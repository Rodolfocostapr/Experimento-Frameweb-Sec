/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.IRI;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyEntityImpl#getEntityIRI <em>Entity IRI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VocabularyEntityImpl extends ClassifierImpl implements VocabularyEntity {
	/**
	 * The cached value of the '{@link #getEntityIRI() <em>Entity IRI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityIRI()
	 * @generated
	 * @ordered
	 */
	protected IRI entityIRI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.VOCABULARY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI getEntityIRI() {
		if (entityIRI != null && entityIRI.eIsProxy()) {
			InternalEObject oldEntityIRI = (InternalEObject) entityIRI;
			entityIRI = (IRI) eResolveProxy(oldEntityIRI);
			if (entityIRI != oldEntityIRI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.VOCABULARY_ENTITY__ENTITY_IRI, oldEntityIRI, entityIRI));
			}
		}
		return entityIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI basicGetEntityIRI() {
		return entityIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityIRI(IRI newEntityIRI) {
		IRI oldEntityIRI = entityIRI;
		entityIRI = newEntityIRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.VOCABULARY_ENTITY__ENTITY_IRI,
					oldEntityIRI, entityIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_ENTITY__ENTITY_IRI:
			if (resolve)
				return getEntityIRI();
			return basicGetEntityIRI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_ENTITY__ENTITY_IRI:
			setEntityIRI((IRI) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_ENTITY__ENTITY_IRI:
			setEntityIRI((IRI) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_ENTITY__ENTITY_IRI:
			return entityIRI != null;
		}
		return super.eIsSet(featureID);
	}

} //VocabularyEntityImpl
