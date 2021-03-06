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

package ims.clinical.vo.beans;

public class SurgicalAuditPreOpChecksVoBean extends ims.vo.ValueObjectBean
{
	public SurgicalAuditPreOpChecksVoBean()
	{
	}
	public SurgicalAuditPreOpChecksVoBean(ims.clinical.vo.SurgicalAuditPreOpChecksVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
		this.plannedprocedures = vo.getPlannedProcedures() == null ? null : vo.getPlannedProcedures().getBeanCollection();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicVoBean)vo.getConsultant().getBean();
		this.sentfortime = vo.getSentForTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getSentForTime().getBean();
		this.arrivaltime = vo.getArrivalTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getArrivalTime().getBean();
		this.leaveholdingtime = vo.getLeaveHoldingTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLeaveHoldingTime().getBean();
		this.accompanyingnurse = vo.getAccompanyingNurse() == null ? null : (ims.core.vo.beans.NurseVoBean)vo.getAccompanyingNurse().getBean();
		this.transferredfrom = vo.getTransferredFrom() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getTransferredFrom().getBean();
		this.asagrade = vo.getASAGrade() == null ? null : (ims.vo.LookupInstanceBean)vo.getASAGrade().getBean();
		this.consentreceived = vo.getConsentReceived() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsentReceived().getBean();
		this.consentauthby = vo.getConsentAuthBy();
		this.bmi = vo.getBMI() == null ? null : (ims.clinical.vo.beans.VitalSignsForSurgicalAuditPreOpChecksVoBean)vo.getBMI().getBean();
		this.sitemarked = vo.getSiteMarked() == null ? null : (ims.vo.LookupInstanceBean)vo.getSiteMarked().getBean();
		this.actiontaken = vo.getActionTaken() == null ? null : (ims.vo.LookupInstanceBean)vo.getActionTaken().getBean();
		this.confirmpatientdetails = vo.getConfirmPatientDetails() == null ? null : (ims.vo.LookupInstanceBean)vo.getConfirmPatientDetails().getBean();
		this.preopcheckdone = vo.getPreOpCheckDone() == null ? null : (ims.vo.LookupInstanceBean)vo.getPreOpCheckDone().getBean();
		this.accompanyinglocumbool = vo.getAccompanyingLocumBool();
		this.accompanyinglocumnurse = vo.getAccompanyingLocumNurse();
		this.theatrenurse = vo.getTheatreNurse() == null ? null : (ims.core.vo.beans.NurseVoBean)vo.getTheatreNurse().getBean();
		this.theatrenurselocumbool = vo.getTheatreNurseLocumBool();
		this.theatrenurselocumnurse = vo.getTheatreNurseLocumNurse();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.SurgicalAuditPreOpChecksVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
		this.plannedprocedures = vo.getPlannedProcedures() == null ? null : vo.getPlannedProcedures().getBeanCollection();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicVoBean)vo.getConsultant().getBean(map);
		this.sentfortime = vo.getSentForTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getSentForTime().getBean();
		this.arrivaltime = vo.getArrivalTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getArrivalTime().getBean();
		this.leaveholdingtime = vo.getLeaveHoldingTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLeaveHoldingTime().getBean();
		this.accompanyingnurse = vo.getAccompanyingNurse() == null ? null : (ims.core.vo.beans.NurseVoBean)vo.getAccompanyingNurse().getBean(map);
		this.transferredfrom = vo.getTransferredFrom() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getTransferredFrom().getBean(map);
		this.asagrade = vo.getASAGrade() == null ? null : (ims.vo.LookupInstanceBean)vo.getASAGrade().getBean();
		this.consentreceived = vo.getConsentReceived() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsentReceived().getBean();
		this.consentauthby = vo.getConsentAuthBy();
		this.bmi = vo.getBMI() == null ? null : (ims.clinical.vo.beans.VitalSignsForSurgicalAuditPreOpChecksVoBean)vo.getBMI().getBean(map);
		this.sitemarked = vo.getSiteMarked() == null ? null : (ims.vo.LookupInstanceBean)vo.getSiteMarked().getBean();
		this.actiontaken = vo.getActionTaken() == null ? null : (ims.vo.LookupInstanceBean)vo.getActionTaken().getBean();
		this.confirmpatientdetails = vo.getConfirmPatientDetails() == null ? null : (ims.vo.LookupInstanceBean)vo.getConfirmPatientDetails().getBean();
		this.preopcheckdone = vo.getPreOpCheckDone() == null ? null : (ims.vo.LookupInstanceBean)vo.getPreOpCheckDone().getBean();
		this.accompanyinglocumbool = vo.getAccompanyingLocumBool();
		this.accompanyinglocumnurse = vo.getAccompanyingLocumNurse();
		this.theatrenurse = vo.getTheatreNurse() == null ? null : (ims.core.vo.beans.NurseVoBean)vo.getTheatreNurse().getBean(map);
		this.theatrenurselocumbool = vo.getTheatreNurseLocumBool();
		this.theatrenurselocumnurse = vo.getTheatreNurseLocumNurse();
	}

	public ims.clinical.vo.SurgicalAuditPreOpChecksVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.SurgicalAuditPreOpChecksVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.SurgicalAuditPreOpChecksVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.SurgicalAuditPreOpChecksVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.SurgicalAuditPreOpChecksVo();
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
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.clinical.vo.beans.PatientProcedureForSurgicalAuditPreOpChecksVoBean[] getPlannedProcedures()
	{
		return this.plannedprocedures;
	}
	public void setPlannedProcedures(ims.clinical.vo.beans.PatientProcedureForSurgicalAuditPreOpChecksVoBean[] value)
	{
		this.plannedprocedures = value;
	}
	public ims.core.vo.beans.MedicVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.beans.MedicVoBean value)
	{
		this.consultant = value;
	}
	public ims.framework.utils.beans.DateTimeBean getSentForTime()
	{
		return this.sentfortime;
	}
	public void setSentForTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.sentfortime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getArrivalTime()
	{
		return this.arrivaltime;
	}
	public void setArrivalTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.arrivaltime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getLeaveHoldingTime()
	{
		return this.leaveholdingtime;
	}
	public void setLeaveHoldingTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.leaveholdingtime = value;
	}
	public ims.core.vo.beans.NurseVoBean getAccompanyingNurse()
	{
		return this.accompanyingnurse;
	}
	public void setAccompanyingNurse(ims.core.vo.beans.NurseVoBean value)
	{
		this.accompanyingnurse = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getTransferredFrom()
	{
		return this.transferredfrom;
	}
	public void setTransferredFrom(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.transferredfrom = value;
	}
	public ims.vo.LookupInstanceBean getASAGrade()
	{
		return this.asagrade;
	}
	public void setASAGrade(ims.vo.LookupInstanceBean value)
	{
		this.asagrade = value;
	}
	public ims.vo.LookupInstanceBean getConsentReceived()
	{
		return this.consentreceived;
	}
	public void setConsentReceived(ims.vo.LookupInstanceBean value)
	{
		this.consentreceived = value;
	}
	public String getConsentAuthBy()
	{
		return this.consentauthby;
	}
	public void setConsentAuthBy(String value)
	{
		this.consentauthby = value;
	}
	public ims.clinical.vo.beans.VitalSignsForSurgicalAuditPreOpChecksVoBean getBMI()
	{
		return this.bmi;
	}
	public void setBMI(ims.clinical.vo.beans.VitalSignsForSurgicalAuditPreOpChecksVoBean value)
	{
		this.bmi = value;
	}
	public ims.vo.LookupInstanceBean getSiteMarked()
	{
		return this.sitemarked;
	}
	public void setSiteMarked(ims.vo.LookupInstanceBean value)
	{
		this.sitemarked = value;
	}
	public ims.vo.LookupInstanceBean getActionTaken()
	{
		return this.actiontaken;
	}
	public void setActionTaken(ims.vo.LookupInstanceBean value)
	{
		this.actiontaken = value;
	}
	public ims.vo.LookupInstanceBean getConfirmPatientDetails()
	{
		return this.confirmpatientdetails;
	}
	public void setConfirmPatientDetails(ims.vo.LookupInstanceBean value)
	{
		this.confirmpatientdetails = value;
	}
	public ims.vo.LookupInstanceBean getPreOpCheckDone()
	{
		return this.preopcheckdone;
	}
	public void setPreOpCheckDone(ims.vo.LookupInstanceBean value)
	{
		this.preopcheckdone = value;
	}
	public Boolean getAccompanyingLocumBool()
	{
		return this.accompanyinglocumbool;
	}
	public void setAccompanyingLocumBool(Boolean value)
	{
		this.accompanyinglocumbool = value;
	}
	public String getAccompanyingLocumNurse()
	{
		return this.accompanyinglocumnurse;
	}
	public void setAccompanyingLocumNurse(String value)
	{
		this.accompanyinglocumnurse = value;
	}
	public ims.core.vo.beans.NurseVoBean getTheatreNurse()
	{
		return this.theatrenurse;
	}
	public void setTheatreNurse(ims.core.vo.beans.NurseVoBean value)
	{
		this.theatrenurse = value;
	}
	public Boolean getTheatreNurseLocumBool()
	{
		return this.theatrenurselocumbool;
	}
	public void setTheatreNurseLocumBool(Boolean value)
	{
		this.theatrenurselocumbool = value;
	}
	public String getTheatreNurseLocumNurse()
	{
		return this.theatrenurselocumnurse;
	}
	public void setTheatreNurseLocumNurse(String value)
	{
		this.theatrenurselocumnurse = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean carecontext;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
	private ims.clinical.vo.beans.PatientProcedureForSurgicalAuditPreOpChecksVoBean[] plannedprocedures;
	private ims.core.vo.beans.MedicVoBean consultant;
	private ims.framework.utils.beans.DateTimeBean sentfortime;
	private ims.framework.utils.beans.DateTimeBean arrivaltime;
	private ims.framework.utils.beans.DateTimeBean leaveholdingtime;
	private ims.core.vo.beans.NurseVoBean accompanyingnurse;
	private ims.core.vo.beans.LocationLiteVoBean transferredfrom;
	private ims.vo.LookupInstanceBean asagrade;
	private ims.vo.LookupInstanceBean consentreceived;
	private String consentauthby;
	private ims.clinical.vo.beans.VitalSignsForSurgicalAuditPreOpChecksVoBean bmi;
	private ims.vo.LookupInstanceBean sitemarked;
	private ims.vo.LookupInstanceBean actiontaken;
	private ims.vo.LookupInstanceBean confirmpatientdetails;
	private ims.vo.LookupInstanceBean preopcheckdone;
	private Boolean accompanyinglocumbool;
	private String accompanyinglocumnurse;
	private ims.core.vo.beans.NurseVoBean theatrenurse;
	private Boolean theatrenurselocumbool;
	private String theatrenurselocumnurse;
}
