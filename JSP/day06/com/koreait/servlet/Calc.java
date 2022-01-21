package com.koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc")
public class Calc extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0
			, HttpServletResponse arg1) throws ServletException, IOException {
		
		// application 저장소 선언
//		ServletContext application = arg0.getServletContext();
		
		// session 객체
//		HttpSession session = arg0.getSession();
		
		// cookie 객체
		Cookie[] cookies = arg0.getCookies();
		
		PrintWriter out = arg1.getWriter();
		
		String valueStr = arg0.getParameter("value");
		String operatorStr = arg0.getParameter("operator");
		
		System.out.println("valueStr : " + valueStr);
		System.out.println("operatorStr : " + operatorStr);
		
		int value = 0;
		
		if( !valueStr.equals("") ) {
			value = Integer.parseInt(valueStr);
		}
		
		// 계산
		if( operatorStr.equals("=") ) {
//			int x = (Integer)application.getAttribute("value");
//			int x = (Integer)session.getAttribute("value");
			
			int x = 0;
			//cookies 꺼내기
			for( Cookie c : cookies ) {
				if( c.getName().equals("value") ) {
					x = Integer.parseInt( c.getValue() );
					break;
				}
			}
			
			
			int y = value;
//			String operator = (String)application.getAttribute("op");
//			String operator = (String)session.getAttribute("op");
			
			String operator = "";
			for(Cookie c : cookies) {
				if(c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}
			
			int result = 0;
			if( operator.equals("+") ) {
				result = x + y;
			} else {
				result = x - y;
			}
			
			out.printf("결과 값 : %d", result);
			
		} else {	// 값 저장
//			application.setAttribute("value", value);
//			application.setAttribute("op", operatorStr);		
			
//			session.setAttribute("value", value);
//			session.setAttribute("op", operatorStr);	
			
			// cookie 값 저장, cookie로 사용할때는 문자열 형태만 사용할 수 있다.
			Cookie valueCookie = new Cookie("value", String.valueOf(value));
			Cookie opCookie = new Cookie("op", operatorStr);
			// 사용자에게 cookie가 전달된다.
			arg1.addCookie(valueCookie);
			arg1.addCookie(opCookie);
		}
	}
}