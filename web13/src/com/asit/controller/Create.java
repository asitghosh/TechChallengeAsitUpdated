package com.asit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.asit.bin.Creator;
//import com.asit.bin.Marketplace;
//import com.asit.bin.Parent;
//import com.asit.bin.ReturnName;
import com.asit.bean.*;
import com.asit.dao.TableCreation;
import com.asit.domain.AccountDomain;
import com.asit.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

/**
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eurl = request.getParameter("url");
		response.setContentType("application/json");
		ObjectMapper om = new ObjectMapper();
		
		PrintWriter  pw = response.getWriter();
		
		CreateUtil createUtil = new CreateUtil();
		try {
			createUtil.createUrl(eurl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		AccountIdentifierUtil accountIdentifierUtilObj = new AccountIdentifierUtil();
		String accidn = accountIdentifierUtilObj.getaccountidntfr();
		ReturnName rn = new ReturnName();
			rn.setSuccess(true);
			rn.setAccountIdentifier(accidn);
			String js = om.writeValueAsString(rn);
			pw.println(js);
	}
}
