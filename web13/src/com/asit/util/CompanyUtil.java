package com.asit.util;

import java.sql.SQLException;

import com.asit.bean.Company;
import com.asit.bean.Parent;
import com.asit.domain.CompanyDomain;
import com.asit.service.CompanyService;

public class CompanyUtil 
	{
		public void companyUtil(Parent parentObj) throws SQLException
		{
			Company companyObj = parentObj.getPayload().getCompany();
			CompanyService companyServiceObj = new CompanyService();
			CompanyDomain companyDomainObj = new CompanyDomain();
			companyDomainObj.setUuid(companyObj.getUuid());
			companyDomainObj.setExternalId(companyObj.getExternalId());
			companyDomainObj.setName(companyObj.getName());
			companyDomainObj.setEmail(companyObj.getEmail());
			companyDomainObj.setPhoneNumber(companyObj.getPhoneNumber());
			companyDomainObj.setWebsite(companyObj.getWebsite());
			companyDomainObj.setCountry(companyObj.getCountry());
			companyServiceObj.companyService(companyDomainObj);
		}
	}
