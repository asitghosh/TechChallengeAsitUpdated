package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;
import com.asit.domain.CompanyDomain;

public interface InsertCompanyDaoInterface {
	public void insertCompanyDao1(AccountDomain accountDomainObj);
	public void insertCompanyDao(CompanyDomain companyDomainObj) throws SQLException;
}
