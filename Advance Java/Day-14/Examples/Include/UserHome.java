package com.example.include;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserHome")
public class UserHome extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head>");
        out.print("<title>User Home</title></head><body>");

        // Set attribute to pass to Welcome servlet
        request.setAttribute("name", "Arun");

        // Include Welcome Servlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome");
        dispatcher.include(request, response);

        // Content in the UserHome servlet
    out.print("<h2 style='color:green;margin-left:50%;margin-top:20%;'>"
    		+ "This is the User home</h2>");

        // Include Footer Servlet
        dispatcher = request.getRequestDispatcher("Footer");
        dispatcher.include(request, response);

        out.print("</body></html>");
    }
}
