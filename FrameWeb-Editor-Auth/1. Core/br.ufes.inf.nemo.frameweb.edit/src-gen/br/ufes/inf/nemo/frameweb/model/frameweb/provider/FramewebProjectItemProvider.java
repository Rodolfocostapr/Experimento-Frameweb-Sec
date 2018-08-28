/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FramewebProjectItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebProjectItemProvider(AdapterFactory adapterFactory) {
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

			addComposePropertyDescriptor(object);
			addConfiguresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Compose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComposePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FramewebProject_compose_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FramewebProject_compose_feature",
								"_UI_FramewebProject_type"),
						FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Configures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfiguresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FramewebProject_configures_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FramewebProject_configures_feature",
								"_UI_FramewebProject_type"),
						FramewebPackage.Literals.FRAMEWEB_PROJECT__CONFIGURES, true, false, true, null, null, null));
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
			childrenFeatures.add(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE);
			childrenFeatures.add(FramewebPackage.Literals.FRAMEWEB_PROJECT__CONFIGURES);
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
	 * This returns FramewebProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FramewebProject"));
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
		return getString("_UI_FramewebProject_type");
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

		switch (notification.getFeatureID(FramewebProject.class)) {
		case FramewebPackage.FRAMEWEB_PROJECT__COMPOSE:
		case FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES:
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

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE,
				FramewebFactory.eINSTANCE.createFramewebModel()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE,
				FramewebFactory.eINSTANCE.createEntityModel()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE,
				FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE,
				FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE,
				FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__COMPOSE,
				FramewebFactory.eINSTANCE.createVocabularyModel()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__CONFIGURES,
				FramewebFactory.eINSTANCE.createFrameworkProfile()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__CONFIGURES,
				FramewebFactory.eINSTANCE.createFrontControllerTemplate()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__CONFIGURES,
				FramewebFactory.eINSTANCE.createDITemplate()));

		newChildDescriptors.add(createChildParameter(FramewebPackage.Literals.FRAMEWEB_PROJECT__CONFIGURES,
				FramewebFactory.eINSTANCE.createORMTemplate()));
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
