package com.asit.service;

import java.sql.SQLException;

import com.asit.dao.InsertCreatorTable;
import com.asit.dao.TableCreation;
import com.asit.domain.AccountDomain;
import com.asit.domain.CreatorDomain;

public class CreatorService implements CreatorServiceInterface
	{
		public void creatorService(CreatorDomain creatorDomain) throws SQLException
		{
			InsertCreatorTable insertCreatorTableObj = new InsertCreatorTable();
			TableCreation tableCreationObj = new TableCreation();
				tableCreationObj.createTableCreator();
				insertCreatorTableObj.insertCreatorTable(creatorDomain);
		}
		public void creatorService1(AccountDomain accountDomainObj) throws SQLException
		{
			InsertCreatorTable insertCreatorTableObj = new InsertCreatorTable();
				insertCreatorTableObj.insertCreatorTable1(accountDomainObj);
		}
	}
