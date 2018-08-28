/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthRoleName;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AuthRoleImpl#getAuthRoleName <em>Auth Role Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthRoleImpl extends DomainClassImpl implements AuthRole {
	/**
	 * The cached value of the '{@link #getAuthRoleName() <em>Auth Role Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthRoleName()
	 * @generated
	 * @ordered
	 */
	protected AuthRoleName authRoleName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.AUTH_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthRoleName getAuthRoleName() {
		if (authRoleName != null && authRoleName.eIsProxy()) {
			InternalEObject oldAuthRoleName = (InternalEObject) authRoleName;
			authRoleName = (AuthRoleName) eResolveProxy(oldAuthRoleName);
			if (authRoleName != oldAuthRoleName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.AUTH_ROLE__AUTH_ROLE_NAME,
							oldAuthRoleName, authRoleName));
			}
		}
		return authRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthRoleName basicGetAuthRoleName() {
		return authRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthRoleName(AuthRoleName newAuthRoleName) {
		AuthRoleName oldAuthRoleName = authRoleName;
		authRoleName = newAuthRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.AUTH_ROLE__AUTH_ROLE_NAME,
					oldAuthRoleName, authRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.AUTH_ROLE__AUTH_ROLE_NAME:
			if (resolve)
				return getAuthRoleName();
			return basicGetAuthRoleName();
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
		case FramewebPackage.AUTH_ROLE__AUTH_ROLE_NAME:
			setAuthRoleName((AuthRoleName) newValue);
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
		case FramewebPackage.AUTH_ROLE__AUTH_ROLE_NAME:
			setAuthRoleName((AuthRoleName) null);
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
		case FramewebPackage.AUTH_ROLE__AUTH_ROLE_NAME:
			return authRoleName != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthRoleImpl
