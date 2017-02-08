package org.nasdanika.codegen.ecore.presentation;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.nasdanika.codegen.ecore.EPackageSource;

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