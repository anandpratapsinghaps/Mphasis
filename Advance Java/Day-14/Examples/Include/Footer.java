package com.example.include;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Footer")
public class Footer extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	PrintWriter out = response.getWriter();

		// Display the footer
out.print("<h1 style='margin-left:50%;"
		+ "mmmmmargin-top:"
		+ "20%;'>©copyright 2010-2020</h1>");
	}
}
