/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.MethodConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerDependencyImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerDependencyImpl#getMethodDependendencyConstraint <em>Method Dependendency Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrontControllerDependencyImpl extends NavigationDependencyImpl implements FrontControllerDependency {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod method;

	/**
	 * The cached value of the '{@link #getMethodDependendencyConstraint() <em>Method Dependendency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDependendencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected MethodConstraint methodDependendencyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject) method;
			method = (FrontControllerMethod) eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(FrontControllerMethod newMethod) {
		FrontControllerMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD,
					oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConstraint getMethodDependendencyConstraint() {
		return methodDependendencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodDependendencyConstraint(MethodConstraint newMethodDependendencyConstraint,
			NotificationChain msgs) {
		MethodConstraint oldMethodDependendencyConstraint = methodDependendencyConstraint;
		methodDependendencyConstraint = newMethodDependendencyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT,
					oldMethodDependendencyConstraint, newMethodDependendencyConstraint);
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
	public void setMethodDependendencyConstraint(MethodConstraint newMethodDependendencyConstraint) {
		if (newMethodDependendencyConstraint != methodDependendencyConstraint) {
			NotificationChain msgs = null;
			if (methodDependendencyConstraint != null)
				msgs = ((InternalEObject) methodDependendencyConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT,
						null, msgs);
			if (newMethodDependendencyConstraint != null)
				msgs = ((InternalEObject) newMethodDependendencyConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT,
						null, msgs);
			msgs = basicSetMethodDependendencyConstraint(newMethodDependendencyConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT,
					newMethodDependendencyConstraint, newMethodDependendencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT:
			return basicSetMethodDependendencyConstraint(null, msgs);
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
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
			if (resolve)
				return getMethod();
			return basicGetMethod();
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT:
			return getMethodDependendencyConstraint();
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
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
			setMethod((FrontControllerMethod) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT:
			setMethodDependendencyConstraint((MethodConstraint) newValue);
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
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
			setMethod((FrontControllerMethod) null);
			return;
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT:
			setMethodDependendencyConstraint((MethodConstraint) null);
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
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
			return method != null;
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT:
			return methodDependendencyConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //FrontControllerDependencyImpl
