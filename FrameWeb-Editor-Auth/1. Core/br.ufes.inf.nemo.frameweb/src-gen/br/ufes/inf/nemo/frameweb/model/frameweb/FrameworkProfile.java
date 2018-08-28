/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile#getCategory <em>Category</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile#getKind <em>Kind</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameworkProfile()
 * @model
 * @generated
 */
public interface FrameworkProfile extends Profile {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkCategoryList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkCategoryList
	 * @see #setCategory(FrameworkCategoryList)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameworkProfile_Category()
	 * @model
	 * @generated
	 */
	FrameworkCategoryList getCategory();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkCategoryList
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(FrameworkCategoryList value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkKindList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkKindList
	 * @see #setKind(FrameworkKindList)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameworkProfile_Kind()
	 * @model
	 * @generated
	 */
	FrameworkKindList getKind();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkKindList
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FrameworkKindList value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameworkProfile_Version()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // FrameworkProfile
