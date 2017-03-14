package com.asit.service;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;
import com.asit.domain.CreatorDomain;

public interface CreatorServiceInterface {
	public void creatorService(CreatorDomain creatorDomain) throws SQLException;
	public void creatorService1(AccountDomain accountDomainObj) throws SQLException;
}
