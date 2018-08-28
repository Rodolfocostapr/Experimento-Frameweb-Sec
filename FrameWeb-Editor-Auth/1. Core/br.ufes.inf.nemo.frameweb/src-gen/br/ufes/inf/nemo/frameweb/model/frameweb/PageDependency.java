/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.PageDependency#getPageDependencyConstraint <em>Page Dependency Constraint</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getPageDependency()
 * @model
 * @generated
 */
public interface PageDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Page Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Dependency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Dependency Constraint</em>' containment reference.
	 * @see #setPageDependencyConstraint(PageConstraint)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getPageDependency_PageDependencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PageConstraint getPageDependencyConstraint();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.PageDependency#getPageDependencyConstraint <em>Page Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Dependency Constraint</em>' containment reference.
	 * @see #getPageDependencyConstraint()
	 * @generated
	 */
	void setPageDependencyConstraint(PageConstraint value);

} // PageDependency
