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

package ims.coe.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to nursing.assessment.Eating Manual Dexterity business object (ID: 1012100023).
 */
public class ManualDexterityCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ManualDexterity>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ManualDexterity> col = new ArrayList<ManualDexterity>();
	public String getBoClassName()
	{
		return "ims.nursing.assessment.domain.objects.EatingManualDexterity";
	}
	public boolean add(ManualDexterity value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ManualDexterity value)
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
	public int indexOf(ManualDexterity instance)
	{
		return col.indexOf(instance);
	}
	public ManualDexterity get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ManualDexterity value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ManualDexterity instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ManualDexterity instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ManualDexterityCollection clone = new ManualDexterityCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ManualDexterity)this.col.get(x).clone());
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
	public ManualDexterityCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ManualDexterityCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ManualDexterityCollection sort(SortOrder order)
	{
		return sort(new ManualDexterityComparator(order));
	}
	public ManualDexterityCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ManualDexterityComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ManualDexterityCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.nursing.assessment.vo.EatingManualDexterityRefVoCollection toRefVoCollection()
	{
		ims.nursing.assessment.vo.EatingManualDexterityRefVoCollection result = new ims.nursing.assessment.vo.EatingManualDexterityRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public ManualDexterity[] toArray()
	{
		ManualDexterity[] arr = new ManualDexterity[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ManualDexterity> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ManualDexterityComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ManualDexterityComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ManualDexterityComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ManualDexterityComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ManualDexterity voObj1 = (ManualDexterity)obj1;
			ManualDexterity voObj2 = (ManualDexterity)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.coe.vo.beans.ManualDexterityBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.coe.vo.beans.ManualDexterityBean[] getBeanCollectionArray()
	{
		ims.coe.vo.beans.ManualDexterityBean[] result = new ims.coe.vo.beans.ManualDexterityBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ManualDexterity vo = ((ManualDexterity)col.get(i));
			result[i] = (ims.coe.vo.beans.ManualDexterityBean)vo.getBean();
		}
		return result;
	}
	public static ManualDexterityCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ManualDexterityCollection coll = new ManualDexterityCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.coe.vo.beans.ManualDexterityBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ManualDexterityCollection buildFromBeanCollection(ims.coe.vo.beans.ManualDexterityBean[] beans)
	{
		ManualDexterityCollection coll = new ManualDexterityCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
