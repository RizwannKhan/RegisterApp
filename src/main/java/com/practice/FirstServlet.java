package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Working in service method of generic method...");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1>This is GenericServlet Class</h1>");
		out.println("<h1>The Date is "+ new Date().toString() +"</h1>");
	}

}
