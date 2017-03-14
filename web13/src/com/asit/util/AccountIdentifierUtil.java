package com.asit.util;

import java.sql.SQLException;
import java.util.Random;

import com.asit.bean.Account;
import com.asit.bean.Parent;
import com.asit.domain.AccountDomain;
import com.asit.service.AccountService;
import com.asit.service.CompanyService;
import com.asit.service.CreatorService;
import com.asit.service.OrderService;

public class AccountIdentifierUtil {
	static String  accidn;
public void acccountIdentifierUtil(Parent parentObj) throws SQLException
	{
	Account accountObj = parentObj.getPayload().getAccount();
	AccountDomain accountDomainObj = new AccountDomain();
	CreatorService creatorServiceObj = new CreatorService();
	CompanyService companyServiceObj = new CompanyService();
	OrderService orderServiceObj = new OrderService();
	if(accountObj!=null)
	{
		System.out.println("In if case");
	String accountIdentifier = accountObj.getAccountIdentifier();
	accountDomainObj.setAccountIdentifier(accountIdentifier);
	}
	else
	{
		System.out.println("in else case");
		Random ran = new Random();
		int x = ran.nextInt(10000);
		String accIdentifr = "A" + String.valueOf(x);
		accountDomainObj.setAccountIdentifier(accIdentifr);
		accidn = accountDomainObj.getAccountIdentifier();
	}
	AccountService accountServiceObj = new AccountService();
	accountServiceObj.accountService(accountDomainObj);
	creatorServiceObj.creatorService1(accountDomainObj);
	companyServiceObj.companyService1(accountDomainObj);
	orderServiceObj.orderService1(accountDomainObj);
	}
	public String getaccountidntfr()
	{
		return accidn;
	}
}
