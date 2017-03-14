package com.asit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.asit.bean.ReturnCancelResponse;
import com.asit.bean.ReturnErrorData;
import com.asit.service.DeleteService;
import com.asit.util.CancelUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class Cancel
 */
@WebServlet("/Cancel")
public class Cancel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eurl = request.getParameter("url");
		response.setContentType("application/json");
		ObjectMapper om = new ObjectMapper();
		System.out.println(eurl);
		PrintWriter  pw = response.getWriter();
		
		CancelUtil cancelUtil = new CancelUtil();
		try {
			cancelUtil.cancelUrl(eurl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DeleteService deleteServiceObj = new DeleteService();
		int check = deleteServiceObj.deleteService();
		if(check>0)
		{
		ReturnCancelResponse rn = new ReturnCancelResponse();
		rn.setSuccess(true);
		String js = om.writeValueAsString(rn);
		pw.println(js);
		}
		else
		{
			ReturnErrorData rd = new ReturnErrorData();
			rd.setSuccess(false);
            rd.setErrorCode("ACCOUNT_NOT_FOUND");
            rd.setMessage("Account Identifier doesn't exist in database");
		}
	} 
}
