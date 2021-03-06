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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.clinical.domain.impl;

import ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig;
import ims.clinical.configuration.vo.HospitalAtNightCutOverPointsConfigRefVo;
import ims.clinical.domain.base.impl.BaseHospitalAtNightPatientDetailImpl;
import ims.clinical.domain.objects.HospitalAtNightListandDates;
import ims.clinical.domain.objects.HospitalAtNightPatientDetail;
import ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo;
import ims.clinical.vo.HospitalAtNightListandDatesVo;
import ims.clinical.vo.HospitalAtNightListandDatesVoCollection;
import ims.clinical.vo.HospitalAtNightPatientDetailRefVo;
import ims.clinical.vo.HospitalAtNightPatientDetailVo;
import ims.clinical.vo.HospitalAtNightPatientDetailVoCollection;
import ims.clinical.vo.InpatientEpisodeForHospitalAtNightVo;
import ims.clinical.vo.InpatientEpisodeWithCareContextVo;
import ims.clinical.vo.domain.HospitalAtNightCutOverPointsConfigVoAssembler;
import ims.clinical.vo.domain.HospitalAtNightListandDatesVoAssembler;
import ims.clinical.vo.domain.HospitalAtNightPatientDetailVoAssembler;
import ims.clinical.vo.domain.InpatientEpisodeForHospitalAtNightVoAssembler;
import ims.clinical.vo.lookups.HospitalAtNightPatientStatus;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.pas.domain.objects.InpatientEpisode;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.lookups.LocationType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.ILocation;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;

import java.util.List;

public class HospitalAtNightPatientDetailImpl extends BaseHospitalAtNightPatientDetailImpl
{
	private static final long serialVersionUID = 1L;

	public InpatientEpisodeWithCareContextVo getInpatientCareContext(ims.core.patient.vo.PatientRefVo patient)
	{
		if(patient == null)
			throw new CodingRuntimeException("Invalid patient Id.");
		
		DomainFactory factory = getDomainFactory();
		
		String query = "select ie from InpatientEpisode as ie left join ie.pasEvent as pe left join pe.patient as p where p.id = :PatId";
		
		List<?> listInpatientCareContext = factory.find(query, new String[] {"PatId"}, new Object[] {patient.getID_Patient()});
		
		InpatientEpisode inpatient = null;
		
		if(listInpatientCareContext != null && listInpatientCareContext.size() > 0)
		{
			inpatient = (InpatientEpisode)listInpatientCareContext.get(0);	
		}
			
		if(inpatient == null)
			return null;
		
		InpatientEpisodeForHospitalAtNightVo inpatientvo = InpatientEpisodeForHospitalAtNightVoAssembler.create(inpatient);
		
		List<?> careContext = factory.find("from CareContext as cc where cc.pasEvent.id = :PasEventId order by cc.systemInformation.creationDateTime desc ", new String[] {"PasEventId"}, new Object[] {inpatientvo.getPasEvent().getID_PASEvent()});
		
		if(careContext == null || careContext.size() == 0)
			return null;
		
		CareContextRefVo careContextRef = new CareContextRefVo(((CareContext) careContext.get(0)).getId(), ((CareContext) careContext.get(0)).getVersion());
		
		InpatientEpisodeWithCareContextVo inpatientWithCareContext = new InpatientEpisodeWithCareContextVo();
		inpatientWithCareContext.setInpatientEpisode(inpatientvo);
		inpatientWithCareContext.setCareContext(careContextRef);
		
		return inpatientWithCareContext;
	}

	public HospitalAtNightCutOverPointsConfigVo getCurrentHospitalAtNightConfig(ILocation currentLocation) 
	{
		if(currentLocation == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		
		Location currentHospital = getHospital((Location) factory.getDomainObject(Location.class, currentLocation.getID()));
		
		if(currentHospital == null)
			return null;
		
		List<?> config = factory.find("from HospitalAtNightCutOverPointsConfig as h where h.hospital.id = :HospitalId", new String[] {"HospitalId"}, new Object[] {currentHospital.getId()});
		
		if(config == null || config.size() == 0)
			return null;
		
		return HospitalAtNightCutOverPointsConfigVoAssembler.create((HospitalAtNightCutOverPointsConfig) config.get(0));
	}
	
	private Location getHospital(Location doLocation)
	{
		if(doLocation == null)
			return null;
		
		if(doLocation instanceof Location && doLocation.getType().equals(getDomLookup(LocationType.HOSP)))
			return doLocation;
	
		while(doLocation.getParentLocation() != null) 
		{
			doLocation = doLocation.getParentLocation();
			if(doLocation instanceof Location && doLocation.getType().equals(getDomLookup(LocationType.HOSP)))
				return doLocation;
		}
		
		return null;
	}

	public HospitalAtNightPatientDetailVo savePatientHospitalAtNight(HospitalAtNightPatientDetailVo patientDetails)	throws StaleObjectException, DomainInterfaceException 
	{
		if(patientDetails == null)
			throw new CodingRuntimeException("Cannot save a null HospitalAtNightPatientDetailsVo.");
		
		if(!patientDetails.isValidated())
			throw new CodingRuntimeException("HospitalAtNightPatientDetailsVo is not validated.");
		
		DomainFactory factory = getDomainFactory();
		boolean isNewRecord = (patientDetails.getID_HospitalAtNightPatientDetail() == null);
		HospitalAtNightListandDatesVo currentList = null;
		
		if(isNewRecord)
		{
			HospitalAtNightCutOverPointsConfigVo hospitalConfig = getCurrentHospitalAtNightConfig(getCurrentLocation());
		
			if(hospitalConfig == null)
				throw new DomainInterfaceException("Selected Hospital doesn't have a Hospital At Night Config.");
		
			Time startTime = hospitalConfig.getStartTime();
			Time endTime = hospitalConfig.getEndTime();
			Time currentTime = new Time();
			currentTime.setSecond(0);
			
			DateTime startDateTime = null;
			DateTime endDateTime = null;
			if(startTime.isGreaterOrEqualThan(endTime))
			{
				if(currentTime.isLessOrEqualThan(endTime))
				{
					startDateTime = new DateTime(new Date().addDay(-1), startTime);
					endDateTime = new DateTime(new Date(), endTime);
				}
				else
				{
					startDateTime = new DateTime(new Date(), startTime);
					endDateTime = new DateTime(new Date().addDay(1), endTime);
				}
			}
			else if(startTime.isLessThan(endTime))
			{
				if(currentTime.isLessOrEqualThan(endTime))
				{
					startDateTime = new DateTime(new Date(), startTime);
					endDateTime = new DateTime(new Date(), endTime);
				}
				else
				{
					startDateTime = new DateTime(new Date().addDay(1), startTime);
					endDateTime = new DateTime(new Date().addDay(1), endTime);
				}
			}
			
			currentList = getCurrentHospitalNightList(hospitalConfig, startDateTime, endDateTime);
			
			if(currentList == null)
			{
				currentList = new HospitalAtNightListandDatesVo();
				
				currentList.setCutOverPoints(hospitalConfig);
				currentList.setShiftStartDate(startDateTime);
				currentList.setShiftEndDate(endDateTime);
				currentList.setHospital(hospitalConfig.getHospital());
				
				HospitalAtNightListandDates doCurrentList = HospitalAtNightListandDatesVoAssembler.extractHospitalAtNightListandDates(factory, currentList);
				factory.save(doCurrentList);
				factory.refresh(doCurrentList);
				
				currentList = HospitalAtNightListandDatesVoAssembler.create(doCurrentList);
			}
			
			patientDetails.setHospitalAtNightListAndDates(currentList);
		}
		
		HospitalAtNightPatientDetail doPatientDetails = HospitalAtNightPatientDetailVoAssembler.extractHospitalAtNightPatientDetail(factory, patientDetails);
		factory.save(doPatientDetails);
		factory.refresh(doPatientDetails);
		patientDetails =  HospitalAtNightPatientDetailVoAssembler.create(doPatientDetails);
		
		if(isNewRecord && currentList != null)
		{
			HospitalAtNightPatientDetailVoCollection coll = currentList.getPatientDetails();
			if(coll == null)
				coll = new HospitalAtNightPatientDetailVoCollection();
		
			coll.add(patientDetails);
		
			currentList.setPatientDetails(coll);
			currentList.validate();
		
			HospitalAtNightListandDates doCurrentList = HospitalAtNightListandDatesVoAssembler.extractHospitalAtNightListandDates(factory, currentList);
			factory.save(doCurrentList);
		}
		
		return patientDetails;
	}

	private HospitalAtNightListandDatesVo getCurrentHospitalNightList(HospitalAtNightCutOverPointsConfigRefVo hospitalConfig, DateTime startDateTime, DateTime endDateTime) 
	{
		DomainFactory factory = getDomainFactory();
		
		String query = "select h from HospitalAtNightListandDates as h where h.cutOverPoints.id = :HospitalConfig and h.shiftStartDate = :StartDate and h.shiftEndDate = :EndDate";
		List<?> list = factory.find(query, new String[] {"HospitalConfig", "StartDate", "EndDate"}, new Object[] {hospitalConfig.getID_HospitalAtNightCutOverPointsConfig(), startDateTime.getJavaDate(), endDateTime.getJavaDate()});
		
		HospitalAtNightListandDatesVoCollection currentList = HospitalAtNightListandDatesVoAssembler.createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(list);
		
		if(currentList == null || currentList.size() == 0)
			return null;
		
		return currentList.get(0);
	}

	public HospitalAtNightPatientDetailVo getHospitalAtNightPatientDetails(HospitalAtNightPatientDetailRefVo hospitalPatientDetails) 
	{
		if(hospitalPatientDetails == null || hospitalPatientDetails.getID_HospitalAtNightPatientDetail() == null)
			throw new CodingRuntimeException("Cannot get HospitalAtNightPatientDetailVo on null Id.");
		
		return HospitalAtNightPatientDetailVoAssembler.create((HospitalAtNightPatientDetail) getDomainFactory().getDomainObject(HospitalAtNightPatientDetail.class, hospitalPatientDetails.getID_HospitalAtNightPatientDetail()));
	}

	public Boolean isPatientAlreadyAddedToHospAtNightList(PatientRefVo patient, HospitalAtNightCutOverPointsConfigVo hospitalAtNightConfig)//	WDEV-13968
	{
		if(patient == null)
			throw new CodingRuntimeException("Cannot check if patent is already added in Hospital At Night lists on a null Patient Id.");
		
		if(hospitalAtNightConfig == null)//	WDEV-13968
			throw new CodingRuntimeException("Cannot check if patent is already added in Hospital At Night lists on a null HospitalAtNightConfig Id.");
			
		DomainFactory factory = getDomainFactory();
		
		//	WDEV-13968 - starts here
		Time startTime = hospitalAtNightConfig.getStartTime();
		Time endTime = hospitalAtNightConfig.getEndTime();
		Time currentTime = new Time();
		currentTime.setSecond(0);
		
		DateTime startDateTime = null;
		DateTime endDateTime = null;
		if(startTime.isGreaterOrEqualThan(endTime))
		{
			if(currentTime.isLessOrEqualThan(endTime))
			{
				startDateTime = new DateTime(new Date().addDay(-1), startTime);
				endDateTime = new DateTime(new Date(), endTime);
			}
			else
			{
				startDateTime = new DateTime(new Date(), startTime);
				endDateTime = new DateTime(new Date().addDay(1), endTime);
			}
		}
		else if(startTime.isLessThan(endTime))
		{
			if(currentTime.isLessOrEqualThan(endTime))
			{
				startDateTime = new DateTime(new Date(), startTime);
				endDateTime = new DateTime(new Date(), endTime);
			}
			else
			{
				startDateTime = new DateTime(new Date().addDay(1), startTime);
				endDateTime = new DateTime(new Date().addDay(1), endTime);
			}
		}
		
		String query = "select p from HospitalAtNightListandDates as h left join h.patientDetails as pd left join pd.currentStatus as cs left join pd.patient as p where h.cutOverPoints.id = :HospConfig and h.shiftStartDate = :ShiftStartDate and h.shiftEndDate = :ShiftEndDate and p.id = :PatId and (cs.status.id = :New or cs.status.id = :Active)";
		List<?> list = factory.find(query, new String[] {"HospConfig", "ShiftStartDate", "ShiftEndDate", "PatId", "New", "Active"}, new Object[] {hospitalAtNightConfig.getID_HospitalAtNightCutOverPointsConfig(), startDateTime.getJavaDate(), endDateTime.getJavaDate(), patient.getID_Patient(), HospitalAtNightPatientStatus.NEW.getID(), HospitalAtNightPatientStatus.ACTIVE.getID()});
		//	WDEV-13968 - ends here
		
		if(list != null && list.size() > 0)
			return true;
		
		return false;
	}
}
