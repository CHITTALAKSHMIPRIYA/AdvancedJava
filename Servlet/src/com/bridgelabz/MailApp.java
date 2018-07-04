package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MailApp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String to = request.getParameter("to");
       
        //String message =  request.getParameter("message");
        String user = "chitta6896@gmail.com";
        String pass = "manivasu";
        RequestDispatcher dispatch =request.getRequestDispatcher("PreLogin");
        dispatch.forward(request, response);
        try {
			SendMail.send(to, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        out.println("Mail send successfully");
}
}
