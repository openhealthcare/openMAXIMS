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
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.38 build 2144.16652)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.clinical.forms.poacchecklist;

import ims.clinical.forms.poacchecklist.GenForm.grdItemRow;
import ims.clinical.vo.lookups.LookupHelper;
import ims.clinical.vo.lookups.ChecklistItemCollection;
import ims.clinical.vo.POACCheckListVo;
import ims.clinical.vo.CheckListItemsVo;
import ims.clinical.vo.CheckListItemsVoCollection;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	/* (non-Javadoc)
	 * @see ims.clinical.forms.poacchecklist.Handlers#onFormOpen()
	 */
	protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{				
		if  (loadgrid() == false)
			throw new FormOpenException("The ChecklistItem lookup must first be populated before this form can be used. ");
			
		open();
			
	}

	protected void open()
	{		
		if (form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull())
		{
			POACCheckListVo voPoacCheckList = domain.getPOACCheckList(form.getGlobalContext().Core.getCurrentClinicalContact());
			form.getLocalContext().setpoacCheckListVo(voPoacCheckList);
			populateScreenFromData(voPoacCheckList);
		}
		
		boolean visableButtons = form.getLocalContext().getpoacCheckListVo()== null  ||
	    						 form.getLocalContext().getpoacCheckListVo().getID_POACChecklist() == null;
		
		setNewUpdateButtonEnabled(visableButtons,!visableButtons);		
		
	}
	
	private void setNewUpdateButtonEnabled(boolean enableNew,boolean enableUpdate)
	{
		form.btnNew().setEnabled(enableNew);
		form.btnUpdate().setEnabled(enableUpdate);				
	}

	private void populateScreenFromData(POACCheckListVo voPoacCheckList)
	{
		if (voPoacCheckList != null)
		{
			if (voPoacCheckList.getID_POACChecklistIsNotNull())
			{
				GenForm.grdItemRow row;
				CheckListItemsVo voCheckListItem;
				for (int i=0; i < voPoacCheckList.getChecklistItems().size();i++)
				{						
					voCheckListItem = voPoacCheckList.getChecklistItems().get(i);
					if (voCheckListItem.getChecklistItemIsNotNull())
					{
						row = form.grdItem().getRowByValue(voCheckListItem.getChecklistItem());
						if (row != null)
						{
							if (voCheckListItem.getAbsentPresentIsNotNull())
								row.setcolSelect(voCheckListItem.getAbsentPresent());
						
							if (voCheckListItem.getChecklistItemIsNotNull())
									row.setcolItem(voCheckListItem.getChecklistItem());
							
							if (voCheckListItem.getCommentIsNotNull())
								row.setcolComments(voCheckListItem.getComment());									
						}
					}
				}
			}
		}		
	}

	/**
	 * loads the grid with  ims.clinical.vo.lookups.ChecklistItem values
	 * <p>
	 * @return      void
	 */
	protected boolean loadgrid()
	{
		ChecklistItemCollection collkup = LookupHelper.getChecklistItem(domain.getLookupService());
		if (collkup != null)
		{
			if (collkup.size() == 0)
				return false;
			form.grdItem().getRows().clear();
			for(int i=0; i < collkup.size();i++)
			{
				GenForm.grdItemRow row = form.grdItem().getRows().newRow();
				row.setValue(collkup.get(i));
				row.setcolItem(collkup.get(i));				
			}			
		}
		else
			return false;
		
		return true;
	}
	/* (non-Javadoc)
	 * @see ims.clinical.forms.poacchecklist.Handlers#onBtnUpdateClick()
	 */
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		setCommentsReadOnlyStatus();
		setNewUpdateButtonEnabled(false,false);
	}
	protected void setCommentsReadOnlyStatus()
	{
		for (int i=0; i < form.grdItem().getRows().size(); i++)
		{
			if (form.grdItem().getRows().get(i).getcolSelect() != null)
				form.grdItem().getRows().get(i).setcolCommentsReadOnly(false);
			else
				form.grdItem().getRows().get(i).setcolCommentsReadOnly(true);
		}		
	}
	/**
	 * populates the data to be stored from the screen
	 * <p>
	 * @return      void
	 */
	protected void populateDataFromScreen()
	{
		POACCheckListVo poacChkList = form.getLocalContext().getpoacCheckListVo();
		
		if (poacChkList != null)
		{
			if (poacChkList.getChecklistItemsIsNotNull())
				poacChkList.getChecklistItems().clear();				
		}
		else
		{
			poacChkList = new POACCheckListVo();
			poacChkList.setClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact());
		}

		//go through list and add to vo
		GenForm.grdItemRow row;
		CheckListItemsVoCollection volcollChkListItems = new CheckListItemsVoCollection();
		for(int i=0;i<form.grdItem().getRows().size();i++)
		{
			row = form.grdItem().getRows().get(i);
			if (row.getcolSelect() != null)
			{
				CheckListItemsVo voChkListItem = new CheckListItemsVo();				
				voChkListItem.setAbsentPresent(row.getcolSelect());
				voChkListItem.setChecklistItem(row.getcolItem());
				voChkListItem.setComment(row.getcolComments());
				volcollChkListItems.add(voChkListItem);				
			}
		}
		
		if (volcollChkListItems.size() == 0)
			poacChkList.setChecklistItems(null);
		else			
			poacChkList.setChecklistItems(volcollChkListItems);
		
		form.getLocalContext().setpoacCheckListVo(poacChkList);
	}
	/* (non-Javadoc)
	 * @see ims.clinical.forms.poacchecklist.Handlers#onBtnSaveClick()
	 */
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateDataFromScreen();		
		POACCheckListVo poacChkList = form.getLocalContext().getpoacCheckListVo();
		
		String[] arrErrors = poacChkList.validate();
		if(arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return;
		}
		
		
		if (validateCheckList() == false)
		{
			engine.showMessage("You must select an item before comments can be saved.");
			return;
		}
				
		
		try
		{
			domain.savePOACCheckList(poacChkList);
			form.btnUpdate().setText("Update");
		}
		catch(StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			setCommentsReadOnlyStatus();
			return;
		}
			
		form.setMode(FormMode.VIEW);
		open();
	}

	private boolean validateCheckList()
	{
		// WDEV-336 Comments must be accompanied by a selection. 
		for (int i=0; i < form.grdItem().getRows().size(); i++)
		{
			if ((form.grdItem().getRows().get(i).getcolComments() != null &&
				form.grdItem().getRows().get(i).getcolSelect() == null))
			{
				return false;				
			}
		}
		return true;		
	}
	
	/* (non-Javadoc)
	 * @see ims.clinical.forms.poacchecklist.Handlers#onBtnCancelClick()
	 */
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
		open();
	}

	/* (non-Javadoc)
	 * @see ims.clinical.forms.poacchecklist.Handlers#onBtnNewClick()
	 */
	protected void onBtnNewClick() throws PresentationLogicException 
	{
		form.setMode(FormMode.EDIT);
		setNewUpdateButtonEnabled(false,false);
	}

	/* (non-Javadoc)
	 * @see ims.clinical.forms.poacchecklist.Handlers#ongrdItemGridcolSelectColumnAnswerBoxValueChanged(ims.clinical.forms.poacchecklist.GenForm.grdItemRow)
	 */
	protected void ongrdItemGridcolSelectColumnAnswerBoxValueChanged(grdItemRow row) throws PresentationLogicException 
	{
		if (row.getcolSelect() == null)
		{
			//delete the comment
			row.setcolComments(null);
			row.setcolCommentsReadOnly(true);
		}
		else
		{
			restorePreviousComments(row);
			row.setcolCommentsReadOnly(false);
		}
	}
	
	protected void restorePreviousComments(grdItemRow row)
	{
		POACCheckListVo l_vo = form.getLocalContext().getpoacCheckListVo();
		if (l_vo != null && l_vo.getChecklistItemsIsNotNull())
		{
			for(int i=0;i<l_vo.getChecklistItems().size();i++)
			{
				if (l_vo.getChecklistItems().get(i).getChecklistItem().equals(row.getcolItem()))
					//restore the comment
					row.setcolComments(l_vo.getChecklistItems().get(i).getComment());
			}
		}
		else
			return;
		
	}
	
	
	
	
	
}
