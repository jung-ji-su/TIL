package com.koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet 3.0 이상부터는 web.xml과 annotation 방식 둘다 가능하다.
@WebServlet("/hello")
public class MyServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=UTF-8");
		 
		PrintWriter out = arg1.getWriter();
//		out.println("Hello Servlet Annotation");
		for(int i = 0; i<100; i++ ) {
			out.println((i + 1) + "안녕 servlet<br>" );
		}
	}
}