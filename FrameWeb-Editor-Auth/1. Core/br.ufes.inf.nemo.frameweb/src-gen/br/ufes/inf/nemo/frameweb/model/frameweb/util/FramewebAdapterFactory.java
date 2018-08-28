/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.util;

import br.ufes.inf.nemo.frameweb.model.frameweb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.LiteralSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage
 * @generated
 */
public class FramewebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FramewebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FramewebPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramewebSwitch<Adapter> modelSwitch = new FramewebSwitch<Adapter>() {
		@Override
		public Adapter caseFramewebProject(FramewebProject object) {
			return createFramewebProjectAdapter();
		}

		@Override
		public Adapter caseFramewebModel(FramewebModel object) {
			return createFramewebModelAdapter();
		}

		@Override
		public Adapter caseFrameworkProfile(FrameworkProfile object) {
			return createFrameworkProfileAdapter();
		}

		@Override
		public Adapter caseEntityModel(EntityModel object) {
			return createEntityModelAdapter();
		}

		@Override
		public Adapter caseNavigationModel(NavigationModel object) {
			return createNavigationModelAdapter();
		}

		@Override
		public Adapter caseApplicationModel(ApplicationModel object) {
			return createApplicationModelAdapter();
		}

		@Override
		public Adapter casePersistenceModel(PersistenceModel object) {
			return createPersistenceModelAdapter();
		}

		@Override
		public Adapter caseDomainAssociation(DomainAssociation object) {
			return createDomainAssociationAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseVersionAttribute(VersionAttribute object) {
			return createVersionAttributeAdapter();
		}

		@Override
		public Adapter caseIdAttribute(IdAttribute object) {
			return createIdAttributeAdapter();
		}

		@Override
		public Adapter caseLOBAttribute(LOBAttribute object) {
			return createLOBAttributeAdapter();
		}

		@Override
		public Adapter caseEmbeddedAttribute(EmbeddedAttribute object) {
			return createEmbeddedAttributeAdapter();
		}

		@Override
		public Adapter caseDecimalAttribute(DecimalAttribute object) {
			return createDecimalAttributeAdapter();
		}

		@Override
		public Adapter caseDateTimeAttribute(DateTimeAttribute object) {
			return createDateTimeAttributeAdapter();
		}

		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseAuthPage(AuthPage object) {
			return createAuthPageAdapter();
		}

		@Override
		public Adapter caseDAOInterface(DAOInterface object) {
			return createDAOInterfaceAdapter();
		}

		@Override
		public Adapter caseDAOClass(DAOClass object) {
			return createDAOClassAdapter();
		}

		@Override
		public Adapter caseDAORealization(DAORealization object) {
			return createDAORealizationAdapter();
		}

		@Override
		public Adapter caseFrontControllerClass(FrontControllerClass object) {
			return createFrontControllerClassAdapter();
		}

		@Override
		public Adapter caseIOParameter(IOParameter object) {
			return createIOParameterAdapter();
		}

		@Override
		public Adapter caseResultDependency(ResultDependency object) {
			return createResultDependencyAdapter();
		}

		@Override
		public Adapter caseAuthSuccessUrl(AuthSuccessUrl object) {
			return createAuthSuccessUrlAdapter();
		}

		@Override
		public Adapter caseAuthFailureUrl(AuthFailureUrl object) {
			return createAuthFailureUrlAdapter();
		}

		@Override
		public Adapter caseNavigationAssociation(NavigationAssociation object) {
			return createNavigationAssociationAdapter();
		}

		@Override
		public Adapter caseFrontControllerMethod(FrontControllerMethod object) {
			return createFrontControllerMethodAdapter();
		}

		@Override
		public Adapter caseAuthProcessingMethod(AuthProcessingMethod object) {
			return createAuthProcessingMethodAdapter();
		}

		@Override
		public Adapter caseServiceClass(ServiceClass object) {
			return createServiceClassAdapter();
		}

		@Override
		public Adapter caseAuthServiceClass(AuthServiceClass object) {
			return createAuthServiceClassAdapter();
		}

		@Override
		public Adapter caseServiceInterface(ServiceInterface object) {
			return createServiceInterfaceAdapter();
		}

		@Override
		public Adapter caseServiceGeneralization(ServiceGeneralization object) {
			return createServiceGeneralizationAdapter();
		}

		@Override
		public Adapter caseServiceControllerAssociation(ServiceControllerAssociation object) {
			return createServiceControllerAssociationAdapter();
		}

		@Override
		public Adapter caseDomainClass(DomainClass object) {
			return createDomainClassAdapter();
		}

		@Override
		public Adapter caseAuthUser(AuthUser object) {
			return createAuthUserAdapter();
		}

		@Override
		public Adapter caseAuthRole(AuthRole object) {
			return createAuthRoleAdapter();
		}

		@Override
		public Adapter caseAuthPermission(AuthPermission object) {
			return createAuthPermissionAdapter();
		}

		@Override
		public Adapter caseFrontControllerDependency(FrontControllerDependency object) {
			return createFrontControllerDependencyAdapter();
		}

		@Override
		public Adapter casePageDependency(PageDependency object) {
			return createPageDependencyAdapter();
		}

		@Override
		public Adapter caseDAOServiceAssociation(DAOServiceAssociation object) {
			return createDAOServiceAssociationAdapter();
		}

		@Override
		public Adapter caseNavigationAttribute(NavigationAttribute object) {
			return createNavigationAttributeAdapter();
		}

		@Override
		public Adapter caseNavigationClass(NavigationClass object) {
			return createNavigationClassAdapter();
		}

		@Override
		public Adapter caseDomainMethod(DomainMethod object) {
			return createDomainMethodAdapter();
		}

		@Override
		public Adapter caseDAOAttribute(DAOAttribute object) {
			return createDAOAttributeAdapter();
		}

		@Override
		public Adapter caseServiceMethod(ServiceMethod object) {
			return createServiceMethodAdapter();
		}

		@Override
		public Adapter caseAuthServiceMethod(AuthServiceMethod object) {
			return createAuthServiceMethodAdapter();
		}

		@Override
		public Adapter caseServiceAttribute(ServiceAttribute object) {
			return createServiceAttributeAdapter();
		}

		@Override
		public Adapter caseServiceAssociation(ServiceAssociation object) {
			return createServiceAssociationAdapter();
		}

		@Override
		public Adapter caseNavigationDependency(NavigationDependency object) {
			return createNavigationDependencyAdapter();
		}

		@Override
		public Adapter caseDAOMethod(DAOMethod object) {
			return createDAOMethodAdapter();
		}

		@Override
		public Adapter caseDomainPackage(DomainPackage object) {
			return createDomainPackageAdapter();
		}

		@Override
		public Adapter caseViewPackage(ViewPackage object) {
			return createViewPackageAdapter();
		}

		@Override
		public Adapter caseControllerPackage(ControllerPackage object) {
			return createControllerPackageAdapter();
		}

		@Override
		public Adapter casePersistencePackage(PersistencePackage object) {
			return createPersistencePackageAdapter();
		}

		@Override
		public Adapter caseApplicationPackage(ApplicationPackage object) {
			return createApplicationPackageAdapter();
		}

		@Override
		public Adapter caseUIComponent(UIComponent object) {
			return createUIComponentAdapter();
		}

		@Override
		public Adapter caseAuthForm(AuthForm object) {
			return createAuthFormAdapter();
		}

		@Override
		public Adapter caseResultType(ResultType object) {
			return createResultTypeAdapter();
		}

		@Override
		public Adapter caseNavigationPackage(NavigationPackage object) {
			return createNavigationPackageAdapter();
		}

		@Override
		public Adapter caseDomainGeneralization(DomainGeneralization object) {
			return createDomainGeneralizationAdapter();
		}

		@Override
		public Adapter caseUIComponentField(UIComponentField object) {
			return createUIComponentFieldAdapter();
		}

		@Override
		public Adapter caseTagLib(TagLib object) {
			return createTagLibAdapter();
		}

		@Override
		public Adapter caseTag(Tag object) {
			return createTagAdapter();
		}

		@Override
		public Adapter caseNavigationCompositionPart(NavigationCompositionPart object) {
			return createNavigationCompositionPartAdapter();
		}

		@Override
		public Adapter caseNavigationCompositionWhole(NavigationCompositionWhole object) {
			return createNavigationCompositionWholeAdapter();
		}

		@Override
		public Adapter caseNavigationProperty(NavigationProperty object) {
			return createNavigationPropertyAdapter();
		}

		@Override
		public Adapter caseResultSet(ResultSet object) {
			return createResultSetAdapter();
		}

		@Override
		public Adapter caseNavigationConstraint(NavigationConstraint object) {
			return createNavigationConstraintAdapter();
		}

		@Override
		public Adapter casePageConstraint(PageConstraint object) {
			return createPageConstraintAdapter();
		}

		@Override
		public Adapter caseResultConstraint(ResultConstraint object) {
			return createResultConstraintAdapter();
		}

		@Override
		public Adapter caseMethodConstraint(MethodConstraint object) {
			return createMethodConstraintAdapter();
		}

		@Override
		public Adapter caseChainingConstraint(ChainingConstraint object) {
			return createChainingConstraintAdapter();
		}

		@Override
		public Adapter caseNavigationGeneralization(NavigationGeneralization object) {
			return createNavigationGeneralizationAdapter();
		}

		@Override
		public Adapter caseDomainConstraints(DomainConstraints object) {
			return createDomainConstraintsAdapter();
		}

		@Override
		public Adapter caseDAOGeneralization(DAOGeneralization object) {
			return createDAOGeneralizationAdapter();
		}

		@Override
		public Adapter caseMappingLib(MappingLib object) {
			return createMappingLibAdapter();
		}

		@Override
		public Adapter caseClassMapping(ClassMapping object) {
			return createClassMappingAdapter();
		}

		@Override
		public Adapter caseAttributeMapping(AttributeMapping object) {
			return createAttributeMappingAdapter();
		}

		@Override
		public Adapter caseDomainGeneralizationSet(DomainGeneralizationSet object) {
			return createDomainGeneralizationSetAdapter();
		}

		@Override
		public Adapter caseController(Controller object) {
			return createControllerAdapter();
		}

		@Override
		public Adapter caseTagProperty(TagProperty object) {
			return createTagPropertyAdapter();
		}

		@Override
		public Adapter caseResultProperty(ResultProperty object) {
			return createResultPropertyAdapter();
		}

		@Override
		public Adapter caseClassMappingPropery(ClassMappingPropery object) {
			return createClassMappingProperyAdapter();
		}

		@Override
		public Adapter caseAttributeMappingProperty(AttributeMappingProperty object) {
			return createAttributeMappingPropertyAdapter();
		}

		@Override
		public Adapter caseServiceRealization(ServiceRealization object) {
			return createServiceRealizationAdapter();
		}

		@Override
		public Adapter caseNavigationGeneralizationSet(NavigationGeneralizationSet object) {
			return createNavigationGeneralizationSetAdapter();
		}

		@Override
		public Adapter caseDAOGeneralizationSet(DAOGeneralizationSet object) {
			return createDAOGeneralizationSetAdapter();
		}

		@Override
		public Adapter caseServiceGeneralizationSet(ServiceGeneralizationSet object) {
			return createServiceGeneralizationSetAdapter();
		}

		@Override
		public Adapter caseSemanticPackage(SemanticPackage object) {
			return createSemanticPackageAdapter();
		}

		@Override
		public Adapter caseIRI(IRI object) {
			return createIRIAdapter();
		}

		@Override
		public Adapter caseVocabularyModel(VocabularyModel object) {
			return createVocabularyModelAdapter();
		}

		@Override
		public Adapter caseVocabulary(Vocabulary object) {
			return createVocabularyAdapter();
		}

		@Override
		public Adapter caseAxiom(Axiom object) {
			return createAxiomAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseVocabularyConstraints(VocabularyConstraints object) {
			return createVocabularyConstraintsAdapter();
		}

		@Override
		public Adapter caseVocabularyAssociation(VocabularyAssociation object) {
			return createVocabularyAssociationAdapter();
		}

		@Override
		public Adapter caseVocabularyProperty(VocabularyProperty object) {
			return createVocabularyPropertyAdapter();
		}

		@Override
		public Adapter caseVocabularyEntity(VocabularyEntity object) {
			return createVocabularyEntityAdapter();
		}

		@Override
		public Adapter caseObjectProperty(ObjectProperty object) {
			return createObjectPropertyAdapter();
		}

		@Override
		public Adapter caseDataProperty(DataProperty object) {
			return createDataPropertyAdapter();
		}

		@Override
		public Adapter caseVocabularyDataType(VocabularyDataType object) {
			return createVocabularyDataTypeAdapter();
		}

		@Override
		public Adapter caseNamedIndividual(NamedIndividual object) {
			return createNamedIndividualAdapter();
		}

		@Override
		public Adapter caseVocabularyClass(VocabularyClass object) {
			return createVocabularyClassAdapter();
		}

		@Override
		public Adapter caseAnonymousIndividual(AnonymousIndividual object) {
			return createAnonymousIndividualAdapter();
		}

		@Override
		public Adapter caseIndividual(Individual object) {
			return createIndividualAdapter();
		}

		@Override
		public Adapter caseVocabularyLiteral(VocabularyLiteral object) {
			return createVocabularyLiteralAdapter();
		}

		@Override
		public Adapter caseDomainVocabularyAssociation(DomainVocabularyAssociation object) {
			return createDomainVocabularyAssociationAdapter();
		}

		@Override
		public Adapter caseDomainVocabularyProperty(DomainVocabularyProperty object) {
			return createDomainVocabularyPropertyAdapter();
		}

		@Override
		public Adapter caseDomainAttribute(DomainAttribute object) {
			return createDomainAttributeAdapter();
		}

		@Override
		public Adapter caseDomainAuthAttribute(DomainAuthAttribute object) {
			return createDomainAuthAttributeAdapter();
		}

		@Override
		public Adapter caseAuthUserName(AuthUserName object) {
			return createAuthUserNameAdapter();
		}

		@Override
		public Adapter caseAuthPassword(AuthPassword object) {
			return createAuthPasswordAdapter();
		}

		@Override
		public Adapter caseAuthRoleName(AuthRoleName object) {
			return createAuthRoleNameAdapter();
		}

		@Override
		public Adapter caseAuthPermName(AuthPermName object) {
			return createAuthPermNameAdapter();
		}

		@Override
		public Adapter caseDomainProperty(DomainProperty object) {
			return createDomainPropertyAdapter();
		}

		@Override
		public Adapter caseFrontControllerTemplate(FrontControllerTemplate object) {
			return createFrontControllerTemplateAdapter();
		}

		@Override
		public Adapter caseDITemplate(DITemplate object) {
			return createDITemplateAdapter();
		}

		@Override
		public Adapter caseORMTemplate(ORMTemplate object) {
			return createORMTemplateAdapter();
		}

		@Override
		public Adapter caseEModelElement(EModelElement object) {
			return createEModelElementAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseNamespace(Namespace object) {
			return createNamespaceAdapter();
		}

		@Override
		public Adapter caseParameterableElement(ParameterableElement object) {
			return createParameterableElementAdapter();
		}

		@Override
		public Adapter casePackageableElement(PackageableElement object) {
			return createPackageableElementAdapter();
		}

		@Override
		public Adapter caseTemplateableElement(TemplateableElement object) {
			return createTemplateableElementAdapter();
		}

		@Override
		public Adapter casePackage(org.eclipse.uml2.uml.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseProfile(Profile object) {
			return createProfileAdapter();
		}

		@Override
		public Adapter caseRedefinableElement(RedefinableElement object) {
			return createRedefinableElementAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseClassifier(Classifier object) {
			return createClassifierAdapter();
		}

		@Override
		public Adapter caseRelationship(Relationship object) {
			return createRelationshipAdapter();
		}

		@Override
		public Adapter caseAssociation(Association object) {
			return createAssociationAdapter();
		}

		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter caseMultiplicityElement(MultiplicityElement object) {
			return createMultiplicityElementAdapter();
		}

		@Override
		public Adapter caseStructuralFeature(StructuralFeature object) {
			return createStructuralFeatureAdapter();
		}

		@Override
		public Adapter caseConnectableElement(ConnectableElement object) {
			return createConnectableElementAdapter();
		}

		@Override
		public Adapter caseDeploymentTarget(DeploymentTarget object) {
			return createDeploymentTargetAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseStructuredClassifier(StructuredClassifier object) {
			return createStructuredClassifierAdapter();
		}

		@Override
		public Adapter caseEncapsulatedClassifier(EncapsulatedClassifier object) {
			return createEncapsulatedClassifierAdapter();
		}

		@Override
		public Adapter caseBehavioredClassifier(BehavioredClassifier object) {
			return createBehavioredClassifierAdapter();
		}

		@Override
		public Adapter caseClass(org.eclipse.uml2.uml.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseDirectedRelationship(DirectedRelationship object) {
			return createDirectedRelationshipAdapter();
		}

		@Override
		public Adapter caseDependency(Dependency object) {
			return createDependencyAdapter();
		}

		@Override
		public Adapter caseAbstraction(Abstraction object) {
			return createAbstractionAdapter();
		}

		@Override
		public Adapter caseRealization(Realization object) {
			return createRealizationAdapter();
		}

		@Override
		public Adapter caseInterfaceRealization(InterfaceRealization object) {
			return createInterfaceRealizationAdapter();
		}

		@Override
		public Adapter caseBehavioralFeature(BehavioralFeature object) {
			return createBehavioralFeatureAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseGeneralization(Generalization object) {
			return createGeneralizationAdapter();
		}

		@Override
		public Adapter caseStereotype(Stereotype object) {
			return createStereotypeAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseGeneralizationSet(GeneralizationSet object) {
			return createGeneralizationSetAdapter();
		}

		@Override
		public Adapter caseDataType(DataType object) {
			return createDataTypeAdapter();
		}

		@Override
		public Adapter caseValueSpecification(ValueSpecification object) {
			return createValueSpecificationAdapter();
		}

		@Override
		public Adapter caseLiteralSpecification(LiteralSpecification object) {
			return createLiteralSpecificationAdapter();
		}

		@Override
		public Adapter caseLiteralString(LiteralString object) {
			return createLiteralStringAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject
	 * @generated
	 */
	public Adapter createFramewebProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel
	 * @generated
	 */
	public Adapter createFramewebModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile <em>Framework Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile
	 * @generated
	 */
	public Adapter createFrameworkProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel
	 * @generated
	 */
	public Adapter createEntityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel <em>Navigation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel
	 * @generated
	 */
	public Adapter createNavigationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel <em>Application Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel
	 * @generated
	 */
	public Adapter createApplicationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel <em>Persistence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel
	 * @generated
	 */
	public Adapter createPersistenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation <em>Domain Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation
	 * @generated
	 */
	public Adapter createDomainAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VersionAttribute <em>Version Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VersionAttribute
	 * @generated
	 */
	public Adapter createVersionAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.IdAttribute <em>Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.IdAttribute
	 * @generated
	 */
	public Adapter createIdAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.LOBAttribute <em>LOB Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.LOBAttribute
	 * @generated
	 */
	public Adapter createLOBAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.EmbeddedAttribute <em>Embedded Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.EmbeddedAttribute
	 * @generated
	 */
	public Adapter createEmbeddedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute <em>Decimal Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute
	 * @generated
	 */
	public Adapter createDecimalAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DateTimeAttribute <em>Date Time Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DateTimeAttribute
	 * @generated
	 */
	public Adapter createDateTimeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthPage <em>Auth Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthPage
	 * @generated
	 */
	public Adapter createAuthPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface <em>DAO Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface
	 * @generated
	 */
	public Adapter createDAOInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass <em>DAO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass
	 * @generated
	 */
	public Adapter createDAOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAORealization <em>DAO Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAORealization
	 * @generated
	 */
	public Adapter createDAORealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass <em>Front Controller Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass
	 * @generated
	 */
	public Adapter createFrontControllerClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter <em>IO Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter
	 * @generated
	 */
	public Adapter createIOParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency <em>Result Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency
	 * @generated
	 */
	public Adapter createResultDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthSuccessUrl <em>Auth Success Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthSuccessUrl
	 * @generated
	 */
	public Adapter createAuthSuccessUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthFailureUrl <em>Auth Failure Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthFailureUrl
	 * @generated
	 */
	public Adapter createAuthFailureUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation <em>Navigation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation
	 * @generated
	 */
	public Adapter createNavigationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod <em>Front Controller Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod
	 * @generated
	 */
	public Adapter createFrontControllerMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthProcessingMethod <em>Auth Processing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthProcessingMethod
	 * @generated
	 */
	public Adapter createAuthProcessingMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass
	 * @generated
	 */
	public Adapter createServiceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceClass <em>Auth Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceClass
	 * @generated
	 */
	public Adapter createAuthServiceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface
	 * @generated
	 */
	public Adapter createServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceGeneralization <em>Service Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceGeneralization
	 * @generated
	 */
	public Adapter createServiceGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceControllerAssociation <em>Service Controller Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceControllerAssociation
	 * @generated
	 */
	public Adapter createServiceControllerAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass
	 * @generated
	 */
	public Adapter createDomainClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser <em>Auth User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser
	 * @generated
	 */
	public Adapter createAuthUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole <em>Auth Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole
	 * @generated
	 */
	public Adapter createAuthRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission <em>Auth Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission
	 * @generated
	 */
	public Adapter createAuthPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency <em>Front Controller Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency
	 * @generated
	 */
	public Adapter createFrontControllerDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.PageDependency <em>Page Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.PageDependency
	 * @generated
	 */
	public Adapter createPageDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOServiceAssociation <em>DAO Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOServiceAssociation
	 * @generated
	 */
	public Adapter createDAOServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAttribute <em>Navigation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAttribute
	 * @generated
	 */
	public Adapter createNavigationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationClass <em>Navigation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationClass
	 * @generated
	 */
	public Adapter createNavigationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod <em>Domain Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod
	 * @generated
	 */
	public Adapter createDomainMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOAttribute <em>DAO Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOAttribute
	 * @generated
	 */
	public Adapter createDAOAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceMethod <em>Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceMethod
	 * @generated
	 */
	public Adapter createServiceMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceMethod <em>Auth Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceMethod
	 * @generated
	 */
	public Adapter createAuthServiceMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceAttribute <em>Service Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceAttribute
	 * @generated
	 */
	public Adapter createServiceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceAssociation <em>Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceAssociation
	 * @generated
	 */
	public Adapter createServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationDependency <em>Navigation Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationDependency
	 * @generated
	 */
	public Adapter createNavigationDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOMethod <em>DAO Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOMethod
	 * @generated
	 */
	public Adapter createDAOMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage
	 * @generated
	 */
	public Adapter createDomainPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage <em>View Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage
	 * @generated
	 */
	public Adapter createViewPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage <em>Controller Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage
	 * @generated
	 */
	public Adapter createControllerPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage <em>Persistence Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage
	 * @generated
	 */
	public Adapter createPersistencePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationPackage <em>Application Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationPackage
	 * @generated
	 */
	public Adapter createApplicationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponent <em>UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.UIComponent
	 * @generated
	 */
	public Adapter createUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthForm <em>Auth Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthForm
	 * @generated
	 */
	public Adapter createAuthFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationPackage <em>Navigation Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationPackage
	 * @generated
	 */
	public Adapter createNavigationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization <em>Domain Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization
	 * @generated
	 */
	public Adapter createDomainGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField <em>UI Component Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField
	 * @generated
	 */
	public Adapter createUIComponentFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.TagLib <em>Tag Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.TagLib
	 * @generated
	 */
	public Adapter createTagLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionPart <em>Navigation Composition Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionPart
	 * @generated
	 */
	public Adapter createNavigationCompositionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionWhole <em>Navigation Composition Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionWhole
	 * @generated
	 */
	public Adapter createNavigationCompositionWholeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationProperty <em>Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationProperty
	 * @generated
	 */
	public Adapter createNavigationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultSet <em>Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ResultSet
	 * @generated
	 */
	public Adapter createResultSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationConstraint <em>Navigation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationConstraint
	 * @generated
	 */
	public Adapter createNavigationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.PageConstraint <em>Page Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.PageConstraint
	 * @generated
	 */
	public Adapter createPageConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint <em>Result Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint
	 * @generated
	 */
	public Adapter createResultConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.MethodConstraint <em>Method Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.MethodConstraint
	 * @generated
	 */
	public Adapter createMethodConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ChainingConstraint <em>Chaining Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ChainingConstraint
	 * @generated
	 */
	public Adapter createChainingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralization <em>Navigation Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralization
	 * @generated
	 */
	public Adapter createNavigationGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints <em>Domain Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints
	 * @generated
	 */
	public Adapter createDomainConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOGeneralization <em>DAO Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOGeneralization
	 * @generated
	 */
	public Adapter createDAOGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.MappingLib <em>Mapping Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.MappingLib
	 * @generated
	 */
	public Adapter createMappingLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ClassMapping <em>Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ClassMapping
	 * @generated
	 */
	public Adapter createClassMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AttributeMapping <em>Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AttributeMapping
	 * @generated
	 */
	public Adapter createAttributeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralizationSet <em>Domain Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralizationSet
	 * @generated
	 */
	public Adapter createDomainGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.TagProperty <em>Tag Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.TagProperty
	 * @generated
	 */
	public Adapter createTagPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultProperty <em>Result Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ResultProperty
	 * @generated
	 */
	public Adapter createResultPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ClassMappingPropery <em>Class Mapping Propery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ClassMappingPropery
	 * @generated
	 */
	public Adapter createClassMappingProperyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AttributeMappingProperty <em>Attribute Mapping Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AttributeMappingProperty
	 * @generated
	 */
	public Adapter createAttributeMappingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceRealization <em>Service Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceRealization
	 * @generated
	 */
	public Adapter createServiceRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralizationSet <em>Navigation Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralizationSet
	 * @generated
	 */
	public Adapter createNavigationGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOGeneralizationSet <em>DAO Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DAOGeneralizationSet
	 * @generated
	 */
	public Adapter createDAOGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ServiceGeneralizationSet <em>Service Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ServiceGeneralizationSet
	 * @generated
	 */
	public Adapter createServiceGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.SemanticPackage <em>Semantic Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.SemanticPackage
	 * @generated
	 */
	public Adapter createSemanticPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.IRI
	 * @generated
	 */
	public Adapter createIRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyModel <em>Vocabulary Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyModel
	 * @generated
	 */
	public Adapter createVocabularyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary <em>Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary
	 * @generated
	 */
	public Adapter createVocabularyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyConstraints <em>Vocabulary Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyConstraints
	 * @generated
	 */
	public Adapter createVocabularyConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyAssociation <em>Vocabulary Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyAssociation
	 * @generated
	 */
	public Adapter createVocabularyAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyProperty <em>Vocabulary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyProperty
	 * @generated
	 */
	public Adapter createVocabularyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity <em>Vocabulary Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity
	 * @generated
	 */
	public Adapter createVocabularyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ObjectProperty
	 * @generated
	 */
	public Adapter createObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DataProperty
	 * @generated
	 */
	public Adapter createDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyDataType <em>Vocabulary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyDataType
	 * @generated
	 */
	public Adapter createVocabularyDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.NamedIndividual
	 * @generated
	 */
	public Adapter createNamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyClass <em>Vocabulary Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyClass
	 * @generated
	 */
	public Adapter createVocabularyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AnonymousIndividual
	 * @generated
	 */
	public Adapter createAnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyLiteral <em>Vocabulary Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyLiteral
	 * @generated
	 */
	public Adapter createVocabularyLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainVocabularyAssociation <em>Domain Vocabulary Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainVocabularyAssociation
	 * @generated
	 */
	public Adapter createDomainVocabularyAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainVocabularyProperty <em>Domain Vocabulary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainVocabularyProperty
	 * @generated
	 */
	public Adapter createDomainVocabularyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute <em>Domain Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute
	 * @generated
	 */
	public Adapter createDomainAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainAuthAttribute <em>Domain Auth Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainAuthAttribute
	 * @generated
	 */
	public Adapter createDomainAuthAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthUserName <em>Auth User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthUserName
	 * @generated
	 */
	public Adapter createAuthUserNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthPassword <em>Auth Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthPassword
	 * @generated
	 */
	public Adapter createAuthPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthRoleName <em>Auth Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthRoleName
	 * @generated
	 */
	public Adapter createAuthRoleNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermName <em>Auth Perm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermName
	 * @generated
	 */
	public Adapter createAuthPermNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainProperty <em>Domain Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DomainProperty
	 * @generated
	 */
	public Adapter createDomainPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate <em>Front Controller Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate
	 * @generated
	 */
	public Adapter createFrontControllerTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate <em>DI Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate
	 * @generated
	 */
	public Adapter createDITemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate <em>ORM Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate
	 * @generated
	 */
	public Adapter createORMTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.ParameterableElement
	 * @generated
	 */
	public Adapter createParameterableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.TemplateableElement
	 * @generated
	 */
	public Adapter createTemplateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.ConnectableElement
	 * @generated
	 */
	public Adapter createConnectableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DeploymentTarget
	 * @generated
	 */
	public Adapter createDeploymentTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.StructuredClassifier
	 * @generated
	 */
	public Adapter createStructuredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.EncapsulatedClassifier
	 * @generated
	 */
	public Adapter createEncapsulatedClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.BehavioredClassifier
	 * @generated
	 */
	public Adapter createBehavioredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Abstraction
	 * @generated
	 */
	public Adapter createAbstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Realization
	 * @generated
	 */
	public Adapter createRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.InterfaceRealization <em>Interface Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.InterfaceRealization
	 * @generated
	 */
	public Adapter createInterfaceRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Stereotype
	 * @generated
	 */
	public Adapter createStereotypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FramewebAdapterFactory
