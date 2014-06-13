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

package ims.admin.domain;

// Generated from form domain impl
public interface PracticeAdmin extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* list
	*/
	public ims.core.vo.OrgShortVoCollection list(Boolean activeOnly);

	// Generated from form domain interface definition
	/**
	* getOrg
	*/
	public ims.core.vo.OrganisationVo getOrg(ims.core.resource.place.vo.OrganisationRefVo voOrgRef);

	// Generated from form domain interface definition
	public ims.core.vo.OrganisationVo saveOrg(ims.core.vo.OrganisationVo orgVo) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.LocSiteVo getLocSite(ims.core.vo.LocSiteVo voLocSiteRef);

	// Generated from form domain interface definition
	public ims.core.vo.OrgShortVoCollection listSearch(ims.core.vo.OrganisationVo filter);

	// Generated from form domain interface definition
	public void deletePractice(ims.core.vo.OrganisationVo orgToDelete) throws ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.OrganisationVo deleteLocSite(ims.core.vo.LocSiteVo locSiteToDelete) throws ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	/**
	* list GPs
	*/
	public String[] listGps(ims.core.resource.place.vo.OrganisationRefVo organisationRefVo);

	// Generated from form domain interface definition
	public void deletePractice(ims.core.vo.OrganisationVo orgToDelete, Boolean deleteSurgery) throws ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.OrganisationVoCollection listPracticeParents(String value, Boolean activeOnly);

	// Generated from form domain interface definition
	public String[] listPatients(ims.core.vo.LocSiteVo locationsite);

	// Generated from form domain interface definition
	public ims.core.vo.OrganisationVo getPractice(ims.core.resource.place.vo.OrganisationRefVo practiceRef);
}