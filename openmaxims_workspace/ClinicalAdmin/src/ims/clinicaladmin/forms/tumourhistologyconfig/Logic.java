//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 4041.27591)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.clinicaladmin.forms.tumourhistologyconfig;

import ims.clinicaladmin.forms.tumourhistologyconfig.GenForm.grdHistologiesRow;
import ims.clinicaladmin.vo.TumourHistologyLiteVo;
import ims.clinicaladmin.vo.TumourHistologyLiteVoCollection;
import ims.clinicaladmin.vo.TumourHistologyVo;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.Control;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Event Handlers region
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		// Initialize form
		initialize();

		// Refresh screen
		open(false);			// WDEV-12455
	}

	@Override
	protected void onFormModeChanged()
	{
		// Update controls state (buttons, context menu options, etc.)
		updateControlsState();
	}

	@Override
	protected void onImbSearchClick() throws PresentationLogicException
	{
		// Set to search after criteria
		form.getLocalContext().setPerformSearch(Boolean.TRUE);
		// Clear selected record from local context
		form.getLocalContext().setSelectedHistology(null);
		
		// Search for results & populate them to the screen
		searchHistology(true);
		
		// Update controls state
		updateControlsState();
	}

	@Override
	protected void onImbClearClick() throws PresentationLogicException
	{
		// Clear screen
		clearScreen();
		
		// Set not to search after criteria
		form.getLocalContext().setPerformSearch(Boolean.FALSE);
		
		// Clear selected record from local context
		form.getLocalContext().setSelectedHistology(null);
		
		// Update controls state
		updateControlsState();
	}

	@Override
	protected void onGrdHistologiesSelectionChanged()
	{
		// Get selection from domain into local context
		form.getLocalContext().setSelectedHistology(domain.getHistology(form.grdHistologies().getValue()));
		// Populate instance controls with selected record
		populateInstanceControlsFromData(form.getLocalContext().getSelectedHistology());

		// Update controls state (buttons, context menu options, etc.)
		updateControlsState();
	}

	@Override
	protected void onGrdHistologiesSelectionCleared() throws ims.framework.exceptions.PresentationLogicException
	{
		// Clear selection from local context
		form.getLocalContext().setSelectedHistology(null);
		// Clear instance controls
		clearInstanceControls();

		// Update controls state (buttons, context menu options, etc.)
		updateControlsState();
	}

	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Prepare screen for a new instance
		newInstance();
	}

	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Prepare screen to edit current instance
		updateInstance();
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Refresh screen on successful save
		if (save())
			open(true);			// WDEV-12455
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Refresh screen
		open(true);				// WDEV-12455
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{
		// Determine user option
		switch (menuItemID)
		{
			case GenForm.ContextMenus.GenericGrid.Add:
				newInstance();
				break;

			case GenForm.ContextMenus.GenericGrid.Update:
				updateInstance();
				break;
		}

	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Form presentation functions
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void initialize() throws FormOpenException
	{
		// Clear local contexts
		form.getLocalContext().setSelectedHistology(null);
		form.getLocalContext().setPerformSearch(Boolean.FALSE);

		// Initialize context menu
		form.getContextMenus().hideAllGenericGridMenuItems();

		form.getContextMenus().getGenericGridAddItem().setText("New");
		form.getContextMenus().getGenericGridUpdateItem().setText("Edit");
		
		// Initially only search for active only - WDEV-12455
		form.chkActiveOnly().setValue(true);
	}

	/**
	 * WDEV-12455
	 * <br>Function used to refresh the screen
	 * @param performSearch - if set to <b>true</b> it will perform a search
	 */
	public void open(boolean performSearch) throws ims.framework.exceptions.PresentationLogicException
	{
		// Clear screen
		clear();

		// Perform search if needed without displaying results - WDEV-12455
		if (performSearch) searchHistology(false);

		// Set form to VIEW mode
		form.setMode(FormMode.VIEW);
	}

	/**
	 * WDEV-12455
	 * Function used to search & display Tumour Histologies to screen
	 * @param displayMessages - set to <b>true</b> it will display the "No result found" message
	 */
	private void searchHistology(boolean displayMessages)
	{
		// List form domain histology records matching search criteria
		TumourHistologyLiteVoCollection histologies = null;
		if (Boolean.TRUE.equals(form.getLocalContext().getPerformSearch()))
			histologies = domain.listHistologies(form.getLocalContext().getSelectedHistology(), form.txtHistology().getValue(), form.chkActiveOnly().getValue());
		else if (form.getLocalContext().getSelectedHistologyIsNotNull())
			histologies = domain.listHistologies(form.getLocalContext().getSelectedHistology(), null, null);
		
		// Clear screen (less the search controls)
		clear();
		
		// Display "No results found" message if none were found
		if (displayMessages && (histologies == null || histologies.size() == 0))
		{
			engine.showMessage("No results found to match search criteria.");
		}
		
		// List results to grid
		populateHistologyGrid(histologies);
		
		// Refresh local context (first attempt to select in grid, then retrieve the value from domain, and then populate instance controls)
		form.grdHistologies().setValue(form.getLocalContext().getSelectedHistology());
		form.getLocalContext().setSelectedHistology(domain.getHistology(form.grdHistologies().getValue()));
		populateInstanceControlsFromData(form.getLocalContext().getSelectedHistology());
	}

	public void newInstance() throws ims.framework.exceptions.PresentationLogicException
	{
		// Clear instance controls
		clearInstanceControls();
		// Clear local context && grid selection
		form.getLocalContext().setSelectedHistology(null);
		form.grdHistologies().setValue(null);

		// Set active as TRUE by default
		form.ctnDetails().chkActive().setValue(Boolean.TRUE);

		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}

	public void updateInstance()
	{
		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}

	public boolean save() throws ims.framework.exceptions.PresentationLogicException
	{
		try
		{
			// Populate instance data from screen
			form.getLocalContext().setSelectedHistology(populateDataFromInstanceControls(form.getLocalContext().getSelectedHistology()));

			// Validate instance data
			String[] errors = form.getLocalContext().getSelectedHistology().validate();

			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}

			// Attempt to save
			form.getLocalContext().setSelectedHistology(domain.saveHistology(form.getLocalContext().getSelectedHistology()));
			
			// Save was successful
			return true;
		}
		// Treat exceptions
		catch (StaleObjectException e)
		{
			e.printStackTrace();
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open(true);
			return false;
		}
		catch (ForeignKeyViolationException e)
		{
			e.printStackTrace();
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (UniqueKeyViolationException e)
		{
			e.printStackTrace();
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (UnqViolationUncheckedException e)
		{
			e.printStackTrace();
			engine.showMessage("Taxonomy Mapping is registered to another record");
			return false;
		}
	}
	
	/**
	 * WDEV-12455
	 * Function used to clear search controls, grid and instance controls
	 */
	public void clearScreen()
	{
		// Clear search controls
		form.txtHistology().setValue(null);
		form.chkActiveOnly().setValue(false);
		
		// Clear grid & instance controls
		clear();
	}

	public void clear()
	{
		// Clear histology grid
		form.grdHistologies().getRows().clear();
		// Clear instance controls
		clearInstanceControls();
	}

	public void clearInstanceControls()
	{
		// Clear instance controls
		form.ctnDetails().txtDescription().setValue(null);
		form.ctnDetails().chkActive().setValue(null);
		form.ctnDetails().ccTaxonomyMappings().clear();
	}

	public void updateControlsState()
	{
		// Collapse / expand details container
		form.ctnDetails().setCollapsed(FormMode.VIEW.equals(form.getMode()) && !form.getLocalContext().getSelectedHistologyIsNotNull());

		// Update controls for VIEW mode
		if (FormMode.VIEW.equals(form.getMode()))
		{
			// EDIT button
			form.btnEdit().setEnabled(true);
			form.btnEdit().setVisible(form.getLocalContext().getSelectedHistologyIsNotNull() && form.grdHistologies().getValue() != null);
		}

		// Taxonomy mappings custom control
		form.ctnDetails().ccTaxonomyMappings().setComponentMode(form.getMode());

		// Update context menu options
		updateContextMenuState();
	}

	private void updateContextMenuState()
	{
		// NEW option should be visible in VIEW mode always, EDIT options should have the same rules as EDIT button
		form.getContextMenus().getGenericGridAddItem().setVisible(FormMode.VIEW.equals(form.getMode()));
		form.getContextMenus().getGenericGridUpdateItem().setVisible(form.getLocalContext().getSelectedHistologyIsNotNull() && form.grdHistologies().getValue() != null);
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Data exchange functions
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------

	private void populateHistologyGrid(TumourHistologyLiteVoCollection histologies)
	{
		// Clear grid
		form.grdHistologies().getRows().clear();
		
		// Terminate function on null value parameter
		if (histologies == null)
			return;
		
		// Iterate through histology collection
		for (TumourHistologyLiteVo histology : histologies)
		{
			if (histology == null)
				continue;
			
			// Add each histology to a grid row
			grdHistologiesRow histologyRow = form.grdHistologies().getRows().newRow();
			
			// Set histology row columns
			histologyRow.setColDescription(histology.getHistologyDescription());
			histologyRow.setColActive(Boolean.TRUE.equals(histology.getIsActive()));
			
			histologyRow.setValue(histology);
		}
	}

	private void populateInstanceControlsFromData(TumourHistologyVo histology)
	{
		// Clear instance controls
		clearInstanceControls();
		
		// Terminate function on null value parameter
		if (histology == null)
			return;
		
		// Set value to instance controls
		form.ctnDetails().txtDescription().setValue(histology.getHistologyDescription());
		form.ctnDetails().chkActive().setValue(Boolean.TRUE.equals(histology.getIsActive()));
		form.ctnDetails().ccTaxonomyMappings().setValue(histology.getTaxonomyMap());
	}

	private TumourHistologyVo populateDataFromInstanceControls(TumourHistologyVo histology)
	{
		// Check for an instantiated parameter (instantiate it if null)
		if (histology == null)
		{
			histology = new TumourHistologyVo();
		}
		
		// Get instance data from screen
		histology.setHistologyDescription(form.ctnDetails().txtDescription().getValue());
		histology.setIsActive(Boolean.TRUE.equals(form.ctnDetails().chkActive().getValue()));
		histology.setTaxonomyMap(form.ctnDetails().ccTaxonomyMappings().getValue());

		return histology;
	}
}
