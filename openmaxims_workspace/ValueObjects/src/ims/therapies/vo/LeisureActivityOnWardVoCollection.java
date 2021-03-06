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

package ims.therapies.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to therapies.workLeisureDriving.LeisureActivityOnWard business object (ID: 1019100070).
 */
public class LeisureActivityOnWardVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<LeisureActivityOnWardVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<LeisureActivityOnWardVo> col = new ArrayList<LeisureActivityOnWardVo>();
	public String getBoClassName()
	{
		return "ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard";
	}
	public boolean add(LeisureActivityOnWardVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, LeisureActivityOnWardVo value)
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
	public int indexOf(LeisureActivityOnWardVo instance)
	{
		return col.indexOf(instance);
	}
	public LeisureActivityOnWardVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, LeisureActivityOnWardVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(LeisureActivityOnWardVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(LeisureActivityOnWardVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		LeisureActivityOnWardVoCollection clone = new LeisureActivityOnWardVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((LeisureActivityOnWardVo)this.col.get(x).clone());
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
	public LeisureActivityOnWardVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public LeisureActivityOnWardVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public LeisureActivityOnWardVoCollection sort(SortOrder order)
	{
		return sort(new LeisureActivityOnWardVoComparator(order));
	}
	public LeisureActivityOnWardVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new LeisureActivityOnWardVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public LeisureActivityOnWardVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.therapies.workleisuredriving.vo.LeisureActivityOnWardRefVoCollection toRefVoCollection()
	{
		ims.therapies.workleisuredriving.vo.LeisureActivityOnWardRefVoCollection result = new ims.therapies.workleisuredriving.vo.LeisureActivityOnWardRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public LeisureActivityOnWardVo[] toArray()
	{
		LeisureActivityOnWardVo[] arr = new LeisureActivityOnWardVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<LeisureActivityOnWardVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class LeisureActivityOnWardVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public LeisureActivityOnWardVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public LeisureActivityOnWardVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public LeisureActivityOnWardVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			LeisureActivityOnWardVo voObj1 = (LeisureActivityOnWardVo)obj1;
			LeisureActivityOnWardVo voObj2 = (LeisureActivityOnWardVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.therapies.vo.beans.LeisureActivityOnWardVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.therapies.vo.beans.LeisureActivityOnWardVoBean[] getBeanCollectionArray()
	{
		ims.therapies.vo.beans.LeisureActivityOnWardVoBean[] result = new ims.therapies.vo.beans.LeisureActivityOnWardVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			LeisureActivityOnWardVo vo = ((LeisureActivityOnWardVo)col.get(i));
			result[i] = (ims.therapies.vo.beans.LeisureActivityOnWardVoBean)vo.getBean();
		}
		return result;
	}
	public static LeisureActivityOnWardVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		LeisureActivityOnWardVoCollection coll = new LeisureActivityOnWardVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.therapies.vo.beans.LeisureActivityOnWardVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static LeisureActivityOnWardVoCollection buildFromBeanCollection(ims.therapies.vo.beans.LeisureActivityOnWardVoBean[] beans)
	{
		LeisureActivityOnWardVoCollection coll = new LeisureActivityOnWardVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
