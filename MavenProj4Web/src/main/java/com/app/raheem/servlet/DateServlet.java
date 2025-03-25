package com.app.raheem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Constructor
	public DateServlet() {
		super();
	}

	// Handle GET request
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");

		// Get PrintWriter to write response
		PrintWriter pw = response.getWriter();

		// Get current date and time
		Date d = new Date();

		// Write output
		pw.println("<h1>Date and Time: " + d + "</h1>");

		// Add home hyperlink
		pw.println("<br><a href='index.jsp'>HOME</a>");

		// Close stream
		pw.close();
	}

	// Handle POST request
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
