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
 * Linked to Scheduling.SessionParentChildSlot business object (ID: 1090100019).
 */
public class SessionParentChildSlotVo extends ims.scheduling.vo.SessionParentChildSlotRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SessionParentChildSlotVo()
	{
	}
	public SessionParentChildSlotVo(Integer id, int version)
	{
		super(id, version);
	}
	public SessionParentChildSlotVo(ims.scheduling.vo.beans.SessionParentChildSlotVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.starttime = bean.getStartTime() == null ? null : bean.getStartTime().buildTime();
		this.isactive = bean.getIsActive();
		this.profileslot = bean.getProfileSlot() == null ? null : new ims.scheduling.vo.ProfileParentChildSlotRefVo(new Integer(bean.getProfileSlot().getId()), bean.getProfileSlot().getVersion());
		this.sessdatetime = bean.getSessDateTime() == null ? null : bean.getSessDateTime().buildDateTime();
		this.status = bean.getStatus() == null ? null : ims.scheduling.vo.lookups.Status_Reason.buildLookup(bean.getStatus());
		this.appointment = bean.getAppointment() == null ? null : bean.getAppointment().buildVo();
		this.statusreason = bean.getStatusReason() == null ? null : ims.scheduling.vo.lookups.Status_Reason.buildLookup(bean.getStatusReason());
		if(bean.getStatusReasonHistory() != null)
		{
			this.statusreasonhistory = new ims.scheduling.vo.SessionSlotStatusRefVoCollection();
			for(int statusreasonhistory_i = 0; statusreasonhistory_i < bean.getStatusReasonHistory().length; statusreasonhistory_i++)
			{
				this.statusreasonhistory.add(new ims.scheduling.vo.SessionSlotStatusRefVo(new Integer(bean.getStatusReasonHistory()[statusreasonhistory_i].getId()), bean.getStatusReasonHistory()[statusreasonhistory_i].getVersion()));
			}
		}
		this.session = bean.getSession() == null ? null : new ims.scheduling.vo.Sch_SessionRefVo(new Integer(bean.getSession().getId()), bean.getSession().getVersion());
		this.parentslot = bean.getParentSlot() == null ? null : new ims.scheduling.vo.SessionParentChildSlotRefVo(new Integer(bean.getParentSlot().getId()), bean.getParentSlot().getVersion());
		this.duration = bean.getDuration();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.SessionParentChildSlotVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.starttime = bean.getStartTime() == null ? null : bean.getStartTime().buildTime();
		this.isactive = bean.getIsActive();
		this.profileslot = bean.getProfileSlot() == null ? null : new ims.scheduling.vo.ProfileParentChildSlotRefVo(new Integer(bean.getProfileSlot().getId()), bean.getProfileSlot().getVersion());
		this.sessdatetime = bean.getSessDateTime() == null ? null : bean.getSessDateTime().buildDateTime();
		this.status = bean.getStatus() == null ? null : ims.scheduling.vo.lookups.Status_Reason.buildLookup(bean.getStatus());
		this.appointment = bean.getAppointment() == null ? null : bean.getAppointment().buildVo(map);
		this.statusreason = bean.getStatusReason() == null ? null : ims.scheduling.vo.lookups.Status_Reason.buildLookup(bean.getStatusReason());
		if(bean.getStatusReasonHistory() != null)
		{
			this.statusreasonhistory = new ims.scheduling.vo.SessionSlotStatusRefVoCollection();
			for(int statusreasonhistory_i = 0; statusreasonhistory_i < bean.getStatusReasonHistory().length; statusreasonhistory_i++)
			{
				this.statusreasonhistory.add(new ims.scheduling.vo.SessionSlotStatusRefVo(new Integer(bean.getStatusReasonHistory()[statusreasonhistory_i].getId()), bean.getStatusReasonHistory()[statusreasonhistory_i].getVersion()));
			}
		}
		this.session = bean.getSession() == null ? null : new ims.scheduling.vo.Sch_SessionRefVo(new Integer(bean.getSession().getId()), bean.getSession().getVersion());
		this.parentslot = bean.getParentSlot() == null ? null : new ims.scheduling.vo.SessionParentChildSlotRefVo(new Integer(bean.getParentSlot().getId()), bean.getParentSlot().getVersion());
		this.duration = bean.getDuration();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.SessionParentChildSlotVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.SessionParentChildSlotVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.SessionParentChildSlotVoBean();
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
		if(fieldName.equals("STARTTIME"))
			return getStartTime();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("PROFILESLOT"))
			return getProfileSlot();
		if(fieldName.equals("SESSDATETIME"))
			return getSessDateTime();
		if(fieldName.equals("STATUS"))
			return getStatus();
		if(fieldName.equals("APPOINTMENT"))
			return getAppointment();
		if(fieldName.equals("STATUSREASON"))
			return getStatusReason();
		if(fieldName.equals("STATUSREASONHISTORY"))
			return getStatusReasonHistory();
		if(fieldName.equals("SESSION"))
			return getSession();
		if(fieldName.equals("PARENTSLOT"))
			return getParentSlot();
		if(fieldName.equals("DURATION"))
			return getDuration();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getStartTimeIsNotNull()
	{
		return this.starttime != null;
	}
	public ims.framework.utils.Time getStartTime()
	{
		return this.starttime;
	}
	public void setStartTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.starttime = value;
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
	public boolean getProfileSlotIsNotNull()
	{
		return this.profileslot != null;
	}
	public ims.scheduling.vo.ProfileParentChildSlotRefVo getProfileSlot()
	{
		return this.profileslot;
	}
	public void setProfileSlot(ims.scheduling.vo.ProfileParentChildSlotRefVo value)
	{
		this.isValidated = false;
		this.profileslot = value;
	}
	public boolean getSessDateTimeIsNotNull()
	{
		return this.sessdatetime != null;
	}
	public ims.framework.utils.DateTime getSessDateTime()
	{
		return this.sessdatetime;
	}
	public void setSessDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.sessdatetime = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.scheduling.vo.lookups.Status_Reason getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.scheduling.vo.lookups.Status_Reason value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getAppointmentIsNotNull()
	{
		return this.appointment != null;
	}
	public ims.scheduling.vo.BookingAppointmentTheatreLiteVo getAppointment()
	{
		return this.appointment;
	}
	public void setAppointment(ims.scheduling.vo.BookingAppointmentTheatreLiteVo value)
	{
		this.isValidated = false;
		this.appointment = value;
	}
	public boolean getStatusReasonIsNotNull()
	{
		return this.statusreason != null;
	}
	public ims.scheduling.vo.lookups.Status_Reason getStatusReason()
	{
		return this.statusreason;
	}
	public void setStatusReason(ims.scheduling.vo.lookups.Status_Reason value)
	{
		this.isValidated = false;
		this.statusreason = value;
	}
	public boolean getStatusReasonHistoryIsNotNull()
	{
		return this.statusreasonhistory != null;
	}
	public ims.scheduling.vo.SessionSlotStatusRefVoCollection getStatusReasonHistory()
	{
		return this.statusreasonhistory;
	}
	public void setStatusReasonHistory(ims.scheduling.vo.SessionSlotStatusRefVoCollection value)
	{
		this.isValidated = false;
		this.statusreasonhistory = value;
	}
	public boolean getSessionIsNotNull()
	{
		return this.session != null;
	}
	public ims.scheduling.vo.Sch_SessionRefVo getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.Sch_SessionRefVo value)
	{
		this.isValidated = false;
		this.session = value;
	}
	public boolean getParentSlotIsNotNull()
	{
		return this.parentslot != null;
	}
	public ims.scheduling.vo.SessionParentChildSlotRefVo getParentSlot()
	{
		return this.parentslot;
	}
	public void setParentSlot(ims.scheduling.vo.SessionParentChildSlotRefVo value)
	{
		this.isValidated = false;
		this.parentslot = value;
	}
	public boolean getDurationIsNotNull()
	{
		return this.duration != null;
	}
	public Integer getDuration()
	{
		return this.duration;
	}
	public void setDuration(Integer value)
	{
		this.isValidated = false;
		this.duration = value;
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
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
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
	
		SessionParentChildSlotVo clone = new SessionParentChildSlotVo(this.id, this.version);
		
		if(this.starttime == null)
			clone.starttime = null;
		else
			clone.starttime = (ims.framework.utils.Time)this.starttime.clone();
		clone.isactive = this.isactive;
		clone.profileslot = this.profileslot;
		if(this.sessdatetime == null)
			clone.sessdatetime = null;
		else
			clone.sessdatetime = (ims.framework.utils.DateTime)this.sessdatetime.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.scheduling.vo.lookups.Status_Reason)this.status.clone();
		if(this.appointment == null)
			clone.appointment = null;
		else
			clone.appointment = (ims.scheduling.vo.BookingAppointmentTheatreLiteVo)this.appointment.clone();
		if(this.statusreason == null)
			clone.statusreason = null;
		else
			clone.statusreason = (ims.scheduling.vo.lookups.Status_Reason)this.statusreason.clone();
		clone.statusreasonhistory = this.statusreasonhistory;
		clone.session = this.session;
		clone.parentslot = this.parentslot;
		clone.duration = this.duration;
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
		if (!(SessionParentChildSlotVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SessionParentChildSlotVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SessionParentChildSlotVo compareObj = (SessionParentChildSlotVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getStartTime() == null && compareObj.getStartTime() != null)
				return -1;
			if(this.getStartTime() != null && compareObj.getStartTime() == null)
				return 1;
			if(this.getStartTime() != null && compareObj.getStartTime() != null)
				retVal = this.getStartTime().compareTo(compareObj.getStartTime());
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
		if(this.starttime != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.profileslot != null)
			count++;
		if(this.sessdatetime != null)
			count++;
		if(this.status != null)
			count++;
		if(this.appointment != null)
			count++;
		if(this.statusreason != null)
			count++;
		if(this.statusreasonhistory != null)
			count++;
		if(this.session != null)
			count++;
		if(this.parentslot != null)
			count++;
		if(this.duration != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 11;
	}
	protected ims.framework.utils.Time starttime;
	protected Boolean isactive;
	protected ims.scheduling.vo.ProfileParentChildSlotRefVo profileslot;
	protected ims.framework.utils.DateTime sessdatetime;
	protected ims.scheduling.vo.lookups.Status_Reason status;
	protected ims.scheduling.vo.BookingAppointmentTheatreLiteVo appointment;
	protected ims.scheduling.vo.lookups.Status_Reason statusreason;
	protected ims.scheduling.vo.SessionSlotStatusRefVoCollection statusreasonhistory;
	protected ims.scheduling.vo.Sch_SessionRefVo session;
	protected ims.scheduling.vo.SessionParentChildSlotRefVo parentslot;
	protected Integer duration;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
