/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.ClassifierItemProvider;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyEntityItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyEntityItemProvider(AdapterFactory adapterFactory) {
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

			addEntityIRIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entity IRI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntityIRIPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VocabularyEntity_entityIRI_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VocabularyEntity_entityIRI_feature",
								"_UI_VocabularyEntity_type"),
						FramewebPackage.Literals.VOCABULARY_ENTITY__ENTITY_IRI, true, false, true, null, null, null));
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
		String label = ((VocabularyEntity) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_VocabularyEntity_type")
				: getString("_UI_VocabularyEntity_type") + " " + label;
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

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createDomainGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createNavigationGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createDAOGeneralization()));
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
