package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost method of HttpServlet...");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();		

		String name = req.getParameter("user_name");
		String pass = req.getParameter("user_pass");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String condition = req.getParameter("condition");

		if (condition != null) {
			if (condition.equals("checked")) {
				out.println("<h2>Welcome to Register Servlet</h2>");
				out.println("<h2>Name : " + name + "</h2>");
				out.println("<h2>Password : " + pass + "</h2>");
				out.println("<h2>Email : " + email + "</h2>");
				out.println("<h2>Gender : " + gender + "</h2>");
				out.println("<h2>Course : " + course + "</h2>");
			}
		} else {
			out.println("<h2>You have not accepted terms and conditions...!!!</h2>");
		}

	}

}
