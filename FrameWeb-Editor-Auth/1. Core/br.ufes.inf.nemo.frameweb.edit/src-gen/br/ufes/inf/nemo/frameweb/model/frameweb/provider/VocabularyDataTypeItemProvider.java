/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyDataType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyDataTypeItemProvider extends VocabularyEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedAttributePropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataType_ownedAttribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataType_ownedAttribute_feature",
								"_UI_DataType_type"),
						UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Owned Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataType_ownedOperation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataType_ownedOperation_feature",
								"_UI_DataType_type"),
						UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION, true, false, true, null, null,
						new String[] { "org.eclipse.ui.views.properties.expert" }));
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
			childrenFeatures.add(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE);
			childrenFeatures.add(UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION);
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
	 * This returns VocabularyDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VocabularyDataType"));
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
		String label = ((VocabularyDataType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_VocabularyDataType_type")
				: getString("_UI_VocabularyDataType_type") + " " + label;
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

		switch (notification.getFeatureID(VocabularyDataType.class)) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
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

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createDomainMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createServiceMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createDAOMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				UMLFactory.eINSTANCE.createOperation()));
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

		boolean qualify = childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
				|| childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
