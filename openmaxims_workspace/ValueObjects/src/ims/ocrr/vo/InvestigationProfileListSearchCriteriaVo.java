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

package ims.ocrr.vo;


public class InvestigationProfileListSearchCriteriaVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public InvestigationProfileListSearchCriteriaVo()
	{
	}
	public InvestigationProfileListSearchCriteriaVo(ims.ocrr.vo.beans.InvestigationProfileListSearchCriteriaVoBean bean)
	{
		this.category = bean.getCategory() == null ? null : ims.ocrr.vo.lookups.Category.buildLookup(bean.getCategory());
		this.discipline = bean.getDiscipline() == null ? null : bean.getDiscipline().buildVo();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.text = bean.getText();
		this.investigationcode = bean.getInvestigationCode();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.InvestigationProfileListSearchCriteriaVoBean bean)
	{
		this.category = bean.getCategory() == null ? null : ims.ocrr.vo.lookups.Category.buildLookup(bean.getCategory());
		this.discipline = bean.getDiscipline() == null ? null : bean.getDiscipline().buildVo(map);
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.text = bean.getText();
		this.investigationcode = bean.getInvestigationCode();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.InvestigationProfileListSearchCriteriaVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.InvestigationProfileListSearchCriteriaVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.InvestigationProfileListSearchCriteriaVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getCategoryIsNotNull()
	{
		return this.category != null;
	}
	public ims.ocrr.vo.lookups.Category getCategory()
	{
		return this.category;
	}
	public void setCategory(ims.ocrr.vo.lookups.Category value)
	{
		this.isValidated = false;
		this.category = value;
	}
	public boolean getDisciplineIsNotNull()
	{
		return this.discipline != null;
	}
	public ims.core.vo.ServiceShortVo getDiscipline()
	{
		return this.discipline;
	}
	public void setDiscipline(ims.core.vo.ServiceShortVo value)
	{
		this.isValidated = false;
		this.discipline = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getTextIsNotNull()
	{
		return this.text != null;
	}
	public String getText()
	{
		return this.text;
	}
	public static int getTextMaxLength()
	{
		return 255;
	}
	public void setText(String value)
	{
		this.isValidated = false;
		this.text = value;
	}
	public boolean getInvestigationCodeIsNotNull()
	{
		return this.investigationcode != null;
	}
	public String getInvestigationCode()
	{
		return this.investigationcode;
	}
	public static int getInvestigationCodeMaxLength()
	{
		return 255;
	}
	public void setInvestigationCode(String value)
	{
		this.isValidated = false;
		this.investigationcode = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof InvestigationProfileListSearchCriteriaVo))
			return false;
		InvestigationProfileListSearchCriteriaVo compareObj = (InvestigationProfileListSearchCriteriaVo)obj;
		if(this.getCategory() == null && compareObj.getCategory() != null)
			return false;
		if(this.getCategory() != null && compareObj.getCategory() == null)
			return false;
		if(this.getCategory() != null && compareObj.getCategory() != null)
			if(!this.getCategory().equals(compareObj.getCategory()))
				return false;
		if(this.getDiscipline() == null && compareObj.getDiscipline() != null)
			return false;
		if(this.getDiscipline() != null && compareObj.getDiscipline() == null)
			return false;
		if(this.getDiscipline() != null && compareObj.getDiscipline() != null)
			if(!this.getDiscipline().equals(compareObj.getDiscipline()))
				return false;
		if(this.getStatus() == null && compareObj.getStatus() != null)
			return false;
		if(this.getStatus() != null && compareObj.getStatus() == null)
			return false;
		if(this.getStatus() != null && compareObj.getStatus() != null)
			return this.getStatus().equals(compareObj.getStatus());
		return super.equals(obj);
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
		if(this.discipline != null)
		{
			if(!this.discipline.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.discipline != null)
		{
			String[] listOfOtherErrors = this.discipline.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		InvestigationProfileListSearchCriteriaVo clone = new InvestigationProfileListSearchCriteriaVo();
		
		if(this.category == null)
			clone.category = null;
		else
			clone.category = (ims.ocrr.vo.lookups.Category)this.category.clone();
		if(this.discipline == null)
			clone.discipline = null;
		else
			clone.discipline = (ims.core.vo.ServiceShortVo)this.discipline.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
		clone.text = this.text;
		clone.investigationcode = this.investigationcode;
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
		if (!(InvestigationProfileListSearchCriteriaVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A InvestigationProfileListSearchCriteriaVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		InvestigationProfileListSearchCriteriaVo compareObj = (InvestigationProfileListSearchCriteriaVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getCategory() == null && compareObj.getCategory() != null)
				return -1;
			if(this.getCategory() != null && compareObj.getCategory() == null)
				return 1;
			if(this.getCategory() != null && compareObj.getCategory() != null)
				retVal = this.getCategory().compareTo(compareObj.getCategory());
		}
		if (retVal == 0)
		{
			if(this.getDiscipline() == null && compareObj.getDiscipline() != null)
				return -1;
			if(this.getDiscipline() != null && compareObj.getDiscipline() == null)
				return 1;
			if(this.getDiscipline() != null && compareObj.getDiscipline() != null)
				retVal = this.getDiscipline().compareTo(compareObj.getDiscipline());
		}
		if (retVal == 0)
		{
			if(this.getStatus() == null && compareObj.getStatus() != null)
				return -1;
			if(this.getStatus() != null && compareObj.getStatus() == null)
				return 1;
			if(this.getStatus() != null && compareObj.getStatus() != null)
				retVal = this.getStatus().compareTo(compareObj.getStatus());
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
		if(this.category != null)
			count++;
		if(this.discipline != null)
			count++;
		if(this.status != null)
			count++;
		if(this.text != null)
			count++;
		if(this.investigationcode != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.ocrr.vo.lookups.Category category;
	protected ims.core.vo.ServiceShortVo discipline;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus status;
	protected String text;
	protected String investigationcode;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
