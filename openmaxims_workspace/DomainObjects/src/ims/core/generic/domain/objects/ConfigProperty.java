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
package ims.core.generic.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class ConfigProperty extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1002100005;
	private static final long serialVersionUID = 1002100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String propertyName;
	private String propertyValue;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConfigProperty (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public ConfigProperty ()
    {
    	super();
		isComponentClass=true;
    }
    public ConfigProperty (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.generic.domain.objects.ConfigProperty.class;
	}


	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		if ( null != propertyName && propertyName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for propertyName. Tried to set value: "+
				propertyName);
		}
		this.propertyName = propertyName;
	}

	public String getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		if ( null != propertyValue && propertyValue.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for propertyValue. Tried to set value: "+
				propertyValue);
		}
		this.propertyValue = propertyValue;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*propertyName* :");
		auditStr.append(propertyName);
	    auditStr.append("; ");
		auditStr.append("\r\n*propertyValue* :");
		auditStr.append(propertyValue);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getPropertyName() != null)
		{
			sb.append("<propertyName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPropertyName().toString()));
			sb.append("</propertyName>");		
		}
		if (this.getPropertyValue() != null)
		{
			sb.append("<propertyValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPropertyValue().toString()));
			sb.append("</propertyValue>");		
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
			ConfigProperty domainObject = getConfigPropertyfromXML(itemEl, factory, domMap);

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
			ConfigProperty domainObject = getConfigPropertyfromXML(itemEl, factory, domMap);

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
		
	public static ConfigProperty getConfigPropertyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConfigPropertyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConfigProperty getConfigPropertyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConfigProperty.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConfigProperty.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConfigProperty class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConfigProperty)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConfigProperty.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConfigProperty ret = null;
		if (ret == null)
		{
			ret = new ConfigProperty();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConfigProperty obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("propertyName");
		if(fldEl != null)
		{	
    		obj.setPropertyName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("propertyValue");
		if(fldEl != null)
		{	
    		obj.setPropertyValue(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	hashcode
	*/
	public int hashCode()
	{
		return (this.getPropertyName().hashCode() * 10071) + this.getPropertyValue().hashCode();		
	}

	/**
	override equals method as component class
	*/
	public boolean equals(Object obj)
	{
		if (null == obj)
		{
			return false;
		}

		if (propertyName.equals(((ConfigProperty) obj).getPropertyName()) && propertyValue.equals(((ConfigProperty) obj).getPropertyValue())
				&& this.getId() == ((ConfigProperty)obj).getId())
			return true;
		return false;
	}

	/**
	toString
	*/
	public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		objStr.append(propertyName + "-");
		objStr.append(propertyValue);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PropertyName = "propertyName";
		public static final String PropertyValue = "propertyValue";
	}
}

