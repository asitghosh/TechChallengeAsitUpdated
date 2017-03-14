package com.asit.service;

import java.sql.SQLException;

import com.asit.dao.InsertOrderDao;
import com.asit.dao.TableCreation;
import com.asit.domain.AccountDomain;
import com.asit.domain.OrderDomain;

public class OrderService implements OrderServiceInterface
	{
		public void orderService(OrderDomain orderDomainObj) throws SQLException
		{
			InsertOrderDao insertOrderDaoObj = new InsertOrderDao();
			TableCreation tableCreationObj = new TableCreation();
			tableCreationObj.createTableOrder();
			insertOrderDaoObj.insertOrderDao(orderDomainObj);
		}
		public void orderService1(AccountDomain accountDomainObj)
		{
			
			InsertOrderDao insertOrderDaoObj = new InsertOrderDao();
				insertOrderDaoObj.insertOrderDao1(accountDomainObj);
		}
	}
