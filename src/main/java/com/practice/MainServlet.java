package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Working in service method of Http Servlet...");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>This is GenericServlet Class</h1>");
		out.println("<h1>The Date is "+ new Date().toString() +"</h1>");
	}


}
