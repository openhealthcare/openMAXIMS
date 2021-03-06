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

package ims.clinicaladmin.vo;

/**
 * Linked to Oncology.Configuration.PrognosticGrouping business object (ID: 1075100019).
 */
public class OverallPrognosticGroupingLiteVo extends ims.oncology.configuration.vo.PrognosticGroupingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public OverallPrognosticGroupingLiteVo()
	{
	}
	public OverallPrognosticGroupingLiteVo(Integer id, int version)
	{
		super(id, version);
	}
	public OverallPrognosticGroupingLiteVo(ims.clinicaladmin.vo.beans.OverallPrognosticGroupingLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.prognosticgroup = bean.getPrognosticGroup() == null ? null : ims.oncology.vo.lookups.PrognosticGroup.buildLookup(bean.getPrognosticGroup());
		this.isactive = bean.getIsActive();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.beans.OverallPrognosticGroupingLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.prognosticgroup = bean.getPrognosticGroup() == null ? null : ims.oncology.vo.lookups.PrognosticGroup.buildLookup(bean.getPrognosticGroup());
		this.isactive = bean.getIsActive();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.beans.OverallPrognosticGroupingLiteVoBean bean = null;
		if(map != null)
			bean = (ims.clinicaladmin.vo.beans.OverallPrognosticGroupingLiteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinicaladmin.vo.beans.OverallPrognosticGroupingLiteVoBean();
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
		if(fieldName.equals("PROGNOSTICGROUP"))
			return getPrognosticGroup();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPrognosticGroupIsNotNull()
	{
		return this.prognosticgroup != null;
	}
	public ims.oncology.vo.lookups.PrognosticGroup getPrognosticGroup()
	{
		return this.prognosticgroup;
	}
	public void setPrognosticGroup(ims.oncology.vo.lookups.PrognosticGroup value)
	{
		this.isValidated = false;
		this.prognosticgroup = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		if(this.prognosticgroup != null)
			sb.append(this.prognosticgroup);
		return sb.toString();
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
		if(this.prognosticgroup == null)
			listOfErrors.add("PrognosticGroup is mandatory");
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
	
		OverallPrognosticGroupingLiteVo clone = new OverallPrognosticGroupingLiteVo(this.id, this.version);
		
		if(this.prognosticgroup == null)
			clone.prognosticgroup = null;
		else
			clone.prognosticgroup = (ims.oncology.vo.lookups.PrognosticGroup)this.prognosticgroup.clone();
		clone.isactive = this.isactive;
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
		if (!(OverallPrognosticGroupingLiteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A OverallPrognosticGroupingLiteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((OverallPrognosticGroupingLiteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((OverallPrognosticGroupingLiteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.prognosticgroup != null)
			count++;
		if(this.isactive != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.oncology.vo.lookups.PrognosticGroup prognosticgroup;
	protected Boolean isactive;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
