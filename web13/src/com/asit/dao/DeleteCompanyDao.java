package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;

public class DeleteCompanyDao implements DeleteComapanyDaoInterface {
	public void deleteCompanyDao(AccountDomain accountDomainObj) throws SQLException
	{
	
		Connection con=ConnectionHolder.getConnection(); 

		Statement st=con.createStatement(); 

		st.executeUpdate("delete from company where accountidentifier="+ "\"" + accountDomainObj.getAccountIdentifier() + "\"" +""); 

		st.close(); 

		con.close(); 



		} 
	
	}
