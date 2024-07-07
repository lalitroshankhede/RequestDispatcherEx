package com.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		PrintWriter printWriter=response.getWriter();
		
		String uname=request.getParameter("username");
		String upass=request.getParameter("password");
        String confirmPass=request.getParameter("confpassword");
       
		
		if (upass.equals(confirmPass)) {
			
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/welcome");
			requestDispatcher.forward(request, response);
				
		}
		
		else
		{
		
			printWriter.print("Sorry username and password is wrong");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
			requestDispatcher.include(request, response);
		
		}
		
		
	}

}
