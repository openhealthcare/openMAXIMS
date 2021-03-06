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

package ims.pathways.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class TargetDateCalculation extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public TargetDateCalculation()
	{
		super();
	}
	public TargetDateCalculation(int id)
	{
		super(id, "", true);
	}
	public TargetDateCalculation(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public TargetDateCalculation(int id, String text, boolean active, TargetDateCalculation parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public TargetDateCalculation(int id, String text, boolean active, TargetDateCalculation parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public TargetDateCalculation(int id, String text, boolean active, TargetDateCalculation parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static TargetDateCalculation buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new TargetDateCalculation(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (TargetDateCalculation)super.getParentInstance();
	}
	public TargetDateCalculation getParent()
	{
		return (TargetDateCalculation)super.getParentInstance();
	}
	public void setParent(TargetDateCalculation parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		TargetDateCalculation[] typedChildren = new TargetDateCalculation[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (TargetDateCalculation)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof TargetDateCalculation)
		{
			super.addChild((TargetDateCalculation)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof TargetDateCalculation)
		{
			super.removeChild((TargetDateCalculation)child);
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
		TargetDateCalculationCollection result = new TargetDateCalculationCollection();
		result.add(PATHWAY_START);
		result.add(INSTANTIATING_EVENT);
		return result;
	}
	public static TargetDateCalculation[] getNegativeInstances()
	{
		TargetDateCalculation[] instances = new TargetDateCalculation[2];
		instances[0] = PATHWAY_START;
		instances[1] = INSTANTIATING_EVENT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "PATHWAY_START";
		negativeInstances[1] = "INSTANTIATING_EVENT";
		return negativeInstances;
	}
	public static TargetDateCalculation getNegativeInstance(String name)
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
	public static TargetDateCalculation getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		TargetDateCalculation[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1321012;
	public static final TargetDateCalculation PATHWAY_START = new TargetDateCalculation(-1674, "Start of Pathway", true, null, null, Color.Default);
	public static final TargetDateCalculation INSTANTIATING_EVENT = new TargetDateCalculation(-1675, "Instantiating Event", true, null, null, Color.Default);
}
