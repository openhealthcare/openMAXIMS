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

package ims.admin.forms.drawingconfiguration;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkImageClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnUpdateImageClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdImageSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveImageClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelImageClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewImageClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbDrawingImageValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewRegionClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnUpdateRegionClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveRegionClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelRegionClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkRegionClick() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
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
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormOpen();
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.lnkImage().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkImageClick();
			}
		});
		this.form.lyrDrawing().tabImageSelect().btnUpdateImage().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnUpdateImageClick();
			}
		});
		this.form.lyrDrawing().tabImageSelect().grdImage().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdImageSelectionChanged();
			}
		});
		this.form.lyrDrawing().tabImageSelect().btnSaveImage().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveImageClick();
			}
		});
		this.form.lyrDrawing().tabImageSelect().btnCancelImage().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelImageClick();
			}
		});
		this.form.lyrDrawing().tabImageSelect().btnNewImage().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewImageClick();
			}
		});
		this.form.lyrDrawing().tabRegionConfig().cmbDrawingImage().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbDrawingImageValueChanged();
			}
		});
		this.form.lyrDrawing().tabRegionConfig().btnNewRegion().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewRegionClick();
			}
		});
		this.form.lyrDrawing().tabRegionConfig().btnUpdateRegion().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnUpdateRegionClick();
			}
		});
		this.form.lyrDrawing().tabRegionConfig().btnSaveRegion().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveRegionClick();
			}
		});
		this.form.lyrDrawing().tabRegionConfig().btnCancelRegion().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelRegionClick();
			}
		});
		this.form.lnkRegion().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkRegionClick();
			}
		});
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
