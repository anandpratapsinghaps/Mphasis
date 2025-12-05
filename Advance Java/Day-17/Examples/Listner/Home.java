package com.example.listner;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<h1 style='margin-left:40px;'>Home page</h1>");
        
        HttpSession session = request.getSession();
        System.out.println("Session Listener attributeReplaced() method will be called");
        session.setAttribute("pageNo", "2");

        out.print("<a href='Logoutt'>Log Out</a>");
    }
}
