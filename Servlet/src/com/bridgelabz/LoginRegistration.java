package com.bridgelabz;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginRegistration extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) { 
		
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String name=req.getParameter("passName");
		String mobile=req.getParameter("passMobile");
		String gmail=req.getParameter("passMail");
		req.setAttribute("pass",id);
		req.setAttribute("password",password);
		req.setAttribute("passName",name);
		req.setAttribute("passMobile",mobile);
		req.setAttribute("passMail",gmail);
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		RequestDispatcher dispatcher=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			String sql="select * from Studentdata where id=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			if(rs.next())
			{
				out.print("<h1>Credentials are valid</h1>");
				out.println(id+" "+password); 
				//dispatcher=req.getRequestDispatcher("Welcome");
				//dispatcher.forward(req,resp);
				resp.sendRedirect("PreSuccess");
				
				
			}
			else
			{
				out.print("<html><body><h1>Invalid Credentials </h1><a href='index.jsp'>BACK</a></body></html>");
			}
		}
			 catch(Exception e)
		     {
		   	  e.printStackTrace();
		     }
		     finally
		     {
		   	  try
		   	  {
		   		  if(con!=null)
		   		  {
		   			  con.close();
		   		  }
		   		  if(pstmt!=null)
		   		  {
		   			  pstmt.close();
		   		  }
		   		  if(rs!=null)
		   		  {
		   			  rs.close();
		   		  }
		   	  
		   	  }
		   	 catch(SQLException e)
		   	  {
		   		  e.printStackTrace();
		   		  
		   		  }
		     }
		
		}
		}
