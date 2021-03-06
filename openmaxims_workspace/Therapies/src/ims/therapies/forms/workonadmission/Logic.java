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
// This code was generated by Charlotte Murphy using IMS Development Environment (version 1.45 build 2250.23637)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.therapies.forms.workonadmission;

import ims.core.vo.Hcp;
import ims.core.vo.HcpCollection;
import ims.core.vo.HcpFilter;
import ims.core.vo.PersonName;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;
import ims.therapies.vo.WorkOnAdmissionVo;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws PresentationLogicException
	{
		open();
	}
	private void open()
	{
		if(form.getGlobalContext().Core.getCurrentCareContextIsNotNull())
			form.getLocalContext().setWorkOnAdmission(domain.get(form.getGlobalContext().Core.getCurrentCareContext()));
		
		clear();
		
		populateInstanceControls();
		
		form.setMode(FormMode.VIEW);
	}
	private void populateInstanceControls()
	{
		if(form.getLocalContext().getWorkOnAdmissionIsNotNull())
		{
			Hcp voHcp = form.getLocalContext().getWorkOnAdmission().getAuthoringCP();
			form.qmbAuthoringCP().newRow(voHcp, voHcp.toString());
			
			super.populateScreenFromData(form.getLocalContext().getWorkOnAdmission());
		}
	}
	private void clear()
	{
		super.clearScreen();
	}
	private void enableButtons(boolean enable)
	{
		form.btnNew().setVisible(enable);
		form.btnNew().setEnabled(enable);
		form.btnUpdate().setVisible(!enable);
		form.btnUpdate().setEnabled(!enable);
	}
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		setDefaultValues();
		form.qmbAuthoringCP().setEnabled(true);
		form.dtimAuthoring().setEnabled(true);
	}
	private void setDefaultValues()
	{
		Hcp hcpUser = (Hcp)domain.getHcpUser();
		if(hcpUser != null)
		{
			form.qmbAuthoringCP().newRow(hcpUser, hcpUser.getName().toString());
			form.qmbAuthoringCP().setValue(hcpUser);
		}
		form.dtimAuthoring().setValue(new DateTime());	
	}
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
			open();	
	}
	private boolean save()
	{
		WorkOnAdmissionVo voWorkOnAdmission = super.populateDataFromScreen(form.getLocalContext().getWorkOnAdmission());
		
		if(form.getGlobalContext().Core.getCurrentCareContextIsNotNull())
			voWorkOnAdmission.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
		
		String[] arrErrors =  voWorkOnAdmission.validate();	
		if(arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return false;
		}
		
		try
		{
			domain.save(voWorkOnAdmission);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}
		catch (UniqueKeyViolationException e)
		{
			engine.showMessage("A Work On Admission record already exists for this clinical contact. " + e.getMessage());
			open();
			return false;
		}
		catch(DomainRuntimeException e)
		{
			engine.showMessage(e.getMessage());
			open();
			return false;
		}
		return true;
	}
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	protected void onQmbAuthoringCPTextSubmited(String value) throws PresentationLogicException
	{
		setAuthoringCP(value);	
	}
	private void setAuthoringCP(String value)
	{
		form.qmbAuthoringCP().clear();
		HcpFilter filter = new HcpFilter();
		PersonName name = new PersonName();
		name.setSurname(value);
		filter.setQueryName(name);
		
		HcpCollection coll = domain.listMedics(filter);
		for (int i = 0; i < coll.size(); i++)
		{
			Hcp med = coll.get(i);
			form.qmbAuthoringCP().newRow(med, med.toString());			
		}
		
		if (coll.size() == 1)
			form.qmbAuthoringCP().setValue(coll.get(0));
		else if (coll.size() > 1)
			form.qmbAuthoringCP().showOpened();
		
	}
	protected void onFormModeChanged()
	{
		if(form.getMode().equals(FormMode.VIEW))
		{
			if(form.getLocalContext().getWorkOnAdmissionIsNotNull())
				enableButtons(false);
			else
				enableButtons(true);
		}
		else
			hideButtons(false);
	}
	private void hideButtons(boolean visible)
	{
		form.btnNew().setVisible(visible);
		form.btnUpdate().setVisible(visible);
	}
	
}
