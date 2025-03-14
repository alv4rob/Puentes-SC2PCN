/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaC.ForLoop#getTypeCounter <em>Type Counter</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getNameCounter <em>Name Counter</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getValueCounter <em>Value Counter</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getGasrestriction <em>Gasrestriction</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getUndeterminedloops <em>Undeterminedloops</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getDeterminedloops <em>Determinedloops</em>}</li>
 *   <li>{@link org.xtext.smaC.ForLoop#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaC.SmaCPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Counter</em>' attribute.
   * @see #setTypeCounter(String)
   * @see org.xtext.smaC.SmaCPackage#getForLoop_TypeCounter()
   * @model
   * @generated
   */
  String getTypeCounter();

  /**
   * Sets the value of the '{@link org.xtext.smaC.ForLoop#getTypeCounter <em>Type Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Counter</em>' attribute.
   * @see #getTypeCounter()
   * @generated
   */
  void setTypeCounter(String value);

  /**
   * Returns the value of the '<em><b>Name Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Counter</em>' attribute.
   * @see #setNameCounter(String)
   * @see org.xtext.smaC.SmaCPackage#getForLoop_NameCounter()
   * @model
   * @generated
   */
  String getNameCounter();

  /**
   * Sets the value of the '{@link org.xtext.smaC.ForLoop#getNameCounter <em>Name Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Counter</em>' attribute.
   * @see #getNameCounter()
   * @generated
   */
  void setNameCounter(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.smaC.ForLoop#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Value Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Counter</em>' attribute.
   * @see #setValueCounter(char)
   * @see org.xtext.smaC.SmaCPackage#getForLoop_ValueCounter()
   * @model
   * @generated
   */
  char getValueCounter();

  /**
   * Sets the value of the '{@link org.xtext.smaC.ForLoop#getValueCounter <em>Value Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Counter</em>' attribute.
   * @see #getValueCounter()
   * @generated
   */
  void setValueCounter(char value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link org.xtext.smaC.ForLoop#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Gasrestriction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.RestrictionGas}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gasrestriction</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Gasrestriction()
   * @model containment="true"
   * @generated
   */
  EList<RestrictionGas> getGasrestriction();

  /**
   * Returns the value of the '<em><b>Restriction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.RestrictionClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Restriction()
   * @model containment="true"
   * @generated
   */
  EList<RestrictionClause> getRestriction();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.Properties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Properties> getProperties();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

  /**
   * Returns the value of the '<em><b>Undeterminedloops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.UnDeterminedLoop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Undeterminedloops</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Undeterminedloops()
   * @model containment="true"
   * @generated
   */
  EList<UnDeterminedLoop> getUndeterminedloops();

  /**
   * Returns the value of the '<em><b>Determinedloops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.ForLoop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Determinedloops</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Determinedloops()
   * @model containment="true"
   * @generated
   */
  EList<ForLoop> getDeterminedloops();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' attribute list.
   * @see org.xtext.smaC.SmaCPackage#getForLoop_Expressions()
   * @model unique="false"
   * @generated
   */
  EList<String> getExpressions();

} // ForLoop
