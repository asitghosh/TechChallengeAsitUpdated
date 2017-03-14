package com.asit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {
	public void createTableCreator() throws SQLException
	{ 
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{ 
				String sql="create table creator(accountIdentifier varchar(1000) primary key,uUid varchar(1000), openId varchar(1000), email varchar(1000), firstName varchar(300), lastName varchar(300),language varchar(300),locale varchar(100),city varchar(1000),country varchar(1000),state varchar(1000),street1 varchar(1000), street2 varchar(1000))"; 
				st.execute(sql); 
				System.out.println("Creator Table Created"); 
			}	 
		catch(Exception e)
			{ 
				System.out.print(""); 
			} 
	st.close(); 
	con.close(); 
	}
	
	public void createTableAccount() throws SQLException
	{ 
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{ 
				String sql="create table account(accountidentifier varchar(1000) primary key)"; 
				st.execute(sql); 
				System.out.println("Account Table Created"); 
			}	 
		catch(Exception e)
			{ 
				System.out.print(""); 
			} 
	st.close(); 
	con.close(); 
	}
	
	public void createTableCompany() throws SQLException
	{ 
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{ 
				String sql="create table company(accountidentifier varchar(1000) primary key, uuid varchar(1000),name varchar(1000),email varchar(1000),phonenumber varchar(1000),website varchar(1000),country varchar(1000))"; 
				st.execute(sql); 
				System.out.println("Company Table Created"); 
			}	 
		catch(Exception e)
			{ 
				System.out.print(""); 
			} 
	st.close(); 
	con.close(); 
	}
	
	public void createTableOrder() throws SQLException
	{ 
		Connection con=ConnectionHolder.getConnection(); 
		Statement st=con.createStatement(); 
		try
			{ 
				String sql="create table orderdetails(accountidentifier varchar(1000) primary key,editioncode varchar(1000),pricingduration varchar(1000))"; 
				st.execute(sql); 
				System.out.println("Order Table Created"); 
			}	 
		catch(Exception e)
			{ 
				System.out.print(""); 
			} 
	st.close(); 
	con.close(); 
	}
	
}
