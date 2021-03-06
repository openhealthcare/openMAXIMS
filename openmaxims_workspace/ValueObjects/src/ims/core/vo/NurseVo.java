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
 * Linked to core.resource.people.Hcp business object (ID: 1006100000).
 */
public class NurseVo extends ims.core.vo.Hcp implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IHcp
{
	private static final long serialVersionUID = 1L;

	public NurseVo()
	{
	}
	public NurseVo(Integer id, int version)
	{
		super(id, version);
	}
	public NurseVo(ims.core.vo.beans.NurseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hcptype = bean.getHcpType() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getHcpType());
		this.queryname = bean.getQueryName() == null ? null : bean.getQueryName().buildVo();
		this.isactive = bean.getIsActive();
		this.mos = bean.getMos() == null ? null : bean.getMos().buildVo();
		this.ishcparesponsiblehcp = bean.getIsHCPaResponsibleHCP();
		this.isalocalconsultant = bean.getIsALocalConsultant();
		this.isaresponsibleedclinician = bean.getIsAResponsibleEDClinician();
		this.nursetype = bean.getNurseType() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getNurseType());
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.NurseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hcptype = bean.getHcpType() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getHcpType());
		this.queryname = bean.getQueryName() == null ? null : bean.getQueryName().buildVo(map);
		this.isactive = bean.getIsActive();
		this.mos = bean.getMos() == null ? null : bean.getMos().buildVo(map);
		this.ishcparesponsiblehcp = bean.getIsHCPaResponsibleHCP();
		this.isalocalconsultant = bean.getIsALocalConsultant();
		this.isaresponsibleedclinician = bean.getIsAResponsibleEDClinician();
		this.nursetype = bean.getNurseType() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getNurseType());
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.NurseVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.NurseVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.NurseVoBean();
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
		if(fieldName.equals("NURSETYPE"))
			return getNurseType();
		if(fieldName.equals("SPECIALTY"))
			return getSpecialty();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNurseTypeIsNotNull()
	{
		return this.nursetype != null;
	}
	public ims.core.vo.lookups.HcpDisType getNurseType()
	{
		return this.nursetype;
	}
	public void setNurseType(ims.core.vo.lookups.HcpDisType value)
	{
		this.isValidated = false;
		this.nursetype = value;
	}
	public boolean getSpecialtyIsNotNull()
	{
		return this.specialty != null;
	}
	public ims.core.vo.lookups.Specialty getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.core.vo.lookups.Specialty value)
	{
		this.isValidated = false;
		this.specialty = value;
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
		if(this.queryname != null)
		{
			if(!this.queryname.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.mos != null)
		{
			if(!this.mos.isValidated())
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
		if(this.queryname != null)
		{
			String[] listOfOtherErrors = this.queryname.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.mos != null)
		{
			String[] listOfOtherErrors = this.mos.validate();
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
	
		NurseVo clone = new NurseVo(this.id, this.version);
		
		if(this.hcptype == null)
			clone.hcptype = null;
		else
			clone.hcptype = (ims.core.vo.lookups.HcpDisType)this.hcptype.clone();
		if(this.queryname == null)
			clone.queryname = null;
		else
			clone.queryname = (ims.core.vo.PersonName)this.queryname.clone();
		clone.isactive = this.isactive;
		if(this.mos == null)
			clone.mos = null;
		else
			clone.mos = (ims.core.vo.MemberOfStaffShortVo)this.mos.clone();
		clone.ishcparesponsiblehcp = this.ishcparesponsiblehcp;
		clone.isalocalconsultant = this.isalocalconsultant;
		clone.isaresponsibleedclinician = this.isaresponsibleedclinician;
		if(this.nursetype == null)
			clone.nursetype = null;
		else
			clone.nursetype = (ims.core.vo.lookups.HcpDisType)this.nursetype.clone();
		if(this.specialty == null)
			clone.specialty = null;
		else
			clone.specialty = (ims.core.vo.lookups.Specialty)this.specialty.clone();
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
		if (!(NurseVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A NurseVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		NurseVo compareObj = (NurseVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getMos() == null && compareObj.getMos() != null)
				return -1;
			if(this.getMos() != null && compareObj.getMos() == null)
				return 1;
			if(this.getMos() != null && compareObj.getMos() != null)
				retVal = this.getMos().compareTo(compareObj.getMos());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.nursetype != null)
			count++;
		if(this.specialty != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 2;
	}
	protected ims.core.vo.lookups.HcpDisType nursetype;
	protected ims.core.vo.lookups.Specialty specialty;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
