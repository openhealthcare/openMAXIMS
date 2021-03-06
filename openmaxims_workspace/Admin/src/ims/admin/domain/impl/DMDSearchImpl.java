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
// This code was generated by Marius Mihalec using IMS Development Environment (version 1.65 build 3225.30788)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import ims.admin.domain.base.impl.BaseDMDSearchImpl;
import ims.clinical.vo.AMPVoCollection;
import ims.clinical.vo.VMPVoCollection;
import ims.clinical.vo.VTMVoCollection;
import ims.clinical.vo.domain.AMPVoAssembler;
import ims.clinical.vo.domain.VMPVoAssembler;
import ims.clinical.vo.domain.VTMVoAssembler;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;

public class DMDSearchImpl extends BaseDMDSearchImpl
{
	private static final long serialVersionUID = 1L;

	/**
	* Search for VTM
	*/	
	public VTMVoCollection searchVTMByName(String name, Specialty specialty) throws ims.domain.exceptions.DomainInterfaceException
	{
		if(name == null || name.trim().length() == 0)
			return null;
		
		DomainFactory domainFactory = getDomainFactory();
		
		if(specialty == null)
			return VTMVoAssembler.createVTMVoCollectionFromVTM(domainFactory.find("from VTM vt WHERE vt.name like '" + name + "%'"));
		
		String hql = "select hli.vTM from VTMHotlist as hl join hl.hotListItem as hli left join hli.vTM as vtm where (vtm.name like '" + name + "%' and hl.specialty.id = " + specialty.getID() + ")";
		return VTMVoAssembler.createVTMVoCollectionFromVTM(domainFactory.find(hql));		
	}

	/**
	* Search for VMP
	*/
	public VMPVoCollection searchVMPByName(String name) throws ims.domain.exceptions.DomainInterfaceException
	{
		if(name == null || name.trim().length() == 0)
			return null;
		
		return VMPVoAssembler.createVMPVoCollectionFromVMP(getDomainFactory().find("from VMP vm WHERE vm.name like '" + name + "%'"));
	}

	/**
	* Search for AMP
	* 
	*/
	public AMPVoCollection searchAMPByName(String name) throws ims.domain.exceptions.DomainInterfaceException
	{
		if(name == null || name.trim().length() == 0)
			return null;
		
		return AMPVoAssembler.createAMPVoCollectionFromAMP(getDomainFactory().find("from AMP am WHERE am.name like '" + name + "%'"));
	}
}
