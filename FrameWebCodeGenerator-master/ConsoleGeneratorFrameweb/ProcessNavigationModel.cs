using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace GeradorFrameweb
{
    public class ProcessNavigationModel : Process
    {
        public ProcessNavigationModel(Config _config) : base(_config)
        {
        }

        public override void Execute(Componete componente)
        {

            /// CONTROLLER
            var controllers = componente.Componentes.Where(x => x.xsi_type == "frameweb:ControllerPackage").ToList().SelectMany(x => x.Componentes).ToList();

            foreach (var controller in controllers)
            {
                if (controller.getXsiTypeFile() == "ServiceControllerAssociation.txt") continue;

                var tags_controller = new Dictionary<string, string>();

                tags_controller.Add("FW_CLASS_NAME", controller.name);

                var frontControllerDependency = componente.Componentes.Where(x => x.xsi_type == "frameweb:FrontControllerDependency" && x.getSupplier() == controller.name).FirstOrDefault();
                tags_controller.Add("FW_BEAN_NAME", frontControllerDependency != null ? frontControllerDependency.getClient() : string.Empty);

                //tags_controller.Add("FW_BEAN_CLASS_NAME", "NNN");

                var controller_parameters = controller.Componentes.Where(x => x.xsi_type == "frameweb:IOParameter").ToList();

                string parameters = string.Empty;
                foreach (var parameter in controller_parameters)
                {
                    var text_parameter = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + parameter.getXsiTypeFile());
                    text_parameter = text_parameter.Replace("FW_PARAMETER_TYPE", parameter.parameterType);
                    text_parameter = text_parameter.Replace("FW_PARAMETER_FIRST_UPPER", Utilities.FirstCharToUpper(parameter.name));
                    text_parameter = text_parameter.Replace("FW_PARAMETER", parameter.name);

                    parameters += text_parameter;
                }

                tags_controller.Add("FW_FRONT_CONTROLLER_PARAMETERS", parameters);

                var controller_methods = controller.Componentes.Where(x => x.xsi_type == "frameweb:FrontControllerMethod").ToList();

                string methods = string.Empty;
                foreach (var method in controller_methods)
                {
                    var text_method = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + method.getXsiTypeFile());
                    text_method = text_method.Replace("FW_METHOD_RETURN_TYPE", method.methodType);
                    text_method = text_method.Replace("FW_METHOD_NAME", method.name);

                    methods += text_method;
                }

                //ADD LOGIN PROCESSING METHOD
                var auth_proc_method = controller.Componentes.Where(x => x.xsi_type == "frameweb:AuthProcessingMethod").ToList();
                foreach (var method in auth_proc_method)
                {
                    var text_method = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + method.getXsiTypeFile());
                    text_method = text_method.Replace("FW_METHOD_RETURN_TYPE", method.methodType);
                    text_method = text_method.Replace("FW_METHOD_NAME", method.name);

                    methods += text_method;
                }

                tags_controller.Add("FW_FRONT_CONTROLLER_METHOD", methods);

                var text = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + controller.getXsiTypeFile());
                foreach (var item in tags_controller)
                {
                    text = text.Replace(item.Key, item.Value);
                }

                try
                {
                    Directory.CreateDirectory(Path.Combine(config.dir_output, config.dir_output_class));
                }
                catch
                {
                }
                File.WriteAllText(Path.Combine(config.dir_output, config.dir_output_class, controller.name + config.ext_class), text);
            }
            /// VIEW

            var views = componente.Componentes.Where(x => x.xsi_type == "frameweb:ViewPackage").ToList().SelectMany(x => x.Componentes).ToList();

            var views_pages = views.Where(x => x.xsi_type == "frameweb:Page"||
                                                x.xsi_type == "frameweb:AuthPage").ToList();
            foreach (var page in views_pages)
            {
                string body = string.Empty;

                var componentes_dentro_pagina = page.Componentes.Where(x => x.xsi_type == "frameweb:NavigationCompositionWhole").ToList();
                foreach (Componete componente_pagina in componentes_dentro_pagina)
                {
                    var comp = views.Where(x => x.name == componente_pagina.getType()).FirstOrDefault();
                    if (comp != null)
                    {
                        string body_form = string.Empty;
                        if (comp.xsi_type == "frameweb:UIComponent")// Form
                        {
                            body_form = File.ReadAllText(config.dir_template + "framework" + Path.DirectorySeparatorChar + comp.getXsiTypeFile());
                        }
                        else
                        {
                            if (comp.xsi_type == "frameweb:AuthForm")// Form
                            {
                                //USES A LOGIN FORM TEMPLATE INSTEAD
                                body_form = File.ReadAllText(config.dir_template + "framework" + Path.DirectorySeparatorChar + comp.getXsiTypeFile());
                            }
                        }
                        string body_form_comp = string.Empty;
                        foreach (var item in comp.Componentes)
                        {
                            // Get file path template for component UI (input, radio, ...)
                            var field_template = File.ReadAllText(item.getXsiTypeFile());
                            field_template = field_template.Replace("FW_ID", item.name.Replace('.', '_'));
                            field_template = field_template.Replace("FW_VALUE", comp.name + "." + item.name);

                            body_form_comp += field_template;
                        }

                        body_form = body_form.Replace("FW_BODY", body_form_comp);
                        body_form = body_form.Replace("FW_ID", comp.name);
                        body += body_form;
                    }
                }

                var text = File.ReadAllText(config.dir_template + "framework" + Path.DirectorySeparatorChar + page.getXsiTypeFile());
                text = text.Replace("FW_BODY", body); 

                File.WriteAllText(Path.Combine(config.dir_output, config.dir_output_web, page.name), text);
            }

            var login_page = views.Where(x => x.xsi_type == "frameweb:AuthPage").FirstOrDefault();

                if (login_page != null)
                {
                    //DICTIONARY FOR THE SECURITY FILE
                    var tags_class_sec = new Dictionary<string, string>();
                    tags_class_sec.Add("FW_AUTH_LOGIN_PAGE", login_page.name);

                    var login_form = views.Where(x => x.xsi_type == "frameweb:AuthPage").FirstOrDefault();

                    //GETTING THE SUCCESS AND FAILURE URL
                    var authSuccessUrl = componente.Componentes.Where(x => x.xsi_type == "frameweb:AuthSuccessUrl").FirstOrDefault().getSupplier();
                    var authFailureUrl = componente.Componentes.Where(x => x.xsi_type == "frameweb:AuthFailureUrl").FirstOrDefault().getSupplier();

                tags_class_sec.Add("FW_AUTH_LOGIN_SUCC_URL", authSuccessUrl);
                    tags_class_sec.Add("FW_AUTH_LOGIN_FAIL_URL", authFailureUrl);

                    var text_sec = "";

                    try
                    {
                        text_sec = File.ReadAllText(Path.Combine(config.dir_output, "src\\sec-config.txt"));
                    }
                    catch
                    {
                        text_sec = File.ReadAllText(config.dir_template_sec_config);
                    }

                foreach (var item in tags_class_sec)
                    {
                        text_sec = text_sec.Replace(item.Key, item.Value);
                    }

                    try
                    {
                        // Directory.CreateDirectory(Path.Combine(config.dir_output,"src\\sec-config.txt"));
                    }
                    catch
                    {
                    }
                    File.WriteAllText(Path.Combine(config.dir_output, "src\\sec-config.txt"), text_sec);
                }

            Utilities.Log("Code generated successfully.");

        }

    }
}
