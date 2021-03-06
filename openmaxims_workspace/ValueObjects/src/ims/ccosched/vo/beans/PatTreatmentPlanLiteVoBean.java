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

package ims.ccosched.vo.beans;

public class PatTreatmentPlanLiteVoBean extends ims.vo.ValueObjectBean
{
	public PatTreatmentPlanLiteVoBean()
	{
	}
	public PatTreatmentPlanLiteVoBean(ims.ccosched.vo.PatTreatmentPlanLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.treatmentintent = vo.getTreatmentIntent() == null ? null : (ims.vo.LookupInstanceBean)vo.getTreatmentIntent().getBean();
		this.dateseen = vo.getDateSeen() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateSeen().getBean();
		this.decisiontotreat = vo.getDecisionToTreat() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDecisionToTreat().getBean();
		this.actions = vo.getActions() == null ? null : vo.getActions().getBeanCollection();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.pkey = vo.getPkey();
		this.rkey = vo.getRkey();
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.treatmentplancomment = vo.getTreatmentplanComment();
		this.activestatus = vo.getActiveStatus();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultant().getBean();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.primarytumourhistology = vo.getPrimaryTumourHistology() == null ? null : (ims.clinicaladmin.vo.beans.TumourHistologyLiteVoBean)vo.getPrimaryTumourHistology().getBean();
		this.ecad_date = vo.getEcad_date() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEcad_date().getBean();
		this.primarytumourgroup = vo.getPrimaryTumourGroup() == null ? null : (ims.clinicaladmin.vo.beans.TumourGroupLiteVoBean)vo.getPrimaryTumourGroup().getBean();
		this.primarytumoursite = vo.getPrimaryTumourSite() == null ? null : (ims.clinicaladmin.vo.beans.TumourSiteLiteVoBean)vo.getPrimaryTumourSite().getBean();
		this.treatmentsites = vo.getTreatmentSites() == null ? null : vo.getTreatmentSites().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ccosched.vo.PatTreatmentPlanLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.treatmentintent = vo.getTreatmentIntent() == null ? null : (ims.vo.LookupInstanceBean)vo.getTreatmentIntent().getBean();
		this.dateseen = vo.getDateSeen() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateSeen().getBean();
		this.decisiontotreat = vo.getDecisionToTreat() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDecisionToTreat().getBean();
		this.actions = vo.getActions() == null ? null : vo.getActions().getBeanCollection();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.pkey = vo.getPkey();
		this.rkey = vo.getRkey();
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.treatmentplancomment = vo.getTreatmentplanComment();
		this.activestatus = vo.getActiveStatus();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultant().getBean(map);
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.primarytumourhistology = vo.getPrimaryTumourHistology() == null ? null : (ims.clinicaladmin.vo.beans.TumourHistologyLiteVoBean)vo.getPrimaryTumourHistology().getBean(map);
		this.ecad_date = vo.getEcad_date() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEcad_date().getBean();
		this.primarytumourgroup = vo.getPrimaryTumourGroup() == null ? null : (ims.clinicaladmin.vo.beans.TumourGroupLiteVoBean)vo.getPrimaryTumourGroup().getBean(map);
		this.primarytumoursite = vo.getPrimaryTumourSite() == null ? null : (ims.clinicaladmin.vo.beans.TumourSiteLiteVoBean)vo.getPrimaryTumourSite().getBean(map);
		this.treatmentsites = vo.getTreatmentSites() == null ? null : vo.getTreatmentSites().getBeanCollection();
	}

	public ims.ccosched.vo.PatTreatmentPlanLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ccosched.vo.PatTreatmentPlanLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ccosched.vo.PatTreatmentPlanLiteVo vo = null;
		if(map != null)
			vo = (ims.ccosched.vo.PatTreatmentPlanLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ccosched.vo.PatTreatmentPlanLiteVo();
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
	public ims.vo.LookupInstanceBean getTreatmentIntent()
	{
		return this.treatmentintent;
	}
	public void setTreatmentIntent(ims.vo.LookupInstanceBean value)
	{
		this.treatmentintent = value;
	}
	public ims.framework.utils.beans.DateBean getDateSeen()
	{
		return this.dateseen;
	}
	public void setDateSeen(ims.framework.utils.beans.DateBean value)
	{
		this.dateseen = value;
	}
	public ims.framework.utils.beans.DateBean getDecisionToTreat()
	{
		return this.decisiontotreat;
	}
	public void setDecisionToTreat(ims.framework.utils.beans.DateBean value)
	{
		this.decisiontotreat = value;
	}
	public ims.ccosched.vo.beans.PatTreatPlanActionVoBean[] getActions()
	{
		return this.actions;
	}
	public void setActions(ims.ccosched.vo.beans.PatTreatPlanActionVoBean[] value)
	{
		this.actions = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public Integer getPkey()
	{
		return this.pkey;
	}
	public void setPkey(Integer value)
	{
		this.pkey = value;
	}
	public Integer getRkey()
	{
		return this.rkey;
	}
	public void setRkey(Integer value)
	{
		this.rkey = value;
	}
	public ims.vo.RefVoBean getEpisode()
	{
		return this.episode;
	}
	public void setEpisode(ims.vo.RefVoBean value)
	{
		this.episode = value;
	}
	public String getTreatmentplanComment()
	{
		return this.treatmentplancomment;
	}
	public void setTreatmentplanComment(String value)
	{
		this.treatmentplancomment = value;
	}
	public Boolean getActiveStatus()
	{
		return this.activestatus;
	}
	public void setActiveStatus(Boolean value)
	{
		this.activestatus = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.consultant = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}
	public ims.clinicaladmin.vo.beans.TumourHistologyLiteVoBean getPrimaryTumourHistology()
	{
		return this.primarytumourhistology;
	}
	public void setPrimaryTumourHistology(ims.clinicaladmin.vo.beans.TumourHistologyLiteVoBean value)
	{
		this.primarytumourhistology = value;
	}
	public ims.framework.utils.beans.DateBean getEcad_date()
	{
		return this.ecad_date;
	}
	public void setEcad_date(ims.framework.utils.beans.DateBean value)
	{
		this.ecad_date = value;
	}
	public ims.clinicaladmin.vo.beans.TumourGroupLiteVoBean getPrimaryTumourGroup()
	{
		return this.primarytumourgroup;
	}
	public void setPrimaryTumourGroup(ims.clinicaladmin.vo.beans.TumourGroupLiteVoBean value)
	{
		this.primarytumourgroup = value;
	}
	public ims.clinicaladmin.vo.beans.TumourSiteLiteVoBean getPrimaryTumourSite()
	{
		return this.primarytumoursite;
	}
	public void setPrimaryTumourSite(ims.clinicaladmin.vo.beans.TumourSiteLiteVoBean value)
	{
		this.primarytumoursite = value;
	}
	public java.util.Collection getTreatmentSites()
	{
		return this.treatmentsites;
	}
	public void setTreatmentSites(java.util.Collection value)
	{
		this.treatmentsites = value;
	}
	public void addTreatmentSites(java.util.Collection value)
	{
		if(this.treatmentsites == null)
			this.treatmentsites = new java.util.ArrayList();
		this.treatmentsites.add(value);
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean treatmentintent;
	private ims.framework.utils.beans.DateBean dateseen;
	private ims.framework.utils.beans.DateBean decisiontotreat;
	private ims.ccosched.vo.beans.PatTreatPlanActionVoBean[] actions;
	private ims.vo.RefVoBean patient;
	private Integer pkey;
	private Integer rkey;
	private ims.vo.RefVoBean episode;
	private String treatmentplancomment;
	private Boolean activestatus;
	private ims.core.vo.beans.HcpLiteVoBean consultant;
	private ims.vo.SysInfoBean sysinfo;
	private ims.clinicaladmin.vo.beans.TumourHistologyLiteVoBean primarytumourhistology;
	private ims.framework.utils.beans.DateBean ecad_date;
	private ims.clinicaladmin.vo.beans.TumourGroupLiteVoBean primarytumourgroup;
	private ims.clinicaladmin.vo.beans.TumourSiteLiteVoBean primarytumoursite;
	private java.util.Collection treatmentsites;
}
