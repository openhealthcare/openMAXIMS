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

public class SurgicalAuditTheatreWorklistSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public SurgicalAuditTheatreWorklistSearchCriteriaVoBean()
	{
	}
	public SurgicalAuditTheatreWorklistSearchCriteriaVoBean(ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo vo)
	{
		this.idtype = vo.getIdType() == null ? null : (ims.vo.LookupInstanceBean)vo.getIdType().getBean();
		this.idvalue = vo.getIdValue();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.theatre = vo.getTheatre() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getTheatre().getBean();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateTo().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo vo)
	{
		this.idtype = vo.getIdType() == null ? null : (ims.vo.LookupInstanceBean)vo.getIdType().getBean();
		this.idvalue = vo.getIdValue();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.theatre = vo.getTheatre() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getTheatre().getBean(map);
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateTo().getBean();
	}

	public ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.SurgicalAuditTheatreWorklistSearchCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.vo.LookupInstanceBean getIdType()
	{
		return this.idtype;
	}
	public void setIdType(ims.vo.LookupInstanceBean value)
	{
		this.idtype = value;
	}
	public String getIdValue()
	{
		return this.idvalue;
	}
	public void setIdValue(String value)
	{
		this.idvalue = value;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String value)
	{
		this.surname = value;
	}
	public String getForename()
	{
		return this.forename;
	}
	public void setForename(String value)
	{
		this.forename = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getTheatre()
	{
		return this.theatre;
	}
	public void setTheatre(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.theatre = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public ims.framework.utils.beans.DateBean getDateFrom()
	{
		return this.datefrom;
	}
	public void setDateFrom(ims.framework.utils.beans.DateBean value)
	{
		this.datefrom = value;
	}
	public ims.framework.utils.beans.DateBean getDateTo()
	{
		return this.dateto;
	}
	public void setDateTo(ims.framework.utils.beans.DateBean value)
	{
		this.dateto = value;
	}

	private ims.vo.LookupInstanceBean idtype;
	private String idvalue;
	private String surname;
	private String forename;
	private ims.core.vo.beans.LocationLiteVoBean theatre;
	private ims.vo.LookupInstanceBean status;
	private ims.framework.utils.beans.DateBean datefrom;
	private ims.framework.utils.beans.DateBean dateto;
}
