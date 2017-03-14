package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface DeleteComapanyDaoInterface {
	public void deleteCompanyDao(AccountDomain accountDomainObj) throws SQLException;
}
