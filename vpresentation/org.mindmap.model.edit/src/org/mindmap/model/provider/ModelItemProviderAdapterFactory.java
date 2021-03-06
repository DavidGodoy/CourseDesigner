/**
 */
package org.mindmap.model.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mindmap.model.util.ModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Curso} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CursoItemProvider cursoItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Curso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCursoAdapter() {
		if (cursoItemProvider == null) {
			cursoItemProvider = new CursoItemProvider(this);
		}

		return cursoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.PropiedadCurso} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropiedadCursoItemProvider propiedadCursoItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.PropiedadCurso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropiedadCursoAdapter() {
		if (propiedadCursoItemProvider == null) {
			propiedadCursoItemProvider = new PropiedadCursoItemProvider(this);
		}

		return propiedadCursoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ActividadDiagrama} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadDiagramaItemProvider actividadDiagramaItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ActividadDiagrama}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadDiagramaAdapter() {
		if (actividadDiagramaItemProvider == null) {
			actividadDiagramaItemProvider = new ActividadDiagramaItemProvider(
					this);
		}

		return actividadDiagramaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ConceptosDiagrama} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptosDiagramaItemProvider conceptosDiagramaItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ConceptosDiagrama}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptosDiagramaAdapter() {
		if (conceptosDiagramaItemProvider == null) {
			conceptosDiagramaItemProvider = new ConceptosDiagramaItemProvider(
					this);
		}

		return conceptosDiagramaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Tema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemaItemProvider temaItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Tema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemaAdapter() {
		if (temaItemProvider == null) {
			temaItemProvider = new TemaItemProvider(this);
		}

		return temaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Concepto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptoItemProvider conceptoItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Concepto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptoAdapter() {
		if (conceptoItemProvider == null) {
			conceptoItemProvider = new ConceptoItemProvider(this);
		}

		return conceptoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Atributo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoItemProvider atributoItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtributoAdapter() {
		if (atributoItemProvider == null) {
			atributoItemProvider = new AtributoItemProvider(this);
		}

		return atributoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.EnlaceUsaBloque} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnlaceUsaBloqueItemProvider enlaceUsaBloqueItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.EnlaceUsaBloque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnlaceUsaBloqueAdapter() {
		if (enlaceUsaBloqueItemProvider == null) {
			enlaceUsaBloqueItemProvider = new EnlaceUsaBloqueItemProvider(this);
		}

		return enlaceUsaBloqueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.EnlaceEsUn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnlaceEsUnItemProvider enlaceEsUnItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.EnlaceEsUn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnlaceEsUnAdapter() {
		if (enlaceEsUnItemProvider == null) {
			enlaceEsUnItemProvider = new EnlaceEsUnItemProvider(this);
		}

		return enlaceEsUnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.EnlaceUsa} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnlaceUsaItemProvider enlaceUsaItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.EnlaceUsa}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnlaceUsaAdapter() {
		if (enlaceUsaItemProvider == null) {
			enlaceUsaItemProvider = new EnlaceUsaItemProvider(this);
		}

		return enlaceUsaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Actividad} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadItemProvider actividadItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Actividad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadAdapter() {
		if (actividadItemProvider == null) {
			actividadItemProvider = new ActividadItemProvider(this);
		}

		return actividadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ActividadEspacio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadEspacioItemProvider actividadEspacioItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ActividadEspacio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadEspacioAdapter() {
		if (actividadEspacioItemProvider == null) {
			actividadEspacioItemProvider = new ActividadEspacioItemProvider(
					this);
		}

		return actividadEspacioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Tarea} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaItemProvider tareaItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Tarea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTareaAdapter() {
		if (tareaItemProvider == null) {
			tareaItemProvider = new TareaItemProvider(this);
		}

		return tareaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Leccion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeccionItemProvider leccionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Leccion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeccionAdapter() {
		if (leccionItemProvider == null) {
			leccionItemProvider = new LeccionItemProvider(this);
		}

		return leccionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.Prueba} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PruebaItemProvider pruebaItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.Prueba}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPruebaAdapter() {
		if (pruebaItemProvider == null) {
			pruebaItemProvider = new PruebaItemProvider(this);
		}

		return pruebaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ActividadNodoInicial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadNodoInicialItemProvider actividadNodoInicialItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ActividadNodoInicial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadNodoInicialAdapter() {
		if (actividadNodoInicialItemProvider == null) {
			actividadNodoInicialItemProvider = new ActividadNodoInicialItemProvider(
					this);
		}

		return actividadNodoInicialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ActividadNodoFinal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadNodoFinalItemProvider actividadNodoFinalItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ActividadNodoFinal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadNodoFinalAdapter() {
		if (actividadNodoFinalItemProvider == null) {
			actividadNodoFinalItemProvider = new ActividadNodoFinalItemProvider(
					this);
		}

		return actividadNodoFinalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ActividadEnlace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadEnlaceItemProvider actividadEnlaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ActividadEnlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadEnlaceAdapter() {
		if (actividadEnlaceItemProvider == null) {
			actividadEnlaceItemProvider = new ActividadEnlaceItemProvider(this);
		}

		return actividadEnlaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ActividadUnionBifurcacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadUnionBifurcacionItemProvider actividadUnionBifurcacionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ActividadUnionBifurcacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActividadUnionBifurcacionAdapter() {
		if (actividadUnionBifurcacionItemProvider == null) {
			actividadUnionBifurcacionItemProvider = new ActividadUnionBifurcacionItemProvider(
					this);
		}

		return actividadUnionBifurcacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mindmap.model.ArchivoAdjunto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchivoAdjuntoItemProvider archivoAdjuntoItemProvider;

	/**
	 * This creates an adapter for a {@link org.mindmap.model.ArchivoAdjunto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchivoAdjuntoAdapter() {
		if (archivoAdjuntoItemProvider == null) {
			archivoAdjuntoItemProvider = new ArchivoAdjuntoItemProvider(this);
		}

		return archivoAdjuntoItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cursoItemProvider != null)
			cursoItemProvider.dispose();
		if (propiedadCursoItemProvider != null)
			propiedadCursoItemProvider.dispose();
		if (actividadDiagramaItemProvider != null)
			actividadDiagramaItemProvider.dispose();
		if (conceptosDiagramaItemProvider != null)
			conceptosDiagramaItemProvider.dispose();
		if (temaItemProvider != null)
			temaItemProvider.dispose();
		if (conceptoItemProvider != null)
			conceptoItemProvider.dispose();
		if (atributoItemProvider != null)
			atributoItemProvider.dispose();
		if (enlaceUsaBloqueItemProvider != null)
			enlaceUsaBloqueItemProvider.dispose();
		if (enlaceEsUnItemProvider != null)
			enlaceEsUnItemProvider.dispose();
		if (enlaceUsaItemProvider != null)
			enlaceUsaItemProvider.dispose();
		if (actividadItemProvider != null)
			actividadItemProvider.dispose();
		if (actividadEspacioItemProvider != null)
			actividadEspacioItemProvider.dispose();
		if (tareaItemProvider != null)
			tareaItemProvider.dispose();
		if (leccionItemProvider != null)
			leccionItemProvider.dispose();
		if (pruebaItemProvider != null)
			pruebaItemProvider.dispose();
		if (actividadNodoInicialItemProvider != null)
			actividadNodoInicialItemProvider.dispose();
		if (actividadNodoFinalItemProvider != null)
			actividadNodoFinalItemProvider.dispose();
		if (actividadEnlaceItemProvider != null)
			actividadEnlaceItemProvider.dispose();
		if (actividadUnionBifurcacionItemProvider != null)
			actividadUnionBifurcacionItemProvider.dispose();
		if (archivoAdjuntoItemProvider != null)
			archivoAdjuntoItemProvider.dispose();
	}

}
