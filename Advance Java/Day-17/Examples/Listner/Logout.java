package com.example.listner;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logoutt")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        // Remove the "userName" attribute from the session
        session.removeAttribute("userName");
        System.out.println("Session Listener attributeRemoved() method will be called");
        
        // Invalidate the session
        session.invalidate();
        
        // Redirect to the login page
        response.sendRedirect("listner.html");
    }
}
