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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class UserDefinedAssessmentType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public UserDefinedAssessmentType()
	{
		super();
	}
	public UserDefinedAssessmentType(int id)
	{
		super(id, "", true);
	}
	public UserDefinedAssessmentType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public UserDefinedAssessmentType(int id, String text, boolean active, UserDefinedAssessmentType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public UserDefinedAssessmentType(int id, String text, boolean active, UserDefinedAssessmentType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public UserDefinedAssessmentType(int id, String text, boolean active, UserDefinedAssessmentType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static UserDefinedAssessmentType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new UserDefinedAssessmentType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (UserDefinedAssessmentType)super.getParentInstance();
	}
	public UserDefinedAssessmentType getParent()
	{
		return (UserDefinedAssessmentType)super.getParentInstance();
	}
	public void setParent(UserDefinedAssessmentType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		UserDefinedAssessmentType[] typedChildren = new UserDefinedAssessmentType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (UserDefinedAssessmentType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof UserDefinedAssessmentType)
		{
			super.addChild((UserDefinedAssessmentType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof UserDefinedAssessmentType)
		{
			super.removeChild((UserDefinedAssessmentType)child);
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
		UserDefinedAssessmentTypeCollection result = new UserDefinedAssessmentTypeCollection();
		result.add(GRAPHICAL);
		result.add(ANNOTATEDIMAGEWITHQUESTIONS);
		result.add(PAINASSESSMENT);
		result.add(ANNOTATEDIMAGE);
		result.add(MEDICALNOTING);
		result.add(ANNOTATEDIMAGEWITHREVIEWS);
		result.add(SKINASSESSMENT);
		result.add(QUESTIONBASEDASSESSMENT);
		result.add(USERDEFINEDDATASHEET);
		result.add(DISCHARGECHECKLIST);
		result.add(DISCHARGE);
		result.add(DISCHARGE_PLANNING);
		result.add(ASSESSMENTTOOL);
		result.add(DPP);
		result.add(FALLSRISK);
		result.add(ADL);
		result.add(SKIN);
		result.add(BLAD);
		result.add(BWEL);
		result.add(MOB);
		result.add(WC);
		result.add(COM);
		result.add(DIS);
		result.add(PSY);
		result.add(NURSEDISCHARGECHKLST);
		result.add(PREOPPOSSUM);
		result.add(OPERATIVEDETAILSPOSSUM);
		result.add(TURNING_POINT_ASSESSMENTS);
		result.add(INTROPHONECALL);
		result.add(MANCHESTERTRIAGE);
		return result;
	}
	public static UserDefinedAssessmentType[] getNegativeInstances()
	{
		UserDefinedAssessmentType[] instances = new UserDefinedAssessmentType[30];
		instances[0] = GRAPHICAL;
		instances[1] = ANNOTATEDIMAGEWITHQUESTIONS;
		instances[2] = PAINASSESSMENT;
		instances[3] = ANNOTATEDIMAGE;
		instances[4] = MEDICALNOTING;
		instances[5] = ANNOTATEDIMAGEWITHREVIEWS;
		instances[6] = SKINASSESSMENT;
		instances[7] = QUESTIONBASEDASSESSMENT;
		instances[8] = USERDEFINEDDATASHEET;
		instances[9] = DISCHARGECHECKLIST;
		instances[10] = DISCHARGE;
		instances[11] = DISCHARGE_PLANNING;
		instances[12] = ASSESSMENTTOOL;
		instances[13] = DPP;
		instances[14] = FALLSRISK;
		instances[15] = ADL;
		instances[16] = SKIN;
		instances[17] = BLAD;
		instances[18] = BWEL;
		instances[19] = MOB;
		instances[20] = WC;
		instances[21] = COM;
		instances[22] = DIS;
		instances[23] = PSY;
		instances[24] = NURSEDISCHARGECHKLST;
		instances[25] = PREOPPOSSUM;
		instances[26] = OPERATIVEDETAILSPOSSUM;
		instances[27] = TURNING_POINT_ASSESSMENTS;
		instances[28] = INTROPHONECALL;
		instances[29] = MANCHESTERTRIAGE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[30];
		negativeInstances[0] = "GRAPHICAL";
		negativeInstances[1] = "ANNOTATEDIMAGEWITHQUESTIONS";
		negativeInstances[2] = "PAINASSESSMENT";
		negativeInstances[3] = "ANNOTATEDIMAGE";
		negativeInstances[4] = "MEDICALNOTING";
		negativeInstances[5] = "ANNOTATEDIMAGEWITHREVIEWS";
		negativeInstances[6] = "SKINASSESSMENT";
		negativeInstances[7] = "QUESTIONBASEDASSESSMENT";
		negativeInstances[8] = "USERDEFINEDDATASHEET";
		negativeInstances[9] = "DISCHARGECHECKLIST";
		negativeInstances[10] = "DISCHARGE";
		negativeInstances[11] = "DISCHARGE_PLANNING";
		negativeInstances[12] = "ASSESSMENTTOOL";
		negativeInstances[13] = "DPP";
		negativeInstances[14] = "FALLSRISK";
		negativeInstances[15] = "ADL";
		negativeInstances[16] = "SKIN";
		negativeInstances[17] = "BLAD";
		negativeInstances[18] = "BWEL";
		negativeInstances[19] = "MOB";
		negativeInstances[20] = "WC";
		negativeInstances[21] = "COM";
		negativeInstances[22] = "DIS";
		negativeInstances[23] = "PSY";
		negativeInstances[24] = "NURSEDISCHARGECHKLST";
		negativeInstances[25] = "PREOPPOSSUM";
		negativeInstances[26] = "OPERATIVEDETAILSPOSSUM";
		negativeInstances[27] = "TURNING_POINT_ASSESSMENTS";
		negativeInstances[28] = "INTROPHONECALL";
		negativeInstances[29] = "MANCHESTERTRIAGE";
		return negativeInstances;
	}
	public static UserDefinedAssessmentType getNegativeInstance(String name)
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
	public static UserDefinedAssessmentType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		UserDefinedAssessmentType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021137;
	public static final UserDefinedAssessmentType GRAPHICAL = new UserDefinedAssessmentType(-777, "Graphical", true, null, null, Color.Default);
	public static final UserDefinedAssessmentType ANNOTATEDIMAGEWITHQUESTIONS = new UserDefinedAssessmentType(-725, "Graphical Assessment with Questions", true, UserDefinedAssessmentType.GRAPHICAL, null, Color.Default);
	public static final UserDefinedAssessmentType PAINASSESSMENT = new UserDefinedAssessmentType(-979, "Pain Assessment", true, UserDefinedAssessmentType.ANNOTATEDIMAGEWITHQUESTIONS, null, Color.Default);
	public static final UserDefinedAssessmentType ANNOTATEDIMAGE = new UserDefinedAssessmentType(-679, "Graphical Assessment", true, UserDefinedAssessmentType.GRAPHICAL, null, Color.Default);
	public static final UserDefinedAssessmentType MEDICALNOTING = new UserDefinedAssessmentType(-1123, "Medical Noting Graphic", true, UserDefinedAssessmentType.ANNOTATEDIMAGE, null, Color.Default);
	public static final UserDefinedAssessmentType ANNOTATEDIMAGEWITHREVIEWS = new UserDefinedAssessmentType(-1042, "Graphical Assessment with Reviews", true, UserDefinedAssessmentType.GRAPHICAL, null, Color.Default);
	public static final UserDefinedAssessmentType SKINASSESSMENT = new UserDefinedAssessmentType(-980, "Wound Assessment", true, UserDefinedAssessmentType.ANNOTATEDIMAGEWITHREVIEWS, null, Color.Default);
	public static final UserDefinedAssessmentType QUESTIONBASEDASSESSMENT = new UserDefinedAssessmentType(-778, "QuestionBasedAssessment", true, null, null, Color.Default);
	public static final UserDefinedAssessmentType USERDEFINEDDATASHEET = new UserDefinedAssessmentType(-680, "Non Scoring Assessment", true, UserDefinedAssessmentType.QUESTIONBASEDASSESSMENT, null, Color.Default);
	public static final UserDefinedAssessmentType DISCHARGECHECKLIST = new UserDefinedAssessmentType(-1027, "Discharge Checklist", true, UserDefinedAssessmentType.USERDEFINEDDATASHEET, null, Color.Default);
	public static final UserDefinedAssessmentType DISCHARGE = new UserDefinedAssessmentType(-1133, "Nursing Discharge", true, UserDefinedAssessmentType.USERDEFINEDDATASHEET, null, Color.Default);
	public static final UserDefinedAssessmentType DISCHARGE_PLANNING = new UserDefinedAssessmentType(-1134, "Nursing Discharge Planning", true, UserDefinedAssessmentType.USERDEFINEDDATASHEET, null, Color.Default);
	public static final UserDefinedAssessmentType ASSESSMENTTOOL = new UserDefinedAssessmentType(-678, "Scoring Assessment", true, UserDefinedAssessmentType.QUESTIONBASEDASSESSMENT, null, Color.Default);
	public static final UserDefinedAssessmentType DPP = new UserDefinedAssessmentType(-1028, "Daily Patient Progress", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType FALLSRISK = new UserDefinedAssessmentType(-1099, "Patient Falls Risk Assessment", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType ADL = new UserDefinedAssessmentType(-1144, "Activities of Daily Living ", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType SKIN = new UserDefinedAssessmentType(-1145, "Skin Management", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType BLAD = new UserDefinedAssessmentType(-1146, "Bladder Management", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType BWEL = new UserDefinedAssessmentType(-1147, "Bowel Management", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType MOB = new UserDefinedAssessmentType(-1148, "Mobility", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType WC = new UserDefinedAssessmentType(-1149, "Wheelchair and Equipment", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType COM = new UserDefinedAssessmentType(-1150, "Community Preparation", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType DIS = new UserDefinedAssessmentType(-1151, "Discharge Coordination", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType PSY = new UserDefinedAssessmentType(-1152, "Psychological Issues", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType NURSEDISCHARGECHKLST = new UserDefinedAssessmentType(-1153, "Nursing Discharge Checklist", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType PREOPPOSSUM = new UserDefinedAssessmentType(-1205, "PREOPPOSSUM", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType OPERATIVEDETAILSPOSSUM = new UserDefinedAssessmentType(-1206, "OPERATIVEDETAILSPOSSUM", true, UserDefinedAssessmentType.ASSESSMENTTOOL, null, Color.Default);
	public static final UserDefinedAssessmentType TURNING_POINT_ASSESSMENTS = new UserDefinedAssessmentType(-1482, "Turning Point Assessments", true, UserDefinedAssessmentType.QUESTIONBASEDASSESSMENT, null, Color.Default);
	public static final UserDefinedAssessmentType INTROPHONECALL = new UserDefinedAssessmentType(-1483, "Introductory Phone Call", true, UserDefinedAssessmentType.TURNING_POINT_ASSESSMENTS, null, Color.Default);
	public static final UserDefinedAssessmentType MANCHESTERTRIAGE = new UserDefinedAssessmentType(-1222, "Manchester Triage Protocol", true, null, null, Color.Default);
}
