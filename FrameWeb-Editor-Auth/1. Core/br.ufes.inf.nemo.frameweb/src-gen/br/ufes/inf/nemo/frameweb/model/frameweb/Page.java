/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Page#getPageTagLib <em>Page Tag Lib</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NavigationClass {
	/**
	 * Returns the value of the '<em><b>Page Tag Lib</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.TagLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Tag Lib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Tag Lib</em>' reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getPage_PageTagLib()
	 * @model
	 * @generated
	 */
	EList<TagLib> getPageTagLib();

} // Page
