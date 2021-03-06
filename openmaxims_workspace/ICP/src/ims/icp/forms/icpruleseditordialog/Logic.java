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
// This code was generated by Ander Telleria using IMS Development Environment (version 1.70 build 3432.28152)
// Copyright (C) 1995-2009 IMS MAXIMS plc. All rights reserved.

package ims.icp.forms.icpruleseditordialog;

import java.util.Comparator;

import ims.admin.vo.BusinessRuleVo;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.framework.FormName;
import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.icp.vo.ICPActionLiteVo;
import ims.icp.vo.ICPActionLiteVoCollection;
import ims.icp.vo.ICPActionVo;
import ims.icp.vo.ICPActionVoCollection;
import ims.icp.vo.ICPConfigurationDisplayVo;
import ims.icp.vo.ICPLiteVo;
import ims.icp.vo.ICPPhaseDisplayVo;
import ims.icp.vo.ICPPhaseDisplayVoCollection;
import ims.icp.vo.ICPPhaseLiteVo;
import ims.icp.vo.ICPPhaseVo;
import ims.icp.vo.ICPPhaseVoCollection;
import ims.icp.vo.ICPStageDisplayVo;
import ims.icp.vo.ICPStageDisplayVoCollection;
import ims.icp.vo.ICPStageLiteVo;
import ims.icp.vo.ICPStageVo;
import ims.icp.vo.ICPStageVoCollection;
import ims.icp.vo.ICPVo;
import ims.icps.configuration.vo.ICPRefVo;
import ims.rules.vo.enums.RulesEditorComponentFormAction;
import ims.vo.ValueObjectCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Discuss if the global context should be removed from form
		// For the moment keep the code as it is to ensure compatibility with old forms
		if (form.getGlobalContext().ICP.getICPSelectedIsNotNull())
		{
			populateTree(domain.getDisplayICP(form.getGlobalContext().ICP.getICPSelected()));
		}
		else if (args != null && args.length >= 2 && args[1] instanceof ICPRefVo)
		{
			populateTree(domain.getDisplayICP((ICPRefVo) args[1]));
		}
		

		// TODO Discuss if the global context should be removed and instead parameters should be passed
		RulesEditorComponentFormAction mode = form.getGlobalContext().Rules.RuleEditorComponent.getFormMode();
		
		
		if (RulesEditorComponentFormAction.VIEW.equals(mode)) 
		{														
			form.setMode(FormMode.VIEW);
		}
		else 
		{			
			form.setMode(FormMode.EDIT);			
			
			//display Rule
			BusinessRuleVo editedRule = form.getGlobalContext().Rules.getRuleToEdit() != null ? (BusinessRuleVo) form.getGlobalContext().Rules.getRuleToEdit().clone() : null;
			form.ccRules().setValue(editedRule);
		}				
	}
	
	@Override
	protected void onTreIcpTreeViewSelectionChanged(TreeNode node) throws PresentationLogicException 
	{
		if (node!=null)
			if (node instanceof ICPLiteVo)
				form.getLocalContext().setSelectedId(((ICPLiteVo) node).getID_ICP());
			else if (node instanceof ICPStageLiteVo)
				form.getLocalContext().setSelectedId(((ICPStageLiteVo) node).getID_ICPStage());
			else if (node instanceof ICPPhaseLiteVo)
				form.getLocalContext().setSelectedId(((ICPPhaseLiteVo) node).getID_ICPPhase());
			else if (node instanceof ICPActionLiteVo)
				form.getLocalContext().setSelectedId(((ICPActionLiteVo) node).getID_ICPAction());
				
		
	}
	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result)
			throws PresentationLogicException 
	{
		
	}
	@Override
	protected void onCcRulesValueChanged() throws PresentationLogicException 
	{	
		/*if (form.ccRules().getRuleWasSaved() == true &&
				form.ccRules().getRule() != null)
		{			
			form.getGlobalContext().ICP.RulesEditorDialog.setRule(form.ccRules().getRule());
			engine.close(DialogResult.OK);
		}
		else if(form.ccRules().closeDialog() == true)
		{
			engine.close(DialogResult.OK);
		}		*/
	}
	@Override
	protected void onBtnCloseClick() throws PresentationLogicException 
	{
		engine.close(form.getLocalContext().getDialogResultIsNotNull() ? form.getLocalContext().getDialogResult() : DialogResult.CANCEL);
		
	}
	@Override
	protected void onBtnCancelClick() throws PresentationLogicException 
	{	
		//If Clone and press Cancel return to List screen
		if (form.getGlobalContext().Rules.RuleEditorComponent.getFormMode() != null &&
				form.getGlobalContext().Rules.RuleEditorComponent.getFormMode().equals(RulesEditorComponentFormAction.CLONE))
		{
			engine.close(DialogResult.CANCEL);			
		}
				
		form.getLocalContext().setDialogResult(DialogResult.CANCEL);
		form.setMode(FormMode.VIEW);
		
		BusinessRuleVo editedRule = form.getGlobalContext().Rules.getRuleToEdit();
		form.ccRules().setValue(editedRule);		
	}
	@Override
	protected void onBtnEditClick() throws PresentationLogicException 
	{
		form.setMode(FormMode.EDIT);

		BusinessRuleVo editedRule = form.getGlobalContext().Rules.getRuleToEdit() != null ? (BusinessRuleVo) form.getGlobalContext().Rules.getRuleToEdit().clone() : null;		
		form.ccRules().setValue(editedRule);		
	}	
	@Override
	protected void onBtnSaveClick() throws PresentationLogicException 
	{	
		BusinessRuleVo rule = form.ccRules().getValue();
		if (rule != null)
		{
			form.getGlobalContext().ICP.RulesEditorDialog.setRule(form.ccRules().getValue());
			engine.close(DialogResult.OK);
		}
	}
	@Override
	protected void onFormModeChanged() 
	{
		if (form.getMode().equals(FormMode.VIEW)) 
		{
			form.ccRules().setMode(FormMode.VIEW);
			updateControlsState();
		}
		else
		{
			form.ccRules().setMode(FormMode.EDIT);
		}		
	}
	
	private void updateControlsState()
	{
		boolean isEditMode = form.getMode().equals(FormMode.EDIT);
		boolean isRuleEdited = form.getGlobalContext().Rules.getRuleToEditIsNotNull();		

		form.btnEdit().setVisible(!isEditMode && isRuleEdited);
		form.btnClose().setVisible(!isEditMode);
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------
//	Stage, Phase and Action comparators
//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	private void populateTree(ICPConfigurationDisplayVo icp)
	{
		// Clear tree
		form.treIcp().clear();
		
		// Terminate function if ICP is null
		if (icp == null)
			return;
		
		// Add node ICP
		TreeNode node = form.treIcp().getNodes().add(icp, icp.getName() + " (" + icp.getID_ICP().toString() + ")");
		
		// Set node images, gray text for inactive,
		node.setCollapsedImage(form.getImages().ICP.ICP);
		node.setExpandedImage(form.getImages().ICP.ICP);
		
		if (PreActiveActiveInactiveStatus.INACTIVE.equals(icp.getStatus()))
		{
			node.setTextColor(Color.Gray);
		}
		
		// Populate node stages
		populateTreeStages(node, icp.getStages());
		
		node.setExpanded(true);
	}

	
	private void populateTreeStages(TreeNode node, ICPStageDisplayVoCollection stageCollection)
	{
		// Clear the nodes
		node.getNodes().clear();
		
		// Terminate function if collection is null
		if (stageCollection == null)
			return;
		
		// Sort stage collection after sequence
		stageCollection.sort(new StageComparator());
		
		for (int i = 0; i < stageCollection.size(); i++)
		{
			ICPStageDisplayVo stage = stageCollection.get(i);
			
			// Skip null stages
			if (stage == null)
				continue;
			
			// Add stage node to ICP
			TreeNode stageNode = node.getNodes().add(stage, stage.getName() + " (" + stage.getID_ICPStage().toString() + ")");
			
			// Set node images, gray text for inactive
			stageNode.setCollapsedImage(form.getImages().ICP.Stage);
			stageNode.setExpandedImage(form.getImages().ICP.Stage);
			
			if (PreActiveActiveInactiveStatus.INACTIVE.equals(stage.getStatus()))
			{
				stageNode.setTextColor(Color.Gray);
			}
			
			// Populate node phase
			populateTreePhases(stageNode, stage.getPhases());
			
			stageNode.setExpanded(true);
		}
	}

	private void populateTreePhases(TreeNode node, ICPPhaseDisplayVoCollection phaseCollection)
	{
		// Clear the nodes
		node.getNodes().clear();
		
		// Terminate function if collection is null
		if (phaseCollection == null)
			return;
		
		// Sort phase collection after sequence
		phaseCollection.sort(new PhaseComparator());
		
		// Iterate phase collection
		for (int i = 0; i < phaseCollection.size(); i++)
		{
			ICPPhaseDisplayVo phase = phaseCollection.get(i);
		
			// Skip null phases
			if (phase == null)
				continue;
		
			// Add phase node to ICP
			TreeNode phaseNode = node.getNodes().add(phase, phase.getName() + " (" + phase.getID_ICPPhase().toString() + ")");
		
			// Set node images, gray text for inactive
			phaseNode.setCollapsedImage(form.getImages().ICP.Phase);
			phaseNode.setExpandedImage(form.getImages().ICP.Phase);
		
			// Populate node actions
			populateTreeAction(phaseNode, phase.getActions());
		
			// Expand node
			phaseNode.setExpanded(true);
		}
	}

	private void populateTreeAction(TreeNode node, ICPActionLiteVoCollection actionCollection)
	{
		// Clear nodes
		node.getNodes().clear();
		
		// Terminate function if collection is null
		if (actionCollection == null)
			return;
		
		// Sort action collection after sequence
		actionCollection.sort(new ActionComparator());
		
		// Iterate action collection
		for (int i = 0; i < actionCollection.size(); i++)
		{
			ICPActionLiteVo action = actionCollection.get(i);
		
			// Skip null actions
			if (action == null)
				continue;
		
			// Add action node to ICP
			TreeNode actionNode = node.getNodes().add(action, action.getName() + " (" + action.getID_ICPAction().toString() + ")");
		
			// Set node images, gray text for inactive ones
			actionNode.setCollapsedImage(form.getImages().ICP.Action);
			actionNode.setExpandedImage(form.getImages().ICP.Action);
			
			if (PreActiveActiveInactiveStatus.INACTIVE.equals(action.getStatus()))
			{
				actionNode.setTextColor(Color.Gray);
			}
		}
	}


//------------------------------------------------------------------------------------------------------------------------------------------------------
//	Stage, Phase and Action comparators
//------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Stage Comparator - sort by sequence
	 */
	private class StageComparator implements Comparator<ICPStageLiteVo>
	{
		public int compare(ICPStageLiteVo stage1, ICPStageLiteVo stage2)
		{
			if (stage1 != null && stage2 != null && stage1.getSequenceIsNotNull() && stage2.getSequenceIsNotNull())
				return stage1.getSequence().compareTo(stage2.getSequence());

			return 0;
		}
	}
	
	/**
	 * Phase Comparator - sort by sequence
	 */
	private class PhaseComparator implements Comparator<ICPPhaseLiteVo>
	{
		public int compare(ICPPhaseLiteVo phase1, ICPPhaseLiteVo phase2)
		{
			if (phase1 != null && phase2 != null && phase1.getSequenceIsNotNull() && phase2.getSequenceIsNotNull())
				return phase1.getSequence().compareTo(phase2.getSequence());

			return 0;
		}
	}
	
	private class ActionComparator implements Comparator<ICPActionLiteVo>
	{
		public int compare(ICPActionLiteVo action1, ICPActionLiteVo action2)
		{
			if (action1 != null && action2 != null && action1.getSequenceIsNotNull() && action2.getSequenceIsNotNull())
				return action1.getSequence().compareTo(action2.getSequence());

			return 0;
		}
	}
}
