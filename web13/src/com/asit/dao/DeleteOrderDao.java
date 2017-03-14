package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;

public class DeleteOrderDao implements DeleteOrderDaoInterface {
public void deleteOrderDao(AccountDomain accountDomainObj ) throws SQLException
	{
	Connection con=ConnectionHolder.getConnection(); 

	Statement st=con.createStatement(); 

	st.executeUpdate("delete from orderdetails where accountidentifier="+ "\"" + accountDomainObj.getAccountIdentifier() + "\"" +""); 

	st.close(); 

	con.close(); 
	}
}
