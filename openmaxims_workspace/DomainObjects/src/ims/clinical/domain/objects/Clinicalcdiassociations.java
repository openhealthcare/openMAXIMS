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
package ims.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Clinicalcdiassociations extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100037;
	private static final long serialVersionUID = 1072100037L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** PrimDiagnosis */
	private ims.core.clinical.domain.objects.PatientDiagnosis primDiagnosis;
	/** PrimProcedure */
	private ims.core.clinical.domain.objects.PatientProcedure primProcedure;
	/** PrimProblem */
	private ims.core.clinical.domain.objects.PatientProblem primProblem;
	/** AssociationDescription */
	private ims.domain.lookups.LookupInstance associationDescription;
	/** AssocDiagnosis */
	private ims.core.clinical.domain.objects.PatientDiagnosis assocDiagnosis;
	/** AssocProcedure */
	private ims.core.clinical.domain.objects.PatientProcedure assocProcedure;
	/** AssocProblem */
	private ims.core.clinical.domain.objects.PatientProblem assocProblem;
	/** ReverseAssociation */
	private ims.domain.lookups.LookupInstance reverseAssociation;
	/** isActive */
	private Boolean isActive;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Clinicalcdiassociations (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Clinicalcdiassociations ()
    {
    	super();
    }
    public Clinicalcdiassociations (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.Clinicalcdiassociations.class;
	}


	public ims.core.clinical.domain.objects.PatientDiagnosis getPrimDiagnosis() {
		return primDiagnosis;
	}
	public void setPrimDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis primDiagnosis) {
		this.primDiagnosis = primDiagnosis;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getPrimProcedure() {
		return primProcedure;
	}
	public void setPrimProcedure(ims.core.clinical.domain.objects.PatientProcedure primProcedure) {
		this.primProcedure = primProcedure;
	}

	public ims.core.clinical.domain.objects.PatientProblem getPrimProblem() {
		return primProblem;
	}
	public void setPrimProblem(ims.core.clinical.domain.objects.PatientProblem primProblem) {
		this.primProblem = primProblem;
	}

	public ims.domain.lookups.LookupInstance getAssociationDescription() {
		return associationDescription;
	}
	public void setAssociationDescription(ims.domain.lookups.LookupInstance associationDescription) {
		this.associationDescription = associationDescription;
	}

	public ims.core.clinical.domain.objects.PatientDiagnosis getAssocDiagnosis() {
		return assocDiagnosis;
	}
	public void setAssocDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis assocDiagnosis) {
		this.assocDiagnosis = assocDiagnosis;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getAssocProcedure() {
		return assocProcedure;
	}
	public void setAssocProcedure(ims.core.clinical.domain.objects.PatientProcedure assocProcedure) {
		this.assocProcedure = assocProcedure;
	}

	public ims.core.clinical.domain.objects.PatientProblem getAssocProblem() {
		return assocProblem;
	}
	public void setAssocProblem(ims.core.clinical.domain.objects.PatientProblem assocProblem) {
		this.assocProblem = assocProblem;
	}

	public ims.domain.lookups.LookupInstance getReverseAssociation() {
		return reverseAssociation;
	}
	public void setReverseAssociation(ims.domain.lookups.LookupInstance reverseAssociation) {
		this.reverseAssociation = reverseAssociation;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		
		auditStr.append("\r\n*primDiagnosis* :");
		if (primDiagnosis != null)
		{
			auditStr.append(toShortClassName(primDiagnosis));
				
		    auditStr.append(primDiagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primProcedure* :");
		if (primProcedure != null)
		{
			auditStr.append(toShortClassName(primProcedure));
				
		    auditStr.append(primProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primProblem* :");
		if (primProblem != null)
		{
			auditStr.append(toShortClassName(primProblem));
				
		    auditStr.append(primProblem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associationDescription* :");
		if (associationDescription != null)
			auditStr.append(associationDescription.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assocDiagnosis* :");
		if (assocDiagnosis != null)
		{
			auditStr.append(toShortClassName(assocDiagnosis));
				
		    auditStr.append(assocDiagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assocProcedure* :");
		if (assocProcedure != null)
		{
			auditStr.append(toShortClassName(assocProcedure));
				
		    auditStr.append(assocProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assocProblem* :");
		if (assocProblem != null)
		{
			auditStr.append(toShortClassName(assocProblem));
				
		    auditStr.append(assocProblem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reverseAssociation* :");
		if (reverseAssociation != null)
			auditStr.append(reverseAssociation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
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
		
		String keyClassName = "Clinicalcdiassociations";
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
		if (this.getPrimDiagnosis() != null)
		{
			sb.append("<primDiagnosis>");
			sb.append(this.getPrimDiagnosis().toXMLString(domMap)); 	
			sb.append("</primDiagnosis>");		
		}
		if (this.getPrimProcedure() != null)
		{
			sb.append("<primProcedure>");
			sb.append(this.getPrimProcedure().toXMLString(domMap)); 	
			sb.append("</primProcedure>");		
		}
		if (this.getPrimProblem() != null)
		{
			sb.append("<primProblem>");
			sb.append(this.getPrimProblem().toXMLString(domMap)); 	
			sb.append("</primProblem>");		
		}
		if (this.getAssociationDescription() != null)
		{
			sb.append("<associationDescription>");
			sb.append(this.getAssociationDescription().toXMLString()); 
			sb.append("</associationDescription>");		
		}
		if (this.getAssocDiagnosis() != null)
		{
			sb.append("<assocDiagnosis>");
			sb.append(this.getAssocDiagnosis().toXMLString(domMap)); 	
			sb.append("</assocDiagnosis>");		
		}
		if (this.getAssocProcedure() != null)
		{
			sb.append("<assocProcedure>");
			sb.append(this.getAssocProcedure().toXMLString(domMap)); 	
			sb.append("</assocProcedure>");		
		}
		if (this.getAssocProblem() != null)
		{
			sb.append("<assocProblem>");
			sb.append(this.getAssocProblem().toXMLString(domMap)); 	
			sb.append("</assocProblem>");		
		}
		if (this.getReverseAssociation() != null)
		{
			sb.append("<reverseAssociation>");
			sb.append(this.getReverseAssociation().toXMLString()); 
			sb.append("</reverseAssociation>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
			Clinicalcdiassociations domainObject = getClinicalcdiassociationsfromXML(itemEl, factory, domMap);

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
			Clinicalcdiassociations domainObject = getClinicalcdiassociationsfromXML(itemEl, factory, domMap);

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
		
	public static Clinicalcdiassociations getClinicalcdiassociationsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalcdiassociationsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Clinicalcdiassociations getClinicalcdiassociationsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Clinicalcdiassociations.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Clinicalcdiassociations.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Clinicalcdiassociations class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Clinicalcdiassociations)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Clinicalcdiassociations.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Clinicalcdiassociations ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Clinicalcdiassociations)factory.getImportedDomainObject(Clinicalcdiassociations.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Clinicalcdiassociations();
		}
		String keyClassName = "Clinicalcdiassociations";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Clinicalcdiassociations)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Clinicalcdiassociations obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("primDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.getPatientDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primProblem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimProblem(ims.core.clinical.domain.objects.PatientProblem.getPatientProblemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("associationDescription");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssociationDescription(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assocDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.getPatientDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assocProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assocProblem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocProblem(ims.core.clinical.domain.objects.PatientProblem.getPatientProblemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reverseAssociation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReverseAssociation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
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
		public static final String PrimDiagnosis = "primDiagnosis";
		public static final String PrimProcedure = "primProcedure";
		public static final String PrimProblem = "primProblem";
		public static final String AssociationDescription = "associationDescription";
		public static final String AssocDiagnosis = "assocDiagnosis";
		public static final String AssocProcedure = "assocProcedure";
		public static final String AssocProblem = "assocProblem";
		public static final String ReverseAssociation = "reverseAssociation";
		public static final String IsActive = "isActive";
	}
}

