package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;

public class InsertAccountTable implements InsertAccountTableInterface 
{
	public void insertAccountTable(AccountDomain accountDomainObj) throws SQLException
		{
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{
				System.out.println("city = "+accountDomainObj.getAccountIdentifier());
			
				String sql1="insert into account values("+ "\"" + accountDomainObj.getAccountIdentifier() + "\"" +")"; 
				st.executeUpdate(sql1); 
				System.out.println("Value inserted in Account Table");
			}	 
		catch(Exception e)
			{ 
				System.out.println(e.toString());
			} 
		st.close(); 
		con.close();
		}
}
