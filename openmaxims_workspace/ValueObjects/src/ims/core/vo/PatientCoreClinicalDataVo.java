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
 * Linked to core.clinical.PatientCoreClinicalData business object (ID: 1003100083).
 */
public class PatientCoreClinicalDataVo extends ims.core.clinical.vo.PatientCoreClinicalDataRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientCoreClinicalDataVo()
	{
	}
	public PatientCoreClinicalDataVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientCoreClinicalDataVo(ims.core.vo.beans.PatientCoreClinicalDataVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.allergystatus = bean.getAllergyStatus() == null ? null : ims.core.vo.lookups.PatientAllergyStatus.buildLookup(bean.getAllergyStatus());
		this.alertstatus = bean.getAlertStatus() == null ? null : ims.core.vo.lookups.PatientAlertStatus.buildLookup(bean.getAlertStatus());
		this.supportnetworkstatus = bean.getSupportNetworkStatus() == null ? null : ims.core.vo.lookups.PatientSupportNetworkStatus.buildLookup(bean.getSupportNetworkStatus());
		this.supportnetworkservicestatus = bean.getSupportNetworkServiceStatus() == null ? null : ims.core.vo.lookups.PatientSupportNetworkStatus.buildLookup(bean.getSupportNetworkServiceStatus());
		this.allergyauthoringinformation = bean.getAllergyAuthoringInformation() == null ? null : bean.getAllergyAuthoringInformation().buildVo();
		this.alertauthoringinformation = bean.getAlertAuthoringInformation() == null ? null : bean.getAlertAuthoringInformation().buildVo();
		this.snstatusauthoringinformation = bean.getSnStatusAuthoringInformation() == null ? null : bean.getSnStatusAuthoringInformation().buildVo();
		this.snserviceauthoringinformation = bean.getSnServiceAuthoringInformation() == null ? null : bean.getSnServiceAuthoringInformation().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientCoreClinicalDataVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.allergystatus = bean.getAllergyStatus() == null ? null : ims.core.vo.lookups.PatientAllergyStatus.buildLookup(bean.getAllergyStatus());
		this.alertstatus = bean.getAlertStatus() == null ? null : ims.core.vo.lookups.PatientAlertStatus.buildLookup(bean.getAlertStatus());
		this.supportnetworkstatus = bean.getSupportNetworkStatus() == null ? null : ims.core.vo.lookups.PatientSupportNetworkStatus.buildLookup(bean.getSupportNetworkStatus());
		this.supportnetworkservicestatus = bean.getSupportNetworkServiceStatus() == null ? null : ims.core.vo.lookups.PatientSupportNetworkStatus.buildLookup(bean.getSupportNetworkServiceStatus());
		this.allergyauthoringinformation = bean.getAllergyAuthoringInformation() == null ? null : bean.getAllergyAuthoringInformation().buildVo(map);
		this.alertauthoringinformation = bean.getAlertAuthoringInformation() == null ? null : bean.getAlertAuthoringInformation().buildVo(map);
		this.snstatusauthoringinformation = bean.getSnStatusAuthoringInformation() == null ? null : bean.getSnStatusAuthoringInformation().buildVo(map);
		this.snserviceauthoringinformation = bean.getSnServiceAuthoringInformation() == null ? null : bean.getSnServiceAuthoringInformation().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientCoreClinicalDataVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientCoreClinicalDataVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientCoreClinicalDataVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("ALLERGYSTATUS"))
			return getAllergyStatus();
		if(fieldName.equals("ALERTSTATUS"))
			return getAlertStatus();
		if(fieldName.equals("SUPPORTNETWORKSTATUS"))
			return getSupportNetworkStatus();
		if(fieldName.equals("SUPPORTNETWORKSERVICESTATUS"))
			return getSupportNetworkServiceStatus();
		if(fieldName.equals("ALLERGYAUTHORINGINFORMATION"))
			return getAllergyAuthoringInformation();
		if(fieldName.equals("ALERTAUTHORINGINFORMATION"))
			return getAlertAuthoringInformation();
		if(fieldName.equals("SNSTATUSAUTHORINGINFORMATION"))
			return getSnStatusAuthoringInformation();
		if(fieldName.equals("SNSERVICEAUTHORINGINFORMATION"))
			return getSnServiceAuthoringInformation();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getAllergyStatusIsNotNull()
	{
		return this.allergystatus != null;
	}
	public ims.core.vo.lookups.PatientAllergyStatus getAllergyStatus()
	{
		return this.allergystatus;
	}
	public void setAllergyStatus(ims.core.vo.lookups.PatientAllergyStatus value)
	{
		this.isValidated = false;
		this.allergystatus = value;
	}
	public boolean getAlertStatusIsNotNull()
	{
		return this.alertstatus != null;
	}
	public ims.core.vo.lookups.PatientAlertStatus getAlertStatus()
	{
		return this.alertstatus;
	}
	public void setAlertStatus(ims.core.vo.lookups.PatientAlertStatus value)
	{
		this.isValidated = false;
		this.alertstatus = value;
	}
	public boolean getSupportNetworkStatusIsNotNull()
	{
		return this.supportnetworkstatus != null;
	}
	public ims.core.vo.lookups.PatientSupportNetworkStatus getSupportNetworkStatus()
	{
		return this.supportnetworkstatus;
	}
	public void setSupportNetworkStatus(ims.core.vo.lookups.PatientSupportNetworkStatus value)
	{
		this.isValidated = false;
		this.supportnetworkstatus = value;
	}
	public boolean getSupportNetworkServiceStatusIsNotNull()
	{
		return this.supportnetworkservicestatus != null;
	}
	public ims.core.vo.lookups.PatientSupportNetworkStatus getSupportNetworkServiceStatus()
	{
		return this.supportnetworkservicestatus;
	}
	public void setSupportNetworkServiceStatus(ims.core.vo.lookups.PatientSupportNetworkStatus value)
	{
		this.isValidated = false;
		this.supportnetworkservicestatus = value;
	}
	public boolean getAllergyAuthoringInformationIsNotNull()
	{
		return this.allergyauthoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAllergyAuthoringInformation()
	{
		return this.allergyauthoringinformation;
	}
	public void setAllergyAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.allergyauthoringinformation = value;
	}
	public boolean getAlertAuthoringInformationIsNotNull()
	{
		return this.alertauthoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAlertAuthoringInformation()
	{
		return this.alertauthoringinformation;
	}
	public void setAlertAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.alertauthoringinformation = value;
	}
	public boolean getSnStatusAuthoringInformationIsNotNull()
	{
		return this.snstatusauthoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getSnStatusAuthoringInformation()
	{
		return this.snstatusauthoringinformation;
	}
	public void setSnStatusAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.snstatusauthoringinformation = value;
	}
	public boolean getSnServiceAuthoringInformationIsNotNull()
	{
		return this.snserviceauthoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getSnServiceAuthoringInformation()
	{
		return this.snserviceauthoringinformation;
	}
	public void setSnServiceAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.snserviceauthoringinformation = value;
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
		if(this.allergyauthoringinformation != null)
		{
			if(!this.allergyauthoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.alertauthoringinformation != null)
		{
			if(!this.alertauthoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.snstatusauthoringinformation != null)
		{
			if(!this.snstatusauthoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.snserviceauthoringinformation != null)
		{
			if(!this.snserviceauthoringinformation.isValidated())
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.allergyauthoringinformation != null)
		{
			String[] listOfOtherErrors = this.allergyauthoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.alertauthoringinformation != null)
		{
			String[] listOfOtherErrors = this.alertauthoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.snstatusauthoringinformation != null)
		{
			String[] listOfOtherErrors = this.snstatusauthoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.snserviceauthoringinformation != null)
		{
			String[] listOfOtherErrors = this.snserviceauthoringinformation.validate();
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
	
		PatientCoreClinicalDataVo clone = new PatientCoreClinicalDataVo(this.id, this.version);
		
		clone.patient = this.patient;
		if(this.allergystatus == null)
			clone.allergystatus = null;
		else
			clone.allergystatus = (ims.core.vo.lookups.PatientAllergyStatus)this.allergystatus.clone();
		if(this.alertstatus == null)
			clone.alertstatus = null;
		else
			clone.alertstatus = (ims.core.vo.lookups.PatientAlertStatus)this.alertstatus.clone();
		if(this.supportnetworkstatus == null)
			clone.supportnetworkstatus = null;
		else
			clone.supportnetworkstatus = (ims.core.vo.lookups.PatientSupportNetworkStatus)this.supportnetworkstatus.clone();
		if(this.supportnetworkservicestatus == null)
			clone.supportnetworkservicestatus = null;
		else
			clone.supportnetworkservicestatus = (ims.core.vo.lookups.PatientSupportNetworkStatus)this.supportnetworkservicestatus.clone();
		if(this.allergyauthoringinformation == null)
			clone.allergyauthoringinformation = null;
		else
			clone.allergyauthoringinformation = (ims.core.vo.AuthoringInformationVo)this.allergyauthoringinformation.clone();
		if(this.alertauthoringinformation == null)
			clone.alertauthoringinformation = null;
		else
			clone.alertauthoringinformation = (ims.core.vo.AuthoringInformationVo)this.alertauthoringinformation.clone();
		if(this.snstatusauthoringinformation == null)
			clone.snstatusauthoringinformation = null;
		else
			clone.snstatusauthoringinformation = (ims.core.vo.AuthoringInformationVo)this.snstatusauthoringinformation.clone();
		if(this.snserviceauthoringinformation == null)
			clone.snserviceauthoringinformation = null;
		else
			clone.snserviceauthoringinformation = (ims.core.vo.AuthoringInformationVo)this.snserviceauthoringinformation.clone();
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
		if (!(PatientCoreClinicalDataVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientCoreClinicalDataVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientCoreClinicalDataVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientCoreClinicalDataVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.patient != null)
			count++;
		if(this.allergystatus != null)
			count++;
		if(this.alertstatus != null)
			count++;
		if(this.supportnetworkstatus != null)
			count++;
		if(this.supportnetworkservicestatus != null)
			count++;
		if(this.allergyauthoringinformation != null)
			count++;
		if(this.alertauthoringinformation != null)
			count++;
		if(this.snstatusauthoringinformation != null)
			count++;
		if(this.snserviceauthoringinformation != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.core.vo.lookups.PatientAllergyStatus allergystatus;
	protected ims.core.vo.lookups.PatientAlertStatus alertstatus;
	protected ims.core.vo.lookups.PatientSupportNetworkStatus supportnetworkstatus;
	protected ims.core.vo.lookups.PatientSupportNetworkStatus supportnetworkservicestatus;
	protected ims.core.vo.AuthoringInformationVo allergyauthoringinformation;
	protected ims.core.vo.AuthoringInformationVo alertauthoringinformation;
	protected ims.core.vo.AuthoringInformationVo snstatusauthoringinformation;
	protected ims.core.vo.AuthoringInformationVo snserviceauthoringinformation;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
