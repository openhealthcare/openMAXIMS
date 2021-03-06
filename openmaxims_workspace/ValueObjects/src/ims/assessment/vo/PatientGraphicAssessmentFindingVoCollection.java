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

package ims.assessment.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to Assessment.Instantiation.PatientGraphicAssessmentFinding business object (ID: 1003100051).
 */
public class PatientGraphicAssessmentFindingVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<PatientGraphicAssessmentFindingVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PatientGraphicAssessmentFindingVo> col = new ArrayList<PatientGraphicAssessmentFindingVo>();
	public String getBoClassName()
	{
		return "ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding";
	}
	public boolean add(PatientGraphicAssessmentFindingVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PatientGraphicAssessmentFindingVo value)
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
	public int indexOf(PatientGraphicAssessmentFindingVo instance)
	{
		return col.indexOf(instance);
	}
	public PatientGraphicAssessmentFindingVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PatientGraphicAssessmentFindingVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PatientGraphicAssessmentFindingVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PatientGraphicAssessmentFindingVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PatientGraphicAssessmentFindingVoCollection clone = new PatientGraphicAssessmentFindingVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PatientGraphicAssessmentFindingVo)this.col.get(x).clone());
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
	public PatientGraphicAssessmentFindingVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PatientGraphicAssessmentFindingVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public PatientGraphicAssessmentFindingVoCollection sort(SortOrder order)
	{
		return sort(new PatientGraphicAssessmentFindingVoComparator(order));
	}
	public PatientGraphicAssessmentFindingVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new PatientGraphicAssessmentFindingVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public PatientGraphicAssessmentFindingVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.assessment.instantiation.vo.PatientGraphicAssessmentFindingRefVoCollection toRefVoCollection()
	{
		ims.assessment.instantiation.vo.PatientGraphicAssessmentFindingRefVoCollection result = new ims.assessment.instantiation.vo.PatientGraphicAssessmentFindingRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public PatientGraphicAssessmentFindingVo[] toArray()
	{
		PatientGraphicAssessmentFindingVo[] arr = new PatientGraphicAssessmentFindingVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<PatientGraphicAssessmentFindingVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PatientGraphicAssessmentFindingVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public PatientGraphicAssessmentFindingVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PatientGraphicAssessmentFindingVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public PatientGraphicAssessmentFindingVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			PatientGraphicAssessmentFindingVo voObj1 = (PatientGraphicAssessmentFindingVo)obj1;
			PatientGraphicAssessmentFindingVo voObj2 = (PatientGraphicAssessmentFindingVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean[] getBeanCollectionArray()
	{
		ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean[] result = new ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			PatientGraphicAssessmentFindingVo vo = ((PatientGraphicAssessmentFindingVo)col.get(i));
			result[i] = (ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean)vo.getBean();
		}
		return result;
	}
	public static PatientGraphicAssessmentFindingVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		PatientGraphicAssessmentFindingVoCollection coll = new PatientGraphicAssessmentFindingVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static PatientGraphicAssessmentFindingVoCollection buildFromBeanCollection(ims.assessment.vo.beans.PatientGraphicAssessmentFindingVoBean[] beans)
	{
		PatientGraphicAssessmentFindingVoCollection coll = new PatientGraphicAssessmentFindingVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
