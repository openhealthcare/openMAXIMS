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

public class RiskAssessmentForSummaryOverviewVoBean extends ims.vo.ValueObjectBean
{
	public RiskAssessmentForSummaryOverviewVoBean()
	{
	}
	public RiskAssessmentForSummaryOverviewVoBean(ims.core.vo.RiskAssessmentForSummaryOverviewVo vo)
	{
		this.assessmenttype = vo.getAssessmentType();
		this.date = vo.getDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDate().getBean();
		this.hcp = vo.getHcp() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getHcp().getBean();
		this.score = vo.getScore();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.RiskAssessmentForSummaryOverviewVo vo)
	{
		this.assessmenttype = vo.getAssessmentType();
		this.date = vo.getDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDate().getBean();
		this.hcp = vo.getHcp() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getHcp().getBean(map);
		this.score = vo.getScore();
	}

	public ims.core.vo.RiskAssessmentForSummaryOverviewVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.RiskAssessmentForSummaryOverviewVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.RiskAssessmentForSummaryOverviewVo vo = null;
		if(map != null)
			vo = (ims.core.vo.RiskAssessmentForSummaryOverviewVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.RiskAssessmentForSummaryOverviewVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getAssessmentType()
	{
		return this.assessmenttype;
	}
	public void setAssessmentType(Integer value)
	{
		this.assessmenttype = value;
	}
	public ims.framework.utils.beans.DateBean getDate()
	{
		return this.date;
	}
	public void setDate(ims.framework.utils.beans.DateBean value)
	{
		this.date = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getHcp()
	{
		return this.hcp;
	}
	public void setHcp(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.hcp = value;
	}
	public String getScore()
	{
		return this.score;
	}
	public void setScore(String value)
	{
		this.score = value;
	}

	private Integer assessmenttype;
	private ims.framework.utils.beans.DateBean date;
	private ims.core.vo.beans.HcpLiteVoBean hcp;
	private String score;
}
