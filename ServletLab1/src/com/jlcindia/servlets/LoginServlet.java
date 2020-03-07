package com.jlcindia.servlets;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	{
		String unm = req.getParameter("UserName");
		String pwd = req.getParameter("password");
		String msg = "";
		if (unm.contentEquals(pwd)) 
		{
			msg = "<h1>Login Success<br/>Welcome to jlc home page";
		} else
		{
			msg = "<h1>Login failed<br/>invalid user or password";
		}
		Writer out = res.getWriter();
		out.write(msg);
	}
}