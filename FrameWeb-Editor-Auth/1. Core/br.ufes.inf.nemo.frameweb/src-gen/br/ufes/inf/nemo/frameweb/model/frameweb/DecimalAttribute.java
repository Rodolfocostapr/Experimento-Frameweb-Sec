/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute#getDecimalPrecision <em>Decimal Precision</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute#getDecimalScale <em>Decimal Scale</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDecimalAttribute()
 * @model
 * @generated
 */
public interface DecimalAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Decimal Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Precision</em>' attribute.
	 * @see #setDecimalPrecision(long)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDecimalAttribute_DecimalPrecision()
	 * @model
	 * @generated
	 */
	long getDecimalPrecision();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute#getDecimalPrecision <em>Decimal Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Precision</em>' attribute.
	 * @see #getDecimalPrecision()
	 * @generated
	 */
	void setDecimalPrecision(long value);

	/**
	 * Returns the value of the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Scale</em>' attribute.
	 * @see #setDecimalScale(long)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDecimalAttribute_DecimalScale()
	 * @model
	 * @generated
	 */
	long getDecimalScale();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute#getDecimalScale <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Scale</em>' attribute.
	 * @see #getDecimalScale()
	 * @generated
	 */
	void setDecimalScale(long value);

} // DecimalAttribute
