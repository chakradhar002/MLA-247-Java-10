package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySignUp
 */

public class MySignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (password.equals("ram")) {

			rd = request.getRequestDispatcher("/HelloS1");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("/error.html");
			rd.forward(request, response);
		}
	}
}