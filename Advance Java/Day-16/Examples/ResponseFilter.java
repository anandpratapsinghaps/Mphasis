package com.example.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ResponseFilter
 */
@WebFilter("/SourceServlet")
public class ResponseFilter extends HttpFilter implements Filter {

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		// Initialization logic, if needed
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		PrintWriter out = resp.getWriter();

		// Pre-processing: Add content before passing the request along the filter chain
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<h1>Printed by the Response Filter</h1>");

		// Pass the request and response to the next filter or target servlet
		chain.doFilter(request, response);

		// Post-processing: Add content after the servlet response is completed
		out.println("<h1>This is also printed by Response Filter</h1>");
		out.println("</body></html>");
	}

	@Override
	public void destroy() {
		// Cleanup logic, if needed
	}

}
