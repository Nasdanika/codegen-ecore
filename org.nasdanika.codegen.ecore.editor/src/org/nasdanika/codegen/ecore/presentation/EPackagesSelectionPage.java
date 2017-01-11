package org.nasdanika.codegen.ecore.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.nasdanika.codegen.ecore.EPackageSource;
import org.nasdanika.codegen.ecore.EcoreFactory;

/**
 * EPackages selection page
 */
// Some code was borrowed from the empty emf wizard page.
public class EPackagesSelectionPage extends WizardPage {

	
	public List<EPackageSource> getPackageSources() {
		/*
		 * https://git.eclipse.org/c/emfclient/org.eclipse.emf.ecp.core.git/tree/bundles/org.eclipse.emfforms.editor/src/org/eclipse/emfforms/internal/editor/toolbaractions/LoadEcoreAction.java?id=88ba6b3b2548ba150f4e634dc02b0f15ec1306dd 
		 * ExtendedLoadResourceDialog
		 * org.eclipse.emf.edit.ui.action.LoadResourceAction; LoadResourceDialog;
		 */
		return Collections.emptyList();
	}
	
	/**
	 * 
	 * @param pageName Page name.
	 */
	public EPackagesSelectionPage(String pageName) {
		super(pageName);
	}
	
	/**
	 * (non-Javadoc) Method declared on IDialogPage.
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		initializeDialogUnits(parent);

		setControl(composite);		
		composite.setLayout(new GridLayout(2, false));

		// TODO - create controls - list of selected packages, Add/Remove buttons.
		
	}
								
}