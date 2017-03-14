package com.asit.util;

import java.sql.SQLException;

import com.asit.bean.Order;
import com.asit.bean.Parent;
import com.asit.domain.OrderDomain;
import com.asit.service.OrderService;

public class OrderUtil 
	{
		public void orderUtil(Parent parentObj) throws SQLException
		{
			Order orderObj = parentObj.getPayload().getOrder();
			OrderService orderServiceObj = new OrderService();
			OrderDomain orderDomainObj = new OrderDomain();
			orderDomainObj.setEditionCode(orderObj.getEditionCode());
			orderDomainObj.setPriceDuration(orderObj.getPricingDuration());
			orderServiceObj.orderService(orderDomainObj);
		}
	}
