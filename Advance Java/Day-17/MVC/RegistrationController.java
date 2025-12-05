package com.example.mvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			User user = new User();
			
			String s1 = request.getParameter("fName");
			user.setName(s1);
			String s2= request.getParameter("lName");
			user.setLastName(s2);
			user.setLastName(request.getParameter("lName"));
			user.setPassword(request.getParameter("password"));
			user.setAddress(request.getParameter("address"));
			user.setGender(request.getParameter("gender"));
			user.setCountry(request.getParameter("country"));
			try {
				user.setAge(Integer.parseInt(request.getParameter("age")));
			} catch (NumberFormatException e) {
				throw new RegistrationBusinessException("Age should be a Number");
			}

			RegistrationBO registerBo = new RegistrationBO();
			
			if (registerBo.registerUser(user)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/MVC/success.jsp");
				dispatcher.forward(request, response);
			}
		} catch (RegistrationBusinessException e) {
			request.setAttribute("message", e.getMessage());
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/MVC/Registration.jsp");
			dispatcher.forward(request, response);
			
		} catch (RegistrationException e) {
			e.printStackTrace();
			request.setAttribute("errMessage", "Fatal Error");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/MVC/error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
