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

package ims.nursing.vo;

/**
 * Linked to nursing.Valuable business object (ID: 1009100005).
 */
public class ValuableVo extends ims.nursing.vo.ValuableRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ValuableVo()
	{
	}
	public ValuableVo(Integer id, int version)
	{
		super(id, version);
	}
	public ValuableVo(ims.nursing.vo.beans.ValuableVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.valuable = bean.getValuable() == null ? null : ims.nursing.vo.lookups.Valuable.buildLookup(bean.getValuable());
		this.hasvaluable = bean.getHasValuable() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getHasValuable());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.beans.ValuableVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.valuable = bean.getValuable() == null ? null : ims.nursing.vo.lookups.Valuable.buildLookup(bean.getValuable());
		this.hasvaluable = bean.getHasValuable() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getHasValuable());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.beans.ValuableVoBean bean = null;
		if(map != null)
			bean = (ims.nursing.vo.beans.ValuableVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.nursing.vo.beans.ValuableVoBean();
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
		if(fieldName.equals("VALUABLE"))
			return getValuable();
		if(fieldName.equals("HASVALUABLE"))
			return getHasValuable();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getValuableIsNotNull()
	{
		return this.valuable != null;
	}
	public ims.nursing.vo.lookups.Valuable getValuable()
	{
		return this.valuable;
	}
	public void setValuable(ims.nursing.vo.lookups.Valuable value)
	{
		this.isValidated = false;
		this.valuable = value;
	}
	public boolean getHasValuableIsNotNull()
	{
		return this.hasvaluable != null;
	}
	public ims.core.vo.lookups.YesNo getHasValuable()
	{
		return this.hasvaluable;
	}
	public void setHasValuable(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.hasvaluable = value;
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
	
		ValuableVo clone = new ValuableVo(this.id, this.version);
		
		if(this.valuable == null)
			clone.valuable = null;
		else
			clone.valuable = (ims.nursing.vo.lookups.Valuable)this.valuable.clone();
		if(this.hasvaluable == null)
			clone.hasvaluable = null;
		else
			clone.hasvaluable = (ims.core.vo.lookups.YesNo)this.hasvaluable.clone();
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
		if (!(ValuableVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ValuableVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ValuableVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ValuableVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.valuable != null)
			count++;
		if(this.hasvaluable != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.nursing.vo.lookups.Valuable valuable;
	protected ims.core.vo.lookups.YesNo hasvaluable;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
