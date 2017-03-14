package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;
import com.asit.domain.CreatorDomain;

public interface InsertCreatorTableInterface {
	public void insertCreatorTable1(AccountDomain accountDomainObj) throws SQLException;
	public void insertCreatorTable(CreatorDomain creatorDomain) throws SQLException;
}
