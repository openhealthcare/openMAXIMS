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

package ims.emergency.vo.enums;

public final class EDWhiteBoardEvent extends ims.framework.utils.Enum
{
	public final static EDWhiteBoardEvent OBS_REQ_COL_VALUE_CHANGED = new EDWhiteBoardEvent(0, "OBS_REQ_COL_VALUE_CHANGED", null, ims.framework.utils.Color.Default);
	public final static EDWhiteBoardEvent MEDS_GIVEN_COL_VALUE_CHANGED = new EDWhiteBoardEvent(1, "MEDS_GIVEN_COL_VALUE_CHANGED", null, ims.framework.utils.Color.Default);
	public final static EDWhiteBoardEvent ECG_COL_VALUE_CHANGED = new EDWhiteBoardEvent(2, "ECG_COL_VALUE_CHANGED", null, ims.framework.utils.Color.Default);
	public final static EDWhiteBoardEvent NPO_COL_VALUE_CHANGED = new EDWhiteBoardEvent(3, "NPO_COL_VALUE_CHANGED", null, ims.framework.utils.Color.Default);
	public final static EDWhiteBoardEvent ISOLATION_COL_VALUE_CHANGED = new EDWhiteBoardEvent(4, "ISOLATION_COL_VALUE_CHANGED", null, ims.framework.utils.Color.Default);
	public final static EDWhiteBoardEvent COMMENT_COL_VALUE_CHANGED = new EDWhiteBoardEvent(5, "COMMENT_COL_VALUE_CHANGED", null, ims.framework.utils.Color.Default);
	public final static EDWhiteBoardEvent ROW_SELECTED = new EDWhiteBoardEvent(6, "ROW_SELECTED", null, ims.framework.utils.Color.Default);

	private EDWhiteBoardEvent(int id, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
	{
		super(id, text, image, textColor);
	}
}
