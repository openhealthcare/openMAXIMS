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

package ims.clinical.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseEDischargeSummarySthkComponentImpl extends DomainImpl implements ims.clinical.domain.EDischargeSummarySthkComponent, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validategetSummaryByCareContext(ims.core.admin.vo.CareContextRefVo careContext)
	{
		if(careContext == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'careContext' of type 'ims.core.admin.vo.CareContextRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatesaveSummaryAndDischargeDetails(ims.clinical.vo.EDischargeSTHKSummaryVo summary, ims.clinical.vo.DischargeDetailsVo dischargeDetails)
	{
		if(summary == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'summary' of type 'ims.clinical.vo.EDischargeSTHKSummaryVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetResponsibleHCPFromCareContext(ims.core.admin.vo.CareContextRefVo careContext)
	{
		if(careContext == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'careContext' of type 'ims.core.admin.vo.CareContextRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetInpatientEpisodeByCareContext(ims.core.admin.vo.CareContextRefVo careContext)
	{
		if(careContext == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'careContext' of type 'ims.core.admin.vo.CareContextRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateallowChangeNeoNatalPlastics(ims.edischarge.vo.SummaryRefVo summary)
	{
	}

	@SuppressWarnings("unused")
	public void validategetAdmissionDetailByCareContext(ims.core.admin.vo.CareContextRefVo voCC)
	{
	}
}
