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
// This code was generated by Charlotte Murphy using IMS Development Environment (version 1.45 build 2257.28884)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.therapies.domain.impl;

import java.util.ArrayList;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.ClinicalContactRefVo;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.therapies.domain.base.impl.BaseSportsActivitiesImpl;
import ims.therapies.mobilitytransfers.domain.objects.WheelchairSkills;
import ims.therapies.treatment.domain.objects.SportsActivity;
import ims.therapies.treatment.domain.objects.SportsActivitySession;
import ims.therapies.treatment.vo.SportsActivityRefVo;
import ims.therapies.vo.SportsActivitySessionShortVoCollection;
import ims.therapies.vo.SportsActivitySessionVo;
import ims.therapies.vo.SportsActivitySessionVoCollection;
import ims.therapies.vo.SportsActivityVo;
import ims.therapies.vo.WheelchairSkillsVo;
import ims.therapies.vo.domain.SportsActivitySessionShortVoAssembler;
import ims.therapies.vo.domain.SportsActivitySessionVoAssembler;
import ims.therapies.vo.domain.SportsActivityVoAssembler;
import ims.therapies.vo.domain.WheelchairSkillsVoAssembler;

public class SportsActivitiesImpl extends BaseSportsActivitiesImpl
{
	private static final long serialVersionUID = 1L;

	/**
	* list Medics
	*/
	public ims.core.vo.HcpCollection listMedics(ims.core.vo.HcpFilter voHcpFilter)
	{
		HcpAdmin hcpAdmin = (HcpAdmin)getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listMedics(voHcpFilter);
	}

	/**
	* lists Sports Activity Session for ClinicalContact
	*/
	public SportsActivitySessionVo getSportsActivityByClinicalContact(ClinicalContactRefVo voClinicalContactRef)
	{
		if(voClinicalContactRef == null)
			throw new CodingRuntimeException("Sports Activity Filter not provided for get call. ");
		
		String hql = new String("from SportsActivitySession s where s.clinicalContact.id = :CLINICAL_CONTACT_ID order by s.authoringDateTime desc ");

		java.util.List list = getDomainFactory().find(hql, "CLINICAL_CONTACT_ID", voClinicalContactRef.getID_ClinicalContact());

		if (list.size() == 0)
			return null;
		
		SportsActivitySessionVoCollection vo = SportsActivitySessionVoAssembler.createSportsActivitySessionVoCollectionFromSportsActivitySession(list);
		
		if(vo!=null && vo.size()>0)
			return vo.get(0);
		
		return null;
	}

	/**
	* save Sports Activity Session for ClinicalContact
	*/
	public void saveSportsActivity(SportsActivitySessionVo voSportsActivitySession) throws StaleObjectException, UniqueKeyViolationException
	{
		if(!voSportsActivitySession.isValidated())
			throw new DomainRuntimeException("This Sports Activity has not been validated");
	
		if(voSportsActivitySession.getID_SportsActivitySession() == null)
		{
			if(voSportsActivitySession.getClinicalContactIsNotNull())
			{
				SportsActivitySessionVo voSportsActivitySessiontemp = getSportsActivityByClinicalContact(voSportsActivitySession.getClinicalContact());
				if( voSportsActivitySessiontemp != null)
					throw new UniqueKeyViolationException("The screen will be refreshed. ");
			}
		}
		
		DomainFactory factory = getDomainFactory();
		SportsActivitySession doSportsActivitySess = SportsActivitySessionVoAssembler.extractSportsActivitySession(factory, voSportsActivitySession);
		factory.save(doSportsActivitySess);		
	}

	public SportsActivitySessionShortVoCollection listSportsActivityByCareContext(CareContextRefVo voCareContextRef)
	{

		DomainFactory factory = getDomainFactory();

		String query = " from SportsActivitySession sas ";
		StringBuffer hql = new StringBuffer();
		String andStr = " ";
		
		ArrayList markers= new ArrayList();
		ArrayList values = new ArrayList();
		

		if(voCareContextRef != null)
		{
			hql.append(andStr + " sas.clinicalContact.careContext.id = :cc");
			markers.add("cc");
			values.add(voCareContextRef.getID_CareContext());
			andStr = " and ";
		}
		
		if (markers.size() > 0) query += " where ";
		query += hql.toString();	
		
		java.util.List sasList = factory.find(query,markers,values);
		SportsActivitySessionShortVoCollection voSportsActivitySessionColl = SportsActivitySessionShortVoAssembler.createSportsActivitySessionShortVoCollectionFromSportsActivitySession(sasList);
		
		//if(voSportsActivitySessionColl != null && voSportsActivitySessionColl.size()>0)
			return voSportsActivitySessionColl;
		//else
		//	return null;
	}

	//wdev-13637
	public SportsActivityVo saveSportActivities(SportsActivityVo recordRef) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException 
	{
		if (recordRef == null || recordRef.getID_SportsActivity() == null)
			throw new CodingRuntimeException("This SportsActivityVo is null");
		
		
		DomainFactory factory = getDomainFactory();	
		
				
		SportsActivity domSportsActivity = SportsActivityVoAssembler.extractSportsActivity(factory, recordRef);
		domSportsActivity.setIsRIE(recordRef.getIsRIE());
		factory.save(domSportsActivity);
		
		return SportsActivityVoAssembler.create(domSportsActivity);
		
	}

	
}
