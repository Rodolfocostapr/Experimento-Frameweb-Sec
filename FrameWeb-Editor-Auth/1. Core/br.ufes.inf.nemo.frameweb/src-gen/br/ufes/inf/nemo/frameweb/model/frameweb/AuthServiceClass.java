/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth Service Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceClass#getPermissionName <em>Permission Name</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthServiceClass()
 * @model
 * @generated
 */
public interface AuthServiceClass extends ServiceClass {
	/**
	 * Returns the value of the '<em><b>Permission Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Name</em>' attribute.
	 * @see #setPermissionName(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthServiceClass_PermissionName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	String getPermissionName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceClass#getPermissionName <em>Permission Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Name</em>' attribute.
	 * @see #getPermissionName()
	 * @generated
	 */
	void setPermissionName(String value);

} // AuthServiceClass
