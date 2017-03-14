package com.asit.dao;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;
import com.asit.domain.OrderDomain;

public interface InsertOrderDaoInterface {
	public void insertOrderDao1(AccountDomain accountDomainObj);
	public void insertOrderDao(OrderDomain orderDomainObj) throws SQLException;
}
