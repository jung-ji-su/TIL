package com.koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class MyServlet1 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=UTF-8");
		 
		String paramCnt = arg0.getParameter("cnt");
		System.out.println("paramCnt : " + paramCnt );
		int cnt = 100;
		
		if( paramCnt != null && !paramCnt.equals("") ) {
			cnt = Integer.parseInt(paramCnt);
		}
		
		System.out.println("cnt : " + cnt );
		
		PrintWriter out = arg1.getWriter();
		for(int i = 0; i<cnt; i++) {
			out.println((i+1) + "안녕 servlet<br>");
		}
	}
}