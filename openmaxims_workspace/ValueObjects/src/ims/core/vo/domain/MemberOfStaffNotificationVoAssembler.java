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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class MemberOfStaffNotificationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MemberOfStaffNotificationVo copy(ims.core.vo.MemberOfStaffNotificationVo valueObjectDest, ims.core.vo.MemberOfStaffNotificationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MemberOfStaff(valueObjectSrc.getID_MemberOfStaff());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffNotificationVoCollection createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(java.util.Set domainObjectSet)	
	{
		return createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffNotificationVoCollection createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MemberOfStaffNotificationVoCollection voList = new ims.core.vo.MemberOfStaffNotificationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = (ims.core.resource.people.domain.objects.MemberOfStaff) iterator.next();
			ims.core.vo.MemberOfStaffNotificationVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffNotificationVoCollection createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(java.util.List domainObjectList) 
	{
		return createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffNotificationVoCollection createMemberOfStaffNotificationVoCollectionFromMemberOfStaff(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MemberOfStaffNotificationVoCollection voList = new ims.core.vo.MemberOfStaffNotificationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = (ims.core.resource.people.domain.objects.MemberOfStaff) domainObjectList.get(i);
			ims.core.vo.MemberOfStaffNotificationVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.core.resource.people.domain.objects.MemberOfStaff set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMemberOfStaffSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffNotificationVoCollection voCollection) 
	 {
	 	return extractMemberOfStaffSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMemberOfStaffSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffNotificationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MemberOfStaffNotificationVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = MemberOfStaffNotificationVoAssembler.extractMemberOfStaff(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.core.resource.people.domain.objects.MemberOfStaff list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMemberOfStaffList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffNotificationVoCollection voCollection) 
	 {
	 	return extractMemberOfStaffList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMemberOfStaffList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffNotificationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MemberOfStaffNotificationVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = MemberOfStaffNotificationVoAssembler.extractMemberOfStaff(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.core.resource.people.domain.objects.MemberOfStaff object.
	 * @param domainObject ims.core.resource.people.domain.objects.MemberOfStaff
	 */
	 public static ims.core.vo.MemberOfStaffNotificationVo create(ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.people.domain.objects.MemberOfStaff object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MemberOfStaffNotificationVo create(DomainObjectMap map, ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MemberOfStaffNotificationVo valueObject = (ims.core.vo.MemberOfStaffNotificationVo) map.getValueObject(domainObject, ims.core.vo.MemberOfStaffNotificationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MemberOfStaffNotificationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.MemberOfStaff
	 */
	 public static ims.core.vo.MemberOfStaffNotificationVo insert(ims.core.vo.MemberOfStaffNotificationVo valueObject, ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.MemberOfStaff
	 */
	 public static ims.core.vo.MemberOfStaffNotificationVo insert(DomainObjectMap map, ims.core.vo.MemberOfStaffNotificationVo valueObject, ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MemberOfStaff(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.people.domain.objects.MemberOfStaff extractMemberOfStaff(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffNotificationVo valueObject) 
	{
		return 	extractMemberOfStaff(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.people.domain.objects.MemberOfStaff extractMemberOfStaff(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffNotificationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MemberOfStaff();
		ims.core.resource.people.domain.objects.MemberOfStaff domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject);
			}
			// ims.core.vo.MemberOfStaffNotificationVo ID_MemberOfStaff field is unknown
			domainObject = new ims.core.resource.people.domain.objects.MemberOfStaff();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MemberOfStaff());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(key);
			}
			domainObject = (ims.core.resource.people.domain.objects.MemberOfStaff) domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MemberOfStaff());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.PersonName value1 = null;
		if ( null != valueObject.getName() ) 
		{
			if (valueObject.getName().getBoId() == null)
			{
				if (domMap.get(valueObject.getName()) != null)
				{
					value1 = (ims.core.generic.domain.objects.PersonName)domMap.get(valueObject.getName());
				}
			}
			else
			{
				value1 = (ims.core.generic.domain.objects.PersonName)domainFactory.getDomainObject(ims.core.generic.domain.objects.PersonName.class, valueObject.getName().getBoId());
			}
		}
		domainObject.setName(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.core.generic.vo.CommunicationChannelRefVoCollection refCollection2 = new ims.core.generic.vo.CommunicationChannelRefVoCollection();
		if (valueObject.getCommChannels() != null)
		{
			for (int i2=0; i2<valueObject.getCommChannels().size(); i2++)
			{
				ims.core.generic.vo.CommunicationChannelRefVo ref2 = (ims.core.generic.vo.CommunicationChannelRefVo)valueObject.getCommChannels().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainCommChannels2 = domainObject.getCommChannels();
		if (domainCommChannels2 == null)
		{
			domainCommChannels2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.core.generic.vo.CommunicationChannelRefVo vo = refCollection2.get(i);			
			ims.core.generic.domain.objects.CommunicationChannel dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.CommunicationChannel)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.CommunicationChannel)domainFactory.getDomainObject( ims.core.generic.domain.objects.CommunicationChannel.class, vo.getBoId());
				}
			}

			int domIdx = domainCommChannels2.indexOf(dom);
			if (domIdx == -1)
			{
				domainCommChannels2.add(i, dom);
			}
			else if (i != domIdx && i < domainCommChannels2.size())
			{
				Object tmp = domainCommChannels2.get(i);
				domainCommChannels2.set(i, domainCommChannels2.get(domIdx));
				domainCommChannels2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainCommChannels2.size();
		while (i2 > size2)
		{
			domainCommChannels2.remove(i2-1);
			i2 = domainCommChannels2.size();
		}
		
		domainObject.setCommChannels(domainCommChannels2);		

		return domainObject;
	}

}
