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

package ims.racpc.forms.racpcsymptomandriskfactor;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.racpc.domain.RACPCSymptomAndRiskFactor.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.racpc.domain.RACPCSymptomAndRiskFactor domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbAlcoholValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbAlcohol().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.UnitsPerWeek existingInstance = (ims.core.vo.lookups.UnitsPerWeek)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbAlcoholLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.UnitsPerWeek)
		{
			ims.core.vo.lookups.UnitsPerWeek instance = (ims.core.vo.lookups.UnitsPerWeek)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbAlcoholLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.UnitsPerWeek existingInstance = (ims.core.vo.lookups.UnitsPerWeek)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbAlcohol().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbAlcoholLookup()
	{
		this.form.cmbAlcohol().clear();
		ims.core.vo.lookups.UnitsPerWeekCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getUnitsPerWeek(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbAlcohol().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbAlcoholLookupValue(int id)
	{
		ims.core.vo.lookups.UnitsPerWeek instance = ims.core.vo.lookups.LookupHelper.getUnitsPerWeekInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbAlcohol().setValue(instance);
	}
	protected final void defaultcmbAlcoholLookupValue()
	{
		this.form.cmbAlcohol().setValue((ims.core.vo.lookups.UnitsPerWeek)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.UnitsPerWeek.class, engine.getFormName().getID(), ims.core.vo.lookups.UnitsPerWeek.TYPE_ID));
	}
	protected final void oncmbDiabetesValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbDiabetes().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.DiabetesStatus existingInstance = (ims.clinical.vo.lookups.DiabetesStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDiabetesLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.DiabetesStatus)
		{
			ims.clinical.vo.lookups.DiabetesStatus instance = (ims.clinical.vo.lookups.DiabetesStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDiabetesLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.DiabetesStatus existingInstance = (ims.clinical.vo.lookups.DiabetesStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbDiabetes().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDiabetesLookup()
	{
		this.form.cmbDiabetes().clear();
		ims.clinical.vo.lookups.DiabetesStatusCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getDiabetesStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbDiabetes().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDiabetesLookupValue(int id)
	{
		ims.clinical.vo.lookups.DiabetesStatus instance = ims.clinical.vo.lookups.LookupHelper.getDiabetesStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbDiabetes().setValue(instance);
	}
	protected final void defaultcmbDiabetesLookupValue()
	{
		this.form.cmbDiabetes().setValue((ims.clinical.vo.lookups.DiabetesStatus)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.DiabetesStatus.class, engine.getFormName().getID(), ims.clinical.vo.lookups.DiabetesStatus.TYPE_ID));
	}
	protected final void oncmbSmokerValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSmoker().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SmokingStatus existingInstance = (ims.core.vo.lookups.SmokingStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSmokerLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SmokingStatus)
		{
			ims.core.vo.lookups.SmokingStatus instance = (ims.core.vo.lookups.SmokingStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSmokerLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SmokingStatus existingInstance = (ims.core.vo.lookups.SmokingStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSmoker().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSmokerLookup()
	{
		this.form.cmbSmoker().clear();
		ims.core.vo.lookups.SmokingStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSmokingStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSmoker().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSmokerLookupValue(int id)
	{
		ims.core.vo.lookups.SmokingStatus instance = ims.core.vo.lookups.LookupHelper.getSmokingStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSmoker().setValue(instance);
	}
	protected final void defaultcmbSmokerLookupValue()
	{
		this.form.cmbSmoker().setValue((ims.core.vo.lookups.SmokingStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SmokingStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.SmokingStatus.TYPE_ID));
	}
	protected final void oncmbDurationValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbDuration().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.SymptomDuration existingInstance = (ims.clinical.vo.lookups.SymptomDuration)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDurationLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.SymptomDuration)
		{
			ims.clinical.vo.lookups.SymptomDuration instance = (ims.clinical.vo.lookups.SymptomDuration)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDurationLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.SymptomDuration existingInstance = (ims.clinical.vo.lookups.SymptomDuration)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbDuration().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDurationLookup()
	{
		this.form.cmbDuration().clear();
		ims.clinical.vo.lookups.SymptomDurationCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getSymptomDuration(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbDuration().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDurationLookupValue(int id)
	{
		ims.clinical.vo.lookups.SymptomDuration instance = ims.clinical.vo.lookups.LookupHelper.getSymptomDurationInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbDuration().setValue(instance);
	}
	protected final void defaultcmbDurationLookupValue()
	{
		this.form.cmbDuration().setValue((ims.clinical.vo.lookups.SymptomDuration)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.SymptomDuration.class, engine.getFormName().getID(), ims.clinical.vo.lookups.SymptomDuration.TYPE_ID));
	}
	protected final void bindgrdSymptomscolSympLookup()
	{
		this.form.grdSymptoms().colSympComboBox().clear();
		ims.core.vo.lookups.RACPSymptomCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getRACPSymptom(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdSymptoms().colSympComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.racpc.domain.RACPCSymptomAndRiskFactor domain;
}
