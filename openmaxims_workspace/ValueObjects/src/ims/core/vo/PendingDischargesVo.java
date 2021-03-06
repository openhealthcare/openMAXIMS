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
 * Linked to core.admin.pas.Inpatient Episode business object (ID: 1014100000).
 */
public class PendingDischargesVo extends ims.core.admin.pas.vo.InpatientEpisodeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PendingDischargesVo()
	{
	}
	public PendingDischargesVo(Integer id, int version)
	{
		super(id, version);
	}
	public PendingDischargesVo(ims.core.vo.beans.PendingDischargesVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.forename = bean.getForename();
		this.surname = bean.getSurname();
		this.hospitalnumber = bean.getHospitalNumber();
		this.sex = bean.getSex() == null ? null : ims.core.vo.lookups.Sex.buildLookup(bean.getSex());
		this.ward = bean.getWard() == null ? null : bean.getWard().buildVo();
		this.estdischargedate = bean.getEstDischargeDate() == null ? null : bean.getEstDischargeDate().buildDate();
		this.currenthospital = bean.getCurrentHospital() == null ? null : bean.getCurrentHospital().buildVo();
		this.consultant = bean.getConsultant() == null ? null : bean.getConsultant().buildVo();
		this.timeunits = bean.getTimeUnits() == null ? null : ims.core.vo.lookups.TimeUnitsSecondsToMonths.buildLookup(bean.getTimeUnits());
		this.numberoftimeunits = bean.getNumberOfTimeUnits();
		this.querypending = bean.getQueryPending();
		this.idtype = bean.getIDType() == null ? null : ims.core.vo.lookups.PatIdType.buildLookup(bean.getIDType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PendingDischargesVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.forename = bean.getForename();
		this.surname = bean.getSurname();
		this.hospitalnumber = bean.getHospitalNumber();
		this.sex = bean.getSex() == null ? null : ims.core.vo.lookups.Sex.buildLookup(bean.getSex());
		this.ward = bean.getWard() == null ? null : bean.getWard().buildVo(map);
		this.estdischargedate = bean.getEstDischargeDate() == null ? null : bean.getEstDischargeDate().buildDate();
		this.currenthospital = bean.getCurrentHospital() == null ? null : bean.getCurrentHospital().buildVo(map);
		this.consultant = bean.getConsultant() == null ? null : bean.getConsultant().buildVo(map);
		this.timeunits = bean.getTimeUnits() == null ? null : ims.core.vo.lookups.TimeUnitsSecondsToMonths.buildLookup(bean.getTimeUnits());
		this.numberoftimeunits = bean.getNumberOfTimeUnits();
		this.querypending = bean.getQueryPending();
		this.idtype = bean.getIDType() == null ? null : ims.core.vo.lookups.PatIdType.buildLookup(bean.getIDType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PendingDischargesVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PendingDischargesVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PendingDischargesVoBean();
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
		if(fieldName.equals("FORENAME"))
			return getForename();
		if(fieldName.equals("SURNAME"))
			return getSurname();
		if(fieldName.equals("HOSPITALNUMBER"))
			return getHospitalNumber();
		if(fieldName.equals("SEX"))
			return getSex();
		if(fieldName.equals("WARD"))
			return getWard();
		if(fieldName.equals("ESTDISCHARGEDATE"))
			return getEstDischargeDate();
		if(fieldName.equals("CURRENTHOSPITAL"))
			return getCurrentHospital();
		if(fieldName.equals("CONSULTANT"))
			return getConsultant();
		if(fieldName.equals("TIMEUNITS"))
			return getTimeUnits();
		if(fieldName.equals("NUMBEROFTIMEUNITS"))
			return getNumberOfTimeUnits();
		if(fieldName.equals("QUERYPENDING"))
			return getQueryPending();
		if(fieldName.equals("IDTYPE"))
			return getIDType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getForenameIsNotNull()
	{
		return this.forename != null;
	}
	public String getForename()
	{
		return this.forename;
	}
	public static int getForenameMaxLength()
	{
		return 255;
	}
	public void setForename(String value)
	{
		this.isValidated = false;
		this.forename = value;
	}
	public boolean getSurnameIsNotNull()
	{
		return this.surname != null;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public static int getSurnameMaxLength()
	{
		return 255;
	}
	public void setSurname(String value)
	{
		this.isValidated = false;
		this.surname = value;
	}
	public boolean getHospitalNumberIsNotNull()
	{
		return this.hospitalnumber != null;
	}
	public String getHospitalNumber()
	{
		return this.hospitalnumber;
	}
	public static int getHospitalNumberMaxLength()
	{
		return 255;
	}
	public void setHospitalNumber(String value)
	{
		this.isValidated = false;
		this.hospitalnumber = value;
	}
	public boolean getSexIsNotNull()
	{
		return this.sex != null;
	}
	public ims.core.vo.lookups.Sex getSex()
	{
		return this.sex;
	}
	public void setSex(ims.core.vo.lookups.Sex value)
	{
		this.isValidated = false;
		this.sex = value;
	}
	public boolean getWardIsNotNull()
	{
		return this.ward != null;
	}
	public ims.core.vo.LocationLiteVo getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.ward = value;
	}
	public boolean getEstDischargeDateIsNotNull()
	{
		return this.estdischargedate != null;
	}
	public ims.framework.utils.Date getEstDischargeDate()
	{
		return this.estdischargedate;
	}
	public void setEstDischargeDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.estdischargedate = value;
	}
	public boolean getCurrentHospitalIsNotNull()
	{
		return this.currenthospital != null;
	}
	public ims.core.vo.LocationLiteVo getCurrentHospital()
	{
		return this.currenthospital;
	}
	public void setCurrentHospital(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.currenthospital = value;
	}
	public boolean getConsultantIsNotNull()
	{
		return this.consultant != null;
	}
	public ims.core.vo.HcpLiteVo getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.consultant = value;
	}
	public boolean getTimeUnitsIsNotNull()
	{
		return this.timeunits != null;
	}
	public ims.core.vo.lookups.TimeUnitsSecondsToMonths getTimeUnits()
	{
		return this.timeunits;
	}
	public void setTimeUnits(ims.core.vo.lookups.TimeUnitsSecondsToMonths value)
	{
		this.isValidated = false;
		this.timeunits = value;
	}
	public boolean getNumberOfTimeUnitsIsNotNull()
	{
		return this.numberoftimeunits != null;
	}
	public Integer getNumberOfTimeUnits()
	{
		return this.numberoftimeunits;
	}
	public void setNumberOfTimeUnits(Integer value)
	{
		this.isValidated = false;
		this.numberoftimeunits = value;
	}
	public boolean getQueryPendingIsNotNull()
	{
		return this.querypending != null;
	}
	public Boolean getQueryPending()
	{
		return this.querypending;
	}
	public void setQueryPending(Boolean value)
	{
		this.isValidated = false;
		this.querypending = value;
	}
	public boolean getIDTypeIsNotNull()
	{
		return this.idtype != null;
	}
	public ims.core.vo.lookups.PatIdType getIDType()
	{
		return this.idtype;
	}
	public void setIDType(ims.core.vo.lookups.PatIdType value)
	{
		this.isValidated = false;
		this.idtype = value;
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
		if(this.ward != null)
		{
			if(!this.ward.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currenthospital != null)
		{
			if(!this.currenthospital.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.consultant != null)
		{
			if(!this.consultant.isValidated())
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
		if(this.surname == null || this.surname.length() == 0)
			listOfErrors.add("Surname is mandatory");
		if(this.ward != null)
		{
			String[] listOfOtherErrors = this.ward.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currenthospital != null)
		{
			String[] listOfOtherErrors = this.currenthospital.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.consultant != null)
		{
			String[] listOfOtherErrors = this.consultant.validate();
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
	
		PendingDischargesVo clone = new PendingDischargesVo(this.id, this.version);
		
		clone.forename = this.forename;
		clone.surname = this.surname;
		clone.hospitalnumber = this.hospitalnumber;
		if(this.sex == null)
			clone.sex = null;
		else
			clone.sex = (ims.core.vo.lookups.Sex)this.sex.clone();
		if(this.ward == null)
			clone.ward = null;
		else
			clone.ward = (ims.core.vo.LocationLiteVo)this.ward.clone();
		if(this.estdischargedate == null)
			clone.estdischargedate = null;
		else
			clone.estdischargedate = (ims.framework.utils.Date)this.estdischargedate.clone();
		if(this.currenthospital == null)
			clone.currenthospital = null;
		else
			clone.currenthospital = (ims.core.vo.LocationLiteVo)this.currenthospital.clone();
		if(this.consultant == null)
			clone.consultant = null;
		else
			clone.consultant = (ims.core.vo.HcpLiteVo)this.consultant.clone();
		if(this.timeunits == null)
			clone.timeunits = null;
		else
			clone.timeunits = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)this.timeunits.clone();
		clone.numberoftimeunits = this.numberoftimeunits;
		clone.querypending = this.querypending;
		if(this.idtype == null)
			clone.idtype = null;
		else
			clone.idtype = (ims.core.vo.lookups.PatIdType)this.idtype.clone();
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
		if (!(PendingDischargesVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PendingDischargesVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PendingDischargesVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PendingDischargesVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.forename != null)
			count++;
		if(this.surname != null)
			count++;
		if(this.hospitalnumber != null)
			count++;
		if(this.sex != null)
			count++;
		if(this.ward != null)
			count++;
		if(this.estdischargedate != null)
			count++;
		if(this.currenthospital != null)
			count++;
		if(this.consultant != null)
			count++;
		if(this.timeunits != null)
			count++;
		if(this.numberoftimeunits != null)
			count++;
		if(this.querypending != null)
			count++;
		if(this.idtype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected String forename;
	protected String surname;
	protected String hospitalnumber;
	protected ims.core.vo.lookups.Sex sex;
	protected ims.core.vo.LocationLiteVo ward;
	protected ims.framework.utils.Date estdischargedate;
	protected ims.core.vo.LocationLiteVo currenthospital;
	protected ims.core.vo.HcpLiteVo consultant;
	protected ims.core.vo.lookups.TimeUnitsSecondsToMonths timeunits;
	protected Integer numberoftimeunits;
	protected Boolean querypending;
	protected ims.core.vo.lookups.PatIdType idtype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
