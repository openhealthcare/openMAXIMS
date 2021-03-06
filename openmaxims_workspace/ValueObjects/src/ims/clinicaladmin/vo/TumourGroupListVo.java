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

package ims.clinicaladmin.vo;

/**
 * Linked to Oncology.Configuration.TumourGroup business object (ID: 1074100009).
 */
public class TumourGroupListVo extends ims.clinicaladmin.vo.TumourGroupLiteVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TumourGroupListVo()
	{
	}
	public TumourGroupListVo(Integer id, int version)
	{
		super(id, version);
	}
	public TumourGroupListVo(ims.clinicaladmin.vo.beans.TumourGroupListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.groupname = bean.getGroupName();
		this.isactive = bean.getIsActive();
		this.hastnm = bean.getHasTNM();
		this.isprognosticgroupingrelevant = bean.getIsPrognosticGroupingRelevant();
		this.groupdescription = bean.getGroupDescription();
		this.hasotherclassifications = bean.getHasOtherClassifications();
		this.otherclassifications = ims.oncology.vo.TumourGroupClassificationVoCollection.buildFromBeanCollection(bean.getOtherClassifications());
		this.sites = ims.clinicaladmin.vo.TumourSiteLiteVoCollection.buildFromBeanCollection(bean.getSites());
		this.tnmrequiresdiff = bean.getTnmRequiresDiff();
		this.tnmrequiresover45 = bean.getTnmRequiresOver45();
		this.tnmrequireshisto = bean.getTnmRequiresHisto();
		this.tnmrequiressmarkers = bean.getTnmRequiresSMarkers();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.beans.TumourGroupListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.groupname = bean.getGroupName();
		this.isactive = bean.getIsActive();
		this.hastnm = bean.getHasTNM();
		this.isprognosticgroupingrelevant = bean.getIsPrognosticGroupingRelevant();
		this.groupdescription = bean.getGroupDescription();
		this.hasotherclassifications = bean.getHasOtherClassifications();
		this.otherclassifications = ims.oncology.vo.TumourGroupClassificationVoCollection.buildFromBeanCollection(bean.getOtherClassifications());
		this.sites = ims.clinicaladmin.vo.TumourSiteLiteVoCollection.buildFromBeanCollection(bean.getSites());
		this.tnmrequiresdiff = bean.getTnmRequiresDiff();
		this.tnmrequiresover45 = bean.getTnmRequiresOver45();
		this.tnmrequireshisto = bean.getTnmRequiresHisto();
		this.tnmrequiressmarkers = bean.getTnmRequiresSMarkers();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.beans.TumourGroupListVoBean bean = null;
		if(map != null)
			bean = (ims.clinicaladmin.vo.beans.TumourGroupListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinicaladmin.vo.beans.TumourGroupListVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("GROUPDESCRIPTION"))
			return getGroupDescription();
		if(fieldName.equals("HASOTHERCLASSIFICATIONS"))
			return getHasOtherClassifications();
		if(fieldName.equals("OTHERCLASSIFICATIONS"))
			return getOtherClassifications();
		if(fieldName.equals("SITES"))
			return getSites();
		if(fieldName.equals("TNMREQUIRESDIFF"))
			return getTnmRequiresDiff();
		if(fieldName.equals("TNMREQUIRESOVER45"))
			return getTnmRequiresOver45();
		if(fieldName.equals("TNMREQUIRESHISTO"))
			return getTnmRequiresHisto();
		if(fieldName.equals("TNMREQUIRESSMARKERS"))
			return getTnmRequiresSMarkers();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getGroupDescriptionIsNotNull()
	{
		return this.groupdescription != null;
	}
	public String getGroupDescription()
	{
		return this.groupdescription;
	}
	public static int getGroupDescriptionMaxLength()
	{
		return 255;
	}
	public void setGroupDescription(String value)
	{
		this.isValidated = false;
		this.groupdescription = value;
	}
	public boolean getHasOtherClassificationsIsNotNull()
	{
		return this.hasotherclassifications != null;
	}
	public Boolean getHasOtherClassifications()
	{
		return this.hasotherclassifications;
	}
	public void setHasOtherClassifications(Boolean value)
	{
		this.isValidated = false;
		this.hasotherclassifications = value;
	}
	public boolean getOtherClassificationsIsNotNull()
	{
		return this.otherclassifications != null;
	}
	public ims.oncology.vo.TumourGroupClassificationVoCollection getOtherClassifications()
	{
		return this.otherclassifications;
	}
	public void setOtherClassifications(ims.oncology.vo.TumourGroupClassificationVoCollection value)
	{
		this.isValidated = false;
		this.otherclassifications = value;
	}
	public boolean getSitesIsNotNull()
	{
		return this.sites != null;
	}
	public ims.clinicaladmin.vo.TumourSiteLiteVoCollection getSites()
	{
		return this.sites;
	}
	public void setSites(ims.clinicaladmin.vo.TumourSiteLiteVoCollection value)
	{
		this.isValidated = false;
		this.sites = value;
	}
	public boolean getTnmRequiresDiffIsNotNull()
	{
		return this.tnmrequiresdiff != null;
	}
	public Boolean getTnmRequiresDiff()
	{
		return this.tnmrequiresdiff;
	}
	public void setTnmRequiresDiff(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequiresdiff = value;
	}
	public boolean getTnmRequiresOver45IsNotNull()
	{
		return this.tnmrequiresover45 != null;
	}
	public Boolean getTnmRequiresOver45()
	{
		return this.tnmrequiresover45;
	}
	public void setTnmRequiresOver45(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequiresover45 = value;
	}
	public boolean getTnmRequiresHistoIsNotNull()
	{
		return this.tnmrequireshisto != null;
	}
	public Boolean getTnmRequiresHisto()
	{
		return this.tnmrequireshisto;
	}
	public void setTnmRequiresHisto(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequireshisto = value;
	}
	public boolean getTnmRequiresSMarkersIsNotNull()
	{
		return this.tnmrequiressmarkers != null;
	}
	public Boolean getTnmRequiresSMarkers()
	{
		return this.tnmrequiressmarkers;
	}
	public void setTnmRequiresSMarkers(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequiressmarkers = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.otherclassifications != null)
		{
			if(!this.otherclassifications.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.groupname == null || this.groupname.length() == 0)
			listOfErrors.add("GroupName is mandatory");
		else if(this.groupname.length() > 255)
			listOfErrors.add("The length of the field [groupname] in the value object [ims.clinicaladmin.vo.TumourGroupListVo] is too big. It should be less or equal to 255");
		if(this.groupdescription != null)
			if(this.groupdescription.length() > 255)
				listOfErrors.add("The length of the field [groupdescription] in the value object [ims.clinicaladmin.vo.TumourGroupListVo] is too big. It should be less or equal to 255");
		if(this.otherclassifications != null)
		{
			String[] listOfOtherErrors = this.otherclassifications.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		TumourGroupListVo clone = new TumourGroupListVo(this.id, this.version);
		
		clone.groupname = this.groupname;
		clone.isactive = this.isactive;
		clone.hastnm = this.hastnm;
		clone.isprognosticgroupingrelevant = this.isprognosticgroupingrelevant;
		clone.groupdescription = this.groupdescription;
		clone.hasotherclassifications = this.hasotherclassifications;
		if(this.otherclassifications == null)
			clone.otherclassifications = null;
		else
			clone.otherclassifications = (ims.oncology.vo.TumourGroupClassificationVoCollection)this.otherclassifications.clone();
		if(this.sites == null)
			clone.sites = null;
		else
			clone.sites = (ims.clinicaladmin.vo.TumourSiteLiteVoCollection)this.sites.clone();
		clone.tnmrequiresdiff = this.tnmrequiresdiff;
		clone.tnmrequiresover45 = this.tnmrequiresover45;
		clone.tnmrequireshisto = this.tnmrequireshisto;
		clone.tnmrequiressmarkers = this.tnmrequiressmarkers;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(TumourGroupListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TumourGroupListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TumourGroupListVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TumourGroupListVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.groupdescription != null)
			count++;
		if(this.hasotherclassifications != null)
			count++;
		if(this.otherclassifications != null)
			count++;
		if(this.sites != null)
			count++;
		if(this.tnmrequiresdiff != null)
			count++;
		if(this.tnmrequiresover45 != null)
			count++;
		if(this.tnmrequireshisto != null)
			count++;
		if(this.tnmrequiressmarkers != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 8;
	}
	protected String groupdescription;
	protected Boolean hasotherclassifications;
	protected ims.oncology.vo.TumourGroupClassificationVoCollection otherclassifications;
	protected ims.clinicaladmin.vo.TumourSiteLiteVoCollection sites;
	protected Boolean tnmrequiresdiff;
	protected Boolean tnmrequiresover45;
	protected Boolean tnmrequireshisto;
	protected Boolean tnmrequiressmarkers;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
