package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;
import com.asit.domain.CreatorDomain;

public class InsertCreatorTable implements InsertCreatorTableInterface
	{
		static String  accountIdentifier = "";
	
	public void insertCreatorTable1(AccountDomain accountDomainObj) throws SQLException
	{
		accountIdentifier = accountDomainObj.getAccountIdentifier();
		
	}
	
	public void insertCreatorTable(CreatorDomain creatorDomain) throws SQLException
	{
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{
				String sql1="insert into creator values("+ "\"" + accountIdentifier + "\"" +","+ "\"" + creatorDomain.getuUid() + "\"" +","+ "\"" + creatorDomain.getOpenId() + "\"" +","+ "\"" + creatorDomain.getEmail() + "\"" +","+ "\"" + creatorDomain.getFirstName() + "\"" +","+ "\"" + creatorDomain.getLastName() + "\"" +","+ "\"" + creatorDomain.getLanguage() + "\"" +","+ "\"" + creatorDomain.getLocale() + "\"" +","+ "\"" + creatorDomain.getCity() + "\"" +","+ "\"" + creatorDomain.getCountry() + "\"" +","+ "\"" + creatorDomain.getState() + "\"" +","+ "\"" + creatorDomain.getStreet1() + "\"" +","+ "\"" + creatorDomain.getStreet2() + "\"" +")"; 
				st.executeUpdate(sql1); 
				System.out.println("Value inserted in Creator Table");
			}	 
		catch(Exception e)
			{ 
				System.out.println(e.toString());
				System.exit(0);
			} 
		st.close(); 
		con.close();
	}
	}


