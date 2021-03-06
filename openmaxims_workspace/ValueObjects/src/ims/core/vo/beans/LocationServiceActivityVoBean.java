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

public class LocationServiceActivityVoBean extends ims.vo.ValueObjectBean
{
	public LocationServiceActivityVoBean()
	{
	}
	public LocationServiceActivityVoBean(ims.core.vo.LocationServiceActivityVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.activitycontextpricings = vo.getActivityContextPricings() == null ? null : vo.getActivityContextPricings().getBeanCollection();
		this.isactive = vo.getIsActive();
		this.serviceactivity = vo.getServiceActivity() == null ? null : (ims.core.vo.beans.ServiceActivityVoBean)vo.getServiceActivity().getBean();
		this.locationservice = vo.getLocationService() == null ? null : (ims.core.vo.beans.LocationServiceVoBean)vo.getLocationService().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.LocationServiceActivityVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.activitycontextpricings = vo.getActivityContextPricings() == null ? null : vo.getActivityContextPricings().getBeanCollection();
		this.isactive = vo.getIsActive();
		this.serviceactivity = vo.getServiceActivity() == null ? null : (ims.core.vo.beans.ServiceActivityVoBean)vo.getServiceActivity().getBean(map);
		this.locationservice = vo.getLocationService() == null ? null : (ims.core.vo.beans.LocationServiceVoBean)vo.getLocationService().getBean(map);
	}

	public ims.core.vo.LocationServiceActivityVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.LocationServiceActivityVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.LocationServiceActivityVo vo = null;
		if(map != null)
			vo = (ims.core.vo.LocationServiceActivityVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.LocationServiceActivityVo();
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
	public ims.core.vo.beans.ActivityContextPricingDetailsVoBean[] getActivityContextPricings()
	{
		return this.activitycontextpricings;
	}
	public void setActivityContextPricings(ims.core.vo.beans.ActivityContextPricingDetailsVoBean[] value)
	{
		this.activitycontextpricings = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public ims.core.vo.beans.ServiceActivityVoBean getServiceActivity()
	{
		return this.serviceactivity;
	}
	public void setServiceActivity(ims.core.vo.beans.ServiceActivityVoBean value)
	{
		this.serviceactivity = value;
	}
	public ims.core.vo.beans.LocationServiceVoBean getLocationService()
	{
		return this.locationservice;
	}
	public void setLocationService(ims.core.vo.beans.LocationServiceVoBean value)
	{
		this.locationservice = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ActivityContextPricingDetailsVoBean[] activitycontextpricings;
	private Boolean isactive;
	private ims.core.vo.beans.ServiceActivityVoBean serviceactivity;
	private ims.core.vo.beans.LocationServiceVoBean locationservice;
}
