package com.asit.service;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface AccountServiceInterface {
	public void accountService(AccountDomain accountDomainObj) throws SQLException;
}
