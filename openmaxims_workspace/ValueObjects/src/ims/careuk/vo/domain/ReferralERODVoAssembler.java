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
 * @author Cristian Belciug
 */
public class ReferralERODVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.careuk.vo.ReferralERODVo copy(ims.careuk.vo.ReferralERODVo valueObjectDest, ims.careuk.vo.ReferralERODVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralEROD(valueObjectSrc.getID_ReferralEROD());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ERODDate1
		valueObjectDest.setERODDate1(valueObjectSrc.getERODDate1());
		// ERODDate2
		valueObjectDest.setERODDate2(valueObjectSrc.getERODDate2());
		// PatAvailFromDate
		valueObjectDest.setPatAvailFromDate(valueObjectSrc.getPatAvailFromDate());
		// ReasonableOffer
		valueObjectDest.setReasonableOffer(valueObjectSrc.getReasonableOffer());
		// ERODType
		valueObjectDest.setERODType(valueObjectSrc.getERODType());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// PathWayClock
		valueObjectDest.setPathWayClock(valueObjectSrc.getPathWayClock());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralERODVoCollectionFromReferralEROD(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.careuk.domain.objects.ReferralEROD objects.
	 */
	public static ims.careuk.vo.ReferralERODVoCollection createReferralERODVoCollectionFromReferralEROD(java.util.Set domainObjectSet)	
	{
		return createReferralERODVoCollectionFromReferralEROD(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.careuk.domain.objects.ReferralEROD objects.
	 */
	public static ims.careuk.vo.ReferralERODVoCollection createReferralERODVoCollectionFromReferralEROD(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.careuk.vo.ReferralERODVoCollection voList = new ims.careuk.vo.ReferralERODVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.careuk.domain.objects.ReferralEROD domainObject = (ims.careuk.domain.objects.ReferralEROD) iterator.next();
			ims.careuk.vo.ReferralERODVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.careuk.domain.objects.ReferralEROD objects.
	 */
	public static ims.careuk.vo.ReferralERODVoCollection createReferralERODVoCollectionFromReferralEROD(java.util.List domainObjectList) 
	{
		return createReferralERODVoCollectionFromReferralEROD(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.careuk.domain.objects.ReferralEROD objects.
	 */
	public static ims.careuk.vo.ReferralERODVoCollection createReferralERODVoCollectionFromReferralEROD(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.careuk.vo.ReferralERODVoCollection voList = new ims.careuk.vo.ReferralERODVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.careuk.domain.objects.ReferralEROD domainObject = (ims.careuk.domain.objects.ReferralEROD) domainObjectList.get(i);
			ims.careuk.vo.ReferralERODVo vo = create(map, domainObject);

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
	 * Create the ims.careuk.domain.objects.ReferralEROD set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralERODSet(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.ReferralERODVoCollection voCollection) 
	 {
	 	return extractReferralERODSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralERODSet(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.ReferralERODVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.careuk.vo.ReferralERODVo vo = voCollection.get(i);
			ims.careuk.domain.objects.ReferralEROD domainObject = ReferralERODVoAssembler.extractReferralEROD(domainFactory, vo, domMap);

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
	 * Create the ims.careuk.domain.objects.ReferralEROD list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralERODList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.ReferralERODVoCollection voCollection) 
	 {
	 	return extractReferralERODList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralERODList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.ReferralERODVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.careuk.vo.ReferralERODVo vo = voCollection.get(i);
			ims.careuk.domain.objects.ReferralEROD domainObject = ReferralERODVoAssembler.extractReferralEROD(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.careuk.domain.objects.ReferralEROD object.
	 * @param domainObject ims.careuk.domain.objects.ReferralEROD
	 */
	 public static ims.careuk.vo.ReferralERODVo create(ims.careuk.domain.objects.ReferralEROD domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.careuk.domain.objects.ReferralEROD object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.careuk.vo.ReferralERODVo create(DomainObjectMap map, ims.careuk.domain.objects.ReferralEROD domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.careuk.vo.ReferralERODVo valueObject = (ims.careuk.vo.ReferralERODVo) map.getValueObject(domainObject, ims.careuk.vo.ReferralERODVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.careuk.vo.ReferralERODVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.careuk.domain.objects.ReferralEROD
	 */
	 public static ims.careuk.vo.ReferralERODVo insert(ims.careuk.vo.ReferralERODVo valueObject, ims.careuk.domain.objects.ReferralEROD domainObject) 
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
	 * @param domainObject ims.careuk.domain.objects.ReferralEROD
	 */
	 public static ims.careuk.vo.ReferralERODVo insert(DomainObjectMap map, ims.careuk.vo.ReferralERODVo valueObject, ims.careuk.domain.objects.ReferralEROD domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralEROD(domainObject.getId());
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
			
		// ERODDate1
		java.util.Date ERODDate1 = domainObject.getERODDate1();
		if ( null != ERODDate1 ) 
		{
			valueObject.setERODDate1(new ims.framework.utils.Date(ERODDate1) );
		}
		// ERODDate2
		java.util.Date ERODDate2 = domainObject.getERODDate2();
		if ( null != ERODDate2 ) 
		{
			valueObject.setERODDate2(new ims.framework.utils.Date(ERODDate2) );
		}
		// PatAvailFromDate
		java.util.Date PatAvailFromDate = domainObject.getPatAvailFromDate();
		if ( null != PatAvailFromDate ) 
		{
			valueObject.setPatAvailFromDate(new ims.framework.utils.Date(PatAvailFromDate) );
		}
		// ReasonableOffer
		valueObject.setReasonableOffer( domainObject.isReasonableOffer() );
		// ERODType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getERODType();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.careuk.vo.lookups.ERODType voLookup5 = new ims.careuk.vo.lookups.ERODType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.careuk.vo.lookups.ERODType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.careuk.vo.lookups.ERODType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setERODType(voLookup5);
		}
				// Appointment
		valueObject.setAppointment(ims.careuk.vo.domain.Booking_AppointmentERODVoAssembler.create(map, domainObject.getAppointment()) );
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// PathWayClock
		if (domainObject.getPathWayClock() != null)
		{
			if(domainObject.getPathWayClock() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPathWayClock();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPathWayClock(new ims.pathways.vo.PathwayClockRefVo(id, -1));				
			}
			else
			{
				valueObject.setPathWayClock(new ims.pathways.vo.PathwayClockRefVo(domainObject.getPathWayClock().getId(), domainObject.getPathWayClock().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.careuk.domain.objects.ReferralEROD extractReferralEROD(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.ReferralERODVo valueObject) 
	{
		return 	extractReferralEROD(domainFactory, valueObject, new HashMap());
	}

	public static ims.careuk.domain.objects.ReferralEROD extractReferralEROD(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.ReferralERODVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralEROD();
		ims.careuk.domain.objects.ReferralEROD domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.careuk.domain.objects.ReferralEROD)domMap.get(valueObject);
			}
			// ims.careuk.vo.ReferralERODVo ID_ReferralEROD field is unknown
			domainObject = new ims.careuk.domain.objects.ReferralEROD();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralEROD());
			if (domMap.get(key) != null)
			{
				return (ims.careuk.domain.objects.ReferralEROD)domMap.get(key);
			}
			domainObject = (ims.careuk.domain.objects.ReferralEROD) domainFactory.getDomainObject(ims.careuk.domain.objects.ReferralEROD.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralEROD());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getERODDate1();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setERODDate1(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getERODDate2();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setERODDate2(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getPatAvailFromDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setPatAvailFromDate(value3);
		domainObject.setReasonableOffer(valueObject.getReasonableOffer());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getERODType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getERODType().getID());
		}
		domainObject.setERODType(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value6 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value6 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value6);
		domainObject.setSequence(valueObject.getSequence());
		domainObject.setIsActive(valueObject.getIsActive());
		ims.pathways.domain.objects.PathwayClock value9 = null;
		if ( null != valueObject.getPathWayClock() ) 
		{
			if (valueObject.getPathWayClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathWayClock()) != null)
				{
					value9 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getPathWayClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getPathWayClock();	
			}
			else
			{
				value9 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getPathWayClock().getBoId());
			}
		}
		domainObject.setPathWayClock(value9);

		return domainObject;
	}

}
