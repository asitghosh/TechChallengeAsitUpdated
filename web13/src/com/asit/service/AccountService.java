package com.asit.service;

import java.sql.SQLException;

import com.asit.dao.InsertAccountTable;
import com.asit.dao.TableCreation;
import com.asit.domain.AccountDomain;

public class AccountService implements AccountServiceInterface
	{
		public void accountService(AccountDomain accountDomainObj) throws SQLException
		{
			InsertAccountTable insertAccountTableObj = new InsertAccountTable();
			TableCreation tableCreationObj = new TableCreation();
				tableCreationObj.createTableAccount();
				insertAccountTableObj.insertAccountTable(accountDomainObj);
		}
	}
