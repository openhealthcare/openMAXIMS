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
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class PainComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100032;
	private static final long serialVersionUID = 1012100032L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.nursing.assessmenttools.domain.objects.PainAssessment optionalPainAssessment;
	private ims.domain.lookups.LookupInstance patientExperiencePainAnyTime;
	private ims.domain.lookups.LookupInstance patientTakePainMeds;
	/** 
	  * Collection of ims.coe.assessment.domain.objects.PainMedication.
	  */
	private java.util.Set painMedication;
	private String otherMethods;
    public PainComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PainComponent ()
    {
    	super();
    }
    public PainComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.PainComponent.class;
	}


	public ims.nursing.assessmenttools.domain.objects.PainAssessment getOptionalPainAssessment() {
		return optionalPainAssessment;
	}
	public void setOptionalPainAssessment(ims.nursing.assessmenttools.domain.objects.PainAssessment optionalPainAssessment) {
		this.optionalPainAssessment = optionalPainAssessment;
	}

	public ims.domain.lookups.LookupInstance getPatientExperiencePainAnyTime() {
		return patientExperiencePainAnyTime;
	}
	public void setPatientExperiencePainAnyTime(ims.domain.lookups.LookupInstance patientExperiencePainAnyTime) {
		this.patientExperiencePainAnyTime = patientExperiencePainAnyTime;
	}

	public ims.domain.lookups.LookupInstance getPatientTakePainMeds() {
		return patientTakePainMeds;
	}
	public void setPatientTakePainMeds(ims.domain.lookups.LookupInstance patientTakePainMeds) {
		this.patientTakePainMeds = patientTakePainMeds;
	}

	public java.util.Set getPainMedication() {
		if ( null == painMedication ) {
			painMedication = new java.util.HashSet();
		}
		return painMedication;
	}
	public void setPainMedication(java.util.Set paramValue) {
		this.painMedication = paramValue;
	}

	public String getOtherMethods() {
		return otherMethods;
	}
	public void setOtherMethods(String otherMethods) {
		if ( null != otherMethods && otherMethods.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherMethods. Tried to set value: "+
				otherMethods);
		}
		this.otherMethods = otherMethods;
	}

	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*optionalPainAssessment* :");
		if (optionalPainAssessment != null)
		{
			auditStr.append(toShortClassName(optionalPainAssessment));
				
		    auditStr.append(optionalPainAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientExperiencePainAnyTime* :");
		if (patientExperiencePainAnyTime != null)
			auditStr.append(patientExperiencePainAnyTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientTakePainMeds* :");
		if (patientTakePainMeds != null)
			auditStr.append(patientTakePainMeds.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*painMedication* :");
		if (painMedication != null)
		{
			java.util.Iterator it4 = painMedication.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.coe.assessment.domain.objects.PainMedication obj = (ims.coe.assessment.domain.objects.PainMedication)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherMethods* :");
		auditStr.append(otherMethods);
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "PainComponent";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getOptionalPainAssessment() != null)
		{
			sb.append("<optionalPainAssessment>");
			sb.append(this.getOptionalPainAssessment().toXMLString(domMap)); 	
			sb.append("</optionalPainAssessment>");		
		}
		if (this.getPatientExperiencePainAnyTime() != null)
		{
			sb.append("<patientExperiencePainAnyTime>");
			sb.append(this.getPatientExperiencePainAnyTime().toXMLString()); 
			sb.append("</patientExperiencePainAnyTime>");		
		}
		if (this.getPatientTakePainMeds() != null)
		{
			sb.append("<patientTakePainMeds>");
			sb.append(this.getPatientTakePainMeds().toXMLString()); 
			sb.append("</patientTakePainMeds>");		
		}
		if (this.getPainMedication() != null)
		{
			if (this.getPainMedication().size() > 0 )
			{
			sb.append("<painMedication>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPainMedication(), domMap));
			sb.append("</painMedication>");		
			}
		}
		if (this.getOtherMethods() != null)
		{
			sb.append("<otherMethods>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherMethods().toString()));
			sb.append("</otherMethods>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			PainComponent domainObject = getPainComponentfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
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
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			PainComponent domainObject = getPainComponentfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static PainComponent getPainComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPainComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PainComponent getPainComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PainComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PainComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PainComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PainComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PainComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PainComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PainComponent)factory.getImportedDomainObject(PainComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PainComponent();
		}
		String keyClassName = "PainComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PainComponent)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PainComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("optionalPainAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOptionalPainAssessment(ims.nursing.assessmenttools.domain.objects.PainAssessment.getPainAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientExperiencePainAnyTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientExperiencePainAnyTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientTakePainMeds");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientTakePainMeds(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("painMedication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPainMedication(ims.coe.assessment.domain.objects.PainMedication.fromSetXMLString(fldEl, factory, obj.getPainMedication(), domMap));
		}
		fldEl = el.element("otherMethods");
		if(fldEl != null)
		{	
    		obj.setOtherMethods(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "painMedication"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String OptionalPainAssessment = "optionalPainAssessment";
		public static final String PatientExperiencePainAnyTime = "patientExperiencePainAnyTime";
		public static final String PatientTakePainMeds = "patientTakePainMeds";
		public static final String PainMedication = "painMedication";
		public static final String OtherMethods = "otherMethods";
	}
}

