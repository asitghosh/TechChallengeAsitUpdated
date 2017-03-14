package com.asit.service;

import java.sql.SQLException;

import com.asit.domain.AccountDomain;
import com.asit.domain.OrderDomain;

public interface OrderServiceInterface {
	public void orderService(OrderDomain orderDomainObj) throws SQLException;
	public void orderService1(AccountDomain accountDomainObj);
}
