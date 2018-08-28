/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPassword;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthUserName;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AuthUserImpl#getAuthUserName <em>Auth User Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AuthUserImpl#getAuthPassword <em>Auth Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthUserImpl extends DomainClassImpl implements AuthUser {
	/**
	 * The cached value of the '{@link #getAuthUserName() <em>Auth User Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthUserName()
	 * @generated
	 * @ordered
	 */
	protected AuthUserName authUserName;

	/**
	 * The cached value of the '{@link #getAuthPassword() <em>Auth Password</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthPassword()
	 * @generated
	 * @ordered
	 */
	protected AuthPassword authPassword;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.AUTH_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthUserName getAuthUserName() {
		if (authUserName != null && authUserName.eIsProxy()) {
			InternalEObject oldAuthUserName = (InternalEObject) authUserName;
			authUserName = (AuthUserName) eResolveProxy(oldAuthUserName);
			if (authUserName != oldAuthUserName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.AUTH_USER__AUTH_USER_NAME,
							oldAuthUserName, authUserName));
			}
		}
		return authUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthUserName basicGetAuthUserName() {
		return authUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthUserName(AuthUserName newAuthUserName) {
		AuthUserName oldAuthUserName = authUserName;
		authUserName = newAuthUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.AUTH_USER__AUTH_USER_NAME,
					oldAuthUserName, authUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthPassword getAuthPassword() {
		if (authPassword != null && authPassword.eIsProxy()) {
			InternalEObject oldAuthPassword = (InternalEObject) authPassword;
			authPassword = (AuthPassword) eResolveProxy(oldAuthPassword);
			if (authPassword != oldAuthPassword) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.AUTH_USER__AUTH_PASSWORD,
							oldAuthPassword, authPassword));
			}
		}
		return authPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthPassword basicGetAuthPassword() {
		return authPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthPassword(AuthPassword newAuthPassword) {
		AuthPassword oldAuthPassword = authPassword;
		authPassword = newAuthPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.AUTH_USER__AUTH_PASSWORD,
					oldAuthPassword, authPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.AUTH_USER__AUTH_USER_NAME:
			if (resolve)
				return getAuthUserName();
			return basicGetAuthUserName();
		case FramewebPackage.AUTH_USER__AUTH_PASSWORD:
			if (resolve)
				return getAuthPassword();
			return basicGetAuthPassword();
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
		case FramewebPackage.AUTH_USER__AUTH_USER_NAME:
			setAuthUserName((AuthUserName) newValue);
			return;
		case FramewebPackage.AUTH_USER__AUTH_PASSWORD:
			setAuthPassword((AuthPassword) newValue);
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
		case FramewebPackage.AUTH_USER__AUTH_USER_NAME:
			setAuthUserName((AuthUserName) null);
			return;
		case FramewebPackage.AUTH_USER__AUTH_PASSWORD:
			setAuthPassword((AuthPassword) null);
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
		case FramewebPackage.AUTH_USER__AUTH_USER_NAME:
			return authUserName != null;
		case FramewebPackage.AUTH_USER__AUTH_PASSWORD:
			return authPassword != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthUserImpl
