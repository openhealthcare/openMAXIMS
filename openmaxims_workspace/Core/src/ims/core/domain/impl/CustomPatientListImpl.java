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
// This code was generated by Calin Perebiceanu using IMS Development Environment (version 1.71 build 3832.22959)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.core.clinical.domain.objects.PatientCustomList;
import ims.core.configuration.domain.objects.CustomList;
import ims.core.configuration.vo.CustomListRefVo;
import ims.core.domain.AddToCustomListDialog;
import ims.core.domain.base.impl.BaseCustomPatientListImpl;
import ims.core.vo.PatientCustomListVo;
import ims.core.vo.PatientCustomListVoCollection;
import ims.core.vo.domain.CustomListVoAssembler;
import ims.core.vo.domain.PatientCustomListVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;

import java.util.ArrayList;

public class CustomPatientListImpl extends BaseCustomPatientListImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* list custom lists
	*/
	public ims.core.vo.CustomListVoCollection listCustomLists(ims.core.resource.people.vo.MemberOfStaffRefVo voMOSRefVo)
	{
		DomainFactory factory = getDomainFactory();
		
		String hql = " from CustomList cl "; 
		StringBuffer condStr = new StringBuffer();
		String andStr = " ";
	
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
	
		if (voMOSRefVo != null)
		{
			condStr.append(" where cl.listOwner.id = :idMOS");
			markers.add("idMOS");
			values.add(voMOSRefVo.getID_MemberOfStaff());

			condStr.append(" and cl.isActive = :isActive");
		}
		else
			condStr.append(" where cl.isActive = :isActive");
		
		markers.add("isActive");
		values.add(Boolean.TRUE);	
		
		if (andStr.equals(" and "))
			hql += " where ";

		hql += condStr.toString();
		return CustomListVoAssembler.createCustomListVoCollectionFromCustomList(factory.find(hql, markers, values)).sort();
	}

	/**
	* save a service and associated functions/activities
	*/
	public ims.core.vo.CustomListVo saveCustomList(ims.core.vo.CustomListVo voCustomList) throws ims.domain.exceptions.StaleObjectException
	{
		if (!voCustomList.isValidated())
		{
			throw new DomainRuntimeException("This voCustomList has not been validated");
		}
		
		DomainFactory factory = getDomainFactory();			
		CustomList domCL = CustomListVoAssembler.extractCustomList(factory, voCustomList);
		factory.save(domCL);
		return CustomListVoAssembler.create(domCL);
	}

	public PatientCustomListVo savePatientCustomList(PatientCustomListVo voCustomList) throws StaleObjectException 
	{
		AddToCustomListDialog implCL = (AddToCustomListDialog)getDomainImpl(AddToCustomListDialogImpl.class);
		return implCL.savePatientCustomList(voCustomList);
	}

	public void deleteCustomList(PatientCustomListVo voPatCustListVo) throws StaleObjectException, ForeignKeyViolationException
	{
		if (voPatCustListVo == null)
		{
			throw new DomainRuntimeException("voPatCustListRefVo is null");
		}
		
		PatientCustomList obj = PatientCustomListVoAssembler.extractPatientCustomList(getDomainFactory(),voPatCustListVo);
		DomainFactory factory = getDomainFactory();
		factory.delete(obj);
	}

	public PatientCustomListVo getPatientCustomList(CustomListRefVo voCustListRefVo) 
	{
		DomainFactory factory = getDomainFactory();
		
		String hql = " from PatientCustomList pcl "; 
		StringBuffer condStr = new StringBuffer();
		String andStr = " ";
	
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
	
		condStr.append(" where pcl.customList.id = :cl");
		markers.add("cl");
		values.add(voCustListRefVo.getID_CustomList());	
		
		if (andStr.equals(" and "))
			hql += " where ";

		hql += condStr.toString();
		PatientCustomListVoCollection voColl = PatientCustomListVoAssembler.createPatientCustomListVoCollectionFromPatientCustomList(factory.find(hql, markers, values));
		if (voColl.size() > 0)
			return voColl.get(0);
			
		return null;
	}
}
