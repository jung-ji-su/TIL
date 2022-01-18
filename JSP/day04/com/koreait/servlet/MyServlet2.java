package com.koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cnt")
public class MyServlet2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=UTF-8");
		 
		String paramNum = arg0.getParameter("num");
		int num = 100;
		
		if( paramNum != null && !paramNum.equals("") ) {
			num = Integer.parseInt(paramNum);
		}
		
		PrintWriter out = arg1.getWriter();
		for(int i = 0; i<num; i++) {
			out.println((i+1) + "안녕 servlet<br>");
		}
	}
}