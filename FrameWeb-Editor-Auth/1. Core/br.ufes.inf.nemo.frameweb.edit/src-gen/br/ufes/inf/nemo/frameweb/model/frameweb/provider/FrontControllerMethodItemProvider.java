/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.OperationItemProvider;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrontControllerMethodItemProvider extends OperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethodItemProvider(AdapterFactory adapterFactory) {
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

			addIsDefaultPropertyDescriptor(object);
			addMethodTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FrontControllerMethod_isDefault_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerMethod_isDefault_feature",
						"_UI_FrontControllerMethod_type"),
				FramewebPackage.Literals.FRONT_CONTROLLER_METHOD__IS_DEFAULT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Method Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FrontControllerMethod_methodType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerMethod_methodType_feature",
						"_UI_FrontControllerMethod_type"),
				FramewebPackage.Literals.FRONT_CONTROLLER_METHOD__METHOD_TYPE, true, false, true, null, null, null));
	}

	/**
	 * This returns FrontControllerMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FrontControllerMethod"));
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
		String label = ((FrontControllerMethod) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FrontControllerMethod_type")
				: getString("_UI_FrontControllerMethod_type") + " " + label;
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

		switch (notification.getFeatureID(FrontControllerMethod.class)) {
		case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createMethodConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createVocabularyConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__BODY_CONDITION,
				FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__BODY_CONDITION,
				FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__BODY_CONDITION,
				FramewebFactory.eINSTANCE.createMethodConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__BODY_CONDITION,
				FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__BODY_CONDITION,
				FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__BODY_CONDITION,
				FramewebFactory.eINSTANCE.createVocabularyConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__POSTCONDITION,
				FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__POSTCONDITION,
				FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__POSTCONDITION,
				FramewebFactory.eINSTANCE.createMethodConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__POSTCONDITION,
				FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__POSTCONDITION,
				FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__POSTCONDITION,
				FramewebFactory.eINSTANCE.createVocabularyConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__PRECONDITION,
				FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__PRECONDITION,
				FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__PRECONDITION,
				FramewebFactory.eINSTANCE.createMethodConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__PRECONDITION,
				FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__PRECONDITION,
				FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.OPERATION__PRECONDITION,
				FramewebFactory.eINSTANCE.createVocabularyConstraints()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
				|| childFeature == UMLPackage.Literals.OPERATION__BODY_CONDITION
				|| childFeature == UMLPackage.Literals.OPERATION__POSTCONDITION
				|| childFeature == UMLPackage.Literals.OPERATION__PRECONDITION;

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
