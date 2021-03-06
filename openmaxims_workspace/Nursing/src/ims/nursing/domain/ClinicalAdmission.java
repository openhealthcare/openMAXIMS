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

package ims.nursing.domain;

// Generated from form domain impl
public interface ClinicalAdmission extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* get clinical admission
	*/
	public ims.nursing.vo.ClinicalAdmissionVo getClinicalAdmission(ims.core.admin.vo.CareContextRefVo careContextRefvo);

	// Generated from form domain interface definition
	/**
	* saveClinicalAdmission
	*/
	public ims.nursing.vo.ClinicalAdmissionVo saveClinicalAdmission(ims.nursing.vo.ClinicalAdmissionVo clinAdmVo) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* getAdmissionDetail
	*/
	public ims.core.vo.AdmissionDetailVo getAdmissionDetail(Integer pasEventId);

	// Generated from form domain interface definition
	/**
	* getPreviousClinicalAdmission
	*/
	public ims.nursing.vo.ClinicalAdmissionVo getPreviousClinicalAdmission(Integer patientId);

	// Generated from form domain interface definition
	public ims.nursing.vo.CarePlanCollection getCareplans(ims.core.admin.vo.CareContextRefVo careContextrefVo);

	// Generated from form domain interface definition
	public ims.nursing.vo.ClinicalAdmissionListVoCollection listClinicalAdmissions(ims.core.patient.vo.PatientRefVo patientRefVo);

	// Generated from form domain interface definition
	public ims.core.vo.CareContextShortVo getCareContextShort(ims.core.admin.vo.CareContextRefVo careContexxtRefVo);

	// Generated from form domain interface definition
	public ims.core.vo.NurseVo getNurse(ims.core.resource.people.vo.HcpRefVo id);

	// Generated from form domain interface definition
	public ims.nursing.vo.AdmissionDetailForClinicalAdmissionVo getPASAdmissionDetails(ims.core.admin.pas.vo.PASEventRefVo pasEvent);

	// Generated from form domain interface definition
	public ims.nursing.vo.PasEventForClinicalAdmissionVo getPASEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent);

	// Generated from form domain interface definition
	public ims.nursing.vo.ClinicalAdmissionVo getClinicalAdmissionById(ims.core.clinical.vo.ClinicalAdmissionRefVo clinicalAdmissionId);
}
