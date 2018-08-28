/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#getSize <em>Size</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#getOwlEquivalentProperty <em>Owl Equivalent Property</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends Property {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAttribute_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Null</em>' attribute.
	 * @see #setIsNull(boolean)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAttribute_IsNull()
	 * @model
	 * @generated
	 */
	boolean isIsNull();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Null</em>' attribute.
	 * @see #isIsNull()
	 * @generated
	 */
	void setIsNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Persistent</em>' attribute.
	 * @see #setIsPersistent(boolean)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAttribute_IsPersistent()
	 * @model
	 * @generated
	 */
	boolean isIsPersistent();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#isIsPersistent <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Persistent</em>' attribute.
	 * @see #isIsPersistent()
	 * @generated
	 */
	void setIsPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Owl Equivalent Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owl Equivalent Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owl Equivalent Property</em>' attribute.
	 * @see #setOwlEquivalentProperty(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAttribute_OwlEquivalentProperty()
	 * @model
	 * @generated
	 */
	String getOwlEquivalentProperty();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Attribute#getOwlEquivalentProperty <em>Owl Equivalent Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owl Equivalent Property</em>' attribute.
	 * @see #getOwlEquivalentProperty()
	 * @generated
	 */
	void setOwlEquivalentProperty(String value);

} // Attribute
