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

package ims.clinical.forms.referralsrecording;

public abstract class BaseLogic extends Handlers
{
	private java.util.ArrayList lookupUsageErrors;

	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinical.domain.ReferralsRecording.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinical.domain.ReferralsRecording domain)
	{
		setContext(engine, form);
		this.domain = domain;
		if(domain.getLookupService().countLookupInstances(ims.clinical.vo.lookups.TypeOfReferralCollection.class, ims.clinical.vo.lookups.TypeOfReferral.class, 1231044, true) == 0)
		{
			if(lookupUsageErrors == null)
				lookupUsageErrors = new java.util.ArrayList();
			lookupUsageErrors.add("The lookup type 'TypeOfReferral' (ID: 1231044) must have at least one active instance configured.");
		}
		if(domain.getLookupService().countLookupInstances(ims.clinical.vo.lookups.ReferralSourceCollection.class, ims.clinical.vo.lookups.ReferralSource.class, 1231045, true) == 0)
		{
			if(lookupUsageErrors == null)
				lookupUsageErrors = new java.util.ArrayList();
			lookupUsageErrors.add("The lookup type 'ReferralSource' (ID: 1231045) must have at least one active instance configured.");
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
	protected final void oncmbReferralTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbReferralType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.TypeOfReferral existingInstance = (ims.clinical.vo.lookups.TypeOfReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReferralTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.TypeOfReferral)
		{
			ims.clinical.vo.lookups.TypeOfReferral instance = (ims.clinical.vo.lookups.TypeOfReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReferralTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.TypeOfReferral existingInstance = (ims.clinical.vo.lookups.TypeOfReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbReferralType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReferralTypeLookup()
	{
		this.form.ctnDetails().cmbReferralType().clear();
		ims.clinical.vo.lookups.TypeOfReferralCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getTypeOfReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbReferralType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReferralTypeLookupValue(int id)
	{
		ims.clinical.vo.lookups.TypeOfReferral instance = ims.clinical.vo.lookups.LookupHelper.getTypeOfReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbReferralType().setValue(instance);
	}
	protected final void defaultcmbReferralTypeLookupValue()
	{
		this.form.ctnDetails().cmbReferralType().setValue((ims.clinical.vo.lookups.TypeOfReferral)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.TypeOfReferral.class, engine.getFormName().getID(), ims.clinical.vo.lookups.TypeOfReferral.TYPE_ID));
	}
	protected final void oncmbSourceValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbSource().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.ReferralSource existingInstance = (ims.clinical.vo.lookups.ReferralSource)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSourceLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.ReferralSource)
		{
			ims.clinical.vo.lookups.ReferralSource instance = (ims.clinical.vo.lookups.ReferralSource)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSourceLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.ReferralSource existingInstance = (ims.clinical.vo.lookups.ReferralSource)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbSource().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSourceLookup()
	{
		this.form.ctnDetails().cmbSource().clear();
		ims.clinical.vo.lookups.ReferralSourceCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getReferralSource(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbSource().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSourceLookupValue(int id)
	{
		ims.clinical.vo.lookups.ReferralSource instance = ims.clinical.vo.lookups.LookupHelper.getReferralSourceInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbSource().setValue(instance);
	}
	protected final void defaultcmbSourceLookupValue()
	{
		this.form.ctnDetails().cmbSource().setValue((ims.clinical.vo.lookups.ReferralSource)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.ReferralSource.class, engine.getFormName().getID(), ims.clinical.vo.lookups.ReferralSource.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinical.domain.ReferralsRecording domain;
}
