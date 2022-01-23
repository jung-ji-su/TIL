package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// GET, POST 비교는 대문자
		if( request.getMethod().equals("GET") ) {
			System.out.println("GET 요청 입니다.");
		} else if( request.getMethod().equals("POST") ) {
			System.out.println("POST 요청 입니다.");
		}
		
		super.service(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출 됐습니다.");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드가 호출 됐습니다.");
	}		
}