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

package ims.scheduling.vo;

/**
 * Linked to Scheduling.ProfileTemplate business object (ID: 1055100017).
 */
public class ProfileTemplateVo extends ims.scheduling.vo.ProfileTemplateRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ProfileTemplateVo()
	{
	}
	public ProfileTemplateVo(Integer id, int version)
	{
		super(id, version);
	}
	public ProfileTemplateVo(ims.scheduling.vo.beans.ProfileTemplateVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.template = bean.getTemplate() == null ? null : bean.getTemplate().buildVo();
		this.profile = bean.getProfile() == null ? null : new ims.scheduling.vo.Sch_ProfileRefVo(new Integer(bean.getProfile().getId()), bean.getProfile().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.ProfileTemplateVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.template = bean.getTemplate() == null ? null : bean.getTemplate().buildVo(map);
		this.profile = bean.getProfile() == null ? null : new ims.scheduling.vo.Sch_ProfileRefVo(new Integer(bean.getProfile().getId()), bean.getProfile().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.ProfileTemplateVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.ProfileTemplateVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.ProfileTemplateVoBean();
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
		if(fieldName.equals("TEMPLATE"))
			return getTemplate();
		if(fieldName.equals("PROFILE"))
			return getProfile();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTemplateIsNotNull()
	{
		return this.template != null;
	}
	public ims.admin.vo.ReportTemplateLiteVo getTemplate()
	{
		return this.template;
	}
	public void setTemplate(ims.admin.vo.ReportTemplateLiteVo value)
	{
		this.isValidated = false;
		this.template = value;
	}
	public boolean getProfileIsNotNull()
	{
		return this.profile != null;
	}
	public ims.scheduling.vo.Sch_ProfileRefVo getProfile()
	{
		return this.profile;
	}
	public void setProfile(ims.scheduling.vo.Sch_ProfileRefVo value)
	{
		this.isValidated = false;
		this.profile = value;
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
		if(this.template != null)
		{
			if(!this.template.isValidated())
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
		if(this.template == null)
			listOfErrors.add("Template is mandatory");
		if(this.template != null)
		{
			String[] listOfOtherErrors = this.template.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.profile == null)
			listOfErrors.add("Profile is mandatory");
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
	
		ProfileTemplateVo clone = new ProfileTemplateVo(this.id, this.version);
		
		if(this.template == null)
			clone.template = null;
		else
			clone.template = (ims.admin.vo.ReportTemplateLiteVo)this.template.clone();
		clone.profile = this.profile;
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
		if (!(ProfileTemplateVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ProfileTemplateVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ProfileTemplateVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ProfileTemplateVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.template != null)
			count++;
		if(this.profile != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.admin.vo.ReportTemplateLiteVo template;
	protected ims.scheduling.vo.Sch_ProfileRefVo profile;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
