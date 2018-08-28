/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Framework Kind List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameworkKindList()
 * @model
 * @generated
 */
public enum FrameworkKindList implements Enumerator {
	/**
	 * The '<em><b>Standard Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_SPECIFICATION(0, "StandardSpecification", "StandardSpecification"),

	/**
	 * The '<em><b>Framework Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAMEWORK_SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORK_SPECIFICATION(1, "FrameworkSpecification", "FrameworkSpecification"),

	/**
	 * The '<em><b>Framework Implementation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAMEWORK_IMPLEMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORK_IMPLEMENTATION(2, "FrameworkImplementation", "FrameworkImplementation"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(3, "Custom", "Custom");

	/**
	 * The '<em><b>Standard Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Specification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_SPECIFICATION
	 * @model name="StandardSpecification"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_SPECIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Framework Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Framework Specification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAMEWORK_SPECIFICATION
	 * @model name="FrameworkSpecification"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORK_SPECIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Framework Implementation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Framework Implementation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAMEWORK_IMPLEMENTATION
	 * @model name="FrameworkImplementation"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORK_IMPLEMENTATION_VALUE = 2;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="Custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Framework Kind List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FrameworkKindList[] VALUES_ARRAY = new FrameworkKindList[] { STANDARD_SPECIFICATION,
			FRAMEWORK_SPECIFICATION, FRAMEWORK_IMPLEMENTATION, CUSTOM, };

	/**
	 * A public read-only list of all the '<em><b>Framework Kind List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FrameworkKindList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Framework Kind List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameworkKindList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkKindList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Kind List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameworkKindList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkKindList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Kind List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameworkKindList get(int value) {
		switch (value) {
		case STANDARD_SPECIFICATION_VALUE:
			return STANDARD_SPECIFICATION;
		case FRAMEWORK_SPECIFICATION_VALUE:
			return FRAMEWORK_SPECIFICATION;
		case FRAMEWORK_IMPLEMENTATION_VALUE:
			return FRAMEWORK_IMPLEMENTATION;
		case CUSTOM_VALUE:
			return CUSTOM;
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
	private FrameworkKindList(int value, String name, String literal) {
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

} //FrameworkKindList
