/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Framework Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameworkCategoryList()
 * @model
 * @generated
 */
public enum FrameworkCategoryList implements Enumerator {
	/**
	 * The '<em><b>Front Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRONT_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	FRONT_CONTROLLER(0, "FrontController", "FrontController"),

	/**
	 * The '<em><b>Dependency Injection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_INJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCY_INJECTION(1, "DependencyInjection", "DependencyInjection"),

	/**
	 * The '<em><b>Objeto Relacional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJETO_RELACIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OBJETO_RELACIONAL(2, "ObjetoRelacional", "ObjetoRelacional");

	/**
	 * The '<em><b>Front Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Front Controller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRONT_CONTROLLER
	 * @model name="FrontController"
	 * @generated
	 * @ordered
	 */
	public static final int FRONT_CONTROLLER_VALUE = 0;

	/**
	 * The '<em><b>Dependency Injection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependency Injection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_INJECTION
	 * @model name="DependencyInjection"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_INJECTION_VALUE = 1;

	/**
	 * The '<em><b>Objeto Relacional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Objeto Relacional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJETO_RELACIONAL
	 * @model name="ObjetoRelacional"
	 * @generated
	 * @ordered
	 */
	public static final int OBJETO_RELACIONAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Framework Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FrameworkCategoryList[] VALUES_ARRAY = new FrameworkCategoryList[] { FRONT_CONTROLLER,
			DEPENDENCY_INJECTION, OBJETO_RELACIONAL, };

	/**
	 * A public read-only list of all the '<em><b>Framework Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FrameworkCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Framework Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameworkCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameworkCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameworkCategoryList get(int value) {
		switch (value) {
		case FRONT_CONTROLLER_VALUE:
			return FRONT_CONTROLLER;
		case DEPENDENCY_INJECTION_VALUE:
			return DEPENDENCY_INJECTION;
		case OBJETO_RELACIONAL_VALUE:
			return OBJETO_RELACIONAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FrameworkCategoryList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //FrameworkCategoryList
