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

package ims.core.vo;

/**
 * Linked to core.admin.EDAttendenceformsConfig business object (ID: 1004100061).
 */
public class EDAttendanceformsConfigVo extends ims.core.admin.vo.EDAttendenceformsConfigRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EDAttendanceformsConfigVo()
	{
	}
	public EDAttendanceformsConfigVo(Integer id, int version)
	{
		super(id, version);
	}
	public EDAttendanceformsConfigVo(ims.core.vo.beans.EDAttendanceformsConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.chartrequestedtabvisible = bean.getChartRequestedTabVisible();
		this.invoicesbillingtabvisible = bean.getInvoicesBillingTabVisible();
		this.controlsconfigitems = ims.admin.vo.EDAttendanceControlsConfigVoCollection.buildFromBeanCollection(bean.getControlsConfigItems());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.EDAttendanceformsConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.chartrequestedtabvisible = bean.getChartRequestedTabVisible();
		this.invoicesbillingtabvisible = bean.getInvoicesBillingTabVisible();
		this.controlsconfigitems = ims.admin.vo.EDAttendanceControlsConfigVoCollection.buildFromBeanCollection(bean.getControlsConfigItems());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.EDAttendanceformsConfigVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.EDAttendanceformsConfigVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.EDAttendanceformsConfigVoBean();
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
		if(fieldName.equals("CHARTREQUESTEDTABVISIBLE"))
			return getChartRequestedTabVisible();
		if(fieldName.equals("INVOICESBILLINGTABVISIBLE"))
			return getInvoicesBillingTabVisible();
		if(fieldName.equals("CONTROLSCONFIGITEMS"))
			return getControlsConfigItems();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getChartRequestedTabVisibleIsNotNull()
	{
		return this.chartrequestedtabvisible != null;
	}
	public Boolean getChartRequestedTabVisible()
	{
		return this.chartrequestedtabvisible;
	}
	public void setChartRequestedTabVisible(Boolean value)
	{
		this.isValidated = false;
		this.chartrequestedtabvisible = value;
	}
	public boolean getInvoicesBillingTabVisibleIsNotNull()
	{
		return this.invoicesbillingtabvisible != null;
	}
	public Boolean getInvoicesBillingTabVisible()
	{
		return this.invoicesbillingtabvisible;
	}
	public void setInvoicesBillingTabVisible(Boolean value)
	{
		this.isValidated = false;
		this.invoicesbillingtabvisible = value;
	}
	public boolean getControlsConfigItemsIsNotNull()
	{
		return this.controlsconfigitems != null;
	}
	public ims.admin.vo.EDAttendanceControlsConfigVoCollection getControlsConfigItems()
	{
		return this.controlsconfigitems;
	}
	public void setControlsConfigItems(ims.admin.vo.EDAttendanceControlsConfigVoCollection value)
	{
		this.isValidated = false;
		this.controlsconfigitems = value;
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
		if(this.controlsconfigitems != null)
		{
			if(!this.controlsconfigitems.isValidated())
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
		if(this.chartrequestedtabvisible == null)
			listOfErrors.add("ChartRequestedTabVisible is mandatory");
		if(this.invoicesbillingtabvisible == null)
			listOfErrors.add("InvoicesBillingTabVisible is mandatory");
		if(this.controlsconfigitems == null || this.controlsconfigitems.size() == 0)
			listOfErrors.add("ControlsConfigItems are mandatory");
		if(this.controlsconfigitems != null)
		{
			String[] listOfOtherErrors = this.controlsconfigitems.validate();
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
	
		EDAttendanceformsConfigVo clone = new EDAttendanceformsConfigVo(this.id, this.version);
		
		clone.chartrequestedtabvisible = this.chartrequestedtabvisible;
		clone.invoicesbillingtabvisible = this.invoicesbillingtabvisible;
		if(this.controlsconfigitems == null)
			clone.controlsconfigitems = null;
		else
			clone.controlsconfigitems = (ims.admin.vo.EDAttendanceControlsConfigVoCollection)this.controlsconfigitems.clone();
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
		if (!(EDAttendanceformsConfigVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EDAttendanceformsConfigVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((EDAttendanceformsConfigVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((EDAttendanceformsConfigVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.chartrequestedtabvisible != null)
			count++;
		if(this.invoicesbillingtabvisible != null)
			count++;
		if(this.controlsconfigitems != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected Boolean chartrequestedtabvisible;
	protected Boolean invoicesbillingtabvisible;
	protected ims.admin.vo.EDAttendanceControlsConfigVoCollection controlsconfigitems;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
