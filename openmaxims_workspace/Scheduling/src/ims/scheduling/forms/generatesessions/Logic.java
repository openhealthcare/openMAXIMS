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
// This code was generated by Billy Mahon using IMS Development Environment (version 1.22 build 50218.1400)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.scheduling.forms.generatesessions;

import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.ServiceLiteVo;
import ims.core.vo.ServiceLiteVoCollection;
import ims.framework.FormName;
import ims.framework.MessageButtons;
import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;
import ims.scheduling.vo.ProfileShortVo;
import ims.scheduling.vo.ProfileShortVoCollection;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws FormOpenException 
	{
		open();
	}
	
	private void open() 
	{
		populateLocationCombo(domain.loadLocations());
		form.chkActive().setValue(true);
		updateControlsState();
	}

	private void populateLocationCombo(LocationLiteVoCollection loadLocations) 
	{
		form.cmbSite().clear();
		
		if(loadLocations == null)
			return;
		
		for (LocationLiteVo item: loadLocations)
		{
			if (item!=null && item.getNameIsNotNull())
				form.cmbSite().newRow(item, item.getName());
		}
	}

	/**
	 * @param voProfiles
	 */
	private void populateTree(ProfileShortVoCollection voProfiles) 
	{
		form.treProfile().clear();
		if(voProfiles == null)
			return;
		
		TreeNode node = null;
		for(int i=0;i<voProfiles.size();i++)
		{
			node = form.treProfile().getNodes().add(voProfiles.get(i),voProfiles.get(i).getName());
			node.setCollapsedImage(form.getImages().Core.ClosedFolder);
			node.setExpandedImage(form.getImages().Core.OpenFolder);
		}
	}

	protected void onBtnGenerateSessionsClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().Scheduling.setProfileShort((ProfileShortVo) form.treProfile().getValue());
		engine.open(form.getForms().Scheduling.DateSelectionEditDialog);
	}

	protected void onChkActiveOnlyValueChanged() throws PresentationLogicException 
	{
		super.clearScreen();
		open();
	}

	protected void onTreProfileTreeViewSelectionChanged(TreeNode node) throws PresentationLogicException 
	{
		if(node == null)
		{
			super.clearScreen();
			return;
		}
		
		super.clearScreen();
		
		if(node.getValue() instanceof ProfileShortVo)
		{
			ProfileShortVo voProfShort =  domain.getProfile((ProfileShortVo)node.getValue()); //WDEV-10444
			super.populateScreenFromData(voProfShort);
		}
		
		updateControlsState();
	}

	//WDEV-17916
	private void updateControlsState()
	{
		boolean isProfileSelected = form.treProfile().getSelectedNode() != null && form.treProfile().getSelectedNode().getValue() instanceof ProfileShortVo;
		form.btnCreateAdHocSession().setEnabled(isProfileSelected);
		form.btnGenerateSessions().setEnabled(isProfileSelected);
		
	}

	/* (non-Javadoc)
	 * @see ims.scheduling.forms.generatesessions.Handlers#onFormDialogClosed(ims.framework.FormName, ims.framework.enumerations.DialogResult)
	 */
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException 
	{
		// Set the the last generated session date to today.
		if ( (formName.equals(form.getForms().Scheduling.DateSelectionEditDialog) || formName.equals(form.getForms().Scheduling.AdHocDateSelection)) && result.equals(DialogResult.OK))
		{
			super.clearScreen();
			form.treProfile().setValue(null);
			search();
		}
	}

	protected void onImbClearClick() throws PresentationLogicException 
	{
		clearControls();
	}

	private void clearControls() 
	{
		form.cmbSite().clear();
		form.qmbProfile().clear();
		form.qmbService().clear();
		form.treProfile().clear();
		form.getLocalContext().setLocation(null);
		clearPanel();
		open();
	}

	private void clearPanel() {
		form.txtDescription().setValue(null);
		form.dteEffectiveFrom().setValue(null);
		form.dteEffectiveTo().setValue(null);
		form.dtelastGen().setValue(null);
	}

	@Override
	protected void onImbSearchClick() throws PresentationLogicException 
	{		
		search();
	}

	private void search()
	{
		super.clearScreen();
		
		ProfileShortVoCollection profiles = domain.listProfiles(form.cmbSite().getValue(), form.qmbProfile().getValue(), form.qmbService().getValue(), form.chkActive().getValue());
		if(profiles != null)
		{
			if (profiles.size()>999)
				engine.showMessage("More than 1000 items were returned", "Message", MessageButtons.OK);
		}
		
		populateTree(profiles);
		updateControlsState();
		
		if (profiles==null)
			engine.showMessage("No records match your search criteria.","No Data Found", MessageButtons.OK);
	}

	@Override
	protected void onCmbSiteValueChanged() throws PresentationLogicException 
	{
		form.getLocalContext().setLocation(form.cmbSite().getValue()!=null ? form.cmbSite().getValue().toLocationRefVo() : null);
		form.qmbProfile().clear();
	}

	protected void onQmbProfileTextSubmited(String value)throws PresentationLogicException 
	{
		populateQueryCombo(domain.loadProfiles(form.getLocalContext().getLocation(), value));
	}

	private void populateQueryCombo(ProfileShortVoCollection loadProfiles) 
	{
		if (loadProfiles!=null)
		{
			for (ProfileShortVo item: loadProfiles)
				if (item!=null&&item.getNameIsNotNull())
					form.qmbProfile().newRow(item, item.getName());
			form.qmbProfile().showOpened();
		}
		else
		{
			form.qmbProfile().clear();
			//engine.showMessage( "No profiles are associated with the selected site", "Message",MessageButtons.OK);
		}
	}

	@Override
	protected void onQmbServiceTextSubmited(String value) throws PresentationLogicException
	{
		form.qmbService().clear();
		
		ServiceLiteVoCollection voCollService =  domain.listActiveServiceByName(value);
		if(voCollService != null)
		{
			for(ServiceLiteVo voService : voCollService)
				form.qmbService().newRow(voService, voService.getServiceName());
			
			if(voCollService.size() == 1)
				form.qmbService().setValue(voCollService.get(0));
			else if(voCollService.size() > 1)
				form.qmbService().showOpened();
			else
				engine.showErrors(new String[] {"No matching records found"});
		}
	}

	@Override
	protected void onBtnCreateAdHocSessionClick() throws PresentationLogicException
	{
		form.getGlobalContext().Scheduling.setProfileShort((ProfileShortVo) form.treProfile().getValue());
		engine.open(form.getForms().Scheduling.AdHocDateSelection);
	}
}
