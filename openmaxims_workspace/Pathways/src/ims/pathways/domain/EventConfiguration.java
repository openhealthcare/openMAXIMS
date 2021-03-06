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

package ims.pathways.domain;

// Generated from form domain impl
public interface EventConfiguration extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* List all Roles
	*/
	public ims.admin.vo.AppRoleShortVoCollection listRoles();

	// Generated from form domain interface definition
	/**
	* listByCriteria
	*/
	public ims.pathways.vo.ExternalEventMappingVoCollection listExternalEventMappingsByCriteria(ims.pathways.vo.ExternalEventMappingVo filter);

	// Generated from form domain interface definition
	/**
	* listRTTEvents
	*/
	public ims.pathways.vo.RTTEventVoCollection listRTTEvents(ims.pathways.vo.RTTEventVo rttEventVo);

	// Generated from form domain interface definition
	/**
	* save
	*/
	public ims.pathways.vo.EventVo save(ims.pathways.vo.EventVo record, ims.pathways.vo.EventTargetVoCollection eventTargets, ims.pathways.vo.EventExternalEventMappingVoCollection externalToBeAdded, ims.pathways.vo.EventExternalEventMappingVoCollection externalToBeDeleted, ims.pathways.vo.EventRTTEventVoCollection rttToBeAdded, ims.pathways.vo.EventRTTEventVoCollection rttToBeDeleted) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.pathways.vo.TargetConfigurationShortVoCollection listTargetByCriteria(ims.pathways.vo.TargetConfigurationShortVo filter);

	// Generated from form domain interface definition
	/**
	* listProviderSystems
	*/
	public ims.ocrr.vo.ProviderSystemVoCollection listProviderSystems();

	// Generated from form domain interface definition
	/**
	* getNameByProviderSystems
	*/
	public ims.pathways.vo.RTTEventVoCollection getNameByProviderSystems(ims.core.admin.vo.ProviderSystemRefVo rttEventRefVo);

	// Generated from form domain interface definition
	/**
	* getEvent
	*/
	public ims.pathways.vo.EventVo getEvent(ims.pathways.configuration.vo.EventRefVo voRef);

	// Generated from form domain interface definition
	/**
	* list16x16Icons
	*/
	public ims.admin.vo.AppImageVoCollection list16x16Icons(String name);

	// Generated from form domain interface definition
	public ims.pathways.vo.RTTEventVo getRTTEventByPASCode(String code);

	// Generated from form domain interface definition
	/**
	* getEventTargetsByEvent
	*/
	public ims.pathways.vo.EventTargetVoCollection getEventTargetsByEvent(ims.pathways.configuration.vo.EventRefVo voRef);

	// Generated from form domain interface definition
	public ims.pathways.vo.ExternalEventMappingVoCollection getEventMappingsByEventAndStatus(ims.pathways.configuration.vo.EventRefVo voRef, ims.core.vo.lookups.PreActiveActiveInactiveStatus status);

	// Generated from form domain interface definition
	public ims.pathways.vo.RTTEventVoCollection getRTTByEventAndStatus(ims.pathways.configuration.vo.EventRefVo voRef, ims.core.vo.lookups.PreActiveActiveInactiveStatus status);

	// Generated from form domain interface definition
	/**
	* getEventRTTEvent
	*/
	public ims.pathways.vo.EventRTTEventVoCollection getEventRTTEvent(ims.pathways.configuration.vo.EventRefVo voRef, ims.core.vo.lookups.PreActiveActiveInactiveStatus status);

	// Generated from form domain interface definition
	/**
	* getEventExternalEventMapping
	*/
	public ims.pathways.vo.EventExternalEventMappingVoCollection getEventExternalEventMapping(ims.pathways.configuration.vo.EventRefVo voRef, ims.core.vo.lookups.PreActiveActiveInactiveStatus status);
}
