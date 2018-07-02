package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class RegistrationFilter
 */
@WebFilter("/RegistrationFilter")
public class RegistrationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegistrationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		  String id=request.getParameter("id");
		  String name=request.getParameter("name");
		  String gmail=request.getParameter("gmail");
		  String mobile=request.getParameter("mobile");
		  String password=request.getParameter("password");
		  if(id.equals("")||name.equals("")||gmail.equals("")||mobile.equals("")||password.equals(""))
		  {
			 out.print("fields cannot be empty.Please enter details");
		  }
		  
		  else
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
