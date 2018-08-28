/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface#getInfix <em>Infix</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface#getSufix <em>Sufix</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOInterface()
 * @model
 * @generated
 */
public interface DAOInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Infix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infix</em>' attribute.
	 * @see #setInfix(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOInterface_Infix()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	String getInfix();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface#getInfix <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infix</em>' attribute.
	 * @see #getInfix()
	 * @generated
	 */
	void setInfix(String value);

	/**
	 * Returns the value of the '<em><b>Sufix</b></em>' attribute.
	 * The default value is <code>"DAO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sufix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sufix</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOInterface_Sufix()
	 * @model default="DAO" dataType="org.eclipse.uml2.types.String" required="true" changeable="false"
	 * @generated
	 */
	String getSufix();

} // DAOInterface
