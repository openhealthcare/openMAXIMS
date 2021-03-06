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

public class ClinicalCorrespondenceLiteVoBean extends ims.vo.ValueObjectBean
{
	public ClinicalCorrespondenceLiteVoBean()
	{
	}
	public ClinicalCorrespondenceLiteVoBean(ims.clinical.vo.ClinicalCorrespondenceLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean();
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextListVoBean)vo.getCareContext().getBean();
		this.verifyinghcp = vo.getVerifyingHCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getVerifyingHCP().getBean();
		this.verifyingdatetime = vo.getVerifyingDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getVerifyingDateTime().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.clinical.vo.beans.CorrespondenceStatusVoBean)vo.getCurrentStatus().getBean();
		this.opdnotes = vo.getOPDNotes() == null ? null : (ims.clinical.vo.beans.OutpatientNotesOutcomeVoBean)vo.getOPDNotes().getBean();
		this.hasobjectivenote = vo.getHasObjectiveNote();
		this.hasplannote = vo.getHasPlanNote();
		this.hasinstructionsnote = vo.getHasInstructionsNote();
		this.inpatientdischargesummary = vo.getInpatientDischargeSummary() == null ? null : (ims.clinical.vo.beans.InpatientDischargeNoteFollowupVoBean)vo.getInpatientDischargeSummary().getBean();
		this.type = vo.getType() == null ? null : (ims.vo.LookupInstanceBean)vo.getType().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : (ims.core.vo.beans.EpisodeofCareShortVoBean)vo.getEpisodeOfCare().getBean();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.ClinicalCorrespondenceLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextListVoBean)vo.getCareContext().getBean(map);
		this.verifyinghcp = vo.getVerifyingHCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getVerifyingHCP().getBean(map);
		this.verifyingdatetime = vo.getVerifyingDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getVerifyingDateTime().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.clinical.vo.beans.CorrespondenceStatusVoBean)vo.getCurrentStatus().getBean(map);
		this.opdnotes = vo.getOPDNotes() == null ? null : (ims.clinical.vo.beans.OutpatientNotesOutcomeVoBean)vo.getOPDNotes().getBean(map);
		this.hasobjectivenote = vo.getHasObjectiveNote();
		this.hasplannote = vo.getHasPlanNote();
		this.hasinstructionsnote = vo.getHasInstructionsNote();
		this.inpatientdischargesummary = vo.getInpatientDischargeSummary() == null ? null : (ims.clinical.vo.beans.InpatientDischargeNoteFollowupVoBean)vo.getInpatientDischargeSummary().getBean(map);
		this.type = vo.getType() == null ? null : (ims.vo.LookupInstanceBean)vo.getType().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : (ims.core.vo.beans.EpisodeofCareShortVoBean)vo.getEpisodeOfCare().getBean(map);
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
	}

	public ims.clinical.vo.ClinicalCorrespondenceLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.ClinicalCorrespondenceLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.ClinicalCorrespondenceLiteVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.ClinicalCorrespondenceLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.ClinicalCorrespondenceLiteVo();
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
	public ims.core.vo.beans.ClinicalContactShortVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.beans.ClinicalContactShortVoBean value)
	{
		this.clinicalcontact = value;
	}
	public ims.core.vo.beans.CareContextListVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.vo.beans.CareContextListVoBean value)
	{
		this.carecontext = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getVerifyingHCP()
	{
		return this.verifyinghcp;
	}
	public void setVerifyingHCP(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.verifyinghcp = value;
	}
	public ims.framework.utils.beans.DateTimeBean getVerifyingDateTime()
	{
		return this.verifyingdatetime;
	}
	public void setVerifyingDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.verifyingdatetime = value;
	}
	public ims.clinical.vo.beans.CorrespondenceStatusVoBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.clinical.vo.beans.CorrespondenceStatusVoBean value)
	{
		this.currentstatus = value;
	}
	public ims.clinical.vo.beans.OutpatientNotesOutcomeVoBean getOPDNotes()
	{
		return this.opdnotes;
	}
	public void setOPDNotes(ims.clinical.vo.beans.OutpatientNotesOutcomeVoBean value)
	{
		this.opdnotes = value;
	}
	public Boolean getHasObjectiveNote()
	{
		return this.hasobjectivenote;
	}
	public void setHasObjectiveNote(Boolean value)
	{
		this.hasobjectivenote = value;
	}
	public Boolean getHasPlanNote()
	{
		return this.hasplannote;
	}
	public void setHasPlanNote(Boolean value)
	{
		this.hasplannote = value;
	}
	public Boolean getHasInstructionsNote()
	{
		return this.hasinstructionsnote;
	}
	public void setHasInstructionsNote(Boolean value)
	{
		this.hasinstructionsnote = value;
	}
	public ims.clinical.vo.beans.InpatientDischargeNoteFollowupVoBean getInpatientDischargeSummary()
	{
		return this.inpatientdischargesummary;
	}
	public void setInpatientDischargeSummary(ims.clinical.vo.beans.InpatientDischargeNoteFollowupVoBean value)
	{
		this.inpatientdischargesummary = value;
	}
	public ims.vo.LookupInstanceBean getType()
	{
		return this.type;
	}
	public void setType(ims.vo.LookupInstanceBean value)
	{
		this.type = value;
	}
	public ims.core.vo.beans.EpisodeofCareShortVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.core.vo.beans.EpisodeofCareShortVoBean value)
	{
		this.episodeofcare = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ClinicalContactShortVoBean clinicalcontact;
	private ims.core.vo.beans.CareContextListVoBean carecontext;
	private ims.core.vo.beans.HcpLiteVoBean verifyinghcp;
	private ims.framework.utils.beans.DateTimeBean verifyingdatetime;
	private ims.clinical.vo.beans.CorrespondenceStatusVoBean currentstatus;
	private ims.clinical.vo.beans.OutpatientNotesOutcomeVoBean opdnotes;
	private Boolean hasobjectivenote;
	private Boolean hasplannote;
	private Boolean hasinstructionsnote;
	private ims.clinical.vo.beans.InpatientDischargeNoteFollowupVoBean inpatientdischargesummary;
	private ims.vo.LookupInstanceBean type;
	private ims.core.vo.beans.EpisodeofCareShortVoBean episodeofcare;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
}
