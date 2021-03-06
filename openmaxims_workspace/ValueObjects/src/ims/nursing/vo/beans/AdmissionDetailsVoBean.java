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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.nursing.vo.beans;

public class AdmissionDetailsVoBean extends ims.vo.ValueObjectBean
{
	public AdmissionDetailsVoBean()
	{
	}
	public AdmissionDetailsVoBean(ims.nursing.vo.AdmissionDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.clinicalcontact = vo.getClinicalContact() == null ? null : new ims.vo.RefVoBean(vo.getClinicalContact().getBoId(), vo.getClinicalContact().getBoVersion());
		this.patientadmreason = vo.getPatientAdmReason();
		this.nursingadmreason = vo.getNursingAdmReason();
		this.resusstatus = vo.getResusStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getResusStatus().getBean();
		this.isdnrformcompleted = vo.getIsDnrFormCompleted();
		this.admquestionsans = vo.getAdmQuestionsAns() == null ? null : vo.getAdmQuestionsAns().getBeanCollection();
		this.wasdiagnosisdiscussed = vo.getWasDiagnosisDiscussed();
		this.communicationneeds = vo.getCommunicationNeeds();
		this.preferredlang = vo.getPreferredLang() == null ? null : (ims.vo.LookupInstanceBean)vo.getPreferredLang().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.AdmissionDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.clinicalcontact = vo.getClinicalContact() == null ? null : new ims.vo.RefVoBean(vo.getClinicalContact().getBoId(), vo.getClinicalContact().getBoVersion());
		this.patientadmreason = vo.getPatientAdmReason();
		this.nursingadmreason = vo.getNursingAdmReason();
		this.resusstatus = vo.getResusStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getResusStatus().getBean();
		this.isdnrformcompleted = vo.getIsDnrFormCompleted();
		this.admquestionsans = vo.getAdmQuestionsAns() == null ? null : vo.getAdmQuestionsAns().getBeanCollection();
		this.wasdiagnosisdiscussed = vo.getWasDiagnosisDiscussed();
		this.communicationneeds = vo.getCommunicationNeeds();
		this.preferredlang = vo.getPreferredLang() == null ? null : (ims.vo.LookupInstanceBean)vo.getPreferredLang().getBean();
	}

	public ims.nursing.vo.AdmissionDetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.nursing.vo.AdmissionDetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.AdmissionDetailsVo vo = null;
		if(map != null)
			vo = (ims.nursing.vo.AdmissionDetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.nursing.vo.AdmissionDetailsVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.vo.RefVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.vo.RefVoBean value)
	{
		this.clinicalcontact = value;
	}
	public String getPatientAdmReason()
	{
		return this.patientadmreason;
	}
	public void setPatientAdmReason(String value)
	{
		this.patientadmreason = value;
	}
	public String getNursingAdmReason()
	{
		return this.nursingadmreason;
	}
	public void setNursingAdmReason(String value)
	{
		this.nursingadmreason = value;
	}
	public ims.vo.LookupInstanceBean getResusStatus()
	{
		return this.resusstatus;
	}
	public void setResusStatus(ims.vo.LookupInstanceBean value)
	{
		this.resusstatus = value;
	}
	public Boolean getIsDnrFormCompleted()
	{
		return this.isdnrformcompleted;
	}
	public void setIsDnrFormCompleted(Boolean value)
	{
		this.isdnrformcompleted = value;
	}
	public ims.nursing.vo.beans.AdmissionDetailsQuestionsVoBean[] getAdmQuestionsAns()
	{
		return this.admquestionsans;
	}
	public void setAdmQuestionsAns(ims.nursing.vo.beans.AdmissionDetailsQuestionsVoBean[] value)
	{
		this.admquestionsans = value;
	}
	public Boolean getWasDiagnosisDiscussed()
	{
		return this.wasdiagnosisdiscussed;
	}
	public void setWasDiagnosisDiscussed(Boolean value)
	{
		this.wasdiagnosisdiscussed = value;
	}
	public String getCommunicationNeeds()
	{
		return this.communicationneeds;
	}
	public void setCommunicationNeeds(String value)
	{
		this.communicationneeds = value;
	}
	public ims.vo.LookupInstanceBean getPreferredLang()
	{
		return this.preferredlang;
	}
	public void setPreferredLang(ims.vo.LookupInstanceBean value)
	{
		this.preferredlang = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
	private ims.vo.RefVoBean carecontext;
	private ims.vo.RefVoBean clinicalcontact;
	private String patientadmreason;
	private String nursingadmreason;
	private ims.vo.LookupInstanceBean resusstatus;
	private Boolean isdnrformcompleted;
	private ims.nursing.vo.beans.AdmissionDetailsQuestionsVoBean[] admquestionsans;
	private Boolean wasdiagnosisdiscussed;
	private String communicationneeds;
	private ims.vo.LookupInstanceBean preferredlang;
}
