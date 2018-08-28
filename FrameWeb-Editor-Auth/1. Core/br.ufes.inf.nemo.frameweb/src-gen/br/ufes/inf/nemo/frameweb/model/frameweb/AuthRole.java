/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole#getAuthRoleName <em>Auth Role Name</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthRole()
 * @model
 * @generated
 */
public interface AuthRole extends DomainClass {
	/**
	 * Returns the value of the '<em><b>Auth Role Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Role Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Role Name</em>' reference.
	 * @see #setAuthRoleName(AuthRoleName)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthRole_AuthRoleName()
	 * @model required="true"
	 * @generated
	 */
	AuthRoleName getAuthRoleName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole#getAuthRoleName <em>Auth Role Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Role Name</em>' reference.
	 * @see #getAuthRoleName()
	 * @generated
	 */
	void setAuthRoleName(AuthRoleName value);

} // AuthRole
