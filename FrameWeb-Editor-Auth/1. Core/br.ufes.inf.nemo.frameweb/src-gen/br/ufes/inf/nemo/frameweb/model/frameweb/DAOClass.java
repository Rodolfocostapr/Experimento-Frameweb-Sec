/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass#getSufix <em>Sufix</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass#getInfix <em>Infix</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOClass()
 * @model
 * @generated
 */
public interface DAOClass extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Sufix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sufix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sufix</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOClass_Sufix()
	 * @model default="" dataType="org.eclipse.uml2.types.String" required="true" changeable="false" derived="true"
	 * @generated
	 */
	String getSufix();

	/**
	 * Returns the value of the '<em><b>Infix</b></em>' attribute.
	 * The default value is <code>"DAO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infix</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOClass_Infix()
	 * @model default="DAO" dataType="org.eclipse.uml2.types.String" required="true" changeable="false"
	 * @generated
	 */
	String getInfix();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDAOClass_Prefix()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" changeable="false" derived="true"
	 * @generated
	 */
	String getPrefix();

} // DAOClass
