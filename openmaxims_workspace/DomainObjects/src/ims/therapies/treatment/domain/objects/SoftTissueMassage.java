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
package ims.therapies.treatment.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class SoftTissueMassage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100019;
	private static final long serialVersionUID = 1019100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Soft Tissue - Massage Type */
	private ims.domain.lookups.LookupInstance sTMassageType;
	/** Soft Tissue - Massage Area */
	private ims.domain.lookups.LookupInstance sTMassageArea;
	/** Soft Tissue - Massage Area Description */
	private String sTMassageAreaDescription;
	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Duration (in mins) */
	private Integer duration;
	/** Notes */
	private String notes;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SoftTissueMassage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SoftTissueMassage ()
    {
    	super();
    }
    public SoftTissueMassage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.SoftTissueMassage.class;
	}


	public ims.domain.lookups.LookupInstance getSTMassageType() {
		return sTMassageType;
	}
	public void setSTMassageType(ims.domain.lookups.LookupInstance sTMassageType) {
		this.sTMassageType = sTMassageType;
	}

	public ims.domain.lookups.LookupInstance getSTMassageArea() {
		return sTMassageArea;
	}
	public void setSTMassageArea(ims.domain.lookups.LookupInstance sTMassageArea) {
		this.sTMassageArea = sTMassageArea;
	}

	public String getSTMassageAreaDescription() {
		return sTMassageAreaDescription;
	}
	public void setSTMassageAreaDescription(String sTMassageAreaDescription) {
		if ( null != sTMassageAreaDescription && sTMassageAreaDescription.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sTMassageAreaDescription. Tried to set value: "+
				sTMassageAreaDescription);
		}
		this.sTMassageAreaDescription = sTMassageAreaDescription;
	}

	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 80 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
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
		
		auditStr.append("\r\n*sTMassageType* :");
		if (sTMassageType != null)
			auditStr.append(sTMassageType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sTMassageArea* :");
		if (sTMassageArea != null)
			auditStr.append(sTMassageArea.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sTMassageAreaDescription* :");
		auditStr.append(sTMassageAreaDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
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
		
		String keyClassName = "SoftTissueMassage";
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
		if (this.getSTMassageType() != null)
		{
			sb.append("<sTMassageType>");
			sb.append(this.getSTMassageType().toXMLString()); 
			sb.append("</sTMassageType>");		
		}
		if (this.getSTMassageArea() != null)
		{
			sb.append("<sTMassageArea>");
			sb.append(this.getSTMassageArea().toXMLString()); 
			sb.append("</sTMassageArea>");		
		}
		if (this.getSTMassageAreaDescription() != null)
		{
			sb.append("<sTMassageAreaDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSTMassageAreaDescription().toString()));
			sb.append("</sTMassageAreaDescription>");		
		}
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
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
			SoftTissueMassage domainObject = getSoftTissueMassagefromXML(itemEl, factory, domMap);

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
			SoftTissueMassage domainObject = getSoftTissueMassagefromXML(itemEl, factory, domMap);

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
		
	public static SoftTissueMassage getSoftTissueMassagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSoftTissueMassagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SoftTissueMassage getSoftTissueMassagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SoftTissueMassage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SoftTissueMassage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SoftTissueMassage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SoftTissueMassage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SoftTissueMassage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SoftTissueMassage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SoftTissueMassage)factory.getImportedDomainObject(SoftTissueMassage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SoftTissueMassage();
		}
		String keyClassName = "SoftTissueMassage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SoftTissueMassage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SoftTissueMassage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("sTMassageType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSTMassageType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sTMassageArea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSTMassageArea(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sTMassageAreaDescription");
		if(fldEl != null)
		{	
    		obj.setSTMassageAreaDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String STMassageType = "sTMassageType";
		public static final String STMassageArea = "sTMassageArea";
		public static final String STMassageAreaDescription = "sTMassageAreaDescription";
		public static final String Laterality = "laterality";
		public static final String Duration = "duration";
		public static final String Notes = "notes";
		public static final String ClinicalContact = "clinicalContact";
	}
}

