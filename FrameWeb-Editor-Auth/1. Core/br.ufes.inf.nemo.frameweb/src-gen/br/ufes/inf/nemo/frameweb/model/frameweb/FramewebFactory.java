/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage
 * @generated
 */
public interface FramewebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FramewebFactory eINSTANCE = br.ufes.inf.nemo.frameweb.model.frameweb.impl.FramewebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	FramewebProject createFramewebProject();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	FramewebModel createFramewebModel();

	/**
	 * Returns a new object of class '<em>Framework Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Framework Profile</em>'.
	 * @generated
	 */
	FrameworkProfile createFrameworkProfile();

	/**
	 * Returns a new object of class '<em>Entity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Model</em>'.
	 * @generated
	 */
	EntityModel createEntityModel();

	/**
	 * Returns a new object of class '<em>Navigation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Model</em>'.
	 * @generated
	 */
	NavigationModel createNavigationModel();

	/**
	 * Returns a new object of class '<em>Application Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Model</em>'.
	 * @generated
	 */
	ApplicationModel createApplicationModel();

	/**
	 * Returns a new object of class '<em>Persistence Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Model</em>'.
	 * @generated
	 */
	PersistenceModel createPersistenceModel();

	/**
	 * Returns a new object of class '<em>Domain Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Association</em>'.
	 * @generated
	 */
	DomainAssociation createDomainAssociation();

	/**
	 * Returns a new object of class '<em>Version Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Attribute</em>'.
	 * @generated
	 */
	VersionAttribute createVersionAttribute();

	/**
	 * Returns a new object of class '<em>Id Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Attribute</em>'.
	 * @generated
	 */
	IdAttribute createIdAttribute();

	/**
	 * Returns a new object of class '<em>LOB Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LOB Attribute</em>'.
	 * @generated
	 */
	LOBAttribute createLOBAttribute();

	/**
	 * Returns a new object of class '<em>Embedded Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Attribute</em>'.
	 * @generated
	 */
	EmbeddedAttribute createEmbeddedAttribute();

	/**
	 * Returns a new object of class '<em>Decimal Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Attribute</em>'.
	 * @generated
	 */
	DecimalAttribute createDecimalAttribute();

	/**
	 * Returns a new object of class '<em>Date Time Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Attribute</em>'.
	 * @generated
	 */
	DateTimeAttribute createDateTimeAttribute();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Auth Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Page</em>'.
	 * @generated
	 */
	AuthPage createAuthPage();

	/**
	 * Returns a new object of class '<em>DAO Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Interface</em>'.
	 * @generated
	 */
	DAOInterface createDAOInterface();

	/**
	 * Returns a new object of class '<em>DAO Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Class</em>'.
	 * @generated
	 */
	DAOClass createDAOClass();

	/**
	 * Returns a new object of class '<em>DAO Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Realization</em>'.
	 * @generated
	 */
	DAORealization createDAORealization();

	/**
	 * Returns a new object of class '<em>Front Controller Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Class</em>'.
	 * @generated
	 */
	FrontControllerClass createFrontControllerClass();

	/**
	 * Returns a new object of class '<em>IO Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Parameter</em>'.
	 * @generated
	 */
	IOParameter createIOParameter();

	/**
	 * Returns a new object of class '<em>Result Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Dependency</em>'.
	 * @generated
	 */
	ResultDependency createResultDependency();

	/**
	 * Returns a new object of class '<em>Auth Success Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Success Url</em>'.
	 * @generated
	 */
	AuthSuccessUrl createAuthSuccessUrl();

	/**
	 * Returns a new object of class '<em>Auth Failure Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Failure Url</em>'.
	 * @generated
	 */
	AuthFailureUrl createAuthFailureUrl();

	/**
	 * Returns a new object of class '<em>Navigation Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Association</em>'.
	 * @generated
	 */
	NavigationAssociation createNavigationAssociation();

	/**
	 * Returns a new object of class '<em>Front Controller Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Method</em>'.
	 * @generated
	 */
	FrontControllerMethod createFrontControllerMethod();

	/**
	 * Returns a new object of class '<em>Auth Processing Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Processing Method</em>'.
	 * @generated
	 */
	AuthProcessingMethod createAuthProcessingMethod();

	/**
	 * Returns a new object of class '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Class</em>'.
	 * @generated
	 */
	ServiceClass createServiceClass();

	/**
	 * Returns a new object of class '<em>Auth Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Service Class</em>'.
	 * @generated
	 */
	AuthServiceClass createAuthServiceClass();

	/**
	 * Returns a new object of class '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface</em>'.
	 * @generated
	 */
	ServiceInterface createServiceInterface();

	/**
	 * Returns a new object of class '<em>Service Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Generalization</em>'.
	 * @generated
	 */
	ServiceGeneralization createServiceGeneralization();

	/**
	 * Returns a new object of class '<em>Service Controller Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Controller Association</em>'.
	 * @generated
	 */
	ServiceControllerAssociation createServiceControllerAssociation();

	/**
	 * Returns a new object of class '<em>Domain Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Class</em>'.
	 * @generated
	 */
	DomainClass createDomainClass();

	/**
	 * Returns a new object of class '<em>Auth User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth User</em>'.
	 * @generated
	 */
	AuthUser createAuthUser();

	/**
	 * Returns a new object of class '<em>Auth Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Role</em>'.
	 * @generated
	 */
	AuthRole createAuthRole();

	/**
	 * Returns a new object of class '<em>Auth Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Permission</em>'.
	 * @generated
	 */
	AuthPermission createAuthPermission();

	/**
	 * Returns a new object of class '<em>Front Controller Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Dependency</em>'.
	 * @generated
	 */
	FrontControllerDependency createFrontControllerDependency();

	/**
	 * Returns a new object of class '<em>Page Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Dependency</em>'.
	 * @generated
	 */
	PageDependency createPageDependency();

	/**
	 * Returns a new object of class '<em>DAO Service Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Service Association</em>'.
	 * @generated
	 */
	DAOServiceAssociation createDAOServiceAssociation();

	/**
	 * Returns a new object of class '<em>Domain Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Method</em>'.
	 * @generated
	 */
	DomainMethod createDomainMethod();

	/**
	 * Returns a new object of class '<em>DAO Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Attribute</em>'.
	 * @generated
	 */
	DAOAttribute createDAOAttribute();

	/**
	 * Returns a new object of class '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Method</em>'.
	 * @generated
	 */
	ServiceMethod createServiceMethod();

	/**
	 * Returns a new object of class '<em>Auth Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Service Method</em>'.
	 * @generated
	 */
	AuthServiceMethod createAuthServiceMethod();

	/**
	 * Returns a new object of class '<em>Service Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Attribute</em>'.
	 * @generated
	 */
	ServiceAttribute createServiceAttribute();

	/**
	 * Returns a new object of class '<em>DAO Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Method</em>'.
	 * @generated
	 */
	DAOMethod createDAOMethod();

	/**
	 * Returns a new object of class '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Package</em>'.
	 * @generated
	 */
	DomainPackage createDomainPackage();

	/**
	 * Returns a new object of class '<em>View Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Package</em>'.
	 * @generated
	 */
	ViewPackage createViewPackage();

	/**
	 * Returns a new object of class '<em>Controller Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Package</em>'.
	 * @generated
	 */
	ControllerPackage createControllerPackage();

	/**
	 * Returns a new object of class '<em>Persistence Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Package</em>'.
	 * @generated
	 */
	PersistencePackage createPersistencePackage();

	/**
	 * Returns a new object of class '<em>Application Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Package</em>'.
	 * @generated
	 */
	ApplicationPackage createApplicationPackage();

	/**
	 * Returns a new object of class '<em>UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Component</em>'.
	 * @generated
	 */
	UIComponent createUIComponent();

	/**
	 * Returns a new object of class '<em>Auth Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Form</em>'.
	 * @generated
	 */
	AuthForm createAuthForm();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns a new object of class '<em>Domain Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Generalization</em>'.
	 * @generated
	 */
	DomainGeneralization createDomainGeneralization();

	/**
	 * Returns a new object of class '<em>UI Component Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Component Field</em>'.
	 * @generated
	 */
	UIComponentField createUIComponentField();

	/**
	 * Returns a new object of class '<em>Tag Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Lib</em>'.
	 * @generated
	 */
	TagLib createTagLib();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Navigation Composition Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Composition Part</em>'.
	 * @generated
	 */
	NavigationCompositionPart createNavigationCompositionPart();

	/**
	 * Returns a new object of class '<em>Navigation Composition Whole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Composition Whole</em>'.
	 * @generated
	 */
	NavigationCompositionWhole createNavigationCompositionWhole();

	/**
	 * Returns a new object of class '<em>Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Set</em>'.
	 * @generated
	 */
	ResultSet createResultSet();

	/**
	 * Returns a new object of class '<em>Page Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Constraint</em>'.
	 * @generated
	 */
	PageConstraint createPageConstraint();

	/**
	 * Returns a new object of class '<em>Result Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Constraint</em>'.
	 * @generated
	 */
	ResultConstraint createResultConstraint();

	/**
	 * Returns a new object of class '<em>Method Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Constraint</em>'.
	 * @generated
	 */
	MethodConstraint createMethodConstraint();

	/**
	 * Returns a new object of class '<em>Chaining Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chaining Constraint</em>'.
	 * @generated
	 */
	ChainingConstraint createChainingConstraint();

	/**
	 * Returns a new object of class '<em>Navigation Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Generalization</em>'.
	 * @generated
	 */
	NavigationGeneralization createNavigationGeneralization();

	/**
	 * Returns a new object of class '<em>Domain Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Constraints</em>'.
	 * @generated
	 */
	DomainConstraints createDomainConstraints();

	/**
	 * Returns a new object of class '<em>DAO Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Generalization</em>'.
	 * @generated
	 */
	DAOGeneralization createDAOGeneralization();

	/**
	 * Returns a new object of class '<em>Mapping Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Lib</em>'.
	 * @generated
	 */
	MappingLib createMappingLib();

	/**
	 * Returns a new object of class '<em>Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mapping</em>'.
	 * @generated
	 */
	ClassMapping createClassMapping();

	/**
	 * Returns a new object of class '<em>Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Mapping</em>'.
	 * @generated
	 */
	AttributeMapping createAttributeMapping();

	/**
	 * Returns a new object of class '<em>Domain Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Generalization Set</em>'.
	 * @generated
	 */
	DomainGeneralizationSet createDomainGeneralizationSet();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Tag Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Property</em>'.
	 * @generated
	 */
	TagProperty createTagProperty();

	/**
	 * Returns a new object of class '<em>Result Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Property</em>'.
	 * @generated
	 */
	ResultProperty createResultProperty();

	/**
	 * Returns a new object of class '<em>Class Mapping Propery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mapping Propery</em>'.
	 * @generated
	 */
	ClassMappingPropery createClassMappingPropery();

	/**
	 * Returns a new object of class '<em>Attribute Mapping Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Mapping Property</em>'.
	 * @generated
	 */
	AttributeMappingProperty createAttributeMappingProperty();

	/**
	 * Returns a new object of class '<em>Service Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Realization</em>'.
	 * @generated
	 */
	ServiceRealization createServiceRealization();

	/**
	 * Returns a new object of class '<em>Navigation Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Generalization Set</em>'.
	 * @generated
	 */
	NavigationGeneralizationSet createNavigationGeneralizationSet();

	/**
	 * Returns a new object of class '<em>DAO Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Generalization Set</em>'.
	 * @generated
	 */
	DAOGeneralizationSet createDAOGeneralizationSet();

	/**
	 * Returns a new object of class '<em>Service Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Generalization Set</em>'.
	 * @generated
	 */
	ServiceGeneralizationSet createServiceGeneralizationSet();

	/**
	 * Returns a new object of class '<em>Semantic Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Package</em>'.
	 * @generated
	 */
	SemanticPackage createSemanticPackage();

	/**
	 * Returns a new object of class '<em>IRI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IRI</em>'.
	 * @generated
	 */
	IRI createIRI();

	/**
	 * Returns a new object of class '<em>Vocabulary Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Model</em>'.
	 * @generated
	 */
	VocabularyModel createVocabularyModel();

	/**
	 * Returns a new object of class '<em>Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary</em>'.
	 * @generated
	 */
	Vocabulary createVocabulary();

	/**
	 * Returns a new object of class '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axiom</em>'.
	 * @generated
	 */
	Axiom createAxiom();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Vocabulary Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Constraints</em>'.
	 * @generated
	 */
	VocabularyConstraints createVocabularyConstraints();

	/**
	 * Returns a new object of class '<em>Vocabulary Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Association</em>'.
	 * @generated
	 */
	VocabularyAssociation createVocabularyAssociation();

	/**
	 * Returns a new object of class '<em>Vocabulary Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Property</em>'.
	 * @generated
	 */
	VocabularyProperty createVocabularyProperty();

	/**
	 * Returns a new object of class '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property</em>'.
	 * @generated
	 */
	ObjectProperty createObjectProperty();

	/**
	 * Returns a new object of class '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property</em>'.
	 * @generated
	 */
	DataProperty createDataProperty();

	/**
	 * Returns a new object of class '<em>Vocabulary Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Data Type</em>'.
	 * @generated
	 */
	VocabularyDataType createVocabularyDataType();

	/**
	 * Returns a new object of class '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Individual</em>'.
	 * @generated
	 */
	NamedIndividual createNamedIndividual();

	/**
	 * Returns a new object of class '<em>Vocabulary Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Class</em>'.
	 * @generated
	 */
	VocabularyClass createVocabularyClass();

	/**
	 * Returns a new object of class '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Individual</em>'.
	 * @generated
	 */
	AnonymousIndividual createAnonymousIndividual();

	/**
	 * Returns a new object of class '<em>Vocabulary Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Literal</em>'.
	 * @generated
	 */
	VocabularyLiteral createVocabularyLiteral();

	/**
	 * Returns a new object of class '<em>Domain Vocabulary Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Vocabulary Association</em>'.
	 * @generated
	 */
	DomainVocabularyAssociation createDomainVocabularyAssociation();

	/**
	 * Returns a new object of class '<em>Domain Vocabulary Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Vocabulary Property</em>'.
	 * @generated
	 */
	DomainVocabularyProperty createDomainVocabularyProperty();

	/**
	 * Returns a new object of class '<em>Domain Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Attribute</em>'.
	 * @generated
	 */
	DomainAttribute createDomainAttribute();

	/**
	 * Returns a new object of class '<em>Domain Auth Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Auth Attribute</em>'.
	 * @generated
	 */
	DomainAuthAttribute createDomainAuthAttribute();

	/**
	 * Returns a new object of class '<em>Auth User Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth User Name</em>'.
	 * @generated
	 */
	AuthUserName createAuthUserName();

	/**
	 * Returns a new object of class '<em>Auth Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Password</em>'.
	 * @generated
	 */
	AuthPassword createAuthPassword();

	/**
	 * Returns a new object of class '<em>Auth Role Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Role Name</em>'.
	 * @generated
	 */
	AuthRoleName createAuthRoleName();

	/**
	 * Returns a new object of class '<em>Auth Perm Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Perm Name</em>'.
	 * @generated
	 */
	AuthPermName createAuthPermName();

	/**
	 * Returns a new object of class '<em>Domain Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Property</em>'.
	 * @generated
	 */
	DomainProperty createDomainProperty();

	/**
	 * Returns a new object of class '<em>Front Controller Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Template</em>'.
	 * @generated
	 */
	FrontControllerTemplate createFrontControllerTemplate();

	/**
	 * Returns a new object of class '<em>DI Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DI Template</em>'.
	 * @generated
	 */
	DITemplate createDITemplate();

	/**
	 * Returns a new object of class '<em>ORM Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ORM Template</em>'.
	 * @generated
	 */
	ORMTemplate createORMTemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FramewebPackage getFramewebPackage();

} //FramewebFactory
