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

package ims.emergency.vo.beans;

public class TrackingForClinicianWorklistAndTriageVoBean extends ims.vo.ValueObjectBean
{
	public TrackingForClinicianWorklistAndTriageVoBean()
	{
	}
	public TrackingForClinicianWorklistAndTriageVoBean(ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.emergency.vo.beans.PatientForTriageVoBean)vo.getPatient().getBean();
		this.attendance = vo.getAttendance() == null ? null : (ims.emergency.vo.beans.EmergencyAttendanceForTriageLiteVoBean)vo.getAttendance().getBean();
		this.episode = vo.getEpisode() == null ? null : (ims.emergency.vo.beans.EmergencyEpisodeForTriageLiteVoBean)vo.getEpisode().getBean();
		this.triagedetails = vo.getTriageDetails() == null ? null : (ims.emergency.vo.beans.TriageForClinicianWorklistVoBean)vo.getTriageDetails().getBean();
		this.currentarea = vo.getCurrentArea() == null ? null : (ims.emergency.vo.beans.TrackingAreaLiteVoBean)vo.getCurrentArea().getBean();
		this.isdischarged = vo.getIsDischarged();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.emergency.vo.beans.TrackingAttendanceStatusVoBean)vo.getCurrentStatus().getBean();
		this.seenby = vo.getSeenBy() == null ? null : (ims.emergency.vo.beans.SeenByHCPVoBean)vo.getSeenBy().getBean();
		this.associatedpendingemergencyadmission = vo.getAssociatedPendingEmergencyAdmission() == null ? null : (ims.emergency.vo.beans.PendingEmergencyAdmissionShortVoBean)vo.getAssociatedPendingEmergencyAdmission().getBean();
		this.bedavailability = vo.getBedAvailability() == null ? null : (ims.emergency.vo.beans.BedAvailabilityForTrackVoBean)vo.getBedAvailability().getBean();
		this.currentreferral = vo.getCurrentReferral() == null ? null : (ims.emergency.vo.beans.ReferralToSpecialtyTeamVoBean)vo.getCurrentReferral().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.emergency.vo.beans.PatientForTriageVoBean)vo.getPatient().getBean(map);
		this.attendance = vo.getAttendance() == null ? null : (ims.emergency.vo.beans.EmergencyAttendanceForTriageLiteVoBean)vo.getAttendance().getBean(map);
		this.episode = vo.getEpisode() == null ? null : (ims.emergency.vo.beans.EmergencyEpisodeForTriageLiteVoBean)vo.getEpisode().getBean(map);
		this.triagedetails = vo.getTriageDetails() == null ? null : (ims.emergency.vo.beans.TriageForClinicianWorklistVoBean)vo.getTriageDetails().getBean(map);
		this.currentarea = vo.getCurrentArea() == null ? null : (ims.emergency.vo.beans.TrackingAreaLiteVoBean)vo.getCurrentArea().getBean(map);
		this.isdischarged = vo.getIsDischarged();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.emergency.vo.beans.TrackingAttendanceStatusVoBean)vo.getCurrentStatus().getBean(map);
		this.seenby = vo.getSeenBy() == null ? null : (ims.emergency.vo.beans.SeenByHCPVoBean)vo.getSeenBy().getBean(map);
		this.associatedpendingemergencyadmission = vo.getAssociatedPendingEmergencyAdmission() == null ? null : (ims.emergency.vo.beans.PendingEmergencyAdmissionShortVoBean)vo.getAssociatedPendingEmergencyAdmission().getBean(map);
		this.bedavailability = vo.getBedAvailability() == null ? null : (ims.emergency.vo.beans.BedAvailabilityForTrackVoBean)vo.getBedAvailability().getBean(map);
		this.currentreferral = vo.getCurrentReferral() == null ? null : (ims.emergency.vo.beans.ReferralToSpecialtyTeamVoBean)vo.getCurrentReferral().getBean(map);
	}

	public ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.emergency.vo.beans.PatientForTriageVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.emergency.vo.beans.PatientForTriageVoBean value)
	{
		this.patient = value;
	}
	public ims.emergency.vo.beans.EmergencyAttendanceForTriageLiteVoBean getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.emergency.vo.beans.EmergencyAttendanceForTriageLiteVoBean value)
	{
		this.attendance = value;
	}
	public ims.emergency.vo.beans.EmergencyEpisodeForTriageLiteVoBean getEpisode()
	{
		return this.episode;
	}
	public void setEpisode(ims.emergency.vo.beans.EmergencyEpisodeForTriageLiteVoBean value)
	{
		this.episode = value;
	}
	public ims.emergency.vo.beans.TriageForClinicianWorklistVoBean getTriageDetails()
	{
		return this.triagedetails;
	}
	public void setTriageDetails(ims.emergency.vo.beans.TriageForClinicianWorklistVoBean value)
	{
		this.triagedetails = value;
	}
	public ims.emergency.vo.beans.TrackingAreaLiteVoBean getCurrentArea()
	{
		return this.currentarea;
	}
	public void setCurrentArea(ims.emergency.vo.beans.TrackingAreaLiteVoBean value)
	{
		this.currentarea = value;
	}
	public Boolean getIsDischarged()
	{
		return this.isdischarged;
	}
	public void setIsDischarged(Boolean value)
	{
		this.isdischarged = value;
	}
	public ims.emergency.vo.beans.TrackingAttendanceStatusVoBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.emergency.vo.beans.TrackingAttendanceStatusVoBean value)
	{
		this.currentstatus = value;
	}
	public ims.emergency.vo.beans.SeenByHCPVoBean getSeenBy()
	{
		return this.seenby;
	}
	public void setSeenBy(ims.emergency.vo.beans.SeenByHCPVoBean value)
	{
		this.seenby = value;
	}
	public ims.emergency.vo.beans.PendingEmergencyAdmissionShortVoBean getAssociatedPendingEmergencyAdmission()
	{
		return this.associatedpendingemergencyadmission;
	}
	public void setAssociatedPendingEmergencyAdmission(ims.emergency.vo.beans.PendingEmergencyAdmissionShortVoBean value)
	{
		this.associatedpendingemergencyadmission = value;
	}
	public ims.emergency.vo.beans.BedAvailabilityForTrackVoBean getBedAvailability()
	{
		return this.bedavailability;
	}
	public void setBedAvailability(ims.emergency.vo.beans.BedAvailabilityForTrackVoBean value)
	{
		this.bedavailability = value;
	}
	public ims.emergency.vo.beans.ReferralToSpecialtyTeamVoBean getCurrentReferral()
	{
		return this.currentreferral;
	}
	public void setCurrentReferral(ims.emergency.vo.beans.ReferralToSpecialtyTeamVoBean value)
	{
		this.currentreferral = value;
	}

	private Integer id;
	private int version;
	private ims.emergency.vo.beans.PatientForTriageVoBean patient;
	private ims.emergency.vo.beans.EmergencyAttendanceForTriageLiteVoBean attendance;
	private ims.emergency.vo.beans.EmergencyEpisodeForTriageLiteVoBean episode;
	private ims.emergency.vo.beans.TriageForClinicianWorklistVoBean triagedetails;
	private ims.emergency.vo.beans.TrackingAreaLiteVoBean currentarea;
	private Boolean isdischarged;
	private ims.emergency.vo.beans.TrackingAttendanceStatusVoBean currentstatus;
	private ims.emergency.vo.beans.SeenByHCPVoBean seenby;
	private ims.emergency.vo.beans.PendingEmergencyAdmissionShortVoBean associatedpendingemergencyadmission;
	private ims.emergency.vo.beans.BedAvailabilityForTrackVoBean bedavailability;
	private ims.emergency.vo.beans.ReferralToSpecialtyTeamVoBean currentreferral;
}
