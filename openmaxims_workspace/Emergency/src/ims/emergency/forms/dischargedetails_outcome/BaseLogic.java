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

package ims.emergency.forms.dischargedetails_outcome;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.emergency.domain.DischargeDetails_Outcome.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.emergency.domain.DischargeDetails_Outcome domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbOutcomeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbOutcome().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.AttendanceOutcome existingInstance = (ims.emergency.vo.lookups.AttendanceOutcome)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbOutcomeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.emergency.vo.lookups.AttendanceOutcome)
		{
			ims.emergency.vo.lookups.AttendanceOutcome instance = (ims.emergency.vo.lookups.AttendanceOutcome)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbOutcomeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.AttendanceOutcome existingInstance = (ims.emergency.vo.lookups.AttendanceOutcome)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbOutcome().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbOutcomeLookup()
	{
		this.form.cmbOutcome().clear();
		ims.emergency.vo.lookups.AttendanceOutcomeCollection lookupCollection = ims.emergency.vo.lookups.LookupHelper.getAttendanceOutcome(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbOutcome().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbOutcomeLookupValue(int id)
	{
		ims.emergency.vo.lookups.AttendanceOutcome instance = ims.emergency.vo.lookups.LookupHelper.getAttendanceOutcomeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbOutcome().setValue(instance);
	}
	protected final void defaultcmbOutcomeLookupValue()
	{
		this.form.cmbOutcome().setValue((ims.emergency.vo.lookups.AttendanceOutcome)domain.getLookupService().getDefaultInstance(ims.emergency.vo.lookups.AttendanceOutcome.class, engine.getFormName().getID(), ims.emergency.vo.lookups.AttendanceOutcome.TYPE_ID));
	}
	protected final void oncmbCategoryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbCategory().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.PatientCategory existingInstance = (ims.emergency.vo.lookups.PatientCategory)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCategoryLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.emergency.vo.lookups.PatientCategory)
		{
			ims.emergency.vo.lookups.PatientCategory instance = (ims.emergency.vo.lookups.PatientCategory)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCategoryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.PatientCategory existingInstance = (ims.emergency.vo.lookups.PatientCategory)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbCategory().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCategoryLookup()
	{
		this.form.cmbCategory().clear();
		ims.emergency.vo.lookups.PatientCategoryCollection lookupCollection = ims.emergency.vo.lookups.LookupHelper.getPatientCategory(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbCategory().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCategoryLookupValue(int id)
	{
		ims.emergency.vo.lookups.PatientCategory instance = ims.emergency.vo.lookups.LookupHelper.getPatientCategoryInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbCategory().setValue(instance);
	}
	protected final void defaultcmbCategoryLookupValue()
	{
		this.form.cmbCategory().setValue((ims.emergency.vo.lookups.PatientCategory)domain.getLookupService().getDefaultInstance(ims.emergency.vo.lookups.PatientCategory.class, engine.getFormName().getID(), ims.emergency.vo.lookups.PatientCategory.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.emergency.domain.DischargeDetails_Outcome domain;
}
