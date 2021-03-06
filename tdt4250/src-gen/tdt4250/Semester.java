/**
 */
package tdt4250;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link tdt4250.Semester#getProgramme <em>Programme</em>}</li>
 *   <li>{@link tdt4250.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 needsEnoughCredits='self.courses-&gt;collect(course | course.credtis).forAll(sum | sum == 30f)'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see tdt4250.SemesterType
	 * @see #setSeason(SemesterType)
	 * @see tdt4250.Tdt4250Package#getSemester_Season()
	 * @model
	 * @generated
	 */
	SemesterType getSeason();

	/**
	 * Sets the value of the '{@link tdt4250.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see tdt4250.SemesterType
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see tdt4250.Tdt4250Package#getSemester_Programme()
	 * @see tdt4250.Programme#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link tdt4250.Semester#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.Tdt4250Package#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // Semester
