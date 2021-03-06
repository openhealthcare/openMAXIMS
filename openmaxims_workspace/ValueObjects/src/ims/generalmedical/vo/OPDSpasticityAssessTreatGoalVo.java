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

package ims.generalmedical.vo;

/**
 * Linked to medical.OPDSpasAssessTreatGoal business object (ID: 1031100007).
 */
public class OPDSpasticityAssessTreatGoalVo extends ims.medical.vo.OPDSpasAssessTreatGoalRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public OPDSpasticityAssessTreatGoalVo()
	{
	}
	public OPDSpasticityAssessTreatGoalVo(Integer id, int version)
	{
		super(id, version);
	}
	public OPDSpasticityAssessTreatGoalVo(ims.generalmedical.vo.beans.OPDSpasticityAssessTreatGoalVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.treatgoal = bean.getTreatGoal() == null ? null : ims.spinalinjuries.vo.lookups.SATreatmentGoal.buildLookup(bean.getTreatGoal());
		this.opdtreatgoalstatus = bean.getOPDTreatGoalStatus() == null ? null : ims.spinalinjuries.vo.lookups.SATreatmentGoalStatus.buildLookup(bean.getOPDTreatGoalStatus());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.beans.OPDSpasticityAssessTreatGoalVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.treatgoal = bean.getTreatGoal() == null ? null : ims.spinalinjuries.vo.lookups.SATreatmentGoal.buildLookup(bean.getTreatGoal());
		this.opdtreatgoalstatus = bean.getOPDTreatGoalStatus() == null ? null : ims.spinalinjuries.vo.lookups.SATreatmentGoalStatus.buildLookup(bean.getOPDTreatGoalStatus());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.beans.OPDSpasticityAssessTreatGoalVoBean bean = null;
		if(map != null)
			bean = (ims.generalmedical.vo.beans.OPDSpasticityAssessTreatGoalVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.generalmedical.vo.beans.OPDSpasticityAssessTreatGoalVoBean();
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
		if(fieldName.equals("TREATGOAL"))
			return getTreatGoal();
		if(fieldName.equals("OPDTREATGOALSTATUS"))
			return getOPDTreatGoalStatus();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTreatGoalIsNotNull()
	{
		return this.treatgoal != null;
	}
	public ims.spinalinjuries.vo.lookups.SATreatmentGoal getTreatGoal()
	{
		return this.treatgoal;
	}
	public void setTreatGoal(ims.spinalinjuries.vo.lookups.SATreatmentGoal value)
	{
		this.isValidated = false;
		this.treatgoal = value;
	}
	public boolean getOPDTreatGoalStatusIsNotNull()
	{
		return this.opdtreatgoalstatus != null;
	}
	public ims.spinalinjuries.vo.lookups.SATreatmentGoalStatus getOPDTreatGoalStatus()
	{
		return this.opdtreatgoalstatus;
	}
	public void setOPDTreatGoalStatus(ims.spinalinjuries.vo.lookups.SATreatmentGoalStatus value)
	{
		this.isValidated = false;
		this.opdtreatgoalstatus = value;
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
	
		OPDSpasticityAssessTreatGoalVo clone = new OPDSpasticityAssessTreatGoalVo(this.id, this.version);
		
		if(this.treatgoal == null)
			clone.treatgoal = null;
		else
			clone.treatgoal = (ims.spinalinjuries.vo.lookups.SATreatmentGoal)this.treatgoal.clone();
		if(this.opdtreatgoalstatus == null)
			clone.opdtreatgoalstatus = null;
		else
			clone.opdtreatgoalstatus = (ims.spinalinjuries.vo.lookups.SATreatmentGoalStatus)this.opdtreatgoalstatus.clone();
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
		if (!(OPDSpasticityAssessTreatGoalVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A OPDSpasticityAssessTreatGoalVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		OPDSpasticityAssessTreatGoalVo compareObj = (OPDSpasticityAssessTreatGoalVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_OPDSpasAssessTreatGoal() == null && compareObj.getID_OPDSpasAssessTreatGoal() != null)
				return -1;
			if(this.getID_OPDSpasAssessTreatGoal() != null && compareObj.getID_OPDSpasAssessTreatGoal() == null)
				return 1;
			if(this.getID_OPDSpasAssessTreatGoal() != null && compareObj.getID_OPDSpasAssessTreatGoal() != null)
				retVal = this.getID_OPDSpasAssessTreatGoal().compareTo(compareObj.getID_OPDSpasAssessTreatGoal());
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
		if(this.treatgoal != null)
			count++;
		if(this.opdtreatgoalstatus != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.spinalinjuries.vo.lookups.SATreatmentGoal treatgoal;
	protected ims.spinalinjuries.vo.lookups.SATreatmentGoalStatus opdtreatgoalstatus;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
