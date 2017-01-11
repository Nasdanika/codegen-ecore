package org.nasdanika.codegen.ecore.presentation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;

/**
 * Viewer which uses a form to edit bounded context generator model information.
 * @author Pavel Vlasov
 *
 */
public class EcoreCodegenViewer extends Viewer {
	
	private EcoreCodegenForm generatorForm;
	private Object input;
	private ISelection selection;

	public EcoreCodegenViewer(EcoreCodegenForm generatorForm) {
		this.generatorForm = generatorForm;
	}

	@Override
	public Control getControl() {
		return generatorForm;
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public ISelection getSelection() {
		return selection;
	}

	@Override
	public void refresh() {
		// TODO - refresh() method to the form, refresh all form viewers.
		System.out.println("refresh()");
	}

	@Override
	public void setInput(Object input) {
		this.input = input;
		if (input instanceof EObject) {
			for (EObject obj = (EObject) input; obj != null; obj = obj.eContainer()) {
				if (obj instanceof EcoreCodeGenerator) {
					generatorForm.setGenerator((EcoreCodeGenerator) obj);
					break;
				}
			}
		}
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		this.selection = selection;
		if (selection instanceof StructuredSelection) {
			Z: for (Object se: ((StructuredSelection) selection).toArray()) {
				if (se instanceof EcoreCodeGenerator) {
					generatorForm.setGenerator((EcoreCodeGenerator) se);
					break;
				}
				if (se instanceof Resource) {
					TreeIterator<EObject> tit = ((Resource) se).getAllContents();
					while (tit.hasNext()) {
						EObject next = tit.next();
						if (next instanceof EcoreCodeGenerator) {
							generatorForm.setGenerator((EcoreCodeGenerator) next);
							break Z;
						}
					}
				}
			}
		}
	}

}
