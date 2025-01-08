package com;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SourceServlet1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("<h1>Main Servlet</h1>");
		response.getWriter().println("<p>Before including Target Servlet</p>");

		// Include the response of the target servlet
		RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher("/target");
		dispatcher.include((ServletRequest) request, response);

		response.getWriter().println("<p>After including Target Servlet</p>");
	}
}
