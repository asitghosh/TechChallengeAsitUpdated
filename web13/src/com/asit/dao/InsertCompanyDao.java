package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;
import com.asit.domain.CompanyDomain;

public class InsertCompanyDao implements InsertCompanyDaoInterface
{
	static String accountIdentifier="";
	public void insertCompanyDao1(AccountDomain accountDomainObj)
	{
		accountIdentifier = accountDomainObj.getAccountIdentifier();
	}
	public void insertCompanyDao(CompanyDomain companyDomainObj) throws SQLException
	{
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{
			
				String sql1="insert into company values("+ "\"" +accountIdentifier + "\"" +","+ "\"" +companyDomainObj.getUuid() + "\"" +","+ "\"" +companyDomainObj.getName() + "\"" +","+ "\"" +companyDomainObj.getEmail() + "\"" +","+ "\"" +companyDomainObj.getPhoneNumber() + "\"" +","+ "\"" +companyDomainObj.getWebsite() + "\"" +","+ "\"" +companyDomainObj.getCountry() + "\"" +")"; 
				st.executeUpdate(sql1); 
				System.out.println("Value inserted in company Table");
			}	 
		catch(Exception e)
			{ 
				System.out.println(e.toString());
			} 
		st.close(); 
		con.close();
	}
	

}
