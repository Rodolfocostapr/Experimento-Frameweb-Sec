/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Component Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField#getInject <em>Inject</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getUIComponentField()
 * @model
 * @generated
 */
public interface UIComponentField extends NavigationAttribute {
	/**
	 * Returns the value of the '<em><b>Inject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inject</em>' reference.
	 * @see #setInject(IOParameter)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getUIComponentField_Inject()
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter#getDisplay
	 * @model opposite="display"
	 * @generated
	 */
	IOParameter getInject();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField#getInject <em>Inject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inject</em>' reference.
	 * @see #getInject()
	 * @generated
	 */
	void setInject(IOParameter value);

} // UIComponentField
