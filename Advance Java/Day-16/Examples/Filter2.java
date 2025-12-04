package com.example.filter;
import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/ChainingDemo")
public class Filter2 implements Filter {

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        // Initialization logic, if required
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Pre-processing: Set an attribute in the request
        request.setAttribute("value2", "filter2 called");

        // Pass the request and response to the next filter or servlet in the chain
        chain.doFilter(request, response);

        // Post-processing logic can be added here, if required
    }

    @Override
    public void destroy() {
        // Cleanup logic, if required
    }
}
