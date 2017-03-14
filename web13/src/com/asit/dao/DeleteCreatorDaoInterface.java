package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface DeleteCreatorDaoInterface {
	public void deleteCreatorDao(AccountDomain accountDomainObj) throws SQLException;
}
