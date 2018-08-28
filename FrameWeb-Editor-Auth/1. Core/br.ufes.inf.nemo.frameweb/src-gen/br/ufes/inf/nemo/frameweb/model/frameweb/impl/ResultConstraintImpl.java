/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultConstraintImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultConstraintImpl#isAjax <em>Ajax</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultConstraintImpl#getResult <em>Result</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultConstraintImpl#getRender <em>Render</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultConstraintImpl extends NavigationConstraintImpl implements ResultConstraint {
	/**
	 * The default value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTE_EDEFAULT = "@this";

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected String execute = EXECUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAjax() <em>Ajax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAjax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AJAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAjax() <em>Ajax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAjax()
	 * @generated
	 * @ordered
	 */
	protected boolean ajax = AJAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRender() <em>Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRender()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_EDEFAULT = "@none";

	/**
	 * The cached value of the '{@link #getRender() <em>Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRender()
	 * @generated
	 * @ordered
	 */
	protected String render = RENDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.RESULT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecute() {
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(String newExecute) {
		String oldExecute = execute;
		execute = newExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_CONSTRAINT__EXECUTE,
					oldExecute, execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAjax() {
		return ajax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAjax(boolean newAjax) {
		boolean oldAjax = ajax;
		ajax = newAjax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_CONSTRAINT__AJAX, oldAjax,
					ajax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_CONSTRAINT__RESULT, oldResult,
					result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRender() {
		return render;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRender(String newRender) {
		String oldRender = render;
		render = newRender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_CONSTRAINT__RENDER, oldRender,
					render));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.RESULT_CONSTRAINT__EXECUTE:
			return getExecute();
		case FramewebPackage.RESULT_CONSTRAINT__AJAX:
			return isAjax();
		case FramewebPackage.RESULT_CONSTRAINT__RESULT:
			return getResult();
		case FramewebPackage.RESULT_CONSTRAINT__RENDER:
			return getRender();
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
		case FramewebPackage.RESULT_CONSTRAINT__EXECUTE:
			setExecute((String) newValue);
			return;
		case FramewebPackage.RESULT_CONSTRAINT__AJAX:
			setAjax((Boolean) newValue);
			return;
		case FramewebPackage.RESULT_CONSTRAINT__RESULT:
			setResult((String) newValue);
			return;
		case FramewebPackage.RESULT_CONSTRAINT__RENDER:
			setRender((String) newValue);
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
		case FramewebPackage.RESULT_CONSTRAINT__EXECUTE:
			setExecute(EXECUTE_EDEFAULT);
			return;
		case FramewebPackage.RESULT_CONSTRAINT__AJAX:
			setAjax(AJAX_EDEFAULT);
			return;
		case FramewebPackage.RESULT_CONSTRAINT__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case FramewebPackage.RESULT_CONSTRAINT__RENDER:
			setRender(RENDER_EDEFAULT);
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
		case FramewebPackage.RESULT_CONSTRAINT__EXECUTE:
			return EXECUTE_EDEFAULT == null ? execute != null : !EXECUTE_EDEFAULT.equals(execute);
		case FramewebPackage.RESULT_CONSTRAINT__AJAX:
			return ajax != AJAX_EDEFAULT;
		case FramewebPackage.RESULT_CONSTRAINT__RESULT:
			return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
		case FramewebPackage.RESULT_CONSTRAINT__RENDER:
			return RENDER_EDEFAULT == null ? render != null : !RENDER_EDEFAULT.equals(render);
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
		result.append(" (execute: ");
		result.append(execute);
		result.append(", ajax: ");
		result.append(ajax);
		result.append(", result: ");
		result.append(result);
		result.append(", render: ");
		result.append(render);
		result.append(')');
		return result.toString();
	}

} //ResultConstraintImpl
