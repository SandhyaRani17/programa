package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends GenericServlet 
{
	public void service(ServletRequest request,ServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		String username=request.getParameter("uid");
		String password=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		out.println("<h1><center>");
		if(username.equalsIgnoreCase("deloitte")&&password.equals("nexwave"))
			out.println("welcome to website");
		else
			out.println("invalid username and password");
		out.println("</center></h1>");
	}

}
