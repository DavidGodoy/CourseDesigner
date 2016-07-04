/**
 */
package org.mindmap.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leccion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.Leccion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.Leccion#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link org.mindmap.model.Leccion#getPorcentajeNota <em>Porcentaje Nota</em>}</li>
 *   <li>{@link org.mindmap.model.Leccion#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link org.mindmap.model.Leccion#getContenidos <em>Contenidos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getLeccion()
 * @model
 * @generated
 */
public interface Leccion extends ActividadNodo, CursoElement {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see org.mindmap.model.ModelPackage#getLeccion_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Leccion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Profesor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profesor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profesor</em>' attribute.
	 * @see #setProfesor(String)
	 * @see org.mindmap.model.ModelPackage#getLeccion_Profesor()
	 * @model
	 * @generated
	 */
	String getProfesor();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Leccion#getProfesor <em>Profesor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profesor</em>' attribute.
	 * @see #getProfesor()
	 * @generated
	 */
	void setProfesor(String value);

	/**
	 * Returns the value of the '<em><b>Porcentaje Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porcentaje Nota</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porcentaje Nota</em>' attribute.
	 * @see #setPorcentajeNota(float)
	 * @see org.mindmap.model.ModelPackage#getLeccion_PorcentajeNota()
	 * @model
	 * @generated
	 */
	float getPorcentajeNota();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Leccion#getPorcentajeNota <em>Porcentaje Nota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porcentaje Nota</em>' attribute.
	 * @see #getPorcentajeNota()
	 * @generated
	 */
	void setPorcentajeNota(float value);

	/**
	 * Returns the value of the '<em><b>Duracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duracion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duracion</em>' attribute.
	 * @see #setDuracion(float)
	 * @see org.mindmap.model.ModelPackage#getLeccion_Duracion()
	 * @model
	 * @generated
	 */
	float getDuracion();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Leccion#getDuracion <em>Duracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duracion</em>' attribute.
	 * @see #getDuracion()
	 * @generated
	 */
	void setDuracion(float value);

	/**
	 * Returns the value of the '<em><b>Contenidos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenidos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenidos</em>' containment reference.
	 * @see #setContenidos(ArchivoAdjunto)
	 * @see org.mindmap.model.ModelPackage#getLeccion_Contenidos()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ArchivoAdjunto getContenidos();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Leccion#getContenidos <em>Contenidos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenidos</em>' containment reference.
	 * @see #getContenidos()
	 * @generated
	 */
	void setContenidos(ArchivoAdjunto value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ActividadEnlace.allInstances()->exists(v1,v2|v1.origen=self and v2.destino=self)'"
	 * @generated
	 */
	boolean EnlacesCompletos(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Leccion
