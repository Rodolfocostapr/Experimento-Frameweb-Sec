/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.ClassMappingPropery;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.PropertyItemProvider;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.ClassMappingPropery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassMappingProperyItemProvider extends PropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingProperyItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns ClassMappingPropery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassMappingPropery"));
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
		String label = ((ClassMappingPropery) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ClassMappingPropery_type")
				: getString("_UI_ClassMappingPropery_type") + " " + label;
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

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				FramewebFactory.eINSTANCE.createVocabularyLiteral()));

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

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE,
				FramewebFactory.eINSTANCE.createVocabularyLiteral()));
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
				|| childFeature == UMLPackage.Literals.PROPERTY__DEFAULT_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FramewebEditPlugin.INSTANCE;
	}

}
