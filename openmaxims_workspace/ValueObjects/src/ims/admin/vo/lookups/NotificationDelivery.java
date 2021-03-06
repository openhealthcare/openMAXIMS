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

package ims.admin.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class NotificationDelivery extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public NotificationDelivery()
	{
		super();
	}
	public NotificationDelivery(int id)
	{
		super(id, "", true);
	}
	public NotificationDelivery(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public NotificationDelivery(int id, String text, boolean active, NotificationDelivery parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public NotificationDelivery(int id, String text, boolean active, NotificationDelivery parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public NotificationDelivery(int id, String text, boolean active, NotificationDelivery parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static NotificationDelivery buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new NotificationDelivery(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (NotificationDelivery)super.getParentInstance();
	}
	public NotificationDelivery getParent()
	{
		return (NotificationDelivery)super.getParentInstance();
	}
	public void setParent(NotificationDelivery parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		NotificationDelivery[] typedChildren = new NotificationDelivery[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (NotificationDelivery)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof NotificationDelivery)
		{
			super.addChild((NotificationDelivery)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof NotificationDelivery)
		{
			super.removeChild((NotificationDelivery)child);
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
		NotificationDeliveryCollection result = new NotificationDeliveryCollection();
		result.add(UI);
		result.add(EMAIL);
		result.add(PUSH);
		result.add(SMS);
		return result;
	}
	public static NotificationDelivery[] getNegativeInstances()
	{
		NotificationDelivery[] instances = new NotificationDelivery[4];
		instances[0] = UI;
		instances[1] = EMAIL;
		instances[2] = PUSH;
		instances[3] = SMS;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[4];
		negativeInstances[0] = "UI";
		negativeInstances[1] = "EMAIL";
		negativeInstances[2] = "PUSH";
		negativeInstances[3] = "SMS";
		return negativeInstances;
	}
	public static NotificationDelivery getNegativeInstance(String name)
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
	public static NotificationDelivery getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		NotificationDelivery[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1031019;
	public static final NotificationDelivery UI = new NotificationDelivery(-2100, "UI", true, null, null, Color.Default);
	public static final NotificationDelivery EMAIL = new NotificationDelivery(-2101, "E-Mail", true, null, null, Color.Default);
	public static final NotificationDelivery PUSH = new NotificationDelivery(-2102, "Push", true, null, null, Color.Default);
	public static final NotificationDelivery SMS = new NotificationDelivery(-2109, "SMS", true, null, null, Color.Default);
}
