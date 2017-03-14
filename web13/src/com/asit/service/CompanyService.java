package com.asit.service;

import java.sql.SQLException;

import com.asit.dao.InsertCompanyDao;
import com.asit.dao.TableCreation;
import com.asit.domain.AccountDomain;
import com.asit.domain.CompanyDomain;

public class CompanyService implements CompanyServiceInterface
	{
		public void companyService(CompanyDomain companyDomainObj) throws SQLException
		{
			InsertCompanyDao insertCompanyDaoObj = new InsertCompanyDao();
			TableCreation tableCreationObj = new TableCreation();
			tableCreationObj.createTableCompany();
			insertCompanyDaoObj.insertCompanyDao(companyDomainObj);
			
		}
		public void companyService1(AccountDomain accountDomainObj)
		{
			InsertCompanyDao insertCompanyDaoObj = new InsertCompanyDao();
				insertCompanyDaoObj.insertCompanyDao1(accountDomainObj);
		}
	}
