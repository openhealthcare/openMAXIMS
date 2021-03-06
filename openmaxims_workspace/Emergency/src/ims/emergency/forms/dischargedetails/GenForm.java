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

package ims.emergency.forms.dischargedetails;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	protected void fireCustomControlValueChanged()
	{
		super.fireValueChanged();
	}
	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	public static class lyrMainLayer extends Layer
	{
		private static final long serialVersionUID = 1L;
		public static class tabAdviceTransportContainer extends LayerBridge
		{
			private static final long serialVersionUID = 1L;
			public void setTabActivatedEvent(ims.framework.delegates.TabActivated delegate)
			{
				super.container.setTabActivatedEvent(delegate);
			}
			public boolean isInitialized()
			{
				return super.container.isInitialized();
			}
			protected void setContext(Form form, ims.framework.interfaces.IAppForm appForm, Control control, FormLoader loader, Integer startControlID, ims.framework.utils.SizeInfo designSize, ims.framework.utils.SizeInfo runtimeSize, Integer startTabIndex, boolean skipContextValidation) throws Exception
			{
				if(form == null)
					throw new RuntimeException("Invalid form");
				if(appForm == null)
					throw new RuntimeException("Invalid application form");
				if(control == null); // this is to avoid eclipse warning only.
				if(loader == null); // this is to avoid eclipse warning only.
				if(startControlID == null)
					throw new RuntimeException("Invalid startControlID");
				if(designSize == null); // this is to avoid eclipse warning only.
				if(runtimeSize == null); // this is to avoid eclipse warning only.
				if(startTabIndex == null)
					throw new RuntimeException("Invalid startTabIndex");
		
		
				// Custom Controls
				ims.framework.CustomComponent instance1 = factory.getEmptyCustomComponent();
				RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 0, 0, 472, 701, ims.framework.enumerations.ControlAnchoring.ALL);
				ims.framework.FormUiLogic m_ccAdviceForm = loader.loadComponent(129156, appForm, startControlID * 10 + 1000, anchoringHelper1.getSize(), instance1, -1, skipContextValidation);
				//ims.framework.Control m_ccAdviceControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(0), new Integer(0), new Integer(472), new Integer(701), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL, new Integer(-1), m_ccAdviceForm, instance1 } );
				ims.framework.Control m_ccAdviceControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1001),  new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL, new Integer(-1), m_ccAdviceForm, instance1, Boolean.FALSE } );
				super.addControl(m_ccAdviceControl);
				Menu[] menus1 = m_ccAdviceForm.getForm().getRegisteredMenus();
				for(int x = 0; x < menus1.length; x++)
				{
					form.registerMenu(menus1[x]);
				}
			}

			public ims.emergency.forms.dischargedetails_advicetransport.IComponent ccAdvice()
			{
				return (ims.emergency.forms.dischargedetails_advicetransport.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(0)).getLogic();
			}
			public void setccAdviceValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
			{
				((CustomComponent)super.getControl(0)).setValueChangedEvent(delegate);
			}
			public void setccAdviceVisible(boolean value)
			{
				((ims.framework.Control)super.getControl(0)).setVisible(value);
			}
			public boolean isccAdviceVisible()
			{
				return ((ims.framework.Control)super.getControl(0)).isVisible();
			}
			public void setccAdviceEnabled(boolean value)
			{
				((ims.framework.Control)super.getControl(0)).setEnabled(value);
			}
			public boolean isccAdviceEnabled()
			{
				return ((ims.framework.Control)super.getControl(0)).isEnabled();
			}
		}
		public static class tabCodingContainer extends LayerBridge
		{
			private static final long serialVersionUID = 1L;
			public void setTabActivatedEvent(ims.framework.delegates.TabActivated delegate)
			{
				super.container.setTabActivatedEvent(delegate);
			}
			public boolean isInitialized()
			{
				return super.container.isInitialized();
			}
			protected void setContext(Form form, ims.framework.interfaces.IAppForm appForm, Control control, FormLoader loader, Integer startControlID, ims.framework.utils.SizeInfo designSize, ims.framework.utils.SizeInfo runtimeSize, Integer startTabIndex, boolean skipContextValidation) throws Exception
			{
				if(form == null)
					throw new RuntimeException("Invalid form");
				if(appForm == null)
					throw new RuntimeException("Invalid application form");
				if(control == null); // this is to avoid eclipse warning only.
				if(loader == null); // this is to avoid eclipse warning only.
				if(startControlID == null)
					throw new RuntimeException("Invalid startControlID");
				if(designSize == null); // this is to avoid eclipse warning only.
				if(runtimeSize == null); // this is to avoid eclipse warning only.
				if(startTabIndex == null)
					throw new RuntimeException("Invalid startTabIndex");
		
			}

		}
		public static class tabOutcomeContainer extends LayerBridge
		{
			private static final long serialVersionUID = 1L;
			public void setTabActivatedEvent(ims.framework.delegates.TabActivated delegate)
			{
				super.container.setTabActivatedEvent(delegate);
			}
			public boolean isInitialized()
			{
				return super.container.isInitialized();
			}
			protected void setContext(Form form, ims.framework.interfaces.IAppForm appForm, Control control, FormLoader loader, Integer startControlID, ims.framework.utils.SizeInfo designSize, ims.framework.utils.SizeInfo runtimeSize, Integer startTabIndex, boolean skipContextValidation) throws Exception
			{
				if(form == null)
					throw new RuntimeException("Invalid form");
				if(appForm == null)
					throw new RuntimeException("Invalid application form");
				if(control == null); // this is to avoid eclipse warning only.
				if(loader == null); // this is to avoid eclipse warning only.
				if(startControlID == null)
					throw new RuntimeException("Invalid startControlID");
				if(designSize == null); // this is to avoid eclipse warning only.
				if(runtimeSize == null); // this is to avoid eclipse warning only.
				if(startTabIndex == null)
					throw new RuntimeException("Invalid startTabIndex");
		
		
				// Custom Controls
				ims.framework.CustomComponent instance1 = factory.getEmptyCustomComponent();
				RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 0, 0, 480, 701, ims.framework.enumerations.ControlAnchoring.ALL);
				ims.framework.FormUiLogic m_ccOutcomeForm = loader.loadComponent(129157, appForm, startControlID * 10 + 2000, anchoringHelper2.getSize(), instance1, -1, skipContextValidation);
				//ims.framework.Control m_ccOutcomeControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(0), new Integer(0), new Integer(480), new Integer(701), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL, new Integer(-1), m_ccOutcomeForm, instance1 } );
				ims.framework.Control m_ccOutcomeControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1003),  new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL, new Integer(-1), m_ccOutcomeForm, instance1, Boolean.FALSE } );
				super.addControl(m_ccOutcomeControl);
				Menu[] menus1 = m_ccOutcomeForm.getForm().getRegisteredMenus();
				for(int x = 0; x < menus1.length; x++)
				{
					form.registerMenu(menus1[x]);
				}
			}

			public ims.emergency.forms.dischargedetails_outcome.IComponent ccOutcome()
			{
				return (ims.emergency.forms.dischargedetails_outcome.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(0)).getLogic();
			}
			public void setccOutcomeValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
			{
				((CustomComponent)super.getControl(0)).setValueChangedEvent(delegate);
			}
			public void setccOutcomeVisible(boolean value)
			{
				((ims.framework.Control)super.getControl(0)).setVisible(value);
			}
			public boolean isccOutcomeVisible()
			{
				return ((ims.framework.Control)super.getControl(0)).isVisible();
			}
			public void setccOutcomeEnabled(boolean value)
			{
				((ims.framework.Control)super.getControl(0)).setEnabled(value);
			}
			public boolean isccOutcomeEnabled()
			{
				return ((ims.framework.Control)super.getControl(0)).isEnabled();
			}
		}

		protected void setContext(Form form, ims.framework.interfaces.IAppForm appForm, Control control, FormLoader loader, Integer startControlID, ims.framework.utils.SizeInfo designSize, ims.framework.utils.SizeInfo runtimeSize, Integer startTabIndex, boolean skipContextValidation) throws Exception
		{
			if(form == null)
				throw new RuntimeException("Invalid form");
			if(appForm == null)
				throw new RuntimeException("Invalid application form");
			if(control == null); // this is to avoid eclipse warning only.
			if(loader == null); // this is to avoid eclipse warning only.
			if(startControlID == null)
				throw new RuntimeException("Invalid startControlID");
			if(designSize == null); // this is to avoid eclipse warning only.
			if(runtimeSize == null); // this is to avoid eclipse warning only.
			if(startTabIndex == null)
				throw new RuntimeException("Invalid startTabIndex");
			RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 0, 0, 472, 730, ims.framework.enumerations.ControlAnchoring.ALL);
			Container m_tabAdviceTransport = (Container)factory.getControl(Container.class, new Object[] { control, new Integer(startControlID.intValue() + 1004), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,"Advice & Transport", new Integer(startControlID.intValue() + 0), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(false)});
			tabAdviceTransportContainer m_tabAdviceTransportContainer = (tabAdviceTransportContainer)LayerBridgeFlyweightFactory.getInstance().createLayerBridge(tabAdviceTransportContainer.class, m_tabAdviceTransport, factory);
			super.addContainer(m_tabAdviceTransport, m_tabAdviceTransportContainer);
			ims.framework.utils.SizeInfo m_tabAdviceTransportDesignSize = new ims.framework.utils.SizeInfo(472, 730);
			ims.framework.utils.SizeInfo m_tabAdviceTransportRuntimeSize = new ims.framework.utils.SizeInfo(anchoringHelper3.getWidth(), anchoringHelper3.getHeight());
			m_tabAdviceTransportContainer.setContext(form, appForm, m_tabAdviceTransport, loader, startControlID, m_tabAdviceTransportDesignSize, m_tabAdviceTransportRuntimeSize, startTabIndex, skipContextValidation);
			RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 0, 0, 472, 730, ims.framework.enumerations.ControlAnchoring.ALL);
			Container m_tabCoding = (Container)factory.getControl(Container.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,"Coding", new Integer(startControlID.intValue() + 0), new Boolean(false), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(false)});
			tabCodingContainer m_tabCodingContainer = (tabCodingContainer)LayerBridgeFlyweightFactory.getInstance().createLayerBridge(tabCodingContainer.class, m_tabCoding, factory);
			super.addContainer(m_tabCoding, m_tabCodingContainer);
			ims.framework.utils.SizeInfo m_tabCodingDesignSize = new ims.framework.utils.SizeInfo(472, 730);
			ims.framework.utils.SizeInfo m_tabCodingRuntimeSize = new ims.framework.utils.SizeInfo(anchoringHelper4.getWidth(), anchoringHelper4.getHeight());
			m_tabCodingContainer.setContext(form, appForm, m_tabCoding, loader, startControlID, m_tabCodingDesignSize, m_tabCodingRuntimeSize, startTabIndex, skipContextValidation);
			RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 0, 0, 472, 730, ims.framework.enumerations.ControlAnchoring.ALL);
			Container m_tabOutcome = (Container)factory.getControl(Container.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,"Outcome", new Integer(startControlID.intValue() + 0), new Boolean(false), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(true), new Boolean(false)});
			tabOutcomeContainer m_tabOutcomeContainer = (tabOutcomeContainer)LayerBridgeFlyweightFactory.getInstance().createLayerBridge(tabOutcomeContainer.class, m_tabOutcome, factory);
			super.addContainer(m_tabOutcome, m_tabOutcomeContainer);
			ims.framework.utils.SizeInfo m_tabOutcomeDesignSize = new ims.framework.utils.SizeInfo(472, 730);
			ims.framework.utils.SizeInfo m_tabOutcomeRuntimeSize = new ims.framework.utils.SizeInfo(anchoringHelper5.getWidth(), anchoringHelper5.getHeight());
			m_tabOutcomeContainer.setContext(form, appForm, m_tabOutcome, loader, startControlID, m_tabOutcomeDesignSize, m_tabOutcomeRuntimeSize, startTabIndex, skipContextValidation);
		}
		public void hide()
		{
			tabAdviceTransport().setVisible(false);
			tabCoding().setVisible(false);
			tabOutcome().setVisible(false);
		}
		public void settabAdviceTransportEnabled(boolean value)
		{
			tabAdviceTransport().setEnabled(value);
		}
		public void settabCodingEnabled(boolean value)
		{
			tabCoding().setEnabled(value);
		}
		public void settabOutcomeEnabled(boolean value)
		{
			tabOutcome().setEnabled(value);
		}
		public void showtabAdviceTransport()
		{
			tabCoding().setVisible(false);
			tabOutcome().setVisible(false);
			tabAdviceTransport().setVisible(true);
		}
		public void showtabCoding()
		{
			tabAdviceTransport().setVisible(false);
			tabOutcome().setVisible(false);
			tabCoding().setVisible(true);
		}
		public void showtabOutcome()
		{
			tabAdviceTransport().setVisible(false);
			tabCoding().setVisible(false);
			tabOutcome().setVisible(true);
		}

		public tabAdviceTransportContainer tabAdviceTransport()
		{
			return (tabAdviceTransportContainer)super.layers.get(0);
		}
		public tabCodingContainer tabCoding()
		{
			return (tabCodingContainer)super.layers.get(1);
		}
		public tabOutcomeContainer tabOutcome()
		{
			return (tabOutcomeContainer)super.layers.get(2);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.PatientShort.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.PatientShort' of the global context variable 'Core.PatientShort' is not supported.");
		if(!context.isValidContextType(ims.core.vo.EpisodeofCareShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.EpisodeofCareShortVo' of the global context variable 'Core.EpisodeofCareShort' is not supported.");
		if(!context.isValidContextType(ims.core.vo.CareContextShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.CareContextShortVo' of the global context variable 'Core.CurrentCareContext' is not supported.");
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(472, 730);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Layer Clasess
		lyrMainLayer m_lyrMainLayer = (lyrMainLayer)LayerFlyweightFactory.getInstance().createLayer(lyrMainLayer.class, this, factory);
		super.addLayer(m_lyrMainLayer);
		m_lyrMainLayer.setContext(form, appForm, control, loader, startControlID, designSize, runtimeSize, startTabIndex, skipContextValidation);
	}


	public lyrMainLayer lyrMain()
	{
		return (lyrMainLayer)super.getLayer(0);
	}
	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_ReadOnly = new ims.framework.ContextVariable("ReadOnly", prefix + "_lv_Emergency.DischargeDetails.__internal_x_context__ReadOnly_" + componentIdentifier + "");
			cxl_CustomEvent = new ims.framework.ContextVariable("CustomEvent", prefix + "_lv_Emergency.DischargeDetails.__internal_x_context__CustomEvent_" + componentIdentifier + "");
		}
		
		public boolean getReadOnlyIsNotNull()
		{
			return !cxl_ReadOnly.getValueIsNull(context);
		}
		public Boolean getReadOnly()
		{
			return (Boolean)cxl_ReadOnly.getValue(context);
		}
		public void setReadOnly(Boolean value)
		{
			cxl_ReadOnly.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_ReadOnly = null;
		public boolean getCustomEventIsNotNull()
		{
			return !cxl_CustomEvent.getValueIsNull(context);
		}
		public ims.emergency.vo.enums.DischargeDetails_CustomEvents getCustomEvent()
		{
			return (ims.emergency.vo.enums.DischargeDetails_CustomEvents)cxl_CustomEvent.getValue(context);
		}
		public void setCustomEvent(ims.emergency.vo.enums.DischargeDetails_CustomEvents value)
		{
			cxl_CustomEvent.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_CustomEvent = null;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[71];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_CareUk.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return formInfo.getLocalVariablesPrefix() + formInfo.getNamespaceName() + formInfo.getFormName() + formInfo.getFormId() + "_" + this.componentIdentifier;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}
