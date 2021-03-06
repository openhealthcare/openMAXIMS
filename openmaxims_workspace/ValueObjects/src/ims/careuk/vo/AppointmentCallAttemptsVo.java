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

package ims.careuk.vo;

/**
 * Linked to CAREUK.AppointmentCallAttempts business object (ID: 1096100010).
 */
public class AppointmentCallAttemptsVo extends ims.careuk.vo.AppointmentCallAttemptsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AppointmentCallAttemptsVo()
	{
	}
	public AppointmentCallAttemptsVo(Integer id, int version)
	{
		super(id, version);
	}
	public AppointmentCallAttemptsVo(ims.careuk.vo.beans.AppointmentCallAttemptsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.calldatetime = bean.getCallDateTime() == null ? null : bean.getCallDateTime().buildDateTime();
		this.caller = bean.getCaller() == null ? null : bean.getCaller().buildVo();
		this.appointmentservice = bean.getAppointmentService() == null ? null : bean.getAppointmentService().buildVo();
		this.reason = bean.getReason() == null ? null : ims.careuk.vo.lookups.CallPurpose.buildLookup(bean.getReason());
		this.callercomments = bean.getCallerComments();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.careuk.vo.beans.AppointmentCallAttemptsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.calldatetime = bean.getCallDateTime() == null ? null : bean.getCallDateTime().buildDateTime();
		this.caller = bean.getCaller() == null ? null : bean.getCaller().buildVo(map);
		this.appointmentservice = bean.getAppointmentService() == null ? null : bean.getAppointmentService().buildVo(map);
		this.reason = bean.getReason() == null ? null : ims.careuk.vo.lookups.CallPurpose.buildLookup(bean.getReason());
		this.callercomments = bean.getCallerComments();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.careuk.vo.beans.AppointmentCallAttemptsVoBean bean = null;
		if(map != null)
			bean = (ims.careuk.vo.beans.AppointmentCallAttemptsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.careuk.vo.beans.AppointmentCallAttemptsVoBean();
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
		if(fieldName.equals("CALLDATETIME"))
			return getCallDateTime();
		if(fieldName.equals("CALLER"))
			return getCaller();
		if(fieldName.equals("APPOINTMENTSERVICE"))
			return getAppointmentService();
		if(fieldName.equals("REASON"))
			return getReason();
		if(fieldName.equals("CALLERCOMMENTS"))
			return getCallerComments();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCallDateTimeIsNotNull()
	{
		return this.calldatetime != null;
	}
	public ims.framework.utils.DateTime getCallDateTime()
	{
		return this.calldatetime;
	}
	public void setCallDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.calldatetime = value;
	}
	public boolean getCallerIsNotNull()
	{
		return this.caller != null;
	}
	public ims.core.vo.MemberOfStaffLiteVo getCaller()
	{
		return this.caller;
	}
	public void setCaller(ims.core.vo.MemberOfStaffLiteVo value)
	{
		this.isValidated = false;
		this.caller = value;
	}
	public boolean getAppointmentServiceIsNotNull()
	{
		return this.appointmentservice != null;
	}
	public ims.core.vo.ServiceLiteVo getAppointmentService()
	{
		return this.appointmentservice;
	}
	public void setAppointmentService(ims.core.vo.ServiceLiteVo value)
	{
		this.isValidated = false;
		this.appointmentservice = value;
	}
	public boolean getReasonIsNotNull()
	{
		return this.reason != null;
	}
	public ims.careuk.vo.lookups.CallPurpose getReason()
	{
		return this.reason;
	}
	public void setReason(ims.careuk.vo.lookups.CallPurpose value)
	{
		this.isValidated = false;
		this.reason = value;
	}
	public boolean getCallerCommentsIsNotNull()
	{
		return this.callercomments != null;
	}
	public String getCallerComments()
	{
		return this.callercomments;
	}
	public static int getCallerCommentsMaxLength()
	{
		return 255;
	}
	public void setCallerComments(String value)
	{
		this.isValidated = false;
		this.callercomments = value;
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
		if(this.calldatetime == null)
			listOfErrors.add("CallDateTime is mandatory");
		if(this.caller == null)
			listOfErrors.add("Caller is mandatory");
		if(this.appointmentservice == null)
			listOfErrors.add("AppointmentService is mandatory");
		if(this.reason == null)
			listOfErrors.add("Reason is mandatory");
		if(this.callercomments != null)
			if(this.callercomments.length() > 255)
				listOfErrors.add("The length of the field [callercomments] in the value object [ims.careuk.vo.AppointmentCallAttemptsVo] is too big. It should be less or equal to 255");
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
	
		AppointmentCallAttemptsVo clone = new AppointmentCallAttemptsVo(this.id, this.version);
		
		if(this.calldatetime == null)
			clone.calldatetime = null;
		else
			clone.calldatetime = (ims.framework.utils.DateTime)this.calldatetime.clone();
		if(this.caller == null)
			clone.caller = null;
		else
			clone.caller = (ims.core.vo.MemberOfStaffLiteVo)this.caller.clone();
		if(this.appointmentservice == null)
			clone.appointmentservice = null;
		else
			clone.appointmentservice = (ims.core.vo.ServiceLiteVo)this.appointmentservice.clone();
		if(this.reason == null)
			clone.reason = null;
		else
			clone.reason = (ims.careuk.vo.lookups.CallPurpose)this.reason.clone();
		clone.callercomments = this.callercomments;
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
		if (!(AppointmentCallAttemptsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AppointmentCallAttemptsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		AppointmentCallAttemptsVo compareObj = (AppointmentCallAttemptsVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getCallDateTime() == null && compareObj.getCallDateTime() != null)
				return -1;
			if(this.getCallDateTime() != null && compareObj.getCallDateTime() == null)
				return 1;
			if(this.getCallDateTime() != null && compareObj.getCallDateTime() != null)
				retVal = this.getCallDateTime().compareTo(compareObj.getCallDateTime());
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
		if(this.calldatetime != null)
			count++;
		if(this.caller != null)
			count++;
		if(this.appointmentservice != null)
			count++;
		if(this.reason != null)
			count++;
		if(this.callercomments != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.framework.utils.DateTime calldatetime;
	protected ims.core.vo.MemberOfStaffLiteVo caller;
	protected ims.core.vo.ServiceLiteVo appointmentservice;
	protected ims.careuk.vo.lookups.CallPurpose reason;
	protected String callercomments;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
