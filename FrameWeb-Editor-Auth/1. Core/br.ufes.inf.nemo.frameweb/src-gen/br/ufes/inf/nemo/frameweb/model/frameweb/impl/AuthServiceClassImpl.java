/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth Service Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AuthServiceClassImpl#getPermissionName <em>Permission Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthServiceClassImpl extends ServiceClassImpl implements AuthServiceClass {
	/**
	 * The default value of the '{@link #getPermissionName() <em>Permission Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermissionName() <em>Permission Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionName()
	 * @generated
	 * @ordered
	 */
	protected String permissionName = PERMISSION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthServiceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.AUTH_SERVICE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissionName(String newPermissionName) {
		String oldPermissionName = permissionName;
		permissionName = newPermissionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.AUTH_SERVICE_CLASS__PERMISSION_NAME,
					oldPermissionName, permissionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.AUTH_SERVICE_CLASS__PERMISSION_NAME:
			return getPermissionName();
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
		case FramewebPackage.AUTH_SERVICE_CLASS__PERMISSION_NAME:
			setPermissionName((String) newValue);
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
		case FramewebPackage.AUTH_SERVICE_CLASS__PERMISSION_NAME:
			setPermissionName(PERMISSION_NAME_EDEFAULT);
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
		case FramewebPackage.AUTH_SERVICE_CLASS__PERMISSION_NAME:
			return PERMISSION_NAME_EDEFAULT == null ? permissionName != null
					: !PERMISSION_NAME_EDEFAULT.equals(permissionName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (permissionName: ");
		result.append(permissionName);
		result.append(')');
		return result.toString();
	}

} //AuthServiceClassImpl
