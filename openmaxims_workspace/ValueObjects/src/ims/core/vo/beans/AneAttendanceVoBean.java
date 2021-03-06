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

public class AneAttendanceVoBean extends ims.vo.ValueObjectBean
{
	public AneAttendanceVoBean()
	{
	}
	public AneAttendanceVoBean(ims.core.vo.AneAttendanceVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventVoBean)vo.getPasEvent().getBean();
		this.modeofarrival = vo.getModeOfArrival() == null ? null : (ims.vo.LookupInstanceBean)vo.getModeOfArrival().getBean();
		this.isactive = vo.getIsActive();
		this.admitdatetime = vo.getAdmitDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAdmitDateTime().getBean();
		this.aneconclusiondatetime = vo.getANEconclusionDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getANEconclusionDateTime().getBean();
		this.reasonforadmission = vo.getReasonForAdmission();
		this.bedtyperequested = vo.getBedTypeRequested() == null ? null : (ims.vo.LookupInstanceBean)vo.getBedTypeRequested().getBean();
		this.currentlocation = vo.getCurrentLocation() == null ? null : (ims.core.vo.beans.LocShortVoBean)vo.getCurrentLocation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.AneAttendanceVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventVoBean)vo.getPasEvent().getBean(map);
		this.modeofarrival = vo.getModeOfArrival() == null ? null : (ims.vo.LookupInstanceBean)vo.getModeOfArrival().getBean();
		this.isactive = vo.getIsActive();
		this.admitdatetime = vo.getAdmitDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAdmitDateTime().getBean();
		this.aneconclusiondatetime = vo.getANEconclusionDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getANEconclusionDateTime().getBean();
		this.reasonforadmission = vo.getReasonForAdmission();
		this.bedtyperequested = vo.getBedTypeRequested() == null ? null : (ims.vo.LookupInstanceBean)vo.getBedTypeRequested().getBean();
		this.currentlocation = vo.getCurrentLocation() == null ? null : (ims.core.vo.beans.LocShortVoBean)vo.getCurrentLocation().getBean(map);
	}

	public ims.core.vo.AneAttendanceVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.AneAttendanceVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.AneAttendanceVo vo = null;
		if(map != null)
			vo = (ims.core.vo.AneAttendanceVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.AneAttendanceVo();
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
	public ims.core.vo.beans.PasEventVoBean getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.vo.beans.PasEventVoBean value)
	{
		this.pasevent = value;
	}
	public ims.vo.LookupInstanceBean getModeOfArrival()
	{
		return this.modeofarrival;
	}
	public void setModeOfArrival(ims.vo.LookupInstanceBean value)
	{
		this.modeofarrival = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAdmitDateTime()
	{
		return this.admitdatetime;
	}
	public void setAdmitDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.admitdatetime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getANEconclusionDateTime()
	{
		return this.aneconclusiondatetime;
	}
	public void setANEconclusionDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.aneconclusiondatetime = value;
	}
	public String getReasonForAdmission()
	{
		return this.reasonforadmission;
	}
	public void setReasonForAdmission(String value)
	{
		this.reasonforadmission = value;
	}
	public ims.vo.LookupInstanceBean getBedTypeRequested()
	{
		return this.bedtyperequested;
	}
	public void setBedTypeRequested(ims.vo.LookupInstanceBean value)
	{
		this.bedtyperequested = value;
	}
	public ims.core.vo.beans.LocShortVoBean getCurrentLocation()
	{
		return this.currentlocation;
	}
	public void setCurrentLocation(ims.core.vo.beans.LocShortVoBean value)
	{
		this.currentlocation = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PasEventVoBean pasevent;
	private ims.vo.LookupInstanceBean modeofarrival;
	private Boolean isactive;
	private ims.framework.utils.beans.DateTimeBean admitdatetime;
	private ims.framework.utils.beans.DateTimeBean aneconclusiondatetime;
	private String reasonforadmission;
	private ims.vo.LookupInstanceBean bedtyperequested;
	private ims.core.vo.beans.LocShortVoBean currentlocation;
}
