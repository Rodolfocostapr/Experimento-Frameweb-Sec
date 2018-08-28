/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.PageConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.PageDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.PageDependencyImpl#getPageDependencyConstraint <em>Page Dependency Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageDependencyImpl extends NavigationDependencyImpl implements PageDependency {
	/**
	 * The cached value of the '{@link #getPageDependencyConstraint() <em>Page Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageDependencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected PageConstraint pageDependencyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PAGE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageConstraint getPageDependencyConstraint() {
		return pageDependencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageDependencyConstraint(PageConstraint newPageDependencyConstraint,
			NotificationChain msgs) {
		PageConstraint oldPageDependencyConstraint = pageDependencyConstraint;
		pageDependencyConstraint = newPageDependencyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT, oldPageDependencyConstraint,
					newPageDependencyConstraint);
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
	public void setPageDependencyConstraint(PageConstraint newPageDependencyConstraint) {
		if (newPageDependencyConstraint != pageDependencyConstraint) {
			NotificationChain msgs = null;
			if (pageDependencyConstraint != null)
				msgs = ((InternalEObject) pageDependencyConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT, null,
						msgs);
			if (newPageDependencyConstraint != null)
				msgs = ((InternalEObject) newPageDependencyConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT, null,
						msgs);
			msgs = basicSetPageDependencyConstraint(newPageDependencyConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT, newPageDependencyConstraint,
					newPageDependencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT:
			return basicSetPageDependencyConstraint(null, msgs);
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
		case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT:
			return getPageDependencyConstraint();
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
		case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT:
			setPageDependencyConstraint((PageConstraint) newValue);
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
		case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT:
			setPageDependencyConstraint((PageConstraint) null);
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
		case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT:
			return pageDependencyConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //PageDependencyImpl
