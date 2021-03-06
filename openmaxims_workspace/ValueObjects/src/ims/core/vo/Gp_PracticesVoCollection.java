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

package ims.core.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.resource.GpToPractice business object (ID: 1005100004).
 */
public class Gp_PracticesVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<Gp_PracticesVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<Gp_PracticesVo> col = new ArrayList<Gp_PracticesVo>();
	public String getBoClassName()
	{
		return "ims.core.resource.domain.objects.GpToPractice";
	}
	public boolean add(Gp_PracticesVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, Gp_PracticesVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(Gp_PracticesVo instance)
	{
		return col.indexOf(instance);
	}
	public Gp_PracticesVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, Gp_PracticesVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(Gp_PracticesVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(Gp_PracticesVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		Gp_PracticesVoCollection clone = new Gp_PracticesVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((Gp_PracticesVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public Gp_PracticesVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public Gp_PracticesVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public Gp_PracticesVoCollection sort(SortOrder order)
	{
		return sort(new Gp_PracticesVoComparator(order));
	}
	public Gp_PracticesVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new Gp_PracticesVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public Gp_PracticesVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.resource.vo.GpToPracticeRefVoCollection toRefVoCollection()
	{
		ims.core.resource.vo.GpToPracticeRefVoCollection result = new ims.core.resource.vo.GpToPracticeRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public Gp_PracticesVo[] toArray()
	{
		Gp_PracticesVo[] arr = new Gp_PracticesVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<Gp_PracticesVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class Gp_PracticesVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public Gp_PracticesVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public Gp_PracticesVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public Gp_PracticesVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			Gp_PracticesVo voObj1 = (Gp_PracticesVo)obj1;
			Gp_PracticesVo voObj2 = (Gp_PracticesVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.core.vo.beans.Gp_PracticesVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.core.vo.beans.Gp_PracticesVoBean[] getBeanCollectionArray()
	{
		ims.core.vo.beans.Gp_PracticesVoBean[] result = new ims.core.vo.beans.Gp_PracticesVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			Gp_PracticesVo vo = ((Gp_PracticesVo)col.get(i));
			result[i] = (ims.core.vo.beans.Gp_PracticesVoBean)vo.getBean();
		}
		return result;
	}
	public static Gp_PracticesVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		Gp_PracticesVoCollection coll = new Gp_PracticesVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.core.vo.beans.Gp_PracticesVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static Gp_PracticesVoCollection buildFromBeanCollection(ims.core.vo.beans.Gp_PracticesVoBean[] beans)
	{
		Gp_PracticesVoCollection coll = new Gp_PracticesVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
