package com.example.filter;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set content type for the response
        response.setContentType("text/html");

        // Get the writer object to send response content
        PrintWriter out = response.getWriter();

        // Write HTML content to the response
        out.print("<h1>Printed from The Source Servlet</h1>");
    }
}
