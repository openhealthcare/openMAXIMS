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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.65 build 3225.30788)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.core.forms.referraldetailsnotes;

import ims.careuk.vo.lookups.ReferralNoteType;
import ims.core.forms.referraldetailsnotes.GenForm.grdNotesRow;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.ReferralNoteVo;
import ims.core.vo.ReferralNoteVoCollection;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().CareUk.setReferralNote(form.grdNotes().getValue());

		switch (menuItemID)
		{
			case GenForm.ContextMenus.CAREUKNamespace.NotesMenu.NewNote :
				form.getGlobalContext().CareUk.setReferralNote(null);
			break;
			default :
		}
		engine.open(form.getForms().Core.ReferralDetailsNoteDialog);
	}

	@Override
	protected void onGrdNotesSelectionChanged() throws PresentationLogicException 
	{
		manageNotesMenu();				
	}
	private void manageNotesMenu() 
	{
		form.getContextMenus().CAREUK.disableAllNotesMenuMenuItems();
		form.getContextMenus().CAREUK.getNotesMenuNewNoteItem().setEnabled(domain.getMosUser() != null);
		form.getContextMenus().CAREUK.getNotesMenuNewNoteItem().setVisible(domain.getMosUser() != null);
		
		form.getContextMenus().CAREUK.getNotesMenuEditNoteItem().setEnabled(form.grdNotes().getSelectedRow() != null && domain.getMosUser() != null ? Boolean.TRUE : Boolean.FALSE);
		form.getContextMenus().CAREUK.getNotesMenuEditNoteItem().setVisible(form.grdNotes().getSelectedRow() != null && domain.getMosUser() != null ? Boolean.TRUE : Boolean.FALSE);
		
		if (form.grdNotes().getSelectedRow() != null
			&& form.grdNotes().getSelectedRow().getValue() !=null
			&& form.grdNotes().getSelectedRow().getValue().getNoteTypeIsNotNull()
			&& form.grdNotes().getSelectedRow().getValue().getNoteType().equals(ReferralNoteType.CLINICAL))
			form.getContextMenus().CAREUK.getNotesMenuEditNoteItem().setVisible(Boolean.FALSE);
	
	}
	
	private void listReferralNotes() 
	{
		ReferralNoteVoCollection voColl = domain.listReferralNote(form.getGlobalContext().Core.getCurrentCareContext());
		
		form.grdNotes().getRows().clear();
		
		for(int i = 0 ; voColl != null && i < voColl.size() ; i++)
		{
			//WDEV-8323
			if (voColl.get(i) != null &&
					voColl.get(i).getNoteIsNotNull() && (voColl.get(i).getNoteTypeIsNotNull()
						&& !voColl.get(i).getNoteType().equals(ReferralNoteType.CLINICAL)))
			{
				addNotesRow(voColl.get(i));
			}
		}
		
		manageNotesMenu();
	}

	private void addNotesRow(ReferralNoteVo voNote) 
	{
		grdNotesRow row = form.grdNotes().getRows().newRow();
		row.setColDateTime(voNote.getRecordingDateTimeIsNotNull() ? voNote.getRecordingDateTime().toString() : "");
		row.setColUser(voNote.getRecordingUserIsNotNull() ? voNote.getRecordingUser().getName().toString() : "");
		row.setColNote(voNote.getNote());
		
		row.setValue(voNote);
	}
	
	private void saveReferralNote(ReferralNoteVo referralNote)
	{
		referralNote.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
		
		String[] arrErrors = referralNote.validate();
		if(arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return;
		}

		try 
		{
			referralNote = domain.saveReferralNote(referralNote);
		} 
		catch (DomainInterfaceException e) 
		{
			engine.showMessage(e.getMessage());
			return;
		} 
		catch (StaleObjectException e) 
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			
		}
		
		form.getGlobalContext().CareUk.setReferralNote(null);		
		listReferralNotes();
	}

	
	public void initialize() 
	{	
		listReferralNotes();		
	}

	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException 
	{
		if(formName.equals(form.getForms().Core.ReferralDetailsNoteDialog)
				&& result.equals(DialogResult.OK))
		{
				saveReferralNote(form.getGlobalContext().CareUk.getReferralNote());
		}		
	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{
		initialize();	
	}

	
	public void addNotes(String notes) 
	{
		if (notes != null)
		{
			ReferralNoteVo voNote = new ReferralNoteVo();
			MemberOfStaffLiteVo voMos = (MemberOfStaffLiteVo) domain.getMosUser();
			if (voMos != null)
				voNote.setRecordingUser(voMos);
			voNote.setRecordingDateTime(new DateTime());
			//WDEV-8323
			voNote.setNoteType(ReferralNoteType.NON_CLINICAL);	
			voNote.setNote(notes);					
			saveReferralNote(voNote);
		}
	}
}
