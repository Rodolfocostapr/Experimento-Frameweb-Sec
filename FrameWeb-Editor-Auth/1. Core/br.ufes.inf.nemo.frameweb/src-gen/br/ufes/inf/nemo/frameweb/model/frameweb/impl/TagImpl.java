/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.Tag;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.StereotypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.TagImpl#getCodeGenerationTemplate <em>Code Generation Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends StereotypeImpl implements Tag {
	/**
	 * The default value of the '{@link #getCodeGenerationTemplate() <em>Code Generation Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeGenerationTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_GENERATION_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeGenerationTemplate() <em>Code Generation Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeGenerationTemplate()
	 * @generated
	 * @ordered
	 */
	protected String codeGenerationTemplate = CODE_GENERATION_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeGenerationTemplate() {
		return codeGenerationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeGenerationTemplate(String newCodeGenerationTemplate) {
		String oldCodeGenerationTemplate = codeGenerationTemplate;
		codeGenerationTemplate = newCodeGenerationTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.TAG__CODE_GENERATION_TEMPLATE,
					oldCodeGenerationTemplate, codeGenerationTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.TAG__CODE_GENERATION_TEMPLATE:
			return getCodeGenerationTemplate();
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
		case FramewebPackage.TAG__CODE_GENERATION_TEMPLATE:
			setCodeGenerationTemplate((String) newValue);
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
		case FramewebPackage.TAG__CODE_GENERATION_TEMPLATE:
			setCodeGenerationTemplate(CODE_GENERATION_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.TAG__CODE_GENERATION_TEMPLATE:
			return CODE_GENERATION_TEMPLATE_EDEFAULT == null ? codeGenerationTemplate != null
					: !CODE_GENERATION_TEMPLATE_EDEFAULT.equals(codeGenerationTemplate);
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
		result.append(" (codeGenerationTemplate: ");
		result.append(codeGenerationTemplate);
		result.append(')');
		return result.toString();
	}

} //TagImpl
