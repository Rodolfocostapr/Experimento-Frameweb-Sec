/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Component Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.UIComponentFieldImpl#getInject <em>Inject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIComponentFieldImpl extends NavigationAttributeImpl implements UIComponentField {
	/**
	 * The cached value of the '{@link #getInject() <em>Inject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInject()
	 * @generated
	 * @ordered
	 */
	protected IOParameter inject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIComponentFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.UI_COMPONENT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter getInject() {
		if (inject != null && inject.eIsProxy()) {
			InternalEObject oldInject = (InternalEObject) inject;
			inject = (IOParameter) eResolveProxy(oldInject);
			if (inject != oldInject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.UI_COMPONENT_FIELD__INJECT, oldInject, inject));
			}
		}
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter basicGetInject() {
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInject(IOParameter newInject, NotificationChain msgs) {
		IOParameter oldInject = inject;
		inject = newInject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FramewebPackage.UI_COMPONENT_FIELD__INJECT, oldInject, newInject);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInject(IOParameter newInject) {
		if (newInject != inject) {
			NotificationChain msgs = null;
			if (inject != null)
				msgs = ((InternalEObject) inject).eInverseRemove(this, FramewebPackage.IO_PARAMETER__DISPLAY,
						IOParameter.class, msgs);
			if (newInject != null)
				msgs = ((InternalEObject) newInject).eInverseAdd(this, FramewebPackage.IO_PARAMETER__DISPLAY,
						IOParameter.class, msgs);
			msgs = basicSetInject(newInject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT_FIELD__INJECT, newInject,
					newInject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
			if (inject != null)
				msgs = ((InternalEObject) inject).eInverseRemove(this, FramewebPackage.IO_PARAMETER__DISPLAY,
						IOParameter.class, msgs);
			return basicSetInject((IOParameter) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
			return basicSetInject(null, msgs);
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
		case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
			if (resolve)
				return getInject();
			return basicGetInject();
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
		case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
			setInject((IOParameter) newValue);
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
		case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
			setInject((IOParameter) null);
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
		case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
			return inject != null;
		}
		return super.eIsSet(featureID);
	}

} //UIComponentFieldImpl
