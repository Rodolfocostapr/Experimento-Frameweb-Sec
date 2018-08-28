/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject#getCompose <em>Compose</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject#getConfigures <em>Configures</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebProject()
 * @model
 * @generated
 */
public interface FramewebProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebProject_Compose()
	 * @model containment="true"
	 * @generated
	 */
	EList<FramewebModel> getCompose();

	/**
	 * Returns the value of the '<em><b>Configures</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configures</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebProject_Configures()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameworkProfile> getConfigures();

} // FramewebProject
