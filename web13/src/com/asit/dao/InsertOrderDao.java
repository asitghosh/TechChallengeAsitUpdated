package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;
import com.asit.domain.OrderDomain;

public class InsertOrderDao implements InsertOrderDaoInterface
	{
		static String accountIdentifier = "";
	
		public void insertOrderDao1(AccountDomain accountDomainObj)
		{
			accountIdentifier = accountDomainObj.getAccountIdentifier(); 
		}
		public void insertOrderDao(OrderDomain orderDomainObj) throws SQLException
		{
			Connection con=ConnectionHolder.getConnection(); 
			Statement st=con.createStatement(); 
			try
				{
				
					String sql1="insert into orderdetails values("+ "\"" + accountIdentifier + "\"" +","+ "\"" + orderDomainObj.getEditionCode() + "\"" +","+ "\"" + orderDomainObj.getPriceDuration() + "\"" +")"; 
					st.executeUpdate(sql1); 
					System.out.println("Value inserted in Order Table");
				}	 
			catch(Exception e)
				{ 
					System.out.println(e.toString());
				} 
			st.close(); 
			con.close();
		}
	}
