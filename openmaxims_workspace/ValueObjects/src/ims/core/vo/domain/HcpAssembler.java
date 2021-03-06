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
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class HcpAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.Hcp copy(ims.core.vo.Hcp valueObjectDest, ims.core.vo.Hcp valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Hcp(valueObjectSrc.getID_Hcp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Mos
		valueObjectDest.setMos(valueObjectSrc.getMos());
		// isHCPaResponsibleHCP
		valueObjectDest.setIsHCPaResponsibleHCP(valueObjectSrc.getIsHCPaResponsibleHCP());
		// isALocalConsultant
		valueObjectDest.setIsALocalConsultant(valueObjectSrc.getIsALocalConsultant());
		// isAResponsibleEDClinician
		valueObjectDest.setIsAResponsibleEDClinician(valueObjectSrc.getIsAResponsibleEDClinician());
		// hcpType
		valueObjectDest.setHcpType(valueObjectSrc.getHcpType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHcpCollectionFromHcp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Hcp objects.
	 */
	public static ims.core.vo.HcpCollection createHcpCollectionFromHcp(java.util.Set domainObjectSet)	
	{
		return createHcpCollectionFromHcp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Hcp objects.
	 */
	public static ims.core.vo.HcpCollection createHcpCollectionFromHcp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.HcpCollection voList = new ims.core.vo.HcpCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.people.domain.objects.Hcp domainObject = (ims.core.resource.people.domain.objects.Hcp) iterator.next();
			ims.core.vo.Hcp vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Hcp objects.
	 */
	public static ims.core.vo.HcpCollection createHcpCollectionFromHcp(java.util.List domainObjectList) 
	{
		return createHcpCollectionFromHcp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Hcp objects.
	 */
	public static ims.core.vo.HcpCollection createHcpCollectionFromHcp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.HcpCollection voList = new ims.core.vo.HcpCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.people.domain.objects.Hcp domainObject = (ims.core.resource.people.domain.objects.Hcp) domainObjectList.get(i);
			ims.core.vo.Hcp vo = create(map, domainObject);

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
	 * Create the ims.core.resource.people.domain.objects.Hcp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHcpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HcpCollection voCollection) 
	 {
	 	return extractHcpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHcpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HcpCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.Hcp vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Hcp domainObject = HcpAssembler.extractHcp(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.people.domain.objects.Hcp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHcpList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HcpCollection voCollection) 
	 {
	 	return extractHcpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHcpList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HcpCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.Hcp vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Hcp domainObject = HcpAssembler.extractHcp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.people.domain.objects.Hcp object.
	 * @param domainObject ims.core.resource.people.domain.objects.Hcp
	 */
	 public static ims.core.vo.Hcp create(ims.core.resource.people.domain.objects.Hcp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.people.domain.objects.Hcp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.Hcp create(DomainObjectMap map, ims.core.resource.people.domain.objects.Hcp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.Hcp valueObject = (ims.core.vo.Hcp) map.getValueObject(domainObject, ims.core.vo.Hcp.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.Hcp(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.Hcp
	 */
	 public static ims.core.vo.Hcp insert(ims.core.vo.Hcp valueObject, ims.core.resource.people.domain.objects.Hcp domainObject) 
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
	 * @param domainObject ims.core.resource.people.domain.objects.Hcp
	 */
	 public static ims.core.vo.Hcp insert(DomainObjectMap map, ims.core.vo.Hcp valueObject, ims.core.resource.people.domain.objects.Hcp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Hcp(domainObject.getId());
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
			
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Mos
		valueObject.setMos(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getMos()) );
		// isHCPaResponsibleHCP
		valueObject.setIsHCPaResponsibleHCP( domainObject.isIsHCPaResponsibleHCP() );
		// isALocalConsultant
		valueObject.setIsALocalConsultant( domainObject.isIsALocalConsultant() );
		// isAResponsibleEDClinician
		valueObject.setIsAResponsibleEDClinician( domainObject.isIsAResponsibleEDClinician() );
		// hcpType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getHcpType();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.HcpDisType voLookup6 = new ims.core.vo.lookups.HcpDisType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.HcpDisType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setHcpType(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.people.domain.objects.Hcp extractHcp(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.Hcp valueObject) 
	{
		return 	extractHcp(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.people.domain.objects.Hcp extractHcp(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.Hcp valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Hcp();
		ims.core.resource.people.domain.objects.Hcp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject);
			}
			// ims.core.vo.Hcp ID_Hcp field is unknown
			domainObject = new ims.core.resource.people.domain.objects.Hcp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Hcp());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.people.domain.objects.Hcp)domMap.get(key);
			}
			domainObject = (ims.core.resource.people.domain.objects.Hcp) domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Hcp());

		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setMos(ims.core.vo.domain.MemberOfStaffShortVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getMos(), domMap));
		domainObject.setIsHCPaResponsibleHCP(valueObject.getIsHCPaResponsibleHCP());
		domainObject.setIsALocalConsultant(valueObject.getIsALocalConsultant());
		domainObject.setIsAResponsibleEDClinician(valueObject.getIsAResponsibleEDClinician());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getHcpType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getHcpType().getID());
		}
		domainObject.setHcpType(value6);

		return domainObject;
	}

}
