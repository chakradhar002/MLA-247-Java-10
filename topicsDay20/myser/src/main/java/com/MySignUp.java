package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySignUp
 */
@WebServlet("/MySignUp")
public class MySignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   response.setContentType("text/html");
		String email = request.getParameter("email");
		System.out.println(email);
		
		 PrintWriter out = response.getWriter();
		 
		 out.println("<html><body>");
	        out.println("<h1>Sign-Up Successful</h1>");
	        out.println("<p>Welcome, " + email + "!</p>");
	        out.println("</body></html>");

	}

}
