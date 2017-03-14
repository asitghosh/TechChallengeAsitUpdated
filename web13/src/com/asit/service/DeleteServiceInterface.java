package com.asit.service;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface DeleteServiceInterface {
	public void creatorDeleteService(AccountDomain accountDomainObj) throws SQLException;
	public int deleteService();
}
