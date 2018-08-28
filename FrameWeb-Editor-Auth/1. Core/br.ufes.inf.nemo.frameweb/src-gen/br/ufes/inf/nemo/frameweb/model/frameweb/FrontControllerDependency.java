/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front Controller Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency#getMethod <em>Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency#getMethodDependendencyConstraint <em>Method Dependendency Constraint</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrontControllerDependency()
 * @model
 * @generated
 */
public interface FrontControllerDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(FrontControllerMethod)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrontControllerDependency_Method()
	 * @model
	 * @generated
	 */
	FrontControllerMethod getMethod();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Method Dependendency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Dependendency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Dependendency Constraint</em>' containment reference.
	 * @see #setMethodDependendencyConstraint(MethodConstraint)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrontControllerDependency_MethodDependendencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MethodConstraint getMethodDependendencyConstraint();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency#getMethodDependendencyConstraint <em>Method Dependendency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Dependendency Constraint</em>' containment reference.
	 * @see #getMethodDependendencyConstraint()
	 * @generated
	 */
	void setMethodDependendencyConstraint(MethodConstraint value);

} // FrontControllerDependency
