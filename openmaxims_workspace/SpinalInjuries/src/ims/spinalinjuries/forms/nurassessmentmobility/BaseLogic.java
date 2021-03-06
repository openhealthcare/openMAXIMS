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

package ims.spinalinjuries.forms.nurassessmentmobility;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.spinalinjuries.domain.NurAssessmentMobility.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.spinalinjuries.domain.NurAssessmentMobility domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void bindgrdTransfersColAssistanceLookup()
	{
		this.form.grdTransfers().ColAssistanceComboBox().clear();
		ims.nursing.vo.lookups.AbilityCollection lookupCollection = ims.nursing.vo.lookups.LookupHelper.getAbility(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdTransfers().ColAssistanceComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void oncmbAidsUsedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbAidsUsed().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.nursing.vo.lookups.MobilityAids existingInstance = (ims.nursing.vo.lookups.MobilityAids)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbAidsUsedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.nursing.vo.lookups.MobilityAids)
		{
			ims.nursing.vo.lookups.MobilityAids instance = (ims.nursing.vo.lookups.MobilityAids)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbAidsUsedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.nursing.vo.lookups.MobilityAids existingInstance = (ims.nursing.vo.lookups.MobilityAids)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbAidsUsed().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbAidsUsedLookup()
	{
		this.form.cmbAidsUsed().clear();
		ims.nursing.vo.lookups.MobilityAidsCollection lookupCollection = ims.nursing.vo.lookups.LookupHelper.getMobilityAids(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbAidsUsed().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbAidsUsedLookupValue(int id)
	{
		ims.nursing.vo.lookups.MobilityAids instance = ims.nursing.vo.lookups.LookupHelper.getMobilityAidsInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbAidsUsed().setValue(instance);
	}
	protected final void defaultcmbAidsUsedLookupValue()
	{
		this.form.cmbAidsUsed().setValue((ims.nursing.vo.lookups.MobilityAids)domain.getLookupService().getDefaultInstance(ims.nursing.vo.lookups.MobilityAids.class, engine.getFormName().getID(), ims.nursing.vo.lookups.MobilityAids.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.spinalinjuries.domain.NurAssessmentMobility domain;
}
