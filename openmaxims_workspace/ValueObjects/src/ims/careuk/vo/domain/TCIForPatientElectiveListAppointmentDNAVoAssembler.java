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
package ims.careuk.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class TCIForPatientElectiveListAppointmentDNAVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo copy(ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObjectDest, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TCIForPatientElectiveList(valueObjectSrc.getID_TCIForPatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CurrentOutcome
		valueObjectDest.setCurrentOutcome(valueObjectSrc.getCurrentOutcome());
		// OutcomeHistory
		valueObjectDest.setOutcomeHistory(valueObjectSrc.getOutcomeHistory());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.careuk.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.careuk.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection voList = new ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.careuk.domain.objects.TCIForPatientElectiveList domainObject = (ims.careuk.domain.objects.TCIForPatientElectiveList) iterator.next();
			ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.careuk.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(java.util.List domainObjectList) 
	{
		return createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.careuk.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection createTCIForPatientElectiveListAppointmentDNAVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection voList = new ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.careuk.domain.objects.TCIForPatientElectiveList domainObject = (ims.careuk.domain.objects.TCIForPatientElectiveList) domainObjectList.get(i);
			ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo vo = create(map, domainObject);

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
	 * Create the ims.careuk.domain.objects.TCIForPatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo vo = voCollection.get(i);
			ims.careuk.domain.objects.TCIForPatientElectiveList domainObject = TCIForPatientElectiveListAppointmentDNAVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.careuk.domain.objects.TCIForPatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo vo = voCollection.get(i);
			ims.careuk.domain.objects.TCIForPatientElectiveList domainObject = TCIForPatientElectiveListAppointmentDNAVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.careuk.domain.objects.TCIForPatientElectiveList object.
	 * @param domainObject ims.careuk.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo create(ims.careuk.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.careuk.domain.objects.TCIForPatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo create(DomainObjectMap map, ims.careuk.domain.objects.TCIForPatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObject = (ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo) map.getValueObject(domainObject, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.careuk.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo insert(ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObject, ims.careuk.domain.objects.TCIForPatientElectiveList domainObject) 
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
	 * @param domainObject ims.careuk.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo insert(DomainObjectMap map, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObject, ims.careuk.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TCIForPatientElectiveList(domainObject.getId());
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
			
		// CurrentOutcome
		valueObject.setCurrentOutcome(ims.careuk.vo.domain.TCIOutcomeForAppointmentDNAVoAssembler.create(map, domainObject.getCurrentOutcome()) );
		// OutcomeHistory
		ims.careuk.vo.TCIOutcomeForPatientElectiveListRefVoCollection OutcomeHistory = new ims.careuk.vo.TCIOutcomeForPatientElectiveListRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOutcomeHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.careuk.domain.objects.TCIOutcomeForPatientElectiveList tmp = (ims.careuk.domain.objects.TCIOutcomeForPatientElectiveList)iterator.next();
			if (tmp != null)
				OutcomeHistory.add(new ims.careuk.vo.TCIOutcomeForPatientElectiveListRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOutcomeHistory(OutcomeHistory);
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.careuk.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObject) 
	{
		return 	extractTCIForPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.careuk.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TCIForPatientElectiveList();
		ims.careuk.domain.objects.TCIForPatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.careuk.domain.objects.TCIForPatientElectiveList)domMap.get(valueObject);
			}
			// ims.careuk.vo.TCIForPatientElectiveListAppointmentDNAVo ID_TCIForPatientElectiveList field is unknown
			domainObject = new ims.careuk.domain.objects.TCIForPatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TCIForPatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.careuk.domain.objects.TCIForPatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.careuk.domain.objects.TCIForPatientElectiveList) domainFactory.getDomainObject(ims.careuk.domain.objects.TCIForPatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TCIForPatientElectiveList());

		domainObject.setCurrentOutcome(ims.careuk.vo.domain.TCIOutcomeForAppointmentDNAVoAssembler.extractTCIOutcomeForPatientElectiveList(domainFactory, valueObject.getCurrentOutcome(), domMap));

		ims.careuk.vo.TCIOutcomeForPatientElectiveListRefVoCollection refCollection2 = valueObject.getOutcomeHistory();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainOutcomeHistory2 = domainObject.getOutcomeHistory();
		if (domainOutcomeHistory2 == null)
		{
			domainOutcomeHistory2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.careuk.vo.TCIOutcomeForPatientElectiveListRefVo vo = refCollection2.get(i);			
			ims.careuk.domain.objects.TCIOutcomeForPatientElectiveList dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.careuk.domain.objects.TCIOutcomeForPatientElectiveList)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.careuk.domain.objects.TCIOutcomeForPatientElectiveList)domainFactory.getDomainObject( ims.careuk.domain.objects.TCIOutcomeForPatientElectiveList.class, vo.getBoId());
				}
			}

			int domIdx = domainOutcomeHistory2.indexOf(dom);
			if (domIdx == -1)
			{
				domainOutcomeHistory2.add(i, dom);
			}
			else if (i != domIdx && i < domainOutcomeHistory2.size())
			{
				Object tmp = domainOutcomeHistory2.get(i);
				domainOutcomeHistory2.set(i, domainOutcomeHistory2.get(domIdx));
				domainOutcomeHistory2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainOutcomeHistory2.size();
		while (i2 > size2)
		{
			domainOutcomeHistory2.remove(i2-1);
			i2 = domainOutcomeHistory2.size();
		}
		
		domainObject.setOutcomeHistory(domainOutcomeHistory2);		
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
