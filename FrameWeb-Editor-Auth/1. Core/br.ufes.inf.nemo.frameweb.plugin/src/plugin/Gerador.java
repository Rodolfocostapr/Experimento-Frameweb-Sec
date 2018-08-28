package plugin;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JFileChooser;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionWhole;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.Tag;
import br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage;

public class Gerador implements IExternalJavaAction {
	static String lang;
	static String ext_class;
	static String ext_page;
	static String form_template;
	static String page_template;
	static String iOParameter_template;
	static String frontControllerClass_template;
	static String frontControllerMethod_template;
	
	static String entityClass_template;
	static String entityAttribute_template;
	static String entityMethod_template;
	static String entityAbstractMethod_template;

	public Gerador() {}
	
	@SuppressWarnings("restriction")
	void readTemplates(EObject obj) {
		TreeIterator<EObject> eAllContents = obj.eAllContents();
		while(eAllContents.hasNext()) {
        	EObject ele = eAllContents.next();
			if(ele instanceof DNodeContainerSpec) {
				EObject model = ((DRepresentationElement)ele).getTarget();
				if(model instanceof FrontControllerTemplate) {
		        	try {
		        		ext_class = URLDecoder.decode(((FrontControllerTemplate) model).getClassExtension(), "UTF-8");
		        		ext_page = URLDecoder.decode(((FrontControllerTemplate) model).getPageExtension(), "UTF-8");

						form_template = URLDecoder.decode(((FrontControllerTemplate) model).getFormTemplate(), "UTF-8");
						page_template = URLDecoder.decode(((FrontControllerTemplate) model).getPageTemplate(), "UTF-8");
						iOParameter_template = URLDecoder.decode(((FrontControllerTemplate) model).getAttributeTemplate(), "UTF-8");
						frontControllerClass_template = URLDecoder.decode(((FrontControllerTemplate) model).getClassTemplate(), "UTF-8");
						frontControllerMethod_template = URLDecoder.decode(((FrontControllerTemplate) model).getMethodTemplate(), "UTF-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				} else if(model instanceof ORMTemplate) {
					try {
						entityClass_template = URLDecoder.decode(((ORMTemplate) model).getClassTemplate(), "UTF-8");
						entityAttribute_template = URLDecoder.decode(((ORMTemplate) model).getAttributeTemplate(), "UTF-8");
						entityMethod_template = URLDecoder.decode(((ORMTemplate) model).getMethodTemplate(), "UTF-8");
						entityAbstractMethod_template = URLDecoder.decode(((ORMTemplate) model).getAbstractMethodTemplate(), "UTF-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				}
			}
        }
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		String dir_output_web = "WebContent" + File.separator;
		String dir_output_class = "src" + File.separator + "com" + File.separator + "frameweb" + File.separator + "java" + File.separator;
		
		JFileChooser f = new JFileChooser();
		f.setDialogTitle("Selecione um diretório para o projeto");
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);
        
        String dir_output = f.getSelectedFile().getPath() + File.separator + "build";

        File file_diretorio_class = new File(dir_output + File.separator + dir_output_class);
        String diretorio_class = dir_output + File.separator + dir_output_class;
        int i = 1;
        while(file_diretorio_class.exists()) {
        	file_diretorio_class = new File(dir_output + " (" + i + ")" + File.separator + dir_output_class);
        	diretorio_class = dir_output + " (" + i + ")" + File.separator + dir_output_class;
        	i++;
        }
        file_diretorio_class.mkdirs();
        
        File file_diretorio_web = new File(dir_output + File.separator + dir_output_web);
        String diretorio_web = dir_output + File.separator + dir_output_web;
        i = 1;
        while(file_diretorio_web.exists()) {
        	file_diretorio_web = new File(dir_output + " (" + i + ")" + File.separator + dir_output_web);
        	diretorio_web = dir_output + " (" + i + ")" + File.separator + dir_output_web;
        	i++;
        }
        file_diretorio_web.mkdirs();

		for(EObject obj : selections) {
			readTemplates(obj);
			
			TreeIterator<EObject> eAllContents = obj.eAllContents();
		    while(eAllContents.hasNext()) {
				EObject ele = eAllContents.next();

				if(ele instanceof DNodeContainerSpec) {
					EObject model = ((DRepresentationElement)ele).getTarget();
					
					
					if(model instanceof NavigationModel) {
			    		EList<EObject> navigation = model.eContents();
			    		
			    		// CONTROLLER
			    		List<EObject> controllers = navigation.stream().filter(x -> x instanceof ControllerPackage).collect(Collectors.toList());
			    		for(EObject ctrl : controllers) {
			    			
				    		List<EObject> controllers2 = ctrl.eContents().stream().filter(x -> x instanceof FrontControllerClass).collect(Collectors.toList());
							
				    		
				    		Map<String, String> tags_controller = new HashMap<String, String>();
				    		tags_controller.put("FW_PACKAGE", ((NamedElementImpl) ctrl).getName());
				    		for(EObject controller : controllers2) {
				    			
								tags_controller.put("FW_CLASS_NAME", ((NamedElementImpl) controller).getName().charAt(0) + ((NamedElementImpl) controller).getName().substring(1));
								
								EObject frontControllerDependency = navigation.stream().filter(x -> x instanceof FrontControllerDependency && ((Dependency) x).getSuppliers().get(0).getName().equals(((NamedElementImpl) controller).getName())).findFirst().orElse(null);
								tags_controller.put("FW_BEAN_NAME", frontControllerDependency != null ? ((Dependency)frontControllerDependency).getClients().get(0).getName() : "");
	
				    			EObject generalization = controller.eContents().stream().filter(x -> x instanceof NavigationGeneralization).findFirst().orElse(null);
								if(((NavigationGeneralization) generalization).getGeneralizationSets().size() > 0) {
									tags_controller.put("FW_EXTENDS", "extends " + ((NavigationGeneralization) generalization).getGeneralizationSets().get(0).getName());
								}else{
									tags_controller.put("FW_EXTENDS", "");
								}
				    			
								List<EObject> controller_parameters = controller.eContents().stream().filter(x -> x instanceof IOParameter).collect(Collectors.toList());
								StringBuilder parameters1 = new StringBuilder();
								for(EObject parameter : controller_parameters) {
									String text_parameter = iOParameter_template;
									text_parameter = text_parameter.replaceAll("FW_PARAMETER_TYPE", ((IOParameter) parameter).getType().getName());
									String parameter_name = ((NamedElementImpl)parameter).getName();
									parameter_name = parameter_name.replace(" ", "");
									text_parameter = text_parameter.replaceAll("FW_PARAMETER_FIRST_UPPER", Character.toUpperCase(parameter_name.charAt(0)) + parameter_name.substring(1));
									text_parameter = text_parameter.replaceAll("FW_PARAMETER", parameter_name);
									
									parameters1.append(text_parameter);
								}
	
								tags_controller.put("FW_FRONT_CONTROLLER_PARAMETERS", parameters1.toString());
	
								List<EObject> controller_methods = controller.eContents().stream().filter(x -> x instanceof FrontControllerMethod).collect(Collectors.toList());
								StringBuilder methods = new StringBuilder();
								for(EObject method : controller_methods) {
									String text_method = frontControllerMethod_template;
									text_method = text_method.replaceAll("FW_METHOD_RETURN_TYPE", (method != null && ((FrontControllerMethod) method).getMethodType() != null) ? ((FrontControllerMethod) method).getMethodType().getName() : "void");
									text_method = text_method.replaceAll("FW_METHOD_NAME", ((NamedElementImpl)method).getName());
									
									methods.append(text_method);
								}
								
								tags_controller.put("FW_FRONT_CONTROLLER_METHOD", methods.toString());
								
								String text = frontControllerClass_template;
								
								for (Map.Entry<String,String> item : tags_controller.entrySet()) {
									text = text.replaceAll(item.getKey(), item.getValue());
								}
								
								try {
									FileWriter fw = new FileWriter(diretorio_class + ((NamedElementImpl) controller).getName() + ext_class);
						            BufferedWriter bw = new BufferedWriter(fw);
						            bw.write(text);
						            bw.newLine();
						            bw.close();
						            fw.close();
								} catch (IOException e) {
									System.out.println("Erro na criação dos arquivos.");
									return;
								}
							}
						}
			    		
			    		//VIEW
						List<EObject> views1 = navigation.stream().filter(x -> x instanceof ViewPackage).collect(Collectors.toList());
						List<EObject> views2 = new ArrayList<EObject>();
						for(EObject c : views1) {
							views2.addAll(c.eContents());
						}
						
						List<EObject> views_pages = views2.stream().filter(x -> x instanceof Page).collect(Collectors.toList());
						for(EObject page : views_pages) {
							StringBuilder body = new StringBuilder();
							
							List<EObject> componentes_dentro_pagina = page.eContents().stream().filter(x -> x instanceof NavigationCompositionWhole).collect(Collectors.toList());
							for(EObject componente_pagina : componentes_dentro_pagina) {
								EObject comp = views2.stream().filter(x -> !(x instanceof NavigationAssociation) ? ((NamedElementImpl)x).getName().equals(((NavigationProperty) componente_pagina).getType().getName()) : false).findFirst().orElse(null);
								if(comp != null) {
									String body_form = form_template;
									
									StringBuilder body_form_comp = new StringBuilder();
									for(EObject item : comp.eContents()) {
										try {
											EList<EStructuralFeature> features = item.eClass().getEAllStructuralFeatures();
											String field_template = null;
											for(EStructuralFeature feature : features) {
												if(item.eGet(feature) instanceof Tag) {
													field_template = URLDecoder.decode(((Tag) item.eGet(feature)).getCodeGenerationTemplate(), "UTF-8");
													break;
												}
											}
											field_template = field_template.replaceFirst("FW_ID", ((NamedElementImpl)item).getName().replace('.', '_'));
											field_template = field_template.replaceFirst("FW_VALUE", ((NamedElementImpl)comp).getName() + '.' + ((NamedElementImpl)item).getName());
											body_form_comp.append("\n");
											body_form_comp.append(field_template);
										} catch (UnsupportedEncodingException e) {
											e.printStackTrace();
											System.out.print(item);
										}
									}
									body_form = body_form.replaceFirst("FW_BODY", body_form_comp.toString());
									body_form = body_form.replaceFirst("FW_ID", ((NamedElementImpl)comp).getName());
									body.append(body_form);
								}
							}
							String text = page_template.replaceFirst("FW_BODY", body.toString());
							
							try {
								FileWriter fw = new FileWriter(diretorio_web + ((NamedElementImpl)page).getName() + ".html");
					            BufferedWriter bw = new BufferedWriter(fw);
					            bw.write(text);
					            bw.close();
					            fw.close();
							} catch (IOException e) {
								System.out.println("Erro na criação dos arquivos.");
								return;
							}
						}
			    	}
					else if(model instanceof EntityModel) {
						EList<EObject> entity = model.eContents();
						List<EObject> packs = entity.stream().filter(x -> x instanceof DomainPackage).collect(Collectors.toList());
						for(EObject pack : packs) {
				    		List<EObject> classes = pack.eContents().stream().filter(x -> x instanceof DomainClass).collect(Collectors.toList());

			    			Map<String, String> tags_class = new HashMap<String, String>();
			    			tags_class.put("FW_PACKAGE", ((NamedElementImpl) pack).getName());
				    		for(EObject _class : classes) {
				    			tags_class.put("FW_CLASS_NAME", ((NamedElementImpl)_class).getName());
				    			
				    			EObject generalization = _class.eContents().stream().filter(x -> x instanceof DomainGeneralization).findFirst().orElse(null);
				    			if(generalization != null)
				    				tags_class.put("FW_EXTENDS", "extends " + ((DomainGeneralization) generalization).getGeneralizationSets().get(0).getName());
								else
									tags_class.put("FW_EXTENDS", "");
				    			
				    			if(_class.eContents().stream().filter(x -> x instanceof DomainClass && ((DomainClass) x).isAbstract()).collect(Collectors.toList()).size() != 0)
				    				tags_class.put("FW_CLASS_VISIBILITY", "public abstract");
			                    else
			                        tags_class.put("FW_CLASS_VISIBILITY", "public");
				    			
				    			List<EObject> classProperties = _class.eContents().stream().filter(x -> x instanceof DomainAttribute).collect(Collectors.toList());
				    			StringBuilder properties = new StringBuilder();
				    			for(EObject propertie : classProperties) {
				    				String textParameter = null;
									try {
										textParameter = URLDecoder.decode(entityAttribute_template, "UTF-8");
									} catch (UnsupportedEncodingException e) {
										e.printStackTrace();
									}
				    				textParameter = textParameter.replaceAll("FW_PARAMETER_TYPE", ((TypedElement) propertie).getType().getName());
				    				String parameter_name = ((NamedElementImpl)propertie).getName();
									parameter_name = parameter_name.replace(" ", "");
									textParameter = textParameter.replaceAll("FW_PARAMETER_FIRST_UPPER", Character.toUpperCase(parameter_name.charAt(0)) + parameter_name.substring(1));
				    				textParameter = textParameter.replaceAll("FW_PARAMETER", parameter_name);
				    				textParameter = textParameter.replaceAll("FW_VISIBILITY", ((NamedElement) propertie).getVisibility().toString());
				    				
				    				properties.append("\n");
				    				properties.append(textParameter);
				    				
				    			}
				    			tags_class.put("FW_CLASS_PARAMETERS", properties.toString());
				    			
				    			List<EObject> classMethods = _class.eContents().stream().filter(x -> x instanceof DomainMethod).collect(Collectors.toList());
				    			StringBuilder methods = new StringBuilder();
				    			for(EObject method : classMethods) {
				    				String textMethod = null;
									try {
					    				if(((DomainMethod) method).isAbstract()) {
											textMethod = URLDecoder.decode(entityAbstractMethod_template, "UTF-8");
					    					textMethod = textMethod.replaceAll("FW_METHOD_VISIBILITY", "public abstract");
					    				}else{
											textMethod = URLDecoder.decode(entityMethod_template, "UTF-8");
					    					textMethod = textMethod.replaceAll("FW_METHOD_VISIBILITY", "public");
					    				}
									} catch (UnsupportedEncodingException e) {
										e.printStackTrace();
									}
				    				textMethod = textMethod.replaceAll("FW_METHOD_RETURN_TYPE", ((DomainMethod) method).getMethodType().getName());
				    				textMethod = textMethod.replaceAll("FW_METHOD_NAME", ((NamedElementImpl)method).getName());
				    				methods.append("\n");
				    				methods.append(textMethod);
				    			}
				    			
				    			tags_class.put("FW_CLASS_METHOD", methods.toString());
				    			
				    			String text = null;
								try {
									text = URLDecoder.decode(entityClass_template, "UTF-8");
								} catch (UnsupportedEncodingException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								for (Map.Entry<String,String> item : tags_class.entrySet()) {
									text = text.replaceAll(item.getKey(), item.getValue());
								}
								
								try {
									FileWriter fw = new FileWriter(diretorio_class + ((NamedElementImpl) _class).getName() + ext_class);
						            BufferedWriter bw = new BufferedWriter(fw);
						            bw.write(text);
						            bw.newLine();
						            bw.close();
						            fw.close();
								} catch (IOException e) {
									System.out.println("Erro na criação dos arquivos.");
									return;
								}
				    		}
						}
					}
					else {}
			    }
		    }
		}
	}

	@SuppressWarnings("restriction")
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return (selections.size() == 1 && selections.iterator().next() instanceof DSemanticDiagramSpec);
	}
}