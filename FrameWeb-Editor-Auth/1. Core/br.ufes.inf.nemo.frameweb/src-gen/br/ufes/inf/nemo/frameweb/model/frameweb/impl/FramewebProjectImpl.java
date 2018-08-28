/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FramewebProjectImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FramewebProjectImpl#getConfigures <em>Configures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramewebProjectImpl extends MinimalEObjectImpl.Container implements FramewebProject {
	/**
	 * The cached value of the '{@link #getCompose() <em>Compose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompose()
	 * @generated
	 * @ordered
	 */
	protected EList<FramewebModel> compose;

	/**
	 * The cached value of the '{@link #getConfigures() <em>Configures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigures()
	 * @generated
	 * @ordered
	 */
	protected EList<FrameworkProfile> configures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramewebProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRAMEWEB_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FramewebModel> getCompose() {
		if (compose == null) {
			compose = new EObjectContainmentEList<FramewebModel>(FramewebModel.class, this,
					FramewebPackage.FRAMEWEB_PROJECT__COMPOSE);
		}
		return compose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameworkProfile> getConfigures() {
		if (configures == null) {
			configures = new EObjectContainmentEList<FrameworkProfile>(FrameworkProfile.class, this,
					FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES);
		}
		return configures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.FRAMEWEB_PROJECT__COMPOSE:
			return ((InternalEList<?>) getCompose()).basicRemove(otherEnd, msgs);
		case FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES:
			return ((InternalEList<?>) getConfigures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.FRAMEWEB_PROJECT__COMPOSE:
			return getCompose();
		case FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES:
			return getConfigures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FramewebPackage.FRAMEWEB_PROJECT__COMPOSE:
			getCompose().clear();
			getCompose().addAll((Collection<? extends FramewebModel>) newValue);
			return;
		case FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES:
			getConfigures().clear();
			getConfigures().addAll((Collection<? extends FrameworkProfile>) newValue);
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
		case FramewebPackage.FRAMEWEB_PROJECT__COMPOSE:
			getCompose().clear();
			return;
		case FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES:
			getConfigures().clear();
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
		case FramewebPackage.FRAMEWEB_PROJECT__COMPOSE:
			return compose != null && !compose.isEmpty();
		case FramewebPackage.FRAMEWEB_PROJECT__CONFIGURES:
			return configures != null && !configures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FramewebProjectImpl
