package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface InsertAccountTableInterface {
	public void insertAccountTable(AccountDomain accountDomainObj) throws SQLException;
}
