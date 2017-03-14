package com.asit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.asit.domain.AccountDomain;

public class CheckAccountIdentifier implements CheckAccountIdentifierInterface  
	{
		public int checkAccountIdentifier(AccountDomain accountDomainObj) throws SQLException
		{
			String accountIdentifier = accountDomainObj.getAccountIdentifier();
			int flag=0;
			Connection con=ConnectionHolder.getConnection(); 
			Statement st=con.createStatement(); 
			String sql="select * from account"; 
			ResultSet rs=st.executeQuery(sql); 
			while(rs.next())
				{ 
				if(accountIdentifier.equals(rs.getString(1)))
				{
					flag++;
					break;
				}
				}
			if(flag==0)
			{
				return 0;
			}
			else
			{
				return 1;
			}
			
	}
	}
