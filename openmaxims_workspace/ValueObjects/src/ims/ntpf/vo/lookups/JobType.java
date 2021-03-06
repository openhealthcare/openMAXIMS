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

package ims.ntpf.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class JobType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public JobType()
	{
		super();
	}
	public JobType(int id)
	{
		super(id, "", true);
	}
	public JobType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public JobType(int id, String text, boolean active, JobType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public JobType(int id, String text, boolean active, JobType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public JobType(int id, String text, boolean active, JobType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static JobType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new JobType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (JobType)super.getParentInstance();
	}
	public JobType getParent()
	{
		return (JobType)super.getParentInstance();
	}
	public void setParent(JobType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		JobType[] typedChildren = new JobType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (JobType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof JobType)
		{
			super.addChild((JobType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof JobType)
		{
			super.removeChild((JobType)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		JobTypeCollection result = new JobTypeCollection();
		result.add(PATIENT_LETTER);
		result.add(SATISFACTION_SURVEY);
		result.add(TRANSACTION_EXPORT);
		result.add(GENERIC);
		result.add(PROCEDURE_SPECIALTY_LINK_RECORDS);
		result.add(MONTHLY_ACTIVITY_REPORT);
		result.add(DNA_BATCH_JOB);
		result.add(CENTRAL_BATCH_PRINT);
		result.add(ORDERING_LOCATION_BATCH_PRINT);
		return result;
	}
	public static JobType[] getNegativeInstances()
	{
		JobType[] instances = new JobType[9];
		instances[0] = PATIENT_LETTER;
		instances[1] = SATISFACTION_SURVEY;
		instances[2] = TRANSACTION_EXPORT;
		instances[3] = GENERIC;
		instances[4] = PROCEDURE_SPECIALTY_LINK_RECORDS;
		instances[5] = MONTHLY_ACTIVITY_REPORT;
		instances[6] = DNA_BATCH_JOB;
		instances[7] = CENTRAL_BATCH_PRINT;
		instances[8] = ORDERING_LOCATION_BATCH_PRINT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[9];
		negativeInstances[0] = "PATIENT_LETTER";
		negativeInstances[1] = "SATISFACTION_SURVEY";
		negativeInstances[2] = "TRANSACTION_EXPORT";
		negativeInstances[3] = "GENERIC";
		negativeInstances[4] = "PROCEDURE_SPECIALTY_LINK_RECORDS";
		negativeInstances[5] = "MONTHLY_ACTIVITY_REPORT";
		negativeInstances[6] = "DNA_BATCH_JOB";
		negativeInstances[7] = "CENTRAL_BATCH_PRINT";
		negativeInstances[8] = "ORDERING_LOCATION_BATCH_PRINT";
		return negativeInstances;
	}
	public static JobType getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static JobType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		JobType[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1101047;
	public static final JobType PATIENT_LETTER = new JobType(-696, "Patient Letter", true, null, null, Color.Default);
	public static final JobType SATISFACTION_SURVEY = new JobType(-697, "Satisfaction Survey", true, null, null, Color.Default);
	public static final JobType TRANSACTION_EXPORT = new JobType(-780, "Transaction Export", true, null, null, Color.Default);
	public static final JobType GENERIC = new JobType(-804, "Generic", true, null, null, Color.Default);
	public static final JobType PROCEDURE_SPECIALTY_LINK_RECORDS = new JobType(-975, "Procedure Specialty Link Records", true, null, null, Color.Default);
	public static final JobType MONTHLY_ACTIVITY_REPORT = new JobType(-1593, "Monthly Activity Report", true, null, null, Color.Default);
	public static final JobType DNA_BATCH_JOB = new JobType(-1872, "DNA Batch Job", true, null, null, Color.Default);
	public static final JobType CENTRAL_BATCH_PRINT = new JobType(-1959, "Results Central Batch Print", true, null, null, Color.Default);
	public static final JobType ORDERING_LOCATION_BATCH_PRINT = new JobType(-2061, "Results Ordering Location Batch Print", true, null, null, Color.Default);
}
