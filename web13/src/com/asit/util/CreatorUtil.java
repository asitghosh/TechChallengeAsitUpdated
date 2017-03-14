package com.asit.util;

import java.sql.SQLException;

import com.asit.bean.Address;
import com.asit.bean.Parent;
import com.asit.domain.CreatorDomain;
import com.asit.service.CreatorService;
import com.asit.bean.Creator;

public class CreatorUtil 
	{
		public void creatorUtil(Parent parentObj ) throws SQLException
		{
		Creator creator = parentObj.getCreator();
		Address address = parentObj.getCreator().getAddress();
		CreatorDomain creatorDomain = new CreatorDomain();
		CreatorService creatorServiceObj = new CreatorService();
		String uUid = creator.getUuid();
		creatorDomain.setuUid(uUid);
		String openId = creator.getOpenId();
		creatorDomain.setOpenId(openId);
		String email = creator.getEmail();
		creatorDomain.setEmail(email);
		String firstName = creator.getFirstName();
		creatorDomain.setFirstName(firstName);
		String lastName = creator.getLastName();
		creatorDomain.setLastName(lastName);
		String language = creator.getLanguage();
		creatorDomain.setLanguage(language);
		String locale = creator.getLocale();
		creatorDomain.setLocale(locale);
		if(address!=null)
		{
		String city = address.getCity();
		creatorDomain.setCity(city);
		String country = address.getCountry();
		creatorDomain.setCountry(country);
		String state = address.getState();
		creatorDomain.setState(state);
		String street1 = address.getStreet1();
		creatorDomain.setStreet1(street1);
		String street2 = address.getStreet2();
		creatorDomain.setStreet2(street2);
		}
		else
		{
			creatorDomain.setCity(null);
			creatorDomain.setCountry(null);
			creatorDomain.setState(null);
			creatorDomain.setStreet1(null);
			creatorDomain.setStreet2(null);
		}
		creatorServiceObj.creatorService(creatorDomain);
		}
	}
