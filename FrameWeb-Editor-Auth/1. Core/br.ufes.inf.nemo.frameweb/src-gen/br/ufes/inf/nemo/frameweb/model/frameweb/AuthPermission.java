/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission#getAuthPermName <em>Auth Perm Name</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthPermission()
 * @model
 * @generated
 */
public interface AuthPermission extends DomainClass {
	/**
	 * Returns the value of the '<em><b>Auth Perm Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Perm Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Perm Name</em>' reference.
	 * @see #setAuthPermName(AuthPermName)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthPermission_AuthPermName()
	 * @model required="true"
	 * @generated
	 */
	AuthPermName getAuthPermName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission#getAuthPermName <em>Auth Perm Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Perm Name</em>' reference.
	 * @see #getAuthPermName()
	 * @generated
	 */
	void setAuthPermName(AuthPermName value);

} // AuthPermission
