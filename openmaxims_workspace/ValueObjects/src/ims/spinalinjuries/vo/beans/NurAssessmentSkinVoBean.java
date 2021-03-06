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

package ims.spinalinjuries.vo.beans;

public class NurAssessmentSkinVoBean extends ims.vo.ValueObjectBean
{
	public NurAssessmentSkinVoBean()
	{
	}
	public NurAssessmentSkinVoBean(ims.spinalinjuries.vo.NurAssessmentSkinVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.iscomplete = vo.getIsComplete();
		this.assessmentinfo = vo.getAssessmentInfo() == null ? null : vo.getAssessmentInfo().getBeanCollection();
		this.copy = vo.getCopy();
		this.componenttype = vo.getComponentType() == null ? null : (ims.vo.LookupInstanceBean)vo.getComponentType().getBean();
		this.lastassessmentinfo = vo.getLastAssessmentInfo() == null ? null : (ims.nursing.vo.beans.AssessmentInfoBean)vo.getLastAssessmentInfo().getBean();
		this.careplantemplate = vo.getCarePlanTemplate() == null ? null : vo.getCarePlanTemplate().getBeanCollection();
		this.careplans = vo.getCarePlans() == null ? null : vo.getCarePlans().getBeanCollection();
		this.bedtype = vo.getBedType() == null ? null : (ims.vo.LookupInstanceBean)vo.getBedType().getBean();
		this.mattresstype = vo.getMattressType() == null ? null : (ims.vo.LookupInstanceBean)vo.getMattressType().getBean();
		this.chairtype = vo.getChairType() == null ? null : (ims.vo.LookupInstanceBean)vo.getChairType().getBean();
		this.cushiontype = vo.getCushionType() == null ? null : (ims.vo.LookupInstanceBean)vo.getCushionType().getBean();
		this.turnsperformedby = vo.getTurnsPerformedBy() == null ? null : (ims.vo.LookupInstanceBean)vo.getTurnsPerformedBy().getBean();
		this.turntype = vo.getTurnType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTurnType().getBean();
		this.turns = vo.getTurns() == null ? null : vo.getTurns().getBeanCollection();
		this.notes = vo.getNotes();
		this.skinassessment = vo.getSkinAssessment() == null ? null : (ims.nursing.vo.beans.SkinAssessmentBean)vo.getSkinAssessment().getBean();
		this.waterlow = vo.getWaterlow() == null ? null : (ims.nursing.vo.beans.WaterlowAssessmentVoBean)vo.getWaterlow().getBean();
		this.waterlowscore = vo.getWaterlowScore();
		this.bradenscale = vo.getBradenScale() == null ? null : (ims.nursing.vo.beans.BradenScaleBean)vo.getBradenScale().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.spinalinjuries.vo.NurAssessmentSkinVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.iscomplete = vo.getIsComplete();
		this.assessmentinfo = vo.getAssessmentInfo() == null ? null : vo.getAssessmentInfo().getBeanCollection();
		this.copy = vo.getCopy();
		this.componenttype = vo.getComponentType() == null ? null : (ims.vo.LookupInstanceBean)vo.getComponentType().getBean();
		this.lastassessmentinfo = vo.getLastAssessmentInfo() == null ? null : (ims.nursing.vo.beans.AssessmentInfoBean)vo.getLastAssessmentInfo().getBean(map);
		this.careplantemplate = vo.getCarePlanTemplate() == null ? null : vo.getCarePlanTemplate().getBeanCollection();
		this.careplans = vo.getCarePlans() == null ? null : vo.getCarePlans().getBeanCollection();
		this.bedtype = vo.getBedType() == null ? null : (ims.vo.LookupInstanceBean)vo.getBedType().getBean();
		this.mattresstype = vo.getMattressType() == null ? null : (ims.vo.LookupInstanceBean)vo.getMattressType().getBean();
		this.chairtype = vo.getChairType() == null ? null : (ims.vo.LookupInstanceBean)vo.getChairType().getBean();
		this.cushiontype = vo.getCushionType() == null ? null : (ims.vo.LookupInstanceBean)vo.getCushionType().getBean();
		this.turnsperformedby = vo.getTurnsPerformedBy() == null ? null : (ims.vo.LookupInstanceBean)vo.getTurnsPerformedBy().getBean();
		this.turntype = vo.getTurnType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTurnType().getBean();
		this.turns = vo.getTurns() == null ? null : vo.getTurns().getBeanCollection();
		this.notes = vo.getNotes();
		this.skinassessment = vo.getSkinAssessment() == null ? null : (ims.nursing.vo.beans.SkinAssessmentBean)vo.getSkinAssessment().getBean(map);
		this.waterlow = vo.getWaterlow() == null ? null : (ims.nursing.vo.beans.WaterlowAssessmentVoBean)vo.getWaterlow().getBean(map);
		this.waterlowscore = vo.getWaterlowScore();
		this.bradenscale = vo.getBradenScale() == null ? null : (ims.nursing.vo.beans.BradenScaleBean)vo.getBradenScale().getBean(map);
	}

	public ims.spinalinjuries.vo.NurAssessmentSkinVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.spinalinjuries.vo.NurAssessmentSkinVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.spinalinjuries.vo.NurAssessmentSkinVo vo = null;
		if(map != null)
			vo = (ims.spinalinjuries.vo.NurAssessmentSkinVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.spinalinjuries.vo.NurAssessmentSkinVo();
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
	public Boolean getIsComplete()
	{
		return this.iscomplete;
	}
	public void setIsComplete(Boolean value)
	{
		this.iscomplete = value;
	}
	public ims.nursing.vo.beans.AssessmentInfoBean[] getAssessmentInfo()
	{
		return this.assessmentinfo;
	}
	public void setAssessmentInfo(ims.nursing.vo.beans.AssessmentInfoBean[] value)
	{
		this.assessmentinfo = value;
	}
	public Boolean getCopy()
	{
		return this.copy;
	}
	public void setCopy(Boolean value)
	{
		this.copy = value;
	}
	public ims.vo.LookupInstanceBean getComponentType()
	{
		return this.componenttype;
	}
	public void setComponentType(ims.vo.LookupInstanceBean value)
	{
		this.componenttype = value;
	}
	public ims.nursing.vo.beans.AssessmentInfoBean getLastAssessmentInfo()
	{
		return this.lastassessmentinfo;
	}
	public void setLastAssessmentInfo(ims.nursing.vo.beans.AssessmentInfoBean value)
	{
		this.lastassessmentinfo = value;
	}
	public ims.nursing.vo.beans.CarePlanTemplateBean[] getCarePlanTemplate()
	{
		return this.careplantemplate;
	}
	public void setCarePlanTemplate(ims.nursing.vo.beans.CarePlanTemplateBean[] value)
	{
		this.careplantemplate = value;
	}
	public ims.nursing.vo.beans.CarePlanBean[] getCarePlans()
	{
		return this.careplans;
	}
	public void setCarePlans(ims.nursing.vo.beans.CarePlanBean[] value)
	{
		this.careplans = value;
	}
	public ims.vo.LookupInstanceBean getBedType()
	{
		return this.bedtype;
	}
	public void setBedType(ims.vo.LookupInstanceBean value)
	{
		this.bedtype = value;
	}
	public ims.vo.LookupInstanceBean getMattressType()
	{
		return this.mattresstype;
	}
	public void setMattressType(ims.vo.LookupInstanceBean value)
	{
		this.mattresstype = value;
	}
	public ims.vo.LookupInstanceBean getChairType()
	{
		return this.chairtype;
	}
	public void setChairType(ims.vo.LookupInstanceBean value)
	{
		this.chairtype = value;
	}
	public ims.vo.LookupInstanceBean getCushionType()
	{
		return this.cushiontype;
	}
	public void setCushionType(ims.vo.LookupInstanceBean value)
	{
		this.cushiontype = value;
	}
	public ims.vo.LookupInstanceBean getTurnsPerformedBy()
	{
		return this.turnsperformedby;
	}
	public void setTurnsPerformedBy(ims.vo.LookupInstanceBean value)
	{
		this.turnsperformedby = value;
	}
	public ims.vo.LookupInstanceBean getTurnType()
	{
		return this.turntype;
	}
	public void setTurnType(ims.vo.LookupInstanceBean value)
	{
		this.turntype = value;
	}
	public ims.nursing.vo.beans.PatientTurnsVoBean[] getTurns()
	{
		return this.turns;
	}
	public void setTurns(ims.nursing.vo.beans.PatientTurnsVoBean[] value)
	{
		this.turns = value;
	}
	public String getNotes()
	{
		return this.notes;
	}
	public void setNotes(String value)
	{
		this.notes = value;
	}
	public ims.nursing.vo.beans.SkinAssessmentBean getSkinAssessment()
	{
		return this.skinassessment;
	}
	public void setSkinAssessment(ims.nursing.vo.beans.SkinAssessmentBean value)
	{
		this.skinassessment = value;
	}
	public ims.nursing.vo.beans.WaterlowAssessmentVoBean getWaterlow()
	{
		return this.waterlow;
	}
	public void setWaterlow(ims.nursing.vo.beans.WaterlowAssessmentVoBean value)
	{
		this.waterlow = value;
	}
	public Integer getWaterlowScore()
	{
		return this.waterlowscore;
	}
	public void setWaterlowScore(Integer value)
	{
		this.waterlowscore = value;
	}
	public ims.nursing.vo.beans.BradenScaleBean getBradenScale()
	{
		return this.bradenscale;
	}
	public void setBradenScale(ims.nursing.vo.beans.BradenScaleBean value)
	{
		this.bradenscale = value;
	}

	private Integer id;
	private int version;
	private Boolean iscomplete;
	private ims.nursing.vo.beans.AssessmentInfoBean[] assessmentinfo;
	private Boolean copy;
	private ims.vo.LookupInstanceBean componenttype;
	private ims.nursing.vo.beans.AssessmentInfoBean lastassessmentinfo;
	private ims.nursing.vo.beans.CarePlanTemplateBean[] careplantemplate;
	private ims.nursing.vo.beans.CarePlanBean[] careplans;
	private ims.vo.LookupInstanceBean bedtype;
	private ims.vo.LookupInstanceBean mattresstype;
	private ims.vo.LookupInstanceBean chairtype;
	private ims.vo.LookupInstanceBean cushiontype;
	private ims.vo.LookupInstanceBean turnsperformedby;
	private ims.vo.LookupInstanceBean turntype;
	private ims.nursing.vo.beans.PatientTurnsVoBean[] turns;
	private String notes;
	private ims.nursing.vo.beans.SkinAssessmentBean skinassessment;
	private ims.nursing.vo.beans.WaterlowAssessmentVoBean waterlow;
	private Integer waterlowscore;
	private ims.nursing.vo.beans.BradenScaleBean bradenscale;
}
