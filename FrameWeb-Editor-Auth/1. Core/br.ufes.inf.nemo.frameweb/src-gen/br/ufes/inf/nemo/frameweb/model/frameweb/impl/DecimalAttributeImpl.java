/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DecimalAttributeImpl#getDecimalPrecision <em>Decimal Precision</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DecimalAttributeImpl#getDecimalScale <em>Decimal Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecimalAttributeImpl extends AttributeImpl implements DecimalAttribute {
	/**
	 * The default value of the '{@link #getDecimalPrecision() <em>Decimal Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final long DECIMAL_PRECISION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDecimalPrecision() <em>Decimal Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPrecision()
	 * @generated
	 * @ordered
	 */
	protected long decimalPrecision = DECIMAL_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalScale() <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalScale()
	 * @generated
	 * @ordered
	 */
	protected static final long DECIMAL_SCALE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDecimalScale() <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalScale()
	 * @generated
	 * @ordered
	 */
	protected long decimalScale = DECIMAL_SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DECIMAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDecimalPrecision() {
		return decimalPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPrecision(long newDecimalPrecision) {
		long oldDecimalPrecision = decimalPrecision;
		decimalPrecision = newDecimalPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION,
					oldDecimalPrecision, decimalPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDecimalScale() {
		return decimalScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalScale(long newDecimalScale) {
		long oldDecimalScale = decimalScale;
		decimalScale = newDecimalScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_SCALE,
					oldDecimalScale, decimalScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION:
			return getDecimalPrecision();
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_SCALE:
			return getDecimalScale();
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
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION:
			setDecimalPrecision((Long) newValue);
			return;
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_SCALE:
			setDecimalScale((Long) newValue);
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
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION:
			setDecimalPrecision(DECIMAL_PRECISION_EDEFAULT);
			return;
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_SCALE:
			setDecimalScale(DECIMAL_SCALE_EDEFAULT);
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
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION:
			return decimalPrecision != DECIMAL_PRECISION_EDEFAULT;
		case FramewebPackage.DECIMAL_ATTRIBUTE__DECIMAL_SCALE:
			return decimalScale != DECIMAL_SCALE_EDEFAULT;
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
		result.append(" (decimalPrecision: ");
		result.append(decimalPrecision);
		result.append(", decimalScale: ");
		result.append(decimalScale);
		result.append(')');
		return result.toString();
	}

} //DecimalAttributeImpl
