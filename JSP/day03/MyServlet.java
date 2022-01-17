package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0
			, HttpServletResponse arg1) throws ServletException, IOException {
		
		PrintWriter out = arg1.getWriter();
		out.println("Hello Servlet");		
	}
}