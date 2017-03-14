package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface CheckAccountIdentifierInterface 
	{
	public int checkAccountIdentifier(AccountDomain accountDomainObj) throws SQLException;
	}
