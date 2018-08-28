/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getIOParameter()
 * @model
 * @generated
 */
public interface IOParameter extends NavigationAttribute {
	/**
	 * Returns the value of the '<em><b>Display</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField}.
	 * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField#getInject <em>Inject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getIOParameter_Display()
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField#getInject
	 * @model opposite="inject" derived="true"
	 * @generated
	 */
	EList<UIComponentField> getDisplay();

} // IOParameter
