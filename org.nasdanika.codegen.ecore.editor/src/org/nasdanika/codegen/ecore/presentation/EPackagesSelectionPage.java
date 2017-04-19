package org.nasdanika.codegen.ecore.presentation;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * EPackages selection page
 */
// Some code was borrowed from the empty emf wizard page.
public class EPackagesSelectionPage extends WizardPage {
	
	private org.eclipse.swt.widgets.List list;
	private IFile modelFile;
	
	public String[] getResourceURIs() {
		return list.getItems();
	}
	
	/**
	 * 
	 * @param pageName Page name.
	 * @param newFileCreationPage 
	 */
	public EPackagesSelectionPage(String pageName, IFile modelFile) {
		super(pageName);
		this.modelFile = modelFile;
	}
	
	/**
	 * (non-Javadoc) Method declared on IDialogPage.
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		initializeDialogUnits(parent);

		setControl(composite);		
		composite.setLayout(new GridLayout(2, false));
		
		list = new org.eclipse.swt.widgets.List(composite, SWT.NONE); 
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		Button btnAddPackage = new Button(composite, SWT.NONE);
		btnAddPackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		btnAddPackage.setText("Add");
		
		Button btnRemove = new Button(composite, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnRemove.setEnabled(false);
		btnRemove.setText("Remove");
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				list.remove(list.getSelectionIndices());
				setPageComplete(list.getItemCount() > 0);
			}
		});

		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				btnRemove.setEnabled(list.getSelectionCount() > 0);
			}
		});
		btnAddPackage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {				
				ExtendedLoadResourceDialog resourceDialog = new ExtendedLoadResourceDialog(composite.getShell(), null);
				if (resourceDialog.open() == Window.OK) {
					for (URI uri: resourceDialog.getURIs()) {
						list.add(uri.toString());						
					}
					setPageComplete(list.getItemCount() > 0);
					if (list.getSelectionCount() == 0 && list.getItemCount() > 0) {
						list.select(0);
						btnRemove.setEnabled(true);
					}
				}
			}
		});

		if (modelFile != null) {
			URI modelFileURI = URI.createPlatformResourceURI(modelFile.getProject().getName()+"/"+modelFile.getProjectRelativePath().toString(), true);
			list.add(modelFileURI.toString());
		}
		
		setPageComplete(list.getItemCount() > 0);
		if (list.getSelectionCount() == 0 && list.getItemCount() > 0) {
			list.select(0);
			btnRemove.setEnabled(true);
		}
		
	}
									
}