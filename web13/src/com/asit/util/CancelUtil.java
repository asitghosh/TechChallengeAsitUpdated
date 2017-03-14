package com.asit.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;

import com.asit.bean.Parent;
import com.fasterxml.jackson.databind.ObjectMapper;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

public class CancelUtil {
	public void cancelUrl(String eurl) throws IOException, SQLException 
	{
		ObjectMapper om = new ObjectMapper();
		OAuthConsumer consumer = new DefaultOAuthConsumer("xyz-154447", "U3Ej22hqPIHbbZNT");
		URL url = new URL(eurl);
		System.out.println(url);
		HttpURLConnection requestRes = (HttpURLConnection) url.openConnection();
		requestRes.setRequestProperty("Accept", "application/json");
		try{
			consumer.sign(requestRes);
		}catch(Exception e){
			e.printStackTrace();
		}
		requestRes.connect();
		System.out.println("connected");
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(requestRes.getInputStream()));	
		String line = "";
		String str = "";
		while((line = bf.readLine()) != null){
			str=str+line;
		}
		System.out.println(str); 
		Parent parentObj = om.readValue(str, Parent.class);
		CreatorDelete creatorDeleteObj = new CreatorDelete();
		creatorDeleteObj.creatorDelete(parentObj);
	}
}
