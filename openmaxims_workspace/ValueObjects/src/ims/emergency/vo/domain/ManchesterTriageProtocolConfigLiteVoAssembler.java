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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ManchesterTriageProtocolConfigLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo copy(ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObjectDest, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ManchesterTriageProtocolConfiguration(valueObjectSrc.getID_ManchesterTriageProtocolConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProtocolName
		valueObjectDest.setProtocolName(valueObjectSrc.getProtocolName());
		// ProtocolDescription
		valueObjectDest.setProtocolDescription(valueObjectSrc.getProtocolDescription());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// Problem
		valueObjectDest.setProblem(valueObjectSrc.getProblem());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(java.util.Set domainObjectSet)	
	{
		return createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection voList = new ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration) iterator.next();
			ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(java.util.List domainObjectList) 
	{
		return createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection createManchesterTriageProtocolConfigLiteVoCollectionFromManchesterTriageProtocolConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection voList = new ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration) domainObjectList.get(i);
			ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractManchesterTriageProtocolConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection voCollection) 
	 {
	 	return extractManchesterTriageProtocolConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractManchesterTriageProtocolConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = ManchesterTriageProtocolConfigLiteVoAssembler.extractManchesterTriageProtocolConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractManchesterTriageProtocolConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection voCollection) 
	 {
	 	return extractManchesterTriageProtocolConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractManchesterTriageProtocolConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = ManchesterTriageProtocolConfigLiteVoAssembler.extractManchesterTriageProtocolConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration object.
	 * @param domainObject ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo create(ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObject = (ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo) map.getValueObject(domainObject, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo insert(ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObject, ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo insert(DomainObjectMap map, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObject, ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ManchesterTriageProtocolConfiguration(domainObject.getId());
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
			
		// ProtocolName
		valueObject.setProtocolName(domainObject.getProtocolName());
		// ProtocolDescription
		valueObject.setProtocolDescription(domainObject.getProtocolDescription());
		// ActiveStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getActiveStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setActiveStatus(voLookup3);
		}
				// Problem
		valueObject.setProblem(ims.clinical.vo.domain.ClinicalProblemShortVoAssembler.create(map, domainObject.getProblem()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration extractManchesterTriageProtocolConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObject) 
	{
		return 	extractManchesterTriageProtocolConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration extractManchesterTriageProtocolConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ManchesterTriageProtocolConfiguration();
		ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration)domMap.get(valueObject);
			}
			// ims.emergency.vo.ManchesterTriageProtocolConfigLiteVo ID_ManchesterTriageProtocolConfiguration field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ManchesterTriageProtocolConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ManchesterTriageProtocolConfiguration());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProtocolName() != null && valueObject.getProtocolName().equals(""))
		{
			valueObject.setProtocolName(null);
		}
		domainObject.setProtocolName(valueObject.getProtocolName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProtocolDescription() != null && valueObject.getProtocolDescription().equals(""))
		{
			valueObject.setProtocolDescription(null);
		}
		domainObject.setProtocolDescription(valueObject.getProtocolDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.ClinicalProblem value4 = null;
		if ( null != valueObject.getProblem() ) 
		{
			if (valueObject.getProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProblem()) != null)
				{
					value4 = (ims.clinical.configuration.domain.objects.ClinicalProblem)domMap.get(valueObject.getProblem());
				}
			}
			else
			{
				value4 = (ims.clinical.configuration.domain.objects.ClinicalProblem)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.ClinicalProblem.class, valueObject.getProblem().getBoId());
			}
		}
		domainObject.setProblem(value4);

		return domainObject;
	}

}
