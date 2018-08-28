/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermName;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AuthPermissionImpl#getAuthPermName <em>Auth Perm Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthPermissionImpl extends DomainClassImpl implements AuthPermission {
	/**
	 * The cached value of the '{@link #getAuthPermName() <em>Auth Perm Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthPermName()
	 * @generated
	 * @ordered
	 */
	protected AuthPermName authPermName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.AUTH_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthPermName getAuthPermName() {
		if (authPermName != null && authPermName.eIsProxy()) {
			InternalEObject oldAuthPermName = (InternalEObject) authPermName;
			authPermName = (AuthPermName) eResolveProxy(oldAuthPermName);
			if (authPermName != oldAuthPermName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.AUTH_PERMISSION__AUTH_PERM_NAME, oldAuthPermName, authPermName));
			}
		}
		return authPermName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthPermName basicGetAuthPermName() {
		return authPermName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthPermName(AuthPermName newAuthPermName) {
		AuthPermName oldAuthPermName = authPermName;
		authPermName = newAuthPermName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.AUTH_PERMISSION__AUTH_PERM_NAME,
					oldAuthPermName, authPermName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.AUTH_PERMISSION__AUTH_PERM_NAME:
			if (resolve)
				return getAuthPermName();
			return basicGetAuthPermName();
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
		case FramewebPackage.AUTH_PERMISSION__AUTH_PERM_NAME:
			setAuthPermName((AuthPermName) newValue);
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
		case FramewebPackage.AUTH_PERMISSION__AUTH_PERM_NAME:
			setAuthPermName((AuthPermName) null);
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
		case FramewebPackage.AUTH_PERMISSION__AUTH_PERM_NAME:
			return authPermName != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthPermissionImpl
