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

package ims.emergency.vo;

/**
 * Linked to emergency.Configuration.TrackingArea business object (ID: 1087100001).
 */
public class TrackingAreaForTrackingLiteVo extends ims.emergency.configuration.vo.TrackingAreaRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TrackingAreaForTrackingLiteVo()
	{
	}
	public TrackingAreaForTrackingLiteVo(Integer id, int version)
	{
		super(id, version);
	}
	public TrackingAreaForTrackingLiteVo(ims.emergency.vo.beans.TrackingAreaForTrackingLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.areadisplayname = bean.getAreaDisplayName();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.TrackingAreaForTrackingLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.areadisplayname = bean.getAreaDisplayName();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.TrackingAreaForTrackingLiteVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.TrackingAreaForTrackingLiteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.TrackingAreaForTrackingLiteVoBean();
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
		if(fieldName.equals("AREADISPLAYNAME"))
			return getAreaDisplayName();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAreaDisplayNameIsNotNull()
	{
		return this.areadisplayname != null;
	}
	public String getAreaDisplayName()
	{
		return this.areadisplayname;
	}
	public static int getAreaDisplayNameMaxLength()
	{
		return 15;
	}
	public void setAreaDisplayName(String value)
	{
		this.isValidated = false;
		this.areadisplayname = value;
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
		if(this.areadisplayname == null || this.areadisplayname.length() == 0)
			listOfErrors.add("AreaDisplayName is mandatory");
		else if(this.areadisplayname.length() > 15)
			listOfErrors.add("The length of the field [areadisplayname] in the value object [ims.emergency.vo.TrackingAreaForTrackingLiteVo] is too big. It should be less or equal to 15");
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
	
		TrackingAreaForTrackingLiteVo clone = new TrackingAreaForTrackingLiteVo(this.id, this.version);
		
		clone.areadisplayname = this.areadisplayname;
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
		if (!(TrackingAreaForTrackingLiteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TrackingAreaForTrackingLiteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TrackingAreaForTrackingLiteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TrackingAreaForTrackingLiteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.areadisplayname != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 1;
	}
	protected String areadisplayname;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
