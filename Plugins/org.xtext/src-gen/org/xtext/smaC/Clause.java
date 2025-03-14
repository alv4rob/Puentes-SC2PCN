/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaC.Clause#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getInputParams <em>Input Params</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getVisibilityAccess <em>Visibility Access</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getPersonalizedModifier <em>Personalized Modifier</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getInputParamsModifier <em>Input Params Modifier</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getPredefinedModifier <em>Predefined Modifier</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getOverride <em>Override</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getOutputParams <em>Output Params</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getMappingProperties <em>Mapping Properties</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getUndeterminedloops <em>Undeterminedloops</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getDeterminedloops <em>Determinedloops</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getPredefinedFunctions <em>Predefined Functions</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.smaC.Clause#getInputParamsEvent <em>Input Params Event</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaC.SmaCPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smaC.SmaCPackage#getClause_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smaC.Clause#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.InputParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Params</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_InputParams()
   * @model containment="true"
   * @generated
   */
  EList<InputParam> getInputParams();

  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(String)
   * @see org.xtext.smaC.SmaCPackage#getClause_Constant()
   * @model
   * @generated
   */
  String getConstant();

  /**
   * Sets the value of the '{@link org.xtext.smaC.Clause#getConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #getConstant()
   * @generated
   */
  void setConstant(String value);

  /**
   * Returns the value of the '<em><b>Virtual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual</em>' attribute.
   * @see #setVirtual(String)
   * @see org.xtext.smaC.SmaCPackage#getClause_Virtual()
   * @model
   * @generated
   */
  String getVirtual();

  /**
   * Sets the value of the '{@link org.xtext.smaC.Clause#getVirtual <em>Virtual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Virtual</em>' attribute.
   * @see #getVirtual()
   * @generated
   */
  void setVirtual(String value);

  /**
   * Returns the value of the '<em><b>Visibility Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.smaC.Visibility}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility Access</em>' attribute.
   * @see org.xtext.smaC.Visibility
   * @see #setVisibilityAccess(Visibility)
   * @see org.xtext.smaC.SmaCPackage#getClause_VisibilityAccess()
   * @model
   * @generated
   */
  Visibility getVisibilityAccess();

  /**
   * Sets the value of the '{@link org.xtext.smaC.Clause#getVisibilityAccess <em>Visibility Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility Access</em>' attribute.
   * @see org.xtext.smaC.Visibility
   * @see #getVisibilityAccess()
   * @generated
   */
  void setVisibilityAccess(Visibility value);

  /**
   * Returns the value of the '<em><b>Personalized Modifier</b></em>' reference list.
   * The list contents are of type {@link org.xtext.smaC.Modifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Personalized Modifier</em>' reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_PersonalizedModifier()
   * @model
   * @generated
   */
  EList<Modifier> getPersonalizedModifier();

  /**
   * Returns the value of the '<em><b>Input Params Modifier</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.InputParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Params Modifier</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_InputParamsModifier()
   * @model containment="true"
   * @generated
   */
  EList<InputParam> getInputParamsModifier();

  /**
   * Returns the value of the '<em><b>Predefined Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.smaC.InputModifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predefined Modifier</em>' attribute.
   * @see org.xtext.smaC.InputModifier
   * @see #setPredefinedModifier(InputModifier)
   * @see org.xtext.smaC.SmaCPackage#getClause_PredefinedModifier()
   * @model
   * @generated
   */
  InputModifier getPredefinedModifier();

  /**
   * Sets the value of the '{@link org.xtext.smaC.Clause#getPredefinedModifier <em>Predefined Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predefined Modifier</em>' attribute.
   * @see org.xtext.smaC.InputModifier
   * @see #getPredefinedModifier()
   * @generated
   */
  void setPredefinedModifier(InputModifier value);

  /**
   * Returns the value of the '<em><b>Override</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' containment reference.
   * @see #setOverride(OverrideModifier)
   * @see org.xtext.smaC.SmaCPackage#getClause_Override()
   * @model containment="true"
   * @generated
   */
  OverrideModifier getOverride();

  /**
   * Sets the value of the '{@link org.xtext.smaC.Clause#getOverride <em>Override</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' containment reference.
   * @see #getOverride()
   * @generated
   */
  void setOverride(OverrideModifier value);

  /**
   * Returns the value of the '<em><b>Output Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.OutputParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Params</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_OutputParams()
   * @model containment="true"
   * @generated
   */
  EList<OutputParam> getOutputParams();

  /**
   * Returns the value of the '<em><b>Restriction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.RestrictionClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_Restriction()
   * @model containment="true"
   * @generated
   */
  EList<RestrictionClause> getRestriction();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.Properties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Properties> getProperties();

  /**
   * Returns the value of the '<em><b>Mapping Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.Mapping}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Properties</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_MappingProperties()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMappingProperties();

  /**
   * Returns the value of the '<em><b>Undeterminedloops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.UnDeterminedLoop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Undeterminedloops</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_Undeterminedloops()
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
   * @see org.xtext.smaC.SmaCPackage#getClause_Determinedloops()
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
   * @see org.xtext.smaC.SmaCPackage#getClause_Expressions()
   * @model unique="false"
   * @generated
   */
  EList<String> getExpressions();

  /**
   * Returns the value of the '<em><b>Predefined Functions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predefined Functions</em>' attribute list.
   * @see org.xtext.smaC.SmaCPackage#getClause_PredefinedFunctions()
   * @model unique="false"
   * @generated
   */
  EList<String> getPredefinedFunctions();

  /**
   * Returns the value of the '<em><b>Event</b></em>' reference list.
   * The list contents are of type {@link org.xtext.smaC.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_Event()
   * @model
   * @generated
   */
  EList<Event> getEvent();

  /**
   * Returns the value of the '<em><b>Input Params Event</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.InputParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Params Event</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getClause_InputParamsEvent()
   * @model containment="true"
   * @generated
   */
  EList<InputParam> getInputParamsEvent();

} // Clause
