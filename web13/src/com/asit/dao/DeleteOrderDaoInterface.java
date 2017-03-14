package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;

public interface DeleteOrderDaoInterface {
	public void deleteOrderDao(AccountDomain accountDomainObj ) throws SQLException;
}
