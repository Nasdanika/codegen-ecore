package org.nasdanika.codegen.ecore.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * Generation targets selection page
 */
public class GenerationTargetsSelectionPage extends WizardPage {
	
	private List<Button> generationTargetCheckboxes = new ArrayList<>();
	
	public List<String> getGenerationTargets() {
		return generationTargetCheckboxes.stream()
				.filter(b -> b.getSelection())
				.map(b -> (String) b.getData())
				.collect(Collectors.toList());
	}
	
	/**
	 * 
	 * @param pageName Page name.
	 * @param newFileCreationPage 
	 */
	public GenerationTargetsSelectionPage(String pageName) {
		super(pageName);
	}
	
	/**
	 * (non-Javadoc) Method declared on IDialogPage.
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		initializeDialogUnits(parent);

		setControl(composite);
		composite.setLayout(new GridLayout(1, false));
		
		List<IConfigurationElement> gtl = new ArrayList<>();
		for (IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor(EcoreCodegenForm.GENERATION_TARGET_EXTENSION_POINT_ID)) {
			if ("generation_target".equals(ce.getName())) {
				gtl.add(ce);
			}
		}					
		Collections.sort(gtl, (ce1, ce2) -> ce1.getAttribute("name").compareTo(ce2.getAttribute("name")));
		
		for (IConfigurationElement ce: gtl) {
			Button btnGenerationTarget = new Button(composite, SWT.CHECK);
			btnGenerationTarget.setText(ce.getAttribute("name"));
			btnGenerationTarget.setData(ce.getContributor().getName()+"/"+ce.getAttribute("id"));
			generationTargetCheckboxes.add(btnGenerationTarget);
			btnGenerationTarget.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setPageComplete(false);
					for (Button b: generationTargetCheckboxes) {
						if (b.getSelection()) {
							setPageComplete(true);
							break;
						}
					}
				}
			});
		}
		
		setPageComplete(false);
		
	}
									
}