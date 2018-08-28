/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser#getAuthUserName <em>Auth User Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser#getAuthPassword <em>Auth Password</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthUser()
 * @model
 * @generated
 */
public interface AuthUser extends DomainClass {
	/**
	 * Returns the value of the '<em><b>Auth User Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth User Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth User Name</em>' reference.
	 * @see #setAuthUserName(AuthUserName)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthUser_AuthUserName()
	 * @model required="true"
	 * @generated
	 */
	AuthUserName getAuthUserName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser#getAuthUserName <em>Auth User Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth User Name</em>' reference.
	 * @see #getAuthUserName()
	 * @generated
	 */
	void setAuthUserName(AuthUserName value);

	/**
	 * Returns the value of the '<em><b>Auth Password</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Password</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Password</em>' reference.
	 * @see #setAuthPassword(AuthPassword)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getAuthUser_AuthPassword()
	 * @model required="true"
	 * @generated
	 */
	AuthPassword getAuthPassword();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser#getAuthPassword <em>Auth Password</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Password</em>' reference.
	 * @see #getAuthPassword()
	 * @generated
	 */
	void setAuthPassword(AuthPassword value);

} // AuthUser
