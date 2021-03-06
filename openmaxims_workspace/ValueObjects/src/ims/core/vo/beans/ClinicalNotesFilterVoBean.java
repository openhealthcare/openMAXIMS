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

package ims.core.vo.beans;

public class ClinicalNotesFilterVoBean extends ims.vo.ValueObjectBean
{
	public ClinicalNotesFilterVoBean()
	{
	}
	public ClinicalNotesFilterVoBean(ims.core.vo.ClinicalNotesFilterVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.discipline = vo.getDiscipline() == null ? null : (ims.vo.LookupInstanceBean)vo.getDiscipline().getBean();
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDateTo().getBean();
		this.recordinguser = vo.getRecordingUser() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getRecordingUser().getBean();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.notetype = vo.getNoteType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNoteType().getBean();
		this.forreview = vo.getForReview();
		this.forreviewdiscipline = vo.getForReviewDiscipline() == null ? null : (ims.vo.LookupInstanceBean)vo.getForReviewDiscipline().getBean();
		this.authoringhcp = vo.getAuthoringHCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAuthoringHCP().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.ClinicalNotesFilterVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.discipline = vo.getDiscipline() == null ? null : (ims.vo.LookupInstanceBean)vo.getDiscipline().getBean();
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDateTo().getBean();
		this.recordinguser = vo.getRecordingUser() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getRecordingUser().getBean(map);
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean(map);
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.notetype = vo.getNoteType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNoteType().getBean();
		this.forreview = vo.getForReview();
		this.forreviewdiscipline = vo.getForReviewDiscipline() == null ? null : (ims.vo.LookupInstanceBean)vo.getForReviewDiscipline().getBean();
		this.authoringhcp = vo.getAuthoringHCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAuthoringHCP().getBean(map);
	}

	public ims.core.vo.ClinicalNotesFilterVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.ClinicalNotesFilterVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.ClinicalNotesFilterVo vo = null;
		if(map != null)
			vo = (ims.core.vo.ClinicalNotesFilterVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.ClinicalNotesFilterVo();
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
	public ims.vo.LookupInstanceBean getDiscipline()
	{
		return this.discipline;
	}
	public void setDiscipline(ims.vo.LookupInstanceBean value)
	{
		this.discipline = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDateFrom()
	{
		return this.datefrom;
	}
	public void setDateFrom(ims.framework.utils.beans.DateTimeBean value)
	{
		this.datefrom = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDateTo()
	{
		return this.dateto;
	}
	public void setDateTo(ims.framework.utils.beans.DateTimeBean value)
	{
		this.dateto = value;
	}
	public ims.core.vo.beans.MemberOfStaffShortVoBean getRecordingUser()
	{
		return this.recordinguser;
	}
	public void setRecordingUser(ims.core.vo.beans.MemberOfStaffShortVoBean value)
	{
		this.recordinguser = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public ims.core.vo.beans.PatientShortBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientShortBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.vo.RefVoBean value)
	{
		this.episodeofcare = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.vo.LookupInstanceBean getNoteType()
	{
		return this.notetype;
	}
	public void setNoteType(ims.vo.LookupInstanceBean value)
	{
		this.notetype = value;
	}
	public Boolean getForReview()
	{
		return this.forreview;
	}
	public void setForReview(Boolean value)
	{
		this.forreview = value;
	}
	public ims.vo.LookupInstanceBean getForReviewDiscipline()
	{
		return this.forreviewdiscipline;
	}
	public void setForReviewDiscipline(ims.vo.LookupInstanceBean value)
	{
		this.forreviewdiscipline = value;
	}
	public ims.core.vo.beans.HcpBean getAuthoringHCP()
	{
		return this.authoringhcp;
	}
	public void setAuthoringHCP(ims.core.vo.beans.HcpBean value)
	{
		this.authoringhcp = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean discipline;
	private ims.framework.utils.beans.DateTimeBean datefrom;
	private ims.framework.utils.beans.DateTimeBean dateto;
	private ims.core.vo.beans.MemberOfStaffShortVoBean recordinguser;
	private ims.vo.LookupInstanceBean status;
	private ims.core.vo.beans.PatientShortBean patient;
	private ims.vo.RefVoBean episodeofcare;
	private ims.vo.RefVoBean carecontext;
	private ims.vo.LookupInstanceBean notetype;
	private Boolean forreview;
	private ims.vo.LookupInstanceBean forreviewdiscipline;
	private ims.core.vo.beans.HcpBean authoringhcp;
}
