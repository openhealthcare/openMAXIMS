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

package ims.therapies.vo;

/**
 * Linked to therapies.homeAndEnvironmentalVisit.RoomDetails business object (ID: 1019100093).
 */
public class RoomDetailsVo extends ims.therapies.homeandenvironmentalvisit.vo.RoomDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public RoomDetailsVo()
	{
	}
	public RoomDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public RoomDetailsVo(ims.therapies.vo.beans.RoomDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.location = bean.getLocation() == null ? null : ims.spinalinjuries.vo.lookups.RoomLocation.buildLookup(bean.getLocation());
		this.access = bean.getAccess();
		this.doorwidth = bean.getDoorWidth();
		this.roomdetails = bean.getRoomDetails();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.unitofmeasure = bean.getUnitOfMeasure() == null ? null : ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement.buildLookup(bean.getUnitOfMeasure());
		this.homevisitroomtype = bean.getHomeVisitRoomType() == null ? null : ims.spinalinjuries.vo.lookups.RoomType.buildLookup(bean.getHomeVisitRoomType());
		this.environmentvisitroomtype = bean.getEnvironmentVisitRoomType() == null ? null : ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType.buildLookup(bean.getEnvironmentVisitRoomType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.beans.RoomDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.location = bean.getLocation() == null ? null : ims.spinalinjuries.vo.lookups.RoomLocation.buildLookup(bean.getLocation());
		this.access = bean.getAccess();
		this.doorwidth = bean.getDoorWidth();
		this.roomdetails = bean.getRoomDetails();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.unitofmeasure = bean.getUnitOfMeasure() == null ? null : ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement.buildLookup(bean.getUnitOfMeasure());
		this.homevisitroomtype = bean.getHomeVisitRoomType() == null ? null : ims.spinalinjuries.vo.lookups.RoomType.buildLookup(bean.getHomeVisitRoomType());
		this.environmentvisitroomtype = bean.getEnvironmentVisitRoomType() == null ? null : ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType.buildLookup(bean.getEnvironmentVisitRoomType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.beans.RoomDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.therapies.vo.beans.RoomDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.therapies.vo.beans.RoomDetailsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("LOCATION"))
			return getLocation();
		if(fieldName.equals("ACCESS"))
			return getAccess();
		if(fieldName.equals("DOORWIDTH"))
			return getDoorWidth();
		if(fieldName.equals("ROOMDETAILS"))
			return getRoomDetails();
		if(fieldName.equals("SYSINFO"))
			return getSysInfo();
		if(fieldName.equals("UNITOFMEASURE"))
			return getUnitOfMeasure();
		if(fieldName.equals("HOMEVISITROOMTYPE"))
			return getHomeVisitRoomType();
		if(fieldName.equals("ENVIRONMENTVISITROOMTYPE"))
			return getEnvironmentVisitRoomType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getLocationIsNotNull()
	{
		return this.location != null;
	}
	public ims.spinalinjuries.vo.lookups.RoomLocation getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.spinalinjuries.vo.lookups.RoomLocation value)
	{
		this.isValidated = false;
		this.location = value;
	}
	public boolean getAccessIsNotNull()
	{
		return this.access != null;
	}
	public String getAccess()
	{
		return this.access;
	}
	public static int getAccessMaxLength()
	{
		return 100;
	}
	public void setAccess(String value)
	{
		this.isValidated = false;
		this.access = value;
	}
	public boolean getDoorWidthIsNotNull()
	{
		return this.doorwidth != null;
	}
	public Integer getDoorWidth()
	{
		return this.doorwidth;
	}
	public void setDoorWidth(Integer value)
	{
		this.isValidated = false;
		this.doorwidth = value;
	}
	public boolean getRoomDetailsIsNotNull()
	{
		return this.roomdetails != null;
	}
	public String getRoomDetails()
	{
		return this.roomdetails;
	}
	public static int getRoomDetailsMaxLength()
	{
		return 300;
	}
	public void setRoomDetails(String value)
	{
		this.isValidated = false;
		this.roomdetails = value;
	}
	public boolean getSysInfoIsNotNull()
	{
		return this.sysinfo != null;
	}
	public ims.vo.SystemInformation getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.sysinfo = value;
	}
	public boolean getUnitOfMeasureIsNotNull()
	{
		return this.unitofmeasure != null;
	}
	public ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement getUnitOfMeasure()
	{
		return this.unitofmeasure;
	}
	public void setUnitOfMeasure(ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement value)
	{
		this.isValidated = false;
		this.unitofmeasure = value;
	}
	public boolean getHomeVisitRoomTypeIsNotNull()
	{
		return this.homevisitroomtype != null;
	}
	public ims.spinalinjuries.vo.lookups.RoomType getHomeVisitRoomType()
	{
		return this.homevisitroomtype;
	}
	public void setHomeVisitRoomType(ims.spinalinjuries.vo.lookups.RoomType value)
	{
		this.isValidated = false;
		this.homevisitroomtype = value;
	}
	public boolean getEnvironmentVisitRoomTypeIsNotNull()
	{
		return this.environmentvisitroomtype != null;
	}
	public ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType getEnvironmentVisitRoomType()
	{
		return this.environmentvisitroomtype;
	}
	public void setEnvironmentVisitRoomType(ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType value)
	{
		this.isValidated = false;
		this.environmentvisitroomtype = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.location == null)
			listOfErrors.add("Please enter Location.");
		if(this.access != null)
			if(this.access.length() > 100)
				listOfErrors.add("The length of the field [access] in the value object [ims.therapies.vo.RoomDetailsVo] is too big. It should be less or equal to 100");
		if(this.roomdetails != null)
			if(this.roomdetails.length() > 300)
				listOfErrors.add("The length of the field [roomdetails] in the value object [ims.therapies.vo.RoomDetailsVo] is too big. It should be less or equal to 300");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		RoomDetailsVo clone = new RoomDetailsVo(this.id, this.version);
		
		if(this.location == null)
			clone.location = null;
		else
			clone.location = (ims.spinalinjuries.vo.lookups.RoomLocation)this.location.clone();
		clone.access = this.access;
		clone.doorwidth = this.doorwidth;
		clone.roomdetails = this.roomdetails;
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.unitofmeasure == null)
			clone.unitofmeasure = null;
		else
			clone.unitofmeasure = (ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement)this.unitofmeasure.clone();
		if(this.homevisitroomtype == null)
			clone.homevisitroomtype = null;
		else
			clone.homevisitroomtype = (ims.spinalinjuries.vo.lookups.RoomType)this.homevisitroomtype.clone();
		if(this.environmentvisitroomtype == null)
			clone.environmentvisitroomtype = null;
		else
			clone.environmentvisitroomtype = (ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType)this.environmentvisitroomtype.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(RoomDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A RoomDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		RoomDetailsVo compareObj = (RoomDetailsVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSysInfo() == null && compareObj.getSysInfo() != null)
				return -1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() == null)
				return 1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() != null)
				retVal = this.getSysInfo().compareTo(compareObj.getSysInfo());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.location != null)
			count++;
		if(this.access != null)
			count++;
		if(this.doorwidth != null)
			count++;
		if(this.roomdetails != null)
			count++;
		if(this.sysinfo != null)
			count++;
		if(this.unitofmeasure != null)
			count++;
		if(this.homevisitroomtype != null)
			count++;
		if(this.environmentvisitroomtype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.spinalinjuries.vo.lookups.RoomLocation location;
	protected String access;
	protected Integer doorwidth;
	protected String roomdetails;
	protected ims.vo.SystemInformation sysinfo;
	protected ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement unitofmeasure;
	protected ims.spinalinjuries.vo.lookups.RoomType homevisitroomtype;
	protected ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType environmentvisitroomtype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}