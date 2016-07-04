package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.Workspace;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileDownloadStatus;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileInformation;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileTransferManager;
import org.eclipse.emf.emfstore.internal.client.model.impl.ProjectSpaceBase;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESLocalProjectImpl;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.emf.emfstore.internal.server.exceptions.FileTransferException;
import org.eclipse.emf.emfstore.internal.server.model.FileIdentifier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.ArchivoAdjunto;
import org.mindmap.model.Curso;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.Leccion;
import org.mindmap.model.Tarea;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ModelPackageImpl;
import org.mindmap.ui.diagram.conceptsDiagram.wizards.MiCheckoutProjectComposite;
import org.mindmap.ui.diagram.conceptsDiagram.wizards.MiCheckoutProjectCompositeImpl;
import org.mindmap.ui.diagram.conceptsDiagram.wizards.MiCheckoutProjectWizard;
import org.eclipse.emf.emfstore.internal.server.core.AbstractSubEmfstoreInterface;
public class Checkout extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		final IStructuredSelection ssel = (IStructuredSelection) selection;

		// A�adimos cada proyecto seleccionado a la lista checkouts
		final List<ECPCheckoutSource> checkouts = new ArrayList<ECPCheckoutSource>();
		for (final Iterator<?> it = ssel.iterator(); it.hasNext();) {
			final Object element = it.next();
			if (element instanceof ECPCheckoutSource) {
				final ECPCheckoutSource checkoutSource = (ECPCheckoutSource) element;
				checkouts.add(checkoutSource);
			}
		}
		Shell shell = HandlerUtil.getActiveShell(event);

		// Abrimos nuestro Wzard para que el usuario ponga nombres v�lidos
		List<ECPCheckoutSource> checkoutObjects = checkouts;
		boolean error = false;
		for (final ECPCheckoutSource checkoutSource : checkoutObjects) {

			final MiCheckoutProjectComposite checkoutCompposite = new MiCheckoutProjectCompositeImpl(
					checkoutSource);
			final MiCheckoutProjectWizard wizard = new MiCheckoutProjectWizard();
			wizard.setCompositeProvider(checkoutCompposite);

			final WizardDialog wd = new WizardDialog(shell, wizard);

			final int result = wd.open();
			if (result == Window.OK) {

				final String projectName = checkoutCompposite.getProjectName();
				final ECPProperties projectProperties = checkoutCompposite
						.getProjectProperties();
				
				try {
					// Funcion checkout
					checkoutSource.checkout(projectName, projectProperties);
					
					//Descargar archivos adjuntos
					ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
					List<ESLocalProject> lista = workspace.getLocalProjects();
					ProjectSpace ps = ProjectControl
							.getActualProjectSpace();
					int i=ProjectControl.buscarProyectoLocal(lista,projectName);
					ESLocalProject p = lista.get(i);
					Curso curso=(Curso)p.getModelElements().get(0);
					CursoDiagrama diagramaAct=(CursoDiagrama)curso.getDiagramas().get(1);
					EList<Actividad> listaActividades = diagramaAct.getActividades();
					for(int cont=0;cont<listaActividades.size();cont++)
					{
						Actividad act = listaActividades.get(cont);
						EList<ActividadEspacio> listaEspacios = act.getEspacios();
						for (int j=0;j<listaEspacios.size();j++)
						{
							ActividadEspacio espacio = listaEspacios.get(j);
							EList<Tarea> tareas = espacio.getTareas();
							EList<Leccion> lecciones = espacio.getLecciones();
							for(int k=0;k<tareas.size();k++)
							{
								ArchivoAdjunto archivo = tareas.get(k).getContenidos();
								if(archivo!=null)
								{
									
								//	try {
									//	FileDownloadStatus file = ps.getFile(archivo.getFileIdentifier());
										//file.addTransferFinishedObserver(o);
										//file.addTransferFinishedObserver(o);
									//	file.addDefaultFailObserver();
										//file.isTransferFinished()
								//	} catch (FileTransferException e) {
										// TODO Bloque catch generado autom�ticamente
								//		e.printStackTrace();
								//	}
								}
							}
							for(int k=0;k<lecciones.size();k++)
							{
								
							}
						}
						
					}
				//	Espacioe=a.getEspacios();
					
					
					
					
				} catch (final ECPProjectWithNameExistsException ex) {
					error = true;
					showError(
							shell,
							"Descargar","No se pudo realizar la descarga");//, "El proyecto con nombre " + projectName //$NON-NLS-1$ //$NON-NLS-2$
									//+ " already exists in the workspace."); //$NON-NLS-1$
				}
				
			}
			if (!error) {
				MessageDialog.openInformation(shell, "Descargar", "Descarga correcta");
			}
		}

		return null;
	}

	private static void showError(Shell shell, String title, String message) {
		MessageDialog.openError(shell, title, message);
	}

}
