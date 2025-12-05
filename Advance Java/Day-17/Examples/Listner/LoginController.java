package com.example.listner;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        if ("jack".equals(userName) && "rose".equals(password)) {
            HttpSession session = request.getSession();
            System.out.println("Session Listener attributeAdded() method will be called");
            session.setAttribute("userName", userName);

            System.out.println("Session Listener attributeAdded() method will be called");
            session.setAttribute("pageNo", "1");

            response.sendRedirect("Home");
        } else {
            response.sendRedirect("listner.html");
        }
    }
}
