package com.asit.service;
import com.asit.dao.*;

import java.sql.SQLException;

import com.asit.dao.CheckAccountIdentifier;
import com.asit.domain.AccountDomain;

public class DeleteService 
	{
		static int check;
		public void creatorDeleteService(AccountDomain accountDomainObj) throws SQLException
		{
			CheckAccountIdentifier checkAccountIdentifierObj = new CheckAccountIdentifier();
			check = checkAccountIdentifierObj.checkAccountIdentifier(accountDomainObj);
			if(check==1)
			{
				DeleteCompanyDao deleteCompanyDaoObj = new DeleteCompanyDao();
				deleteCompanyDaoObj.deleteCompanyDao(accountDomainObj);
				DeleteCreatorDao deleteCreatorDaoObj = new DeleteCreatorDao();
				deleteCreatorDaoObj.deleteCreatorDao(accountDomainObj);
				DeleteOrderDao deleteOrderDaoObj = new DeleteOrderDao();
				deleteOrderDaoObj.deleteOrderDao(accountDomainObj);
				System.out.println("Deleted information from table creator,company and order");
			}
			
		}
		public int deleteService()
		{
			return check;
		}
	}
