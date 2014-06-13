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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.70 build 3454.29123)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.icp.forms.icppatientselect;

import ims.core.vo.HcpLiteVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;
import ims.icp.forms.icppatientselect.GenForm.grdICPListRow;
import ims.icp.vo.ICPLiteVo;
import ims.icp.vo.ICPLiteVoCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	// -----------------------------------------------------------------------------------------------------------------------------------------------
	// Events Region
	// -----------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 *	FormOpen event handler (called when form is opened)
	 *		- call initialize() method;
	 *		- call open() method;
	 */
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		// Initialize form controls
		initialize();
		
		// Populate form with initial data
		open();
	}

	/**
	 *	FormModeChanged event handler (called when changes modes from VIEW to EDIT or EDIT to VIEW)
	 *		- call updateControlsState(); 
	 */
	protected void onFormModeChanged()
	{
		updateControlsState();
	}

	/**
	 * 
	 */
	protected void onBtnSaveClick() throws PresentationLogicException
	{
		if (save())
		{
			engine.close(DialogResult.OK);
		}
	}

	/**
	 * 
	 */
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}

	/**
	 * 
	 */
	protected void onGrdICPListSelectionChanged() throws PresentationLogicException
	{
		updateControlsState();
	}

	/**
	 * 
	 */
	protected void onGrdICPListSelectionCleared() throws PresentationLogicException
	{
		updateControlsState();
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------
	// Form Function region
	// -------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 */
	public void initialize() throws FormOpenException
	{
		super.initialize();
	}

	/**
	 * 
	 */
	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		try
		{
			displayListICP(domain.listICP(form.getGlobalContext().ICP.getProcedureID(), form.getGlobalContext().ICP.getService()));

			form.setMode(FormMode.EDIT);

			form.getGlobalContext().ICP.setProcedureID(null);
			form.getGlobalContext().ICP.setService(null);
		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage(e.getMessage());
		}
	}

	/**
	 * 
	 */
	public void updateControlsState()
	{
		form.btnSave().setVisible(form.grdICPList().getValue() instanceof ICPLiteVo);
	}

	/**
	 * 
	 */
	public void clearInstanceControls()
	{
		form.grdICPList().getRows().clear();

		updateControlsState();
	}

	/**
	 * 
	 */
	public void newInstance() throws ims.framework.exceptions.PresentationLogicException
	{
		// Function is not needed
	}

	/**
	 * 
	 */
	public void updateInstance()
	{
		// Function is not needed
	}

	/**
	 * 
	 */
	public boolean save() throws ims.framework.exceptions.PresentationLogicException
	{
		try
		{
			HcpLiteVo hcpLiteVo = (HcpLiteVo) domain.getHcpLiteUser();
			if (hcpLiteVo != null && hcpLiteVo.getHcpTypeIsNotNull())
			{
				domain.createPatientICP(form.getGlobalContext().Core.getCurrentCareContext(), form.getGlobalContext().Core.getPatientShort(),
						form.getGlobalContext().CareUk.getCatsReferral(), domain.getICP(form.grdICPList().getValue()), hcpLiteVo);
			}
			else
			{
				engine.showMessage("To link an ICP to a Referral the logged in user needs to be a HCP.");
			}
		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (ForeignKeyViolationException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (UniqueKeyViolationException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (CodingRuntimeException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}

		return true;
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------
	// Extended Logic Region
	// -------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 */
	private void displayListICP(ICPLiteVoCollection listICP)
	{
		// Clear the grid
		form.grdICPList().getRows().clear();

		// Check the list
		if (listICP == null || listICP.size() == 0)
			return;

		for (int i = 0; i < listICP.size(); i++)
		{
			ICPLiteVo icp = listICP.get(i);

			if (icp != null)
			{
				displayICPRow(form.grdICPList().getRows().newRow(), icp);
			}
		}
	}

	/**
	 * 
	 * @param row
	 * @param icp
	 */
	private void displayICPRow(grdICPListRow row, ICPLiteVo icp)
	{
		if (row == null)
			throw new CodingRuntimeException("Major Logical Error - Can not set a value to a null row");

		if (icp == null)
			return;

		// Set up the row
		row.setValue(icp);

		row.setColICP(icp.getName());
	}
}