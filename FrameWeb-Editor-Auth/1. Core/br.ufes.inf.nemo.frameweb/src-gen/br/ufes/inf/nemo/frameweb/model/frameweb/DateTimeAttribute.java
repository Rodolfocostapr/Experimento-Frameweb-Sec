/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DateTimeAttribute#getDateTimePrecision <em>Date Time Precision</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDateTimeAttribute()
 * @model
 * @generated
 */
public interface DateTimeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Date Time Precision</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.DateTimePrecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Precision</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DateTimePrecision
	 * @see #setDateTimePrecision(DateTimePrecision)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDateTimeAttribute_DateTimePrecision()
	 * @model
	 * @generated
	 */
	DateTimePrecision getDateTimePrecision();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DateTimeAttribute#getDateTimePrecision <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Precision</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.DateTimePrecision
	 * @see #getDateTimePrecision()
	 * @generated
	 */
	void setDateTimePrecision(DateTimePrecision value);

} // DateTimeAttribute
