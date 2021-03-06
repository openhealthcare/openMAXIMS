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
 * Linked to emergency.Tracking business object (ID: 1086100005).
 */
public class TrackingListForClinicianWorklistVo extends ims.emergency.vo.TrackingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TrackingListForClinicianWorklistVo()
	{
	}
	public TrackingListForClinicianWorklistVo(Integer id, int version)
	{
		super(id, version);
	}
	public TrackingListForClinicianWorklistVo(ims.emergency.vo.beans.TrackingListForClinicianWorklistVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.attendance = bean.getAttendance() == null ? null : bean.getAttendance().buildVo();
		this.triagedetails = bean.getTriageDetails() == null ? null : bean.getTriageDetails().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.TrackingListForClinicianWorklistVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.attendance = bean.getAttendance() == null ? null : bean.getAttendance().buildVo(map);
		this.triagedetails = bean.getTriageDetails() == null ? null : bean.getTriageDetails().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.TrackingListForClinicianWorklistVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.TrackingListForClinicianWorklistVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.TrackingListForClinicianWorklistVoBean();
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
		if(fieldName.equals("ATTENDANCE"))
			return getAttendance();
		if(fieldName.equals("TRIAGEDETAILS"))
			return getTriageDetails();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.emergency.vo.PatientForTriageVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.emergency.vo.PatientForTriageVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getAttendanceIsNotNull()
	{
		return this.attendance != null;
	}
	public ims.emergency.vo.EmergencyAttendanceListForClinicianWorklistVo getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.emergency.vo.EmergencyAttendanceListForClinicianWorklistVo value)
	{
		this.isValidated = false;
		this.attendance = value;
	}
	public boolean getTriageDetailsIsNotNull()
	{
		return this.triagedetails != null;
	}
	public ims.emergency.vo.TriageListForClinicianWorklistVo getTriageDetails()
	{
		return this.triagedetails;
	}
	public void setTriageDetails(ims.emergency.vo.TriageListForClinicianWorklistVo value)
	{
		this.isValidated = false;
		this.triagedetails = value;
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.attendance == null)
			listOfErrors.add("Attendance is mandatory");
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
	
		TrackingListForClinicianWorklistVo clone = new TrackingListForClinicianWorklistVo(this.id, this.version);
		
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.emergency.vo.PatientForTriageVo)this.patient.clone();
		if(this.attendance == null)
			clone.attendance = null;
		else
			clone.attendance = (ims.emergency.vo.EmergencyAttendanceListForClinicianWorklistVo)this.attendance.clone();
		if(this.triagedetails == null)
			clone.triagedetails = null;
		else
			clone.triagedetails = (ims.emergency.vo.TriageListForClinicianWorklistVo)this.triagedetails.clone();
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
		if (!(TrackingListForClinicianWorklistVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TrackingListForClinicianWorklistVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TrackingListForClinicianWorklistVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TrackingListForClinicianWorklistVo)obj).getBoId());
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
		if(this.attendance != null)
			count++;
		if(this.triagedetails != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.emergency.vo.PatientForTriageVo patient;
	protected ims.emergency.vo.EmergencyAttendanceListForClinicianWorklistVo attendance;
	protected ims.emergency.vo.TriageListForClinicianWorklistVo triagedetails;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
