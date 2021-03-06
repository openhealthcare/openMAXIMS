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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.70 build 3341.28572)
// Copyright (C) 1995-2009 IMS MAXIMS plc. All rights reserved.

package ims.clinical.domain.impl;

import ims.admin.domain.EDischargeHINTConfig;
import ims.admin.domain.impl.EDischargeHINTConfigImpl;
import ims.clinical.domain.base.impl.BaseEDischargeMedicationComponentImpl;
import ims.clinical.vo.DischargeMedicationDetailsVo;
import ims.clinical.vo.DischargeMedicationDetailsVoCollection;
import ims.clinical.vo.domain.DischargeMedicationDetailsVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.edischarge.domain.objects.MedicationDetails;
import ims.framework.exceptions.CodingRuntimeException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EDischargeMedicationComponentImpl extends BaseEDischargeMedicationComponentImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.FieldHelpVo getHintByLookupID(ims.clinicaladmin.vo.lookups.EDischargeHINT voLookup)
	{
		EDischargeHINTConfig impl = (EDischargeHINTConfig)getDomainImpl(EDischargeHINTConfigImpl.class);
		return impl.getHintByLookupID(voLookup);
	}

	/**
	* saveFuturePlan
	*/
	public ims.clinical.vo.DischargeMedicationDetailsVo saveMedication(ims.clinical.vo.DischargeMedicationDetailsVo voMeds) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		if(voMeds == null)
			throw new CodingRuntimeException("DischargeMedicationDetailsVo is null");
		
		if(!voMeds.isValidated())
			throw new CodingRuntimeException("DischargeMedicationDetailsVo Value Object has not been validated");

		
		
		DomainFactory factory = getDomainFactory();
		MedicationDetails doMeds = DischargeMedicationDetailsVoAssembler.extractMedicationDetails(factory, voMeds);

		
		//WDEV-8813
		//Workaround for the case when 2 users save in the same time a new DischargeMedicationDetailsVo
		//In this case the domain.save call doesn't throw a StaleObjectExeption, even if it is the case
		
		if (!voMeds.getID_MedicationDetailsIsNotNull())
		{
			DischargeMedicationDetailsVo dmDetail = getMedication(voMeds.getCareContext());
			if (dmDetail != null)
				throw new StaleObjectException(doMeds,"A Discharge Medication Detail has been saved by another user");
			
		}
		factory.save(doMeds);
		return DischargeMedicationDetailsVoAssembler.create(doMeds);
	}

	public ims.clinical.vo.DischargeMedicationDetailsVo getMedication(ims.core.admin.vo.CareContextRefVo careContextRefvo)
	{
		if(careContextRefvo == null)
			throw new CodingRuntimeException("careContextRefVo Filter not provided for list call. ");

		if(careContextRefvo != null)
		{
			DomainFactory factory = getDomainFactory();
			StringBuffer hql = new StringBuffer(" from MedicationDetails md where "); 
			String andStr = " ";
		
			ArrayList<String> markers = new ArrayList<String>();
			ArrayList<Serializable> values = new ArrayList<Serializable>();
		
			hql.append(andStr + " md.careContext.id = :careContextId");
 			markers.add("careContextId");
			values.add(careContextRefvo.getID_CareContext());
			andStr = " and ";	

			List list = factory.find(hql.toString(), markers,values);
			if(list != null && list.size() > 0)
			{ 
				DischargeMedicationDetailsVoCollection voColl = DischargeMedicationDetailsVoAssembler.createDischargeMedicationDetailsVoCollectionFromMedicationDetails(list);
				if(voColl != null && voColl.size() > 0)
					return voColl.get(0);
			}
		}
		return null;
	}
}
