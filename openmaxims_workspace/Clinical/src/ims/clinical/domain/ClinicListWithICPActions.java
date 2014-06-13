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

package ims.clinical.domain;

// Generated from form domain impl
public interface ClinicListWithICPActions extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Get PatientShort
	*/
	public ims.core.vo.PatientShort getPatientShort(ims.core.patient.vo.PatientRefVo voPatientRef);

	// Generated from form domain interface definition
	public ims.icp.vo.OutpatientEpisodeWithICPInfoVoCollection listOPEpisodes(ims.core.vo.IPandOPSearchCriteriaVo searchCriteria);

	// Generated from form domain interface definition
	public ims.core.vo.LocationLiteVoCollection getActiveHospitals(ims.core.resource.people.vo.MemberOfStaffRefVo mos);

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionShortVoCollection listClinics(Integer hospital, ims.framework.utils.Date date);

	// Generated from form domain interface definition
	public ims.core.vo.LocMostVo getLocation(ims.core.resource.place.vo.LocationRefVo voLocRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo saveOPEpisode(ims.scheduling.vo.Booking_AppointmentVo voOP, ims.careuk.vo.CatsReferralListVo voCatsReferral, ims.scheduling.vo.SessionSlotVo dnaSessionSlot, ims.careuk.vo.PatientElectiveListForDNAAppointmentsVo electiveList, Boolean isFirstAppointmentActivity) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo getOpEpisode(ims.scheduling.vo.Booking_AppointmentRefVo voBookingRef);

	// Generated from form domain interface definition
	public Boolean isNotACurrentInpatient(ims.core.patient.vo.PatientRefVo voPatRef);

	// Generated from form domain interface definition
	public ims.careuk.vo.CatsReferralRefVo getCatsReferralRef(Integer bookApptID);

	// Generated from form domain interface definition
	public ims.careuk.vo.CatsReferralListVo getCatsReferral(ims.scheduling.vo.Booking_AppointmentRefVo voBookRefVo);

	// Generated from form domain interface definition
	public ims.core.vo.CareContextShortVo getCareContext(ims.core.admin.vo.CareContextRefVo careContextRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo getBookingAppt(ims.scheduling.vo.Booking_AppointmentRefVo bookingApptRefVo);

	// Generated from form domain interface definition
	public Boolean isInpatientCareContext(ims.core.patient.vo.PatientRefVo patientRef, ims.core.admin.vo.CareContextRefVo careContextRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo saveBookingAppointment(ims.scheduling.vo.Booking_AppointmentVo appointment) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.admin.vo.AppointmentTrackingstatusColourConfigVo getTrackingColorConfig(ims.vo.LookupInstVo trackingStatus);

	// Generated from form domain interface definition
	public ims.careuk.vo.PatientElectiveListForDNAAppointmentsVo getPatientElectiveList(ims.scheduling.vo.Booking_AppointmentRefVo appointment);

	// Generated from form domain interface definition
	public Boolean hasTCI(ims.scheduling.vo.Booking_AppointmentRefVo appointment);
}