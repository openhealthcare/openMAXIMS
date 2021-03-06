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

package ims.scheduling.forms.profiles;

public abstract class BaseLogic extends Handlers
{
	private java.util.ArrayList lookupUsageErrors;

	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.scheduling.domain.Profiles.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.scheduling.domain.Profiles domain)
	{
		setContext(engine, form);
		this.domain = domain;
		if(domain.getLookupService().countLookupInstances(ims.scheduling.vo.lookups.Sched_Prfile_CatCollection.class, ims.scheduling.vo.lookups.Sched_Prfile_Cat.class, 1141001, true) == 0)
		{
			if(lookupUsageErrors == null)
				lookupUsageErrors = new java.util.ArrayList();
			lookupUsageErrors.add("The lookup type 'Sched_Prfile_Cat' (ID: 1141001) must have at least one active instance configured.");
		}
	}
	public final String[] getLookupUsageErrors()
	{
		if(lookupUsageErrors == null)
			return null;
		String[] errors = new String[lookupUsageErrors.size()];
		for(int x = 0; x < lookupUsageErrors.size(); x++)
		{
			errors[x] = (String)lookupUsageErrors.get(x);
		}
		return errors;
	}
	public void clearContextInformation()
	{
		engine.clearPatientContextInformation();
	}
	protected final void oncmbConsMediaTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabGeneralDetails().cmbConsMediaType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.ConsultationMediaType existingInstance = (ims.scheduling.vo.lookups.ConsultationMediaType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbConsMediaTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.ConsultationMediaType)
		{
			ims.scheduling.vo.lookups.ConsultationMediaType instance = (ims.scheduling.vo.lookups.ConsultationMediaType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbConsMediaTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.ConsultationMediaType existingInstance = (ims.scheduling.vo.lookups.ConsultationMediaType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabGeneralDetails().cmbConsMediaType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbConsMediaTypeLookup()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbConsMediaType().clear();
		ims.scheduling.vo.lookups.ConsultationMediaTypeCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getConsultationMediaType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabGeneralDetails().cmbConsMediaType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbConsMediaTypeLookupValue(int id)
	{
		ims.scheduling.vo.lookups.ConsultationMediaType instance = ims.scheduling.vo.lookups.LookupHelper.getConsultationMediaTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabGeneralDetails().cmbConsMediaType().setValue(instance);
	}
	protected final void defaultcmbConsMediaTypeLookupValue()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbConsMediaType().setValue((ims.scheduling.vo.lookups.ConsultationMediaType)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.ConsultationMediaType.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.ConsultationMediaType.TYPE_ID));
	}
	protected final void oncmbSlotTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabGeneralDetails().cmbSlotType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.SlotType existingInstance = (ims.scheduling.vo.lookups.SlotType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSlotTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.SlotType)
		{
			ims.scheduling.vo.lookups.SlotType instance = (ims.scheduling.vo.lookups.SlotType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSlotTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.SlotType existingInstance = (ims.scheduling.vo.lookups.SlotType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabGeneralDetails().cmbSlotType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSlotTypeLookup()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbSlotType().clear();
		ims.scheduling.vo.lookups.SlotTypeCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getSlotType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabGeneralDetails().cmbSlotType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSlotTypeLookupValue(int id)
	{
		ims.scheduling.vo.lookups.SlotType instance = ims.scheduling.vo.lookups.LookupHelper.getSlotTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabGeneralDetails().cmbSlotType().setValue(instance);
	}
	protected final void defaultcmbSlotTypeLookupValue()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbSlotType().setValue((ims.scheduling.vo.lookups.SlotType)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.SlotType.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.SlotType.TYPE_ID));
	}
	protected final void oncmbTheatreTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.TheatreType existingInstance = (ims.scheduling.vo.lookups.TheatreType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTheatreTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.TheatreType)
		{
			ims.scheduling.vo.lookups.TheatreType instance = (ims.scheduling.vo.lookups.TheatreType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTheatreTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.TheatreType existingInstance = (ims.scheduling.vo.lookups.TheatreType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTheatreTypeLookup()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().clear();
		ims.scheduling.vo.lookups.TheatreTypeCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getTheatreType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTheatreTypeLookupValue(int id)
	{
		ims.scheduling.vo.lookups.TheatreType instance = ims.scheduling.vo.lookups.LookupHelper.getTheatreTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().setValue(instance);
	}
	protected final void defaultcmbTheatreTypeLookupValue()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().setValue((ims.scheduling.vo.lookups.TheatreType)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.TheatreType.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.TheatreType.TYPE_ID));
	}
	protected final void oncmbCategoryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabGeneralDetails().cmbCategory().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.Sched_Prfile_Cat existingInstance = (ims.scheduling.vo.lookups.Sched_Prfile_Cat)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCategoryLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.Sched_Prfile_Cat)
		{
			ims.scheduling.vo.lookups.Sched_Prfile_Cat instance = (ims.scheduling.vo.lookups.Sched_Prfile_Cat)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCategoryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.Sched_Prfile_Cat existingInstance = (ims.scheduling.vo.lookups.Sched_Prfile_Cat)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabGeneralDetails().cmbCategory().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCategoryLookup()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbCategory().clear();
		ims.scheduling.vo.lookups.Sched_Prfile_CatCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getSched_Prfile_Cat(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabGeneralDetails().cmbCategory().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCategoryLookupValue(int id)
	{
		ims.scheduling.vo.lookups.Sched_Prfile_Cat instance = ims.scheduling.vo.lookups.LookupHelper.getSched_Prfile_CatInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabGeneralDetails().cmbCategory().setValue(instance);
	}
	protected final void defaultcmbCategoryLookupValue()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbCategory().setValue((ims.scheduling.vo.lookups.Sched_Prfile_Cat)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.Sched_Prfile_Cat.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.Sched_Prfile_Cat.TYPE_ID));
	}
	protected final void oncmbIntervalTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabProfileDetails().cmbIntervalType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.Profile_Interval_Type existingInstance = (ims.scheduling.vo.lookups.Profile_Interval_Type)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbIntervalTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.Profile_Interval_Type)
		{
			ims.scheduling.vo.lookups.Profile_Interval_Type instance = (ims.scheduling.vo.lookups.Profile_Interval_Type)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbIntervalTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.Profile_Interval_Type existingInstance = (ims.scheduling.vo.lookups.Profile_Interval_Type)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabProfileDetails().cmbIntervalType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbIntervalTypeLookup()
	{
		this.form.lyrDetails().tabProfileDetails().cmbIntervalType().clear();
		ims.scheduling.vo.lookups.Profile_Interval_TypeCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getProfile_Interval_Type(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabProfileDetails().cmbIntervalType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbIntervalTypeLookupValue(int id)
	{
		ims.scheduling.vo.lookups.Profile_Interval_Type instance = ims.scheduling.vo.lookups.LookupHelper.getProfile_Interval_TypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabProfileDetails().cmbIntervalType().setValue(instance);
	}
	protected final void defaultcmbIntervalTypeLookupValue()
	{
		this.form.lyrDetails().tabProfileDetails().cmbIntervalType().setValue((ims.scheduling.vo.lookups.Profile_Interval_Type)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.Profile_Interval_Type.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.Profile_Interval_Type.TYPE_ID));
	}
	protected void clearScreen()
	{
		this.form.lyrDetails().tabGeneralDetails().cmbSlotType().setValue(null);
		this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().setValue(null);
		this.form.lyrDetails().tabGeneralDetails().chkTheatre().setValue(false);
		this.form.lyrDetails().tabGeneralDetails().cmbCategory().setValue(null);
		this.form.lyrDetails().tabGeneralDetails().cmbSpeciality().setValue(null);
		this.form.lyrDetails().tabGeneralDetails().chkProfileActive().setValue(false);
		this.form.lyrDetails().tabGeneralDetails().chkContractArrange().setValue(false);
		this.form.lyrDetails().tabGeneralDetails().txtProfileName().setValue("");
		this.form.lyrDetails().tabProfileDetails().chkTuesday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkWednesday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkThursday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkFriday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkSaturday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkSunday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkMonday().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkTwo().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkThree().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkFour().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkFive().setValue(false);
		this.form.lyrDetails().tabProfileDetails().chkOne().setValue(false);
		this.form.lyrDetails().tabProfileDetails().timEndTime().setValue(null);
		this.form.lyrDetails().tabProfileDetails().timStartTime().setValue(null);
		this.form.lyrDetails().tabProfileDetails().intIntSize().setValue(null);
		this.form.lyrDetails().tabProfileDetails().cmbIntervalType().setValue(null);
		this.form.lyrDetails().tabProfileDetails().dteEndDate().setValue(null);
		this.form.lyrDetails().tabProfileDetails().dteStartDate().setValue(null);
	}
	protected void populateScreenFromData(ims.scheduling.vo.Sch_ProfileGenericVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.lyrDetails().tabGeneralDetails().cmbSlotType().setValue(value.getSlotTypeIsNotNull() ? value.getSlotType() : null);
		this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().setValue(value.getTheatreTypeIsNotNull() ? value.getTheatreType() : null);
		if(value.getIsTheatreProfileIsNotNull())
			this.form.lyrDetails().tabGeneralDetails().chkTheatre().setValue(value.getIsTheatreProfile().booleanValue());
		this.form.lyrDetails().tabGeneralDetails().cmbCategory().setValue(value.getPrfCategoryIsNotNull() ? value.getPrfCategory() : null);
		this.form.lyrDetails().tabGeneralDetails().cmbSpeciality().setValue(value.getServiceIsNotNull() ? value.getService() : null);
		if(value.getIsActiveIsNotNull())
			this.form.lyrDetails().tabGeneralDetails().chkProfileActive().setValue(value.getIsActive().booleanValue());
		if(value.getIsUnderContractIsNotNull())
			this.form.lyrDetails().tabGeneralDetails().chkContractArrange().setValue(value.getIsUnderContract().booleanValue());
		this.form.lyrDetails().tabGeneralDetails().txtProfileName().setValue(value.getNameIsNotNull() ? value.getName(): null);
		if(value.getIsSchTueIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkTuesday().setValue(value.getIsSchTue().booleanValue());
		if(value.getIsSchWedIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkWednesday().setValue(value.getIsSchWed().booleanValue());
		if(value.getIsSchThurIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkThursday().setValue(value.getIsSchThur().booleanValue());
		if(value.getIsSchFriIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkFriday().setValue(value.getIsSchFri().booleanValue());
		if(value.getIsSchSatIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkSaturday().setValue(value.getIsSchSat().booleanValue());
		if(value.getIsSchSunIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkSunday().setValue(value.getIsSchSun().booleanValue());
		if(value.getIsSchMonIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkMonday().setValue(value.getIsSchMon().booleanValue());
		if(value.getIsSecondInstanceIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkTwo().setValue(value.getIsSecondInstance().booleanValue());
		if(value.getIsThirdInstanceIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkThree().setValue(value.getIsThirdInstance().booleanValue());
		if(value.getIsFourthInstanceIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkFour().setValue(value.getIsFourthInstance().booleanValue());
		if(value.getIsFifthInstanceIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkFive().setValue(value.getIsFifthInstance().booleanValue());
		if(value.getIsFirstInstanceIsNotNull())
			this.form.lyrDetails().tabProfileDetails().chkOne().setValue(value.getIsFirstInstance().booleanValue());
		this.form.lyrDetails().tabProfileDetails().timEndTime().setValue(value.getEndTmIsNotNull() ? value.getEndTm() : null);
		this.form.lyrDetails().tabProfileDetails().timStartTime().setValue(value.getStartTmIsNotNull() ? value.getStartTm() : null);
		this.form.lyrDetails().tabProfileDetails().intIntSize().setValue(value.getIntervalSizeIsNotNull() ? value.getIntervalSize() : null);
		this.form.lyrDetails().tabProfileDetails().cmbIntervalType().setValue(value.getIntervalTypeIsNotNull() ? value.getIntervalType() : null);
		this.form.lyrDetails().tabProfileDetails().dteEndDate().setValue(value.getEffToIsNotNull() ? value.getEffTo() : null);
		this.form.lyrDetails().tabProfileDetails().dteStartDate().setValue(value.getEffFrmIsNotNull() ? value.getEffFrm() : null);
	}
	protected ims.scheduling.vo.Sch_ProfileGenericVo populateDataFromScreen(ims.scheduling.vo.Sch_ProfileGenericVo value)
	{
		if(value == null)
			value = new ims.scheduling.vo.Sch_ProfileGenericVo();

		value.setSlotType(this.form.lyrDetails().tabGeneralDetails().cmbSlotType().getValue());
		value.setTheatreType(this.form.lyrDetails().tabGeneralDetails().cmbTheatreType().getValue());
		value.setIsTheatreProfile(new Boolean(this.form.lyrDetails().tabGeneralDetails().chkTheatre().getValue()));
		value.setPrfCategory(this.form.lyrDetails().tabGeneralDetails().cmbCategory().getValue());
		value.setService(this.form.lyrDetails().tabGeneralDetails().cmbSpeciality().getValue());
		value.setIsActive(new Boolean(this.form.lyrDetails().tabGeneralDetails().chkProfileActive().getValue()));
		value.setIsUnderContract(new Boolean(this.form.lyrDetails().tabGeneralDetails().chkContractArrange().getValue()));
		value.setName(this.form.lyrDetails().tabGeneralDetails().txtProfileName().getValue());
		value.setIsSchTue(new Boolean(this.form.lyrDetails().tabProfileDetails().chkTuesday().getValue()));
		value.setIsSchWed(new Boolean(this.form.lyrDetails().tabProfileDetails().chkWednesday().getValue()));
		value.setIsSchThur(new Boolean(this.form.lyrDetails().tabProfileDetails().chkThursday().getValue()));
		value.setIsSchFri(new Boolean(this.form.lyrDetails().tabProfileDetails().chkFriday().getValue()));
		value.setIsSchSat(new Boolean(this.form.lyrDetails().tabProfileDetails().chkSaturday().getValue()));
		value.setIsSchSun(new Boolean(this.form.lyrDetails().tabProfileDetails().chkSunday().getValue()));
		value.setIsSchMon(new Boolean(this.form.lyrDetails().tabProfileDetails().chkMonday().getValue()));
		value.setIsSecondInstance(new Boolean(this.form.lyrDetails().tabProfileDetails().chkTwo().getValue()));
		value.setIsThirdInstance(new Boolean(this.form.lyrDetails().tabProfileDetails().chkThree().getValue()));
		value.setIsFourthInstance(new Boolean(this.form.lyrDetails().tabProfileDetails().chkFour().getValue()));
		value.setIsFifthInstance(new Boolean(this.form.lyrDetails().tabProfileDetails().chkFive().getValue()));
		value.setIsFirstInstance(new Boolean(this.form.lyrDetails().tabProfileDetails().chkOne().getValue()));
		value.setEndTm(this.form.lyrDetails().tabProfileDetails().timEndTime().getValue());
		value.setStartTm(this.form.lyrDetails().tabProfileDetails().timStartTime().getValue());
		value.setIntervalSize(this.form.lyrDetails().tabProfileDetails().intIntSize().getValue());
		value.setIntervalType(this.form.lyrDetails().tabProfileDetails().cmbIntervalType().getValue());
		value.setEffTo(this.form.lyrDetails().tabProfileDetails().dteEndDate().getValue());
		value.setEffFrm(this.form.lyrDetails().tabProfileDetails().dteStartDate().getValue());

		return value;
	}
	protected ims.scheduling.vo.Sch_ProfileGenericVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.scheduling.vo.Sch_ProfileGenericVo());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.scheduling.domain.Profiles domain;
}
