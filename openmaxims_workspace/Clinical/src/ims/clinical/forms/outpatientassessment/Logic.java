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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.71 build 3708.14700)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.outpatientassessment;

import ims.assessment.vo.PatientAssessmentDataVo;
import ims.assessment.vo.PatientAssessmentVo;
import ims.assessment.vo.UserAssessmentLiteVoCollection;
import ims.assessment.vo.UserAssessmentVo;
import ims.clinical.vo.DischargeDetailsWithAssessmentVo;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.framework.FormName;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setDischargeDetails(null);
		form.getLocalContext().setbInitialised(null);
		form.setMode(FormMode.VIEW);
		UpdateControlState();

	}
	@Override
	protected void onBtnNextClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}

	private void UpdateControlState()
	{
		if(form.getMode().equals(FormMode.EDIT))
		{
			form.btnSave().setVisible(true);
			form.btnNext().setVisible(true);
			form.btnEdit().setVisible(false);
		}
		else
		{
			form.btnSave().setVisible(false);
			form.btnNext().setVisible(false);
			form.btnEdit().setVisible(true);
		}
	}
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.ccOutpatientAssessment().getPatientAssessment() == null)
		{
			form.setMode(FormMode.VIEW);
			open();
			return;
		}
		
		String[] errorsAssess = form.ccOutpatientAssessment().validateData();
		if (errorsAssess != null)
		{
			engine.showErrors(errorsAssess);
			return;
		}

		DischargeDetailsWithAssessmentVo ddVo = form.getLocalContext().getDischargeDetails();
		if (ddVo == null)
			ddVo = new DischargeDetailsWithAssessmentVo();
		
		ddVo.setPatientAssessment(form.ccOutpatientAssessment().getPatientAssessment());
		
		if (ddVo.getPatientAssessmentIsNotNull() && ddVo.getPatientAssessment().getAuthoringInformation() == null)
		{
			AuthoringInformationVo voAuth = new AuthoringInformationVo();
			voAuth.setAuthoringDateTime(new DateTime());
			if(domain.getHcpUser() != null)
				voAuth.setAuthoringHcp((HcpLiteVo) domain.getHcpLiteUser());
			ddVo.getPatientAssessment().setAuthoringInformation(voAuth);
			
		}
		
		//WDEV-11721
		if(ddVo.getPatientAssessmentIsNotNull() && ddVo.getPatientAssessment().getPatient() == null)
			ddVo.getPatientAssessment().setPatient(form.getGlobalContext().Core.getPatientShort());
		
		//WDEV-11526
		if(ddVo.getPatientAssessmentIsNotNull() && ddVo.getPatientAssessment().getEpisodeOfCare() == null)
			ddVo.getPatientAssessment().setEpisodeOfCare(form.getGlobalContext().Core.getEpisodeofCareShort());
		
		if (ddVo.getPatientAssessmentIsNotNull() && ddVo.getPatientAssessment().getCareContext() == null)
			ddVo.getPatientAssessment().setCareContext(form.getGlobalContext().Core.getCurrentCareContext());

		String[] errors = ddVo.validate();
		if (errors != null)
		{
			engine.showErrors(errors);
			return;
		}
		
		ddVo = domain.saveDischargeDetails(ddVo);
		
		form.getLocalContext().setDischargeDetails(ddVo);
		form.setMode(FormMode.VIEW);
		open();
		form.getGlobalContext().Clinical.seteDischargeDisableTabs(false);
		form.fireCustomControlValueChanged();
	}
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		UpdateControlState();
		//if (form.getLocalContext().getDischargeDetailsIsNotNull()
		//	&& form.getLocalContext().getDischargeDetails().getPatientAssessment() == null)
		//{
		//	if ( !initializeCustomControl())
		//		return;
		//}
		//else
		//	form.ccOutpatientAssessment().setPatientAssessment(form.getLocalContext().getDischargeDetails().getPatientAssessment(), form.getMode().equals(FormMode.VIEW));
		//form.getGlobalContext().Clinical.seteDischargeDisableTabs(true);
		//form.fireCustomControlValueChanged();
	}
	private void open() 
	{
		form.ccOutpatientAssessment().clearComponent();
		populateScreenFromData(domain.getDischargeDetails(form.getGlobalContext().Core.getCurrentCareContext()));
		
		form.ccOutpatientAssessment().setReadOnly(Boolean.TRUE);
		manageReadOnly();
	}
	private void populateScreenFromData(DischargeDetailsWithAssessmentVo dischargeDetails) 
	{
		if (dischargeDetails == null)
			return;
		
		form.getLocalContext().setDischargeDetails(dischargeDetails);
		
		if (dischargeDetails.getPatientAssessmentIsNotNull())
		{
			form.ccOutpatientAssessment().clearComponent();
			form.ccOutpatientAssessment().setPatientAssessment(dischargeDetails.getPatientAssessment(), form.getMode().equals(FormMode.VIEW));
		}
		else
			initializeCustomControl();
 
	}

	public void initialise()
	{
		if ( form.getLocalContext().getbInitialised() == null)
		{
			form.setMode(FormMode.VIEW);
			open();
			form.getLocalContext().setbInitialised(Boolean.TRUE);
		}
	}

	public void setReadOnly()
	{
		form.getLocalContext().setisReadonly(/*form.getGlobalContext().Clinical.geteDischargeCompleted()*/form.getGlobalContext().Clinical.geteDischargeClinicalComplete());
		manageReadOnly();
	}
	private void manageReadOnly() 
	{
		if (form.getMode().equals(FormMode.VIEW))
			form.btnEdit().setVisible(true);

		if (form.getLocalContext().getisReadonlyIsNotNull()
			&& form.getLocalContext().getisReadonly()
			&& form.getMode().equals(FormMode.VIEW))
			form.btnEdit().setVisible(false);
	}
	private boolean initializeCustomControl() 
	{
		UserAssessmentLiteVoCollection list = null;
		form.ccOutpatientAssessment().clearComponent();
		if (form.getGlobalContext().Core.getEpisodeofCareShortIsNotNull())
			list  = domain.listAssessments(form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialty());
		
		if (list != null && list.size() == 1)
		{
			form.getLocalContext().setChosenAssessment(domain.getUserAssessment(list.get(0)));
			loadAssessment();
		}
		else if (list != null && list.size() > 1)
		{
			if (form.getMode().equals(FormMode.EDIT))
			{
				form.getGlobalContext().Assessment.setAssessmentsForSpecialtyCollection(list);
				//engine.open(form..getForms().Assessment.AssessmentsForSpecialty);
			}
		}
			
		if (list.size() == 0)
		{
			if (form.getGlobalContext().Core.getEpisodeofCareShortIsNotNull()
				&& form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialtyIsNotNull())
				engine.showMessage("No configured assessment for Specialty - " + form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialty().toString() + ", was found.", "No Configured Assessment", MessageButtons.OK, MessageIcon.WARNING);
			else
				engine.showMessage("No configured assessment for the current Specialty was found.", "No Configured Assessment", MessageButtons.OK, MessageIcon.WARNING);
			
			form.setMode(FormMode.VIEW);
			manageReadOnly();
			return false;
		}
		form.getLocalContext().setisReadonly(false);
		
		return true;
	}
	private void loadAssessment()
	{
		if (form.getLocalContext().getChosenAssessmentIsNotNull())
		{
			PatientAssessmentVo newAssessment = new PatientAssessmentVo();
			PatientAssessmentDataVo assessmentData = new PatientAssessmentDataVo();	
			UserAssessmentVo userAssessment = form.getLocalContext().getChosenAssessment();
			assessmentData.setUserAssessment(userAssessment);
			assessmentData.setGroupQuestionWidth(userAssessment.getGroupQuestionWidth());
			newAssessment.setAssessmentData(assessmentData);	

			form.ccOutpatientAssessment().setPatientAssessment(newAssessment, form.getMode().equals(FormMode.VIEW));
		}		
	}
	@Override
	protected void onFormModeChanged() 
	{
		if(form.getMode().equals(FormMode.VIEW))
			form.ccOutpatientAssessment().setReadOnly(Boolean.TRUE);
		else
			form.ccOutpatientAssessment().setReadOnly(Boolean.FALSE);
		
	}
	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result)
			throws PresentationLogicException 
			{
		/*if(formName.equals(form.getForms().Assessment.AssessmentsForSpecialty) 
				&& result.equals(DialogResult.OK)
				&& form.getGlobalContext().Core.getSelectedUserAssessmentLiteIsNotNull())
			{
				form.getLocalContext().setChosenAssessment(domain.getUserAssessment(form.getGlobalContext().Core.getSelectedUserAssessmentLite()));
				loadAssessment();
			}
			if(formName.equals(form.getForms().Assessment.AssessmentsForSpecialty) 
				&& result.equals(DialogResult.CANCEL))
				form.setMode(FormMode.VIEW);*/
		
	}

}
