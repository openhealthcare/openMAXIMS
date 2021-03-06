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

package ims.rules.forms.ruleseditorcomponent;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void onFormModeChanged();
	abstract protected void onMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrRulesTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onChkDateRangeValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbRootEntityValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDyngrdConditionsCellValueChanged(ims.framework.controls.DynamicGridCell cell);
	abstract protected void onDyngrdConditionsRowSelectionChanged(ims.framework.controls.DynamicGridRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDyngrdActionsCellTextSubmited(ims.framework.controls.DynamicGridCell cell);
	abstract protected void onDyngrdActionsCellValueChanged(ims.framework.controls.DynamicGridCell cell);
	abstract protected void onDyngrdActionsRowSelectionChanged(ims.framework.controls.DynamicGridRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onMessageBoxClosed(messageBoxId, result);
			}
		});
		this.form.lyrRules().tabGeneral().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrRulestabGeneralActivated();
			}
		});
		this.form.lyrRules().tabConditions().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrRulestabConditionsActivated();
			}
		});
		this.form.lyrRules().tabActions().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrRulestabActionsActivated();
			}
		});
		this.form.lyrRules().tabOverview().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrRulestabOverviewActivated();
			}
		});
		this.form.lyrRules().tabGeneral().chkDateRange().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkDateRangeValueChanged();
			}
		});
		this.form.lyrRules().tabConditions().cmbRootEntity().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbRootEntityValueChanged();
			}
		});
		this.form.lyrRules().tabConditions().dyngrdConditions().setDynamicGridCellValueChangedEvent(new DynamicGridCellValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridCell cell) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdConditionsCellValueChanged(cell);
			}
		});
		this.form.lyrRules().tabConditions().dyngrdConditions().setDynamicGridRowSelectionChangedEvent(new DynamicGridRowSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridRow row, ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdConditionsRowSelectionChanged(row);
			}
		});
		this.form.lyrRules().tabActions().dyngrdActions().setDynamicGridCellTextSubmitedEvent(new DynamicGridCellTextSubmited()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridCell cell) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdActionsCellTextSubmited(cell);
			}
		});
		this.form.lyrRules().tabActions().dyngrdActions().setDynamicGridCellValueChangedEvent(new DynamicGridCellValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridCell cell) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdActionsCellValueChanged(cell);
			}
		});
		this.form.lyrRules().tabActions().dyngrdActions().setDynamicGridRowSelectionChangedEvent(new DynamicGridRowSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridRow row, ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdActionsRowSelectionChanged(row);
			}
		});
		this.form.getContextMenus().Admin.getRulesEditorAddLogicalConditionItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.AdminNamespace.RulesEditor.AddLogicalCondition, sender);
			}
		});
		this.form.getContextMenus().Admin.getRulesEditorAddValueConditionItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.AdminNamespace.RulesEditor.AddValueCondition, sender);
			}
		});
		this.form.getContextMenus().Admin.getRulesEditorRemoveItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.AdminNamespace.RulesEditor.Remove, sender);
			}
		});
		this.form.getContextMenus().Admin.getRulesEditorRemoveAllItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.AdminNamespace.RulesEditor.RemoveAll, sender);
			}
		});
		this.form.getContextMenus().Admin.getRulesEditorRemoveLogicalConditionItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.AdminNamespace.RulesEditor.RemoveLogicalCondition, sender);
			}
		});
		this.form.getContextMenus().Admin.getRulesEditorRemoveValueConditionItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.AdminNamespace.RulesEditor.RemoveValueCondition, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddActionItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddAction, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveActionItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveAction, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveAllItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveAll, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddNotificationItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddNotification, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddUserItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddUser, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddEntityUsersItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddEntityUsers, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveEntityUsersItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveEntityUsers, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveUserItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveUser, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddMessageItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddMessage, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveMessageItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveMessage, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddLineSeparatorItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddLineSeparator, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveLineSeparatorItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveLineSeparator, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsAddEntityFieldItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.AddEntityField, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsRemoveEntityFieldItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.RemoveEntityField, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsMoveUPItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.MoveUP, sender);
			}
		});
		this.form.getContextMenus().Rules.getRulesEditorActionsMoveDownItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RulesNamespace.RulesEditorActions.MoveDown, sender);
			}
		});
	}
	private void onlyrRulestabGeneralActivated()
	{
		this.form.lyrRules().showtabGeneral();
		onlyrRulesTabChanged(this.form.lyrRules().tabGeneral());
	}
	private void onlyrRulestabConditionsActivated()
	{
		this.form.lyrRules().showtabConditions();
		onlyrRulesTabChanged(this.form.lyrRules().tabConditions());
	}
	private void onlyrRulestabActionsActivated()
	{
		this.form.lyrRules().showtabActions();
		onlyrRulesTabChanged(this.form.lyrRules().tabActions());
	}
	private void onlyrRulestabOverviewActivated()
	{
		this.form.lyrRules().showtabOverview();
		onlyrRulesTabChanged(this.form.lyrRules().tabOverview());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIComponentEngine engine;
	protected GenForm form;
}
