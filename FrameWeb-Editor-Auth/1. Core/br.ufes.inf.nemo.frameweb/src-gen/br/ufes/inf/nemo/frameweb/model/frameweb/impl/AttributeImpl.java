/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.Attribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.PropertyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AttributeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AttributeImpl#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AttributeImpl#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.AttributeImpl#getOwlEquivalentProperty <em>Owl Equivalent Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeImpl extends PropertyImpl implements Attribute {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNull = IS_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersistent = IS_PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwlEquivalentProperty() <em>Owl Equivalent Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlEquivalentProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String OWL_EQUIVALENT_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwlEquivalentProperty() <em>Owl Equivalent Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlEquivalentProperty()
	 * @generated
	 * @ordered
	 */
	protected String owlEquivalentProperty = OWL_EQUIVALENT_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ATTRIBUTE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNull() {
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNull(boolean newIsNull) {
		boolean oldIsNull = isNull;
		isNull = newIsNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ATTRIBUTE__IS_NULL, oldIsNull,
					isNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersistent() {
		return isPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersistent(boolean newIsPersistent) {
		boolean oldIsPersistent = isPersistent;
		isPersistent = newIsPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ATTRIBUTE__IS_PERSISTENT,
					oldIsPersistent, isPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwlEquivalentProperty() {
		return owlEquivalentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwlEquivalentProperty(String newOwlEquivalentProperty) {
		String oldOwlEquivalentProperty = owlEquivalentProperty;
		owlEquivalentProperty = newOwlEquivalentProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ATTRIBUTE__OWL_EQUIVALENT_PROPERTY,
					oldOwlEquivalentProperty, owlEquivalentProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.ATTRIBUTE__SIZE:
			return getSize();
		case FramewebPackage.ATTRIBUTE__IS_NULL:
			return isIsNull();
		case FramewebPackage.ATTRIBUTE__IS_PERSISTENT:
			return isIsPersistent();
		case FramewebPackage.ATTRIBUTE__OWL_EQUIVALENT_PROPERTY:
			return getOwlEquivalentProperty();
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
		case FramewebPackage.ATTRIBUTE__SIZE:
			setSize((Long) newValue);
			return;
		case FramewebPackage.ATTRIBUTE__IS_NULL:
			setIsNull((Boolean) newValue);
			return;
		case FramewebPackage.ATTRIBUTE__IS_PERSISTENT:
			setIsPersistent((Boolean) newValue);
			return;
		case FramewebPackage.ATTRIBUTE__OWL_EQUIVALENT_PROPERTY:
			setOwlEquivalentProperty((String) newValue);
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
		case FramewebPackage.ATTRIBUTE__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case FramewebPackage.ATTRIBUTE__IS_NULL:
			setIsNull(IS_NULL_EDEFAULT);
			return;
		case FramewebPackage.ATTRIBUTE__IS_PERSISTENT:
			setIsPersistent(IS_PERSISTENT_EDEFAULT);
			return;
		case FramewebPackage.ATTRIBUTE__OWL_EQUIVALENT_PROPERTY:
			setOwlEquivalentProperty(OWL_EQUIVALENT_PROPERTY_EDEFAULT);
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
		case FramewebPackage.ATTRIBUTE__SIZE:
			return size != SIZE_EDEFAULT;
		case FramewebPackage.ATTRIBUTE__IS_NULL:
			return isNull != IS_NULL_EDEFAULT;
		case FramewebPackage.ATTRIBUTE__IS_PERSISTENT:
			return isPersistent != IS_PERSISTENT_EDEFAULT;
		case FramewebPackage.ATTRIBUTE__OWL_EQUIVALENT_PROPERTY:
			return OWL_EQUIVALENT_PROPERTY_EDEFAULT == null ? owlEquivalentProperty != null
					: !OWL_EQUIVALENT_PROPERTY_EDEFAULT.equals(owlEquivalentProperty);
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
		result.append(" (size: ");
		result.append(size);
		result.append(", isNull: ");
		result.append(isNull);
		result.append(", isPersistent: ");
		result.append(isPersistent);
		result.append(", owlEquivalentProperty: ");
		result.append(owlEquivalentProperty);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
