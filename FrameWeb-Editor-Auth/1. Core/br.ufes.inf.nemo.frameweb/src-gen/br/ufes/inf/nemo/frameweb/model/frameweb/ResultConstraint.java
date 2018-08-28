/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#getExecute <em>Execute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#isAjax <em>Ajax</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#getResult <em>Result</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#getRender <em>Render</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultConstraint()
 * @model
 * @generated
 */
public interface ResultConstraint extends NavigationConstraint {
	/**
	 * Returns the value of the '<em><b>Execute</b></em>' attribute.
	 * The default value is <code>"@this"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' attribute.
	 * @see #setExecute(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultConstraint_Execute()
	 * @model default="@this"
	 * @generated
	 */
	String getExecute();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#getExecute <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' attribute.
	 * @see #getExecute()
	 * @generated
	 */
	void setExecute(String value);

	/**
	 * Returns the value of the '<em><b>Ajax</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax</em>' attribute.
	 * @see #setAjax(boolean)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultConstraint_Ajax()
	 * @model default="false"
	 * @generated
	 */
	boolean isAjax();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#isAjax <em>Ajax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax</em>' attribute.
	 * @see #isAjax()
	 * @generated
	 */
	void setAjax(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultConstraint_Result()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Render</b></em>' attribute.
	 * The default value is <code>"@none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Render</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render</em>' attribute.
	 * @see #setRender(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultConstraint_Render()
	 * @model default="@none"
	 * @generated
	 */
	String getRender();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint#getRender <em>Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Render</em>' attribute.
	 * @see #getRender()
	 * @generated
	 */
	void setRender(String value);

} // ResultConstraint
