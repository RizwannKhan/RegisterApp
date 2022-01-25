package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost method of HttpServlet...");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// getting details incoming from request...
		String name = req.getParameter("user_name");
		String pass = req.getParameter("user_pass");
		String email = req.getParameter("user_email");

		// out.println("<h2>Welcome to Signup Servlet</h2>");
		/*
		 * out.println(name); out.println(pass); out.println(email);
		 */

		// connection with jdbc...
		try {
			
			Thread.sleep(3000);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletDB?useSSL=false", "root",
					"1234");
			// Query...
			String query = "insert into registerservlet(name,password,email) values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setString(2, pass);
			stmt.setString(3, email);
			// execute query...
			stmt.executeUpdate();
			System.out.println(stmt);

			out.println("Done...");

		} catch (Exception e) {
			e.printStackTrace();
			out.println("Error...");
		} 

	}

}
