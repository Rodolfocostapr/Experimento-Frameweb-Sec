/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NamedIndividual;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.NamedIndividual} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedIndividualItemProvider extends VocabularyEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividualItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFeaturingClassifierPropertyDescriptor(object);
			addIsStaticPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addLowerValuePropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addUpperValuePropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addDeployedElementPropertyDescriptor(object);
			addDeploymentPropertyDescriptor(object);
			addDatatypePropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addAggregationPropertyDescriptor(object);
			addAssociationEndPropertyDescriptor(object);
			addQualifierPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addIsCompositePropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addIsDerivedUnionPropertyDescriptor(object);
			addIsIDPropertyDescriptor(object);
			addOppositePropertyDescriptor(object);
			addOwningAssociationPropertyDescriptor(object);
			addRedefinedPropertyPropertyDescriptor(object);
			addSubsettedPropertyPropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Featuring Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturingClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Feature_featuringClassifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feature_featuringClassifier_feature",
								"_UI_Feature_type"),
						UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER, false, false, false, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Is Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Feature_isStatic_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feature_isStatic_feature",
								"_UI_Feature_type"),
						UMLPackage.Literals.FEATURE__IS_STATIC, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TypedElement_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TypedElement_type_feature",
								"_UI_TypedElement_type"),
						UMLPackage.Literals.TYPED_ELEMENT__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultiplicityElement_isOrdered_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isOrdered_feature",
								"_UI_MultiplicityElement_type"),
						UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultiplicityElement_isUnique_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isUnique_feature",
								"_UI_MultiplicityElement_type"),
						UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultiplicityElement_lower_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature",
								"_UI_MultiplicityElement_type"),
						UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lower Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultiplicityElement_lowerValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lowerValue_feature",
								"_UI_MultiplicityElement_type"),
						UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultiplicityElement_upper_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature",
								"_UI_MultiplicityElement_type"),
						UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultiplicityElement_upperValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upperValue_feature",
								"_UI_MultiplicityElement_type"),
						UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StructuralFeature_isReadOnly_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_isReadOnly_feature",
								"_UI_StructuralFeature_type"),
						UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConnectableElement_end_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ConnectableElement_end_feature",
								"_UI_ConnectableElement_type"),
						UMLPackage.Literals.CONNECTABLE_ELEMENT__END, false, false, false, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Deployed Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DeploymentTarget_deployedElement_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DeploymentTarget_deployedElement_feature",
								"_UI_DeploymentTarget_type"),
						UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT, false, false, false, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DeploymentTarget_deployment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DeploymentTarget_deployment_feature",
								"_UI_DeploymentTarget_type"),
						UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYMENT, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Datatype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_datatype_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_datatype_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__DATATYPE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_interface_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_interface_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__INTERFACE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_default_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_default_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__DEFAULT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_aggregation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_aggregation_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__AGGREGATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Association End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_associationEnd_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_associationEnd_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__ASSOCIATION_END, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Qualifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_qualifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_qualifier_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__QUALIFIER, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_class_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_class_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__CLASS, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_defaultValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_defaultValue_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__DEFAULT_VALUE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Is Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_isComposite_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_isComposite_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__IS_COMPOSITE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_isDerived_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_isDerived_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__IS_DERIVED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Derived Union feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedUnionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_isDerivedUnion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_isDerivedUnion_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_isID_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_isID_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__IS_ID, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_opposite_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_opposite_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__OPPOSITE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Owning Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_owningAssociation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_owningAssociation_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__OWNING_ASSOCIATION, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Redefined Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_redefinedProperty_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_redefinedProperty_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__REDEFINED_PROPERTY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subsetted Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsettedPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_subsettedProperty_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_subsettedProperty_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__SUBSETTED_PROPERTY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_association_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_association_feature",
								"_UI_Property_type"),
						UMLPackage.Literals.PROPERTY__ASSOCIATION, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE);
			childrenFeatures.add(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE);
			childrenFeatures.add(UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYMENT);
			childrenFeatures.add(UMLPackage.Literals.PROPERTY__QUALIFIER);
			childrenFeatures.add(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NamedIndividual.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NamedIndividual"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NamedIndividual) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NamedIndividual_type")
				: getString("_UI_NamedIndividual_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NamedIndividual.class)) {
		case FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC:
		case FramewebPackage.NAMED_INDIVIDUAL__TYPE:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE:
		case FramewebPackage.NAMED_INDIVIDUAL__LOWER:
		case FramewebPackage.NAMED_INDIVIDUAL__UPPER:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY:
		case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT:
		case FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION:
		case FramewebPackage.NAMED_INDIVIDUAL__IS_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE:
		case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE:
		case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
		case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
		case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				FramewebFactory.eINSTANCE.createVocabularyLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				FramewebFactory.eINSTANCE.createVocabularyLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYMENT,
				UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add(
				createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER, FramewebFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createDomainVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add(
				createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER, UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER, UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__QUALIFIER,
				UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				FramewebFactory.eINSTANCE.createVocabularyLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				UMLFactory.eINSTANCE.createTimeInterval()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
				|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE
				|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE
				|| childFeature == UMLPackage.Literals.PROPERTY__DEFAULT_VALUE
				|| childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
				|| childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
