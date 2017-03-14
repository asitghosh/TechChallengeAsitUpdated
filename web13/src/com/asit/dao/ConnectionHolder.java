package com.asit.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHolder {

	static ConnectionHolder connection; 
		private ConnectionHolder()
			{ 
				try{ 
						Class.forName("com.mysql.jdbc.Driver"); 
					}
				catch(Exception e)
					{
						System.out.println("Exception : " + e.getMessage());
					}	 
	} 

public static Connection getConnection()
	{ 
		if(connection == null)
			{ 
				connection=new ConnectionHolder(); 
			} 
		try{ 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TechChallenge1","root","password01"); 
				return con; 
			}
		catch(Exception e)
			{
				System.out.println("Exception : " + e.getMessage());
			} 
		return null; 
	} 
} 
