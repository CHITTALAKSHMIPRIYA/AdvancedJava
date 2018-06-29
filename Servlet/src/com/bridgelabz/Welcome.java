package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		String name=(String) req.getAttribute("passName");
		String id=(String) req.getAttribute("pass");
		String mobile=(String) req.getAttribute("passMobile");
		String gmail=(String) req.getAttribute("passMail");
		String password=(String) req.getAttribute("password");
		PrintWriter out=resp.getWriter();
		out.println(""+name+" "+mobile);
		RequestDispatcher rs=req.getRequestDispatcher("Welcome");
		rs.forward(req, resp);

}
}