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

public class EventStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public EventStatus()
	{
		super();
	}
	public EventStatus(int id)
	{
		super(id, "", true);
	}
	public EventStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public EventStatus(int id, String text, boolean active, EventStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public EventStatus(int id, String text, boolean active, EventStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public EventStatus(int id, String text, boolean active, EventStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static EventStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new EventStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (EventStatus)super.getParentInstance();
	}
	public EventStatus getParent()
	{
		return (EventStatus)super.getParentInstance();
	}
	public void setParent(EventStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		EventStatus[] typedChildren = new EventStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (EventStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof EventStatus)
		{
			super.addChild((EventStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof EventStatus)
		{
			super.removeChild((EventStatus)child);
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
		EventStatusCollection result = new EventStatusCollection();
		result.add(ACTIVE);
		result.add(RIE);
		result.add(CANCELLED_EVT);
		result.add(UNLINKED_EVT);
		return result;
	}
	public static EventStatus[] getNegativeInstances()
	{
		EventStatus[] instances = new EventStatus[4];
		instances[0] = ACTIVE;
		instances[1] = RIE;
		instances[2] = CANCELLED_EVT;
		instances[3] = UNLINKED_EVT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[4];
		negativeInstances[0] = "ACTIVE";
		negativeInstances[1] = "RIE";
		negativeInstances[2] = "CANCELLED_EVT";
		negativeInstances[3] = "UNLINKED_EVT";
		return negativeInstances;
	}
	public static EventStatus getNegativeInstance(String name)
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
	public static EventStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		EventStatus[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1321007;
	public static final EventStatus ACTIVE = new EventStatus(-1337, "Active", true, null, null, Color.Default);
	public static final EventStatus RIE = new EventStatus(-1338, "RecordedInError", true, null, null, Color.Default);
	public static final EventStatus CANCELLED_EVT = new EventStatus(-1400, "Cancelled", true, null, null, Color.Default);
	public static final EventStatus UNLINKED_EVT = new EventStatus(-1760, "Unlinked", true, null, null, Color.Default);
}
