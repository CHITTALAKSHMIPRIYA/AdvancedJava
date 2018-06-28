package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	  {
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		  String id=req.getParameter("id");
		  String name=req.getParameter("name");
		  String gmail=req.getParameter("gmail");
		  String mobile=req.getParameter("mobile");
		 
		  String password=req.getParameter("password");
		  Connection con=null;
		  PreparedStatement pstmt=null;
		  try
		  {
			  Class.forName("com.mysql.jdbc.Driver");
			  String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			  con=DriverManager.getConnection(dbUrl);
			  String query="insert into Studentdata (id,name,gmail,mobile,password) values(?,?,?,?,?)";
			  pstmt=con.prepareStatement(query);
			  pstmt.setString(1,id);
			  pstmt.setString(2,name);
			  pstmt.setString(3, gmail);
			  pstmt.setInt(4,Integer.parseInt(mobile));
			  pstmt.setString(5, password);
			  int count=pstmt.executeUpdate();
			  if(count>0)
	          {
	            out.println("You are sucessfully registered");
	          }
		  }
		  catch (Exception e) 
		  {
				e.printStackTrace();
			} finally 
		  {

				try {
					if (con != null) {
						con.close();
					}
					if (pstmt != null) {
						pstmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	  }
	}


