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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.60 build 2833.15418)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.pathways.forms.externaleventmappingsconfiguration;

import java.util.ArrayList;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.MedicLiteVo;
import ims.core.vo.MedicLiteVoCollection;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.Control;
import ims.framework.controls.ComboBoxBridge;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.controls.GridMutableComboBox;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocrr.vo.ProviderSystemVoCollection;
import ims.pathways.forms.externaleventmappingsconfiguration.GenForm.qmbSearchConsultantComboBox;
import ims.pathways.forms.externaleventmappingsconfiguration.GenForm.lyrDetailsLayer.tabEventMappingSpecialtyContainer.grdSpecialtyRow;
import ims.pathways.vo.ExternalEventMappingVo;
import ims.pathways.vo.ExternalEventMappingVoCollection;
import ims.pathways.vo.enums.ExternalEventMappings;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	public static final String	COLPROVIDER		= "-1";
	public static final String	COLGROUP		= "-2";
	public static final String	COLDETAIL		= "-3";
	public static final Integer	PROVIDER		= -4;
	public static final Integer	SPECIALTY		= -5;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	private void initialize() 
	{
		populateProviderSystem();
		initialiseDynamicGrid();
	}
	
	private void setContextMenu(boolean isRowSelected) 
	{
		form.getContextMenus().Pathways.hideAllExternalEventMappingsMenuItems();
		
		if (form.getMode().equals(FormMode.VIEW))
		{
			form.getContextMenus().Pathways.getExternalEventMappingsNewItem().setVisible(true);
			form.getContextMenus().Pathways.getExternalEventMappingsEditItem().setVisible(isRowSelected);		
		}
	}
	
	private void populateProviderSystem() 
	{
		form.cmbSearchProvider().clear();
		form.lyrDetails().tabEventMappingDetails().cmbProvider().clear();

		ProviderSystemVoCollection voCollection = domain.listProviderSystems();
		form.getLocalContext().setProviderVoColl(voCollection);
	
		if(voCollection != null)
		{
			for (int i = 0; i < voCollection.size(); i++) 
			{
				form.cmbSearchProvider().newRow(voCollection.get(i), voCollection.get(i).getSystemName());
				form.lyrDetails().tabEventMappingDetails().cmbProvider().newRow(voCollection.get(i), voCollection.get(i).getSystemName());
			}			
		}
	}
	
	private void open() throws PresentationLogicException 
	{
		form.setMode(FormMode.VIEW);
		search();
		updateControlsState();
	}

	private void clearAll() 
	{
		clearSearchCriteria();
		clearDynGridList();
		clearDetails();
	}
	
	private void updateControlsState() 
	{
		boolean isRowSelected = false;
		if (form.getMode().equals(FormMode.VIEW))
		{
			isRowSelected = form.dyngrdList().getSelectedRow() != null;
			form.btnEdit().setVisible(isRowSelected);
		}
		setContextMenu(isRowSelected);
		
		form.dyngrdList().setFooterValue("Total records : " + (form.getLocalContext().getEditedRecordsIsNotNull() ? form.getLocalContext().getEditedRecords().size() : 0));
	}
	
	private void clearSearchCriteria()
	{
		form.cmbSearchGroup().setValue(null);
		form.cmbSearchDetail().setValue(null);
		form.cmbSearchSpecialty().setValue(null);
		form.txtSearchClinicCode().setValue(null);
		form.qmbSearchConsultant().setValue(null);
		form.cmbSearchProvider().setValue(null);
	}
	
	private void clearDetails() 
	{
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setValue(null);
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setValue(null);
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setValue(null);
		form.lyrDetails().tabEventMappingDetails().txtGroup().setValue(null);
		form.lyrDetails().tabEventMappingDetails().txtDetail().setValue(null);
		form.lyrDetails().tabEventMappingDetails().txtDescription().setValue(null);
		form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().setValue(null);
		form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().clear();
	}
	
	private void clearDynGridList() 
	{
		form.dyngrdList().getRows().clear();
	}
	
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		newInstance();
	}
	
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		editInstance();
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		try {
			if (save())
			{
				clearDetails();
				open();
			}
			updateContextMenuState();
		} catch (ForeignKeyViolationException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
		open();
		clearDetails();
	}
	
	private void search() 
	{
		ExternalEventMappingVo filter = new ExternalEventMappingVo();		
		ExternalEventMappingVoCollection collection = new ExternalEventMappingVoCollection();
		
		if (form.cmbSearchGroup().getValue() != null)
		{
			filter.setGroup(form.cmbSearchGroup().getValue());
		}
		if (form.cmbSearchDetail().getValue() != null)
		{
			filter.setDetail(form.cmbSearchDetail().getValue());
		}
		if (form.cmbSearchProvider().getValue() != null)
		{
			filter.setProviderSystem(form.cmbSearchProvider().getValue());
		}
		if (form.cmbSearchSpecialty().getValue() != null)
		{
			filter.setSpecialty(form.cmbSearchSpecialty().getValue());
		}
		if (form.txtSearchClinicCode().getValue() != null)
		{
			
			filter.setClinicCode(form.txtSearchClinicCode().getValue());
		}
		if (form.qmbSearchConsultant().getValue() != null)
		{
			filter.setConsultant(form.qmbSearchConsultant().getValue());
		}
		
		collection = domain.listByCriteria(filter);
		form.getLocalContext().setEditedRecords(collection);
		
		if (collection == null)
		{
			engine.showMessage("Please provide a valid search criteria!");
			return;
		}		
		
		if (collection.size() == 0)
		{
			engine.showMessage("No matching records found"); 
			return;
		}
		
		populateDynamicGrid(collection);
	}
	
	private void populateDynamicGrid(ExternalEventMappingVoCollection collection) 
	{
		if (collection == null)
			return;
		
		initialiseDynamicGrid();
		DynamicGridRow dynParentRow = null;
		DynamicGridRow dynSpecialtyRow = null;
		DynamicGridRow dynClinicRow = null;

		for (int i = 0; i < collection.size(); i++) 
		{			
			ExternalEventMappingVo vo = collection.get(i);	
			
			dynParentRow = searchForProvider(vo, null);
			if (dynParentRow.getValue() == null)
			{
				dynParentRow.setValue(collection.get(i));
			}
								
			dynParentRow.setIdentifier(PROVIDER);
			dynParentRow.setReadOnly(true);
			dynParentRow.setBackColor(Color.Beige);
				
			DynamicGridCell cellProvider = dynParentRow.getCells().newCell(getColumn(COLPROVIDER), DynamicCellType.HTMLVIEW);
			
			cellProvider.setValue(vo.getProviderSystemIsNotNull() ? "<b>"+vo.getProviderSystem().getSystemName()+"</b>" : null);
			cellProvider.setTooltip(vo.getProviderSystemIsNotNull() ? 
					"<p><img src='"+form.getImages().Core.TreeView.getImagePath()+ "'> "+
						"<b>"+vo.getProviderSystem().getSystemName()+
							"</b><br>"+
								(vo.getDescriptionIsNotNull() ? 
									"<i>Descritpion : </i>"+ vo.getDescription() 
										: "") 
											: "");
				
			DynamicGridCell cellGroup = dynParentRow.getCells().newCell(getColumn(COLGROUP), DynamicCellType.HTMLVIEW);
			cellGroup.setValue(vo.getGroupIsNotNull() ? "<b>"+vo.getGroup().getText()+"</b>" : null);
			cellGroup.setTooltip(vo.getGroupIsNotNull() ? vo.getGroup().getText() : null);
				
			DynamicGridCell cellDetail = dynParentRow.getCells().newCell(getColumn(COLDETAIL), DynamicCellType.HTMLVIEW);
			cellDetail.setValue(vo.getDetailIsNotNull() ? "<b>"+vo.getDetail().getText()+"</b>" : null);
			cellDetail.setTooltip(vo.getDetailIsNotNull() ? vo.getDetail().getText() : null);

			if(collection.get(i).getSpecialtyIsNotNull())
			{
				dynSpecialtyRow = searchForSpecialty(vo, dynParentRow);
				if (dynSpecialtyRow.getValue() == null)
				{
					dynSpecialtyRow.setValue(collection.get(i));
				}
			
				dynSpecialtyRow.setIdentifier(SPECIALTY);
				dynSpecialtyRow.setReadOnly(true);
				dynParentRow.setExpanded(true);	
					
				DynamicGridCell cellSpecialty = dynSpecialtyRow.getCells().newCell(getColumn(COLPROVIDER), DynamicCellType.HTMLVIEW);
				cellSpecialty.setValue(collection.get(i).getSpecialtyIsNotNull() ? "<i>"+collection.get(i).getSpecialty().getText()+"</i>" : null);
				cellSpecialty.setTooltip(collection.get(i).getSpecialtyIsNotNull() ? collection.get(i).getSpecialty().getText() : null);
				dynSpecialtyRow.setBackColor(Color.Bisque);
					
				if (collection.get(i).getConsultantIsNotNull() ||
						collection.get(i).getClinicCodeIsNotNull())
				{
					dynClinicRow = dynSpecialtyRow.getRows().newRow();
					dynClinicRow.setReadOnly(true);
					dynClinicRow.setSelectable(false);
					dynSpecialtyRow.setExpanded(true);
							
					DynamicGridCell cellConsultant = dynClinicRow.getCells().newCell(getColumn(COLPROVIDER), DynamicCellType.HTMLVIEW);
					cellConsultant.setValue(collection.get(i).getConsultantIsNotNull() ? "<p><img src='"+collection.get(i).getConsultant().getSpecifierType().getImage().getImagePath()+ "'> "+collection.get(i).getConsultant().getName().toString()+"</p>" : null);			
					cellConsultant.setTooltip(collection.get(i).getConsultantIsNotNull() ? "<p><img src='"+collection.get(i).getConsultant().getSpecifierType().getImage().getImagePath()+ "'> "+collection.get(i).getConsultant().getName().toString()+"<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+collection.get(i).getConsultant().getSpecifierType().getText()+"</p>" : null);
						
					DynamicGridCell cellClinic = dynClinicRow.getCells().newCell(getColumn(COLGROUP), DynamicCellType.HTMLVIEW);
					cellClinic.setValue(collection.get(i).getClinicCodeIsNotNull()? collection.get(i).getClinicCode() :  null);
					cellClinic.setTooltip(collection.get(i).getClinicCodeIsNotNull()? collection.get(i).getClinicCode() :  null);
					dynClinicRow.setValue(collection.get(i));
				}	
			}
		}
	}
	
	private DynamicGridRow searchForProvider(ExternalEventMappingVo vo, DynamicGridRow row) 
	{
			int size = form.dyngrdList().getRows().size();
			for (int i = 0; i < size; i++) 
			{
				ProviderSystemVo voProvoder = vo.getProviderSystem();
	
				if (form.dyngrdList().getRows().get(i).getIdentifier().equals(PROVIDER) &&
						form.dyngrdList().getRows().get(i).getCells().get(getColumn(COLPROVIDER)).getValue().equals("<b>"+voProvoder.getSystemName()+"</b>")&&
							form.dyngrdList().getRows().get(i).getCells().get(getColumn(COLGROUP)).getValue().equals("<b>"+vo.getGroup().getText()+"</b>") &&
								form.dyngrdList().getRows().get(i).getCells().get(getColumn(COLDETAIL)).getValue().equals("<b>"+vo.getDetail().getText()+"</b>"))// &&
								//(vo.getClinicCodeIsNotNull() || vo.getConsultantIsNotNull()) )
									return form.dyngrdList().getRows().get(i);
			}
			
		return form.dyngrdList().getRows().newRow();
	}
	
	private DynamicGridRow searchForSpecialty(ExternalEventMappingVo vo, DynamicGridRow row) 
	{
		if (row.getRows() != null)
		{
			for (int j = 0; j < row.getRows().size(); j++) 
			{
				if (row.getRows().get(j).getCells().get(getColumn(COLPROVIDER)).getValue().equals("<i>"+vo.getSpecialty().getText()+"</i>"))
				{
					return row.getRows().get(j)	;
				}
			}
		}		
				
		return row.getRows().newRow();
	}
	
	private DynamicGridColumn getColumn(String identifier)
	{
		return form.dyngrdList().getColumns().getByIdentifier(identifier);
	}
	
	private void initialiseDynamicGrid()
	{
		DynamicGrid dynGrid = form.dyngrdList();
		form.dyngrdList().clear();
		
		DynamicGridColumn colProvider = null;
		DynamicGridColumn colGroup = null;
		DynamicGridColumn colDetail = null;
		
		colProvider = dynGrid.getColumns().newColumn("Provider", COLPROVIDER);
		colGroup = dynGrid.getColumns().newColumn("Group", COLGROUP);
		colDetail = dynGrid.getColumns().newColumn("Detail", COLDETAIL);
		
		colProvider.setWidth(300);
		colGroup.setWidth(150);
		colDetail.setWidth(-1);
	}
	
	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		switch(menuItemID)
		{
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.New:
				newInstance();
				break;
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.Edit:
				editInstance();
				break;
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.Add:
				newSpecialty();
				break;
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.EditSpecialty:
				editSpecialty();
				break;
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.AddConsultant:
				form.setMode(FormMode.EDIT);
				form.lyrDetails().showtabEventMappingSpecialty();
				addConsulting();
				break;
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappingsSpecialty.Add:
				addConsulting();
				break;	
			case GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappingsSpecialty.Remove:
				removeConsulting();
				break;	
		}	
	}		
	
	private void editSpecialty() 
	{
		form.setMode(FormMode.EDIT);
		form.getLocalContext().setSelectedContextMenu(ExternalEventMappings.EDITSPECIALTY);
		form.lyrDetails().showtabEventMappingSpecialty();
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setEnabled(false);
		updateControlsState();
	}
	
	private void newSpecialty() throws PresentationLogicException
	{
		clearDetails();
		form.getLocalContext().setEditedRecord(null);
		form.getLocalContext().setSelectedContextMenu(ExternalEventMappings.ADDSPECIALTY);
		form.setMode(FormMode.EDIT);
		form.lyrDetails().showtabEventMappingSpecialty();
		
		ExternalEventMappingVo record = null; 
		record = (ExternalEventMappingVo) form.getLocalContext().getParentRow().getValue() ;
		
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setValue(record.getProviderSystem());
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setValue(record.getGroup());
		onCmbGroupValueChanged();
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setValue(record.getDetail());
		onCmbDetailValueChanged();
		form.lyrDetails().tabEventMappingDetails().txtDescription().setValue(record.getDescription());

	}
	
	private void removeConsulting() 
	{
		ExternalEventMappingVoCollection voColl = null;
		
		if (form.getLocalContext().getToBeRemoveCollIsNotNull())
			voColl = form.getLocalContext().getToBeRemoveColl();
		else
			voColl = new ExternalEventMappingVoCollection();
		
		voColl.add(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRow().getValue());
		form.getLocalContext().setToBeRemoveColl(voColl);
		
		form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().remove
			(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRowIndex());	
		updateContextMenuState();
	}
	
	private void addConsulting() 
	{
		form.getLocalContext().setSelectedContextMenu(ExternalEventMappings.NEWCONSULTANT);
		grdSpecialtyRow row = form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().newRow(true);
		row.setCoImg(form.getImages().Admin.MemberOfStaff);
		updateContextMenuState();
	}
	
	private void newInstance() 
	{
		clearDetails();
		form.getLocalContext().setEditedRecord(null);
		form.lyrDetails().showtabEventMappingDetails();
		form.getLocalContext().setSelectedContextMenu(ExternalEventMappings.NEWEVENET);
		form.setMode(FormMode.EDIT);	
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setEnabled(true);
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setEnabled(true);
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setEnabled(true);
	}
	
	private void editInstance() 
	{
		form.lyrDetails().showtabEventMappingDetails();
		form.setMode(FormMode.EDIT);
		form.getLocalContext().setSelectedContextMenu(ExternalEventMappings.EDITEVENT);
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setEnabled(false);
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setEnabled(false);
		updateControlsState();
	}
	
	private void updateContextMenuState() 
	{
		boolean isViewMode = form.getMode().equals(FormMode.VIEW);
		
		if (isViewMode)
		{
			if (form.dyngrdList().getSelectedRow() != null)
			{
				if (form.dyngrdList().getSelectedRow().getParent() != null)
				{
					form.getContextMenus().Pathways.getExternalEventMappingsAddItem().setVisible(true);
					form.getContextMenus().Pathways.getExternalEventMappingsEditSpecialtyItem().setVisible(true);
					form.getContextMenus().Pathways.getExternalEventMappingsAddConsultantItem().setVisible(true);
				}
				else
				{
					form.getContextMenus().Pathways.getExternalEventMappingsAddItem().setVisible(true);
					form.getContextMenus().Pathways.getExternalEventMappingsEditItem().setVisible(form.dyngrdList().getSelectedRow() != null);
					form.getContextMenus().Pathways.getExternalEventMappingsEditSpecialtyItem().setVisible(false);
					form.getContextMenus().Pathways.getExternalEventMappingsAddConsultantItem().setVisible(false);
				}
			}
			else
			{
				form.getContextMenus().Pathways.getExternalEventMappingsNewItem().setVisible(true);
				form.getContextMenus().Pathways.hideAllExternalEventMappingsSpecialtyMenuItems();
			}
			form.getContextMenus().Pathways.hideAllExternalEventMappingsSpecialtyMenuItems();
		}
		else
		{
			form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyAddItem().setVisible(true);
			form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyRemoveItem().setVisible(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRow() != null);
			
			form.getContextMenus().Pathways.hideAllExternalEventMappingsMenuItems();
		}		
	}

	protected void onQmbConsultantTextSubmited(String value)
			throws PresentationLogicException 
	{
		onQmbConsultant(value, form.qmbSearchConsultant()); 		
	}
	
	protected void onQmbSearchConsultantTextSubmited(String value)
			throws PresentationLogicException 
	{
		onQmbConsultant(value, form.qmbSearchConsultant()); 
	}
	
	private void onQmbConsultant(String value, Object qmb) 
	{
		((ComboBoxBridge)qmb).clear();
		ComboBoxBridge comboBoxBridge = form.qmbSearchConsultant();
		
		MedicLiteVoCollection coll = domain.listMedics(value);
				
		for (int i = 0; i < coll.size(); i++)
		{
			MedicLiteVo med = coll.get(i);
			
			if (comboBoxBridge instanceof qmbSearchConsultantComboBox)
			{
				((qmbSearchConsultantComboBox)comboBoxBridge).newRow(med, med.getMos().getName().toString());
			}
		}
		if (coll.size() == 1)
		{
			if (comboBoxBridge instanceof qmbSearchConsultantComboBox)
			{
				((qmbSearchConsultantComboBox)comboBoxBridge).setValue(coll.get(0));
			}
		}
		else if (coll.size() > 1)
		{
			if (comboBoxBridge instanceof qmbSearchConsultantComboBox)
			{
				((qmbSearchConsultantComboBox)comboBoxBridge).showOpened();
			}
		}
	}
	
	@Override
	protected void onFormModeChanged()
	{
		if (form.getMode().equals(FormMode.EDIT))
		{
			form.getLocalContext().setToBeRemoveColl(null);
		}
		updateControlsState();
		updateContextMenuState();
	}
	
	protected ExternalEventMappingVoCollection populateDataFromScreen(ExternalEventMappingVo record)
	{	
		boolean hasConsultantOrClinicaCode = false;
		if (record == null)
			record = new ExternalEventMappingVo();
		
		ExternalEventMappingVoCollection voColl = new ExternalEventMappingVoCollection();
		
		record.setProviderSystem(form.lyrDetails().tabEventMappingDetails().cmbProvider().getValue());
		record.setGroup(form.lyrDetails().tabEventMappingDetails().cmbGroup().getValue());
		record.setDetail(form.lyrDetails().tabEventMappingDetails().cmbDetail().getValue());
		record.setDescription(form.lyrDetails().tabEventMappingDetails().txtDescription().getValue());
		record.setSpecialty(form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().getValue());

		if(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().size() > 0)
		{
			for (int i = form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().size() -1; i >= 0; i--) 
			{				
				if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColConsultant().getValue() != null ||
						form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColClinicCode() != null)
				{
					ExternalEventMappingVo record1 = form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getValue();
					if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getValue() == null)
						record1 = new ExternalEventMappingVo();
					
					record1.setProviderSystem(form.lyrDetails().tabEventMappingDetails().cmbProvider().getValue());
					record1.setGroup(form.lyrDetails().tabEventMappingDetails().cmbGroup().getValue());
					record1.setDetail(form.lyrDetails().tabEventMappingDetails().cmbDetail().getValue());
					record1.setDescription(form.lyrDetails().tabEventMappingDetails().txtDescription().getValue());
					record1.setSpecialty(form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().getValue());
					
					record1.setConsultant((MedicLiteVo) form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColConsultant().getValue());
					record1.setClinicCode(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColClinicCode());
					voColl.add(record1);
					hasConsultantOrClinicaCode = true;
				}
				else
					form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().remove(i);	
			}
		}

		if (!hasConsultantOrClinicaCode)
			voColl.add(record);
		
		return voColl;
	}
	
	private void checkForUnique(ExternalEventMappingVo record) throws UniqueKeyViolationException
	{
		if (record == null)
			return ;
		
		ExternalEventMappingVo filter = new ExternalEventMappingVo();
		
		filter.setID_ExternalEventMapping(record.getID_ExternalEventMapping());
		filter.setProviderSystem(record.getProviderSystem());
		filter.setGroup(record.getGroup());
		filter.setDetail(record.getDetail());
		filter.setSpecialty(record.getSpecialty());
		filter.setClinicCode(record.getClinicCode());
		filter.setConsultant(record.getConsultant());
		
		StringBuffer ids = new StringBuffer();
		if (form.dyngrdList().getSelectedRow() != null &&
				form.dyngrdList().getSelectedRow().getValue() != null)
		{
			ids.append(((ExternalEventMappingVo)form.dyngrdList().getSelectedRow().getValue()).getID_ExternalEventMapping());
			
			if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows() != null)
			{
				
				for (int i = 0; i < form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().size(); i++) 
				{
					if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getValue() != null)
					{
						if (i == 0)
							ids.append(" , ");
						
						ids.append(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getValue().getID_ExternalEventMapping());
						if (i < form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().size() - 1 &&
								form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i+1).getValue() != null	)
						{
							ids.append(" , ");
						}	
					}
				}
			}
		}
		
		//Prevent to add the same Specialty
		if (form.dyngrdList().getSelectedRow() != null &&
				form.getLocalContext().getSelectedContextMenu().equals(ExternalEventMappings.ADDSPECIALTY))
		{
			if (form.dyngrdList().getSelectedRow().getIdentifier().equals(PROVIDER))
			{
				for (int i = 0; i < form.dyngrdList().getSelectedRow().getRows().size(); i++) 
				{
					if (((ExternalEventMappingVo)form.dyngrdList().getSelectedRow().getRows().get(i).getValue()).getSpecialty().equals(
							form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().getValue()))
					{
						throw new UniqueKeyViolationException("Provider, Group, Details, Specialty and Consultant/ClinicalCode must be unique!");
					}
				}
			}
			if (form.dyngrdList().getSelectedRow().getIdentifier().equals(SPECIALTY))
			{
				for (int i = 0; i < form.dyngrdList().getSelectedRow().getParent().getRows().size(); i++) 
				{
					if (((ExternalEventMappingVo)form.dyngrdList().getSelectedRow().getParent().getRows().get(i).getValue()).getSpecialty().equals(
							form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().getValue()))
					{
						throw new UniqueKeyViolationException("Provider, Group, Details, Specialty and Consultant/ClinicalCode must be unique!");
					}
				}
			}
		}
		
		
		//Check uniq for Consultant and ClinicCode in grid
		ArrayList<String> code = new ArrayList<String>();
		ArrayList<String>  consultant =  new ArrayList<String>();
		
		for (int i = 0; i < form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().size(); i++)
		{
			if (i > 0)
			{
				for (int j = 0; j < consultant.size(); j++)
				{
					if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColConsultant().getEditedText() != null)
					{
						if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColConsultant().getEditedText().equals(consultant.get(j)))
						{
							throw new UniqueKeyViolationException("Provider, Group, Details, Specialty and Consultant/ClinicalCode must be unique!");
						}
					}
				}
				
				for (int k = 0; k < code.size(); k++)
				{
					if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColClinicCode() != null)
					{
						if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColClinicCode().equals(code.get(k)))
						{
							throw new UniqueKeyViolationException("Provider, Group, Details, Specialty and Consultant/ClinicalCode must be unique!");
						}
					}
				}
				
			}	
			
			consultant.add(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColConsultant().getEditedText());
			code.add(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().get(i).getColClinicCode());
		}
		
		
		//Remove Consultant
		if (form.getLocalContext().getToBeRemoveColl() != null)
		{
			for (int i = 0; i < form.getLocalContext().getToBeRemoveColl().size(); i++) 
			{
				if (i == 0)
					ids.append(" , ");
				
				ids.append(form.getLocalContext().getToBeRemoveColl().get(i).getID_ExternalEventMapping());
				if (i < form.getLocalContext().getToBeRemoveColl().size() - 1 &&
						form.getLocalContext().getToBeRemoveColl().get(i+1) != null	)
				{
					ids.append(" , ");
				}	
			}
		}
		
		if (domain.checkForUniq(filter, ids).size() == 0)
		{
			return;
		}
		
		throw new UniqueKeyViolationException("Provider, Group, Details, Specialty and Consultant/ClinicalCode must be unique!");
	}
	
	private boolean save() throws ForeignKeyViolationException, PresentationLogicException 
	{
		ExternalEventMappingVoCollection voColl = new ExternalEventMappingVoCollection();
		String[] errors = null;
		
		voColl = populateDataFromScreen(form.getLocalContext().getEditedRecord());	
		
		int voCollSize = voColl.size();
		for (int i = 0; i < voCollSize; i++) 
		{
			errors = voColl.get(i).validate();
		}
		
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}

		//check for unique
		for (int j = 0; j < voCollSize; j++) 
		{
			try 
			{	
				checkForUnique(voColl.get(j));
			}
			catch(UniqueKeyViolationException e)
			{
				engine.showMessage(e.getMessage());
				return false;
			}	
		}
		
		try
		{
			voColl = domain.save(voColl, form.getLocalContext().getToBeRemoveColl());
		}
		catch(StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}
		form.getLocalContext().setEditedRecords(voColl);
		
		return true;
	}
	
	private void getAndDisplayRecord(DynamicGridRow row) throws PresentationLogicException 
	{	
		if(row.getValue() == null)
			return ;
		
		clearDetails();
		ExternalEventMappingVo record = (ExternalEventMappingVo) row.getValue();

		if (row.getIdentifier().equals(PROVIDER))
		{
			populateDetailsTab(record);
			return;
		}
		else
		{
			form.lyrDetails().showtabEventMappingSpecialty();
		}
		
		if (row.getIdentifier().equals(SPECIALTY))
		{
			populateDetailsTab(record);
			
			int collSize = form.getLocalContext().getEditedRecords().size();
			for (int j = 0; j < collSize;j++) 
			{
				if (form.getLocalContext().getEditedRecords().get(j).getProviderSystem().equals(record.getProviderSystem())&&
						form.getLocalContext().getEditedRecords().get(j).getGroup().equals(record.getGroup())&&
							form.getLocalContext().getEditedRecords().get(j).getDetail().equals(record.getDetail())&&
								form.getLocalContext().getEditedRecords().get(j).getSpecialty().equals(record.getSpecialty()) &&
									(form.getLocalContext().getEditedRecords().get(j).getClinicCodeIsNotNull() ||
											form.getLocalContext().getEditedRecords().get(j).getConsultantIsNotNull()))
				{
					grdSpecialtyRow consRow = form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getRows().newRow();
					if (form.getLocalContext().getEditedRecords().get(j).getConsultantIsNotNull())
					{
						consRow.getColConsultant().newRow(form.getLocalContext().getEditedRecords().get(j).getConsultant(), form.getLocalContext().getEditedRecords().get(j).getConsultant().getName().getIItemText());
						consRow.getColConsultant().setValue(form.getLocalContext().getEditedRecords().get(j).getConsultant());
						consRow.setCoImg(form.getImages().Admin.MemberOfStaff);
					}
					if (form.getLocalContext().getEditedRecords().get(j).getClinicCodeIsNotNull())
					{
						consRow.setColClinicCode(form.getLocalContext().getEditedRecords().get(j).getClinicCode());
					}
					consRow.setValue(form.getLocalContext().getEditedRecords().get(j));
				}
			}
		}		
	}
	private void populateDetailsTab(ExternalEventMappingVo record) throws PresentationLogicException 
	{
		form.lyrDetails().showtabEventMappingDetails();
		form.lyrDetails().tabEventMappingDetails().cmbProvider().setValue(record.getProviderSystem());
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setValue(record.getGroup());
		onCmbGroupValueChanged();
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setValue(record.getDetail());
		onCmbDetailValueChanged();
		form.lyrDetails().tabEventMappingDetails().txtDescription().setValue(record.getDescription());
		form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().setValue(record.getSpecialty());
	}

	@Override
	protected void onImbClearClick() throws PresentationLogicException 
	{
		clearAll();
		form.getLocalContext().setEditedRecords(null);
		updateControlsState();
		form.lyrDetails().showtabEventMappingDetails();
		form.dyngrdList().setFooterValue("Total records : " + (form.getLocalContext().getEditedRecordsIsNotNull() ? form.getLocalContext().getEditedRecords().size() : 0));
	}
	
	@Override	
	protected void onImbSearchClick() throws PresentationLogicException 
	{
		clearDynGridList();;
		clearDetails(); 
		updateControlsState();
		search();
		form.dyngrdList().setFooterValue("Total records : " + form.getLocalContext().getEditedRecords().size());
	}	
	
	@Override
	protected void onDyngrdListRowSelectionChanged(DynamicGridRow row) 
	{	
		try 
		{
			getAndDisplayRecord(form.dyngrdList().getSelectedRow());
		} catch (PresentationLogicException e) 
		{
			e.printStackTrace();
		}
		
		updateControlsState();
		updateContextMenuState();		
		ExternalEventMappingVo value = (ExternalEventMappingVo) form.dyngrdList().getSelectedRow().getValue();
		form.getLocalContext().setEditedRecord(value);
		
		if (form.dyngrdList().getSelectedRow().getParent() == null)
			form.getLocalContext().setParentRow(form.dyngrdList().getSelectedRow());
		else
			form.getLocalContext().setParentRow(form.dyngrdList().getSelectedRow().getParent());
	}
	
	@Override
	protected void onGrdSpecialtyGridQueryComboBoxTextSubmited(int column,
			grdSpecialtyRow row, String value) throws PresentationLogicException
	{
		if (form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRow() != null)
		{
			GridMutableComboBox collConsultant = form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRow().getColConsultant();
			if (collConsultant != null)
			{
				collConsultant.clear();
				
				MedicLiteVoCollection coll = domain.listMedics(value);
						
				for (int i = 0; i < coll.size(); i++)
				{
					MedicLiteVo med = coll.get(i);
					collConsultant.newRow(med, med.getMos().getName().toString());
				}
				if (coll.size() == 1)
				{
					collConsultant.setValue(coll.get(0));
				}
				else if (coll.size() > 1)
				{
					collConsultant.showOpened();
				}
			}
		}
		
	}
	
	@Override
	protected void onCmbDetailValueChanged() throws PresentationLogicException 
	{
		if (form.lyrDetails().tabEventMappingDetails().cmbProvider().getValue() == null ||
				form.lyrDetails().tabEventMappingDetails().cmbDetail().getValue() == null)
					return;
		
		String extSystem = form.lyrDetails().tabEventMappingDetails().cmbProvider().getValue().getCodeSystem().getText();
		String name = domain.getPASName(form.lyrDetails().tabEventMappingDetails().cmbDetail().getValue().getID(), extSystem);
		form.lyrDetails().tabEventMappingDetails().txtDetail().setValue(name);
	}
	@Override
	protected void onCmbGroupValueChanged() throws PresentationLogicException 
	{
		if (form.lyrDetails().tabEventMappingDetails().cmbProvider().getValue() == null ||
				form.lyrDetails().tabEventMappingDetails().cmbGroup().getValue() == null)
					return;
		
		String extSystem = form.lyrDetails().tabEventMappingDetails().cmbProvider().getValue().getCodeSystem().getText();
		String name = domain.getPASName(form.lyrDetails().tabEventMappingDetails().cmbGroup().getValue().getID(), extSystem);
		form.lyrDetails().tabEventMappingDetails().txtGroup().setValue(name);
		
	}
	@Override
	protected void onCmbProviderValueChanged() throws PresentationLogicException 
	{
		form.lyrDetails().tabEventMappingDetails().cmbGroup().setValue(null);
		form.lyrDetails().tabEventMappingDetails().txtGroup().setValue(null);
		form.lyrDetails().tabEventMappingDetails().cmbDetail().setValue(null);
		form.lyrDetails().tabEventMappingDetails().txtDetail().setValue(null);
	}
	@Override
	protected void onGrdSpecialtySelectionChanged() throws PresentationLogicException 
	{
		if (form.getMode().equals(FormMode.EDIT))
		{
			form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyAddItem().setVisible(true);
			form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyAddItem().setEnabled(true);
			form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyRemoveItem().setVisible(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRowIndex() >= 0);
			form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyRemoveItem().setEnabled(form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().getSelectedRowIndex() >= 0);
		}
		else
		{
			form.getContextMenus().Pathways.disableAllExternalEventMappingsSpecialtyMenuItems();
		}
	}
}
