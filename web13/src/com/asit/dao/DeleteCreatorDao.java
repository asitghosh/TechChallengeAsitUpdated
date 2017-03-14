package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;

public class DeleteCreatorDao implements DeleteCreatorDaoInterface{
	public void deleteCreatorDao(AccountDomain accountDomainObj) throws SQLException
	{
		Connection con=ConnectionHolder.getConnection(); 

		Statement st=con.createStatement(); 

		st.executeUpdate("delete from creator where accountIdentifier="+ "\"" + accountDomainObj.getAccountIdentifier() + "\"" +""); 

		st.close(); 

		con.close(); 
	}

}
