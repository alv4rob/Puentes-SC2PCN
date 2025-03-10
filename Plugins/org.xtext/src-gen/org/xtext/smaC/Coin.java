/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coin</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.smaC.SmaCPackage#getCoin()
 * @model
 * @generated
 */
public enum Coin implements Enumerator
{
  /**
   * The '<em><b>ETHER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ETHER_VALUE
   * @generated
   * @ordered
   */
  ETHER(0, "ETHER", "ether"),

  /**
   * The '<em><b>WEI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEI_VALUE
   * @generated
   * @ordered
   */
  WEI(1, "WEI", "wei"),

  /**
   * The '<em><b>GWEI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GWEI_VALUE
   * @generated
   * @ordered
   */
  GWEI(2, "GWEI", "gwei"),

  /**
   * The '<em><b>PWEI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PWEI_VALUE
   * @generated
   * @ordered
   */
  PWEI(3, "PWEI", "pwei"),

  /**
   * The '<em><b>FINNEY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINNEY_VALUE
   * @generated
   * @ordered
   */
  FINNEY(4, "FINNEY", "finney"),

  /**
   * The '<em><b>SZABO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SZABO_VALUE
   * @generated
   * @ordered
   */
  SZABO(5, "SZABO", "szabo");

  /**
   * The '<em><b>ETHER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ETHER
   * @model literal="ether"
   * @generated
   * @ordered
   */
  public static final int ETHER_VALUE = 0;

  /**
   * The '<em><b>WEI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEI
   * @model literal="wei"
   * @generated
   * @ordered
   */
  public static final int WEI_VALUE = 1;

  /**
   * The '<em><b>GWEI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GWEI
   * @model literal="gwei"
   * @generated
   * @ordered
   */
  public static final int GWEI_VALUE = 2;

  /**
   * The '<em><b>PWEI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PWEI
   * @model literal="pwei"
   * @generated
   * @ordered
   */
  public static final int PWEI_VALUE = 3;

  /**
   * The '<em><b>FINNEY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINNEY
   * @model literal="finney"
   * @generated
   * @ordered
   */
  public static final int FINNEY_VALUE = 4;

  /**
   * The '<em><b>SZABO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SZABO
   * @model literal="szabo"
   * @generated
   * @ordered
   */
  public static final int SZABO_VALUE = 5;

  /**
   * An array of all the '<em><b>Coin</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Coin[] VALUES_ARRAY =
    new Coin[]
    {
      ETHER,
      WEI,
      GWEI,
      PWEI,
      FINNEY,
      SZABO,
    };

  /**
   * A public read-only list of all the '<em><b>Coin</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Coin> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Coin</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Coin get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Coin result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Coin</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Coin getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Coin result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Coin</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Coin get(int value)
  {
    switch (value)
    {
      case ETHER_VALUE: return ETHER;
      case WEI_VALUE: return WEI;
      case GWEI_VALUE: return GWEI;
      case PWEI_VALUE: return PWEI;
      case FINNEY_VALUE: return FINNEY;
      case SZABO_VALUE: return SZABO;
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
  private Coin(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Coin
