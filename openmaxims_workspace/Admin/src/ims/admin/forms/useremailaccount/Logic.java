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
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.60 build 2791.17293)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.admin.forms.useremailaccount;

import ims.admin.vo.AppUserVo;
import ims.admin.vo.UserEmailAccountVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.lookups.ChannelType;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
		if (args.length>0)
			if (args[0] instanceof FormMode)
			{
//				FormMode mode=(FormMode) args[0];
//				if (mode.equals(FormMode.EDIT))
//					form.getLocalContext().setApplicationUsersEditMode(true);
//				else
//					form.getLocalContext().setApplicationUsersEditMode(false);
				form.setMode((FormMode) args[0]);
			}
	}
	
	public void initialize() 
	{
		populateInstanceControl();
	}

	public void open() 
	{	
		form.setMode(FormMode.VIEW);
		updateControlsState();
	}
	
	public void updateControlsState() 
	{
		if (form.getMode().equals(FormMode.VIEW))
		{
			if (form.getLocalContext().getUserEmailAccountVoIsNotNull())
			{
				form.btnNew().setVisible(false);
			}
			else
			{
				form.btnNew().setVisible(true);				
			}
		}
	}

	public void populateInstanceControl() 
	{
		//display Application User name and email address
		UserEmailAccountVo email=null;
		//String emailAddress=null;
		if (form.getGlobalContext().Admin.getAppUserVoIsNotNull())
		{
			if (form.getGlobalContext().Admin.getuserEmailAccountIsNotNull())
				email=(UserEmailAccountVo) form.getGlobalContext().Admin.getuserEmailAccount().clone();
			else if (form.getGlobalContext().Admin.getAppUserVo().getEmailAccountIsNotNull())
				email=(UserEmailAccountVo) form.getGlobalContext().Admin.getAppUserVo().getEmailAccount().clone();		
		}
			form.txtApplicationUser().setValue(form.getGlobalContext().Admin.getAppUserVo().getUsername());
			
			if (email!=null)
			{
				if (email.getAuthenticationName()!=null)
					form.txtUserName().setValue(email.getAuthenticationName());
				if (email.getAuthenticationPassword()!=null)
					form.txtPassword().setValue(email.getAuthenticationPassword());
				if (email.getPOPIsNotNull())
					form.txtIncomingServer().setValue(email.getPOPServer());
				if (email.getPOPPortIsNotNull())
					form.intPOPPort().setValue(Integer.parseInt(email.getPOPPort()));
				if (email.getSMTPServer()!=null)
					form.txtOutgoingServer().setValue(email.getSMTPServer());
				if (email.getSMTPPortIsNotNull())
					form.intSMTPPort().setValue(Integer.parseInt(email.getSMTPPort()));
				if (email.getEmailAddressIsNotNull())
					form.txtEmailAddress().setValue(email.getEmailAddress());
			}		
			else
			{
				restoreDefaultValues();
			}
			form.getLocalContext().setUserEmailAccountVo(email);
		
	}

	protected void onFormModeChanged()
	{
		updateControlsState();
	}
	
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}
	
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearInstanceControls();
		form.setMode(FormMode.EDIT);
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (validateUILogic())
		{
			populateInstanceData();	
			engine.close(DialogResult.OK);
		}
	}
	
	private boolean validateUILogic() 
	{
		ArrayList <String> errors=new ArrayList<String>();
		if (form.txtEmailAddress().getValue()==null)
			errors.add("Email Address is a mandatory field");
		if (form.txtIncomingServer().getValue()==null)
			errors.add("Incoming Server is a mandatory field");
		if (form.txtOutgoingServer().getValue()==null)
			errors.add("Outgoing Server is a mandatory field");
		if (form.txtPassword().getValue()==null)
			errors.add("Password is a mandatory field");
		if (form.txtUserName().getValue()==null)
			errors.add("UserName Address is a mandatory field");
		if (form.intPOPPort().getValue()==null)
			errors.add("Incoming Port is a mandatory field");
		if (form.intSMTPPort().getValue()==null)
			errors.add("Outgoing Port is a mandatory field");
		if (form.txtEmailAddress().getValue()!=null&&!valideEmail(form.txtEmailAddress().getValue()))
			errors.add("Email Address is not a valid address");
		
		if (errors.size()>0)
		{
			engine.showErrors(errors.toArray(new String[0]));
			return false;
		}
		return true;
			
	}

	private boolean valideEmail(String txtEmailAddress) 
	{
		try
		{
			StringTokenizer validator1=new StringTokenizer(txtEmailAddress,"@");
			if (validator1.countTokens()==2)
			{
				validator1.nextToken();
				StringTokenizer validator2=new StringTokenizer(validator1.nextToken(),".");
				if (validator2.countTokens()==2||validator2.countTokens()==3)
					return true;
			}
		}
		catch (Exception e)
		{
			return false;
		}
		return false;
	}


	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	private void clearInstanceControls() 
	{
		form.txtUserName().setValue(null);
		form.txtPassword().setValue(null);
		form.txtIncomingServer().setValue(null);
		form.intPOPPort().setValue(null);
		form.txtOutgoingServer().setValue(null);
		form.intSMTPPort().setValue(null);
	}

	private void populateInstanceData() 
	{
		UserEmailAccountVo voUserEmailAccount=null;
		if (form.getLocalContext().getUserEmailAccountVo()!=null)
			voUserEmailAccount = (UserEmailAccountVo) form.getLocalContext().getUserEmailAccountVo().clone();
		else
			voUserEmailAccount = new UserEmailAccountVo();
		
		//populate the fields
		
		voUserEmailAccount.setPOP(form.txtIncomingServer().getValue()!=null ? form.txtIncomingServer().getValue() : null);
		voUserEmailAccount.setPOPPort(form.intPOPPort().getValue() != null ? form.intPOPPort().getValue().toString() : null);
		voUserEmailAccount.setSMTP(form.txtOutgoingServer().getValue()!=null ? form.txtOutgoingServer().getValue() : null);
		voUserEmailAccount.setSMTPPort(form.intSMTPPort().getValue() != null ? form.intSMTPPort().getValue().toString() : null);
		voUserEmailAccount.setUserLogon(form.txtUserName().getValue()!= null ? form.txtUserName().getValue() : null);
		voUserEmailAccount.setUserPassword(form.txtPassword().getValue()!=null ? form.txtPassword().getValue() : null);
		AppUserVo user = form.getGlobalContext().Admin.getAppUserVo();
		if (user!=null)
			if (user.getMosIsNotNull())
				if (user.getMos().getCommChannelsIsNotNull())
					if (user.getMos().getCommChannels().getCommunicationChannel(ChannelType.EMAIL)!=null)
							user.getMos().getCommChannels().getCommunicationChannel(ChannelType.EMAIL).setCommValue(form.txtEmailAddress().getValue()!=null ? form.txtEmailAddress().getValue() : null);
					else
					{
						CommChannelVo email=new CommChannelVo();
						email.setChannelType(ChannelType.EMAIL);
						email.setCommValue(form.txtEmailAddress().getValue()!=null ? form.txtEmailAddress().getValue() : null);
						user.getMos().getCommChannels().add(email);
					}
		voUserEmailAccount.setEmailAddress(form.txtEmailAddress().getValue());
		user.setEmailAccount(voUserEmailAccount);
		form.getGlobalContext().Admin.setAppUserVo(user);	
		
	}

	protected void onLnkDefaultValuesClick() throws PresentationLogicException 
	{
		restoreDefaultValues();		
	}
	/**
	 * 
	 */
	private void restoreDefaultValues() 
	{
		form.txtIncomingServer().setValue(ims.configuration.gen.ConfigFlag.FW.POP_SERVER.getValue());
		form.intPOPPort().setValue(ims.configuration.gen.ConfigFlag.FW.POP_PORT.getValue());
		form.intSMTPPort().setValue(ims.configuration.gen.ConfigFlag.FW.SMTP_PORT.getValue());
		form.txtOutgoingServer().setValue(ims.configuration.gen.ConfigFlag.FW.SMTP_SERVER.getValue());
	}

	@Override
	protected void onBtnCloseClick() throws PresentationLogicException 
	{
		engine.close(DialogResult.CANCEL);
	}
	
}
