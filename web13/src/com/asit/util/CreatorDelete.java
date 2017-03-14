package com.asit.util;

import java.sql.SQLException;

import com.asit.bean.Account;
import com.asit.bean.Parent;
import com.asit.domain.AccountDomain;
import com.asit.service.DeleteService;

public class CreatorDelete 
{
		public void creatorDelete(Parent parentObj) throws SQLException
		{
			Account accountObj = parentObj.getPayload().getAccount();
			AccountDomain accountDomainObj = new AccountDomain();
			DeleteService DeleteServiceObj = new DeleteService();
			accountDomainObj.setAccountIdentifier(accountObj.getAccountIdentifier());
			DeleteServiceObj.creatorDeleteService(accountDomainObj);
		}
}
