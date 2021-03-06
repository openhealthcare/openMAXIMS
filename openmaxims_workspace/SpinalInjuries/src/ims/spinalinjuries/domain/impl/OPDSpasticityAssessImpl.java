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
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.37 build 2116.23840)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.spinalinjuries.domain.impl;

import java.util.ArrayList;
import java.util.List;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.vo.CareContextLiteVo;
import ims.core.vo.CareContextShortVoCollection;
import ims.core.vo.CareContextVo;
import ims.core.vo.ClinicalContactFilterVo;
import ims.core.vo.ClinicalContactShortVoCollection;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.MskGroupVoCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.CareContextVoAssembler;
import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.domain.BoneJointConfiguration;
import ims.clinical.domain.PatientSummary;
import ims.clinical.domain.impl.PatientSummaryImpl;
import ims.core.domain.impl.MuscleJointConfigurationImpl;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.generalmedical.vo.domain.OPDSpasticityAssessTreatVoAssembler;
import ims.generalmedical.vo.OPDSpasticityAssessTreatVo;
import ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection;
import ims.medical.domain.objects.OPDSpasticityAssessTreat;

public class OPDSpasticityAssessImpl extends DomainImpl implements ims.spinalinjuries.domain.OPDSpasticityAssess, ims.domain.impl.Transactional
{
	/**
	* get assessment tre atment for this contact
	*/
	public ims.generalmedical.vo.OPDSpasticityAssessTreatVo getAssessTreat(ims.core.vo.ClinicalContactShortVo voClinicalContact)
	{
		DomainFactory factory = getDomainFactory();		

		String hql = " from OPDSpasticityAssessTreat opdSpasAsTreat "; 
		StringBuffer condStr = new StringBuffer();
		String andStr = " ";
	
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
		
		if (voClinicalContact != null)
		{
			if(voClinicalContact.getID_ClinicalContactIsNotNull())
			{
				
				condStr.append(andStr + " opdSpasAsTreat.clinicalContact.id = :id_ClinicalContact"); 
				markers.add("id_ClinicalContact");
				values.add(voClinicalContact.getID_ClinicalContact());
				hql += " where ";
				
					hql += condStr.toString();
					OPDSpasticityAssessTreatVoCollection collOPDSpasticityAssessTreat;
					collOPDSpasticityAssessTreat = OPDSpasticityAssessTreatVoAssembler.createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(factory.find(hql, markers, values));
					if(collOPDSpasticityAssessTreat.size()>0)
						return collOPDSpasticityAssessTreat.get(0);
					else
						return null;
			}	
		}		
		return null;
	}

	/* (non-Javadoc)
	 * @see ims.spinalinjuries.domain.OPDSpasticityAssess#saveAssessTreat(ims.spinalinjuries.vo.OPDSpasticityAssessTreatVo)
	 */
	public OPDSpasticityAssessTreatVo saveAssessTreat(OPDSpasticityAssessTreatVo voOPDSaTreat) throws StaleObjectException 
	{
		// Ensure the value object has been validated
		if (!voOPDSaTreat.isValidated())
			throw new DomainRuntimeException("OPDSpasticityAssessTreatVo has not been validated");
		
		DomainFactory factory = getDomainFactory();
		OPDSpasticityAssessTreat doOPDSAT = OPDSpasticityAssessTreatVoAssembler.extractOPDSpasticityAssessTreat(factory, voOPDSaTreat);
		factory.save(doOPDSAT);
		return OPDSpasticityAssessTreatVoAssembler.create(doOPDSAT);
	}

	public MskGroupVoCollection listMskGroup(Boolean activeOnly) 
	{		
		BoneJointConfiguration bjConfig = (BoneJointConfiguration)getDomainImpl(MuscleJointConfigurationImpl.class);
		return bjConfig.listMskGroup(activeOnly).sort();
	}

	public ClinicalContactShortVoCollection listRootClinicalContacts(ClinicalContactFilterVo filter, PatientShort patient) 
	{
		PatientSummary impl = (PatientSummary) getDomainImpl(PatientSummaryImpl.class);
		return impl.listClinicalContactsShort(patient, filter, Boolean.TRUE);
	}

	public OPDSpasticityAssessTreatVoCollection getAssessTreatByCareContext(CareContextLiteVo voCareContext)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();
		String query = " from OPDSpasticityAssessTreat sat ";
		ArrayList markers= new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " ";

		if(voCareContext.getEpisodeOfCareIsNotNull())
		{
			hql.append(andStr + " sat.careContext.id = :ec");
			markers.add("ec");
			values.add(voCareContext.getID_CareContext());
			andStr = " and ";
		}
		
		if (markers.size() > 0) query += " where ";
		query += hql.toString();	
		
		java.util.List satList = factory.find(query,markers,values);
		OPDSpasticityAssessTreatVoCollection collOPDSpasticityAssessTreat = OPDSpasticityAssessTreatVoAssembler.createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(satList);

		return collOPDSpasticityAssessTreat;
	}

	public OPDSpasticityAssessTreatVoCollection listByCareContext(CareContextLiteVo voCareContext)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();
		String query = " from OPDSpasticityAssessTreat sat ";
		ArrayList markers= new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " ";

		if(voCareContext.getEpisodeOfCareIsNotNull())
		{
			hql.append(andStr + " sat.careContext.id = :cc");
			markers.add("cc");
			values.add(voCareContext.getID_CareContext());
			andStr = " and ";
		}
		
		if (markers.size() > 0) query += " where ";
		query += hql.toString();	
		
		java.util.List satList = factory.find(query,markers,values);
		
		OPDSpasticityAssessTreatVoCollection collOPDSpasticityAssessTreat = OPDSpasticityAssessTreatVoAssembler.createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(satList);
		
		if(collOPDSpasticityAssessTreat.size()>0)
			return collOPDSpasticityAssessTreat;
		else
			return null;	
	}

	public CareContextShortVoCollection listOPDCareContextsByEpisodeOfCare(EpisodeOfCareRefVo refEpisodeOfCare)
	{
		DomainFactory factory = getDomainFactory();
		List OPDList  = factory.find(" from OPDSpasticityAssessTreat opd where opd.careContext.episodeOfCare.id = :ecId and opd.isRIE is null order by opd.careContext.startDateTime desc",
				new String[]{"ecId"},
				new Integer[]{refEpisodeOfCare.getID_EpisodeOfCare()});
	
		CareContextShortVoCollection voCareContextList = new CareContextShortVoCollection();
		for (int x = 0; x < OPDList.size(); x++)
		{
			OPDSpasticityAssessTreat domOPD = (OPDSpasticityAssessTreat) OPDList.get(x);
	
			CareContextVo voCareContext = CareContextVoAssembler.create(domOPD.getCareContext());
			voCareContextList.add(voCareContext);
		}
	
		return voCareContextList;
		
	}
	public HcpLiteVoCollection listHcpLiteByName(String hcpName)
	{
		HcpAdmin impl = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return impl.listHcpLiteByName(hcpName);

	}
}
