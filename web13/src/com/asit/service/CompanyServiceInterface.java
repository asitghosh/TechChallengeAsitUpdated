package com.asit.service;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;
import com.asit.domain.CompanyDomain;

public interface CompanyServiceInterface {
	public void companyService(CompanyDomain companyDomainObj) throws SQLException;
	public void companyService1(AccountDomain accountDomainObj);
}
