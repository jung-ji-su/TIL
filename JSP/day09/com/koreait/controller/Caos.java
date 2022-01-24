package com.koreait.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/caos")
public class Caos extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		int num = 0;
		String num_ = request.getParameter("num");
		
		if( num_ != null || !num_.equals("") ){
			num = Integer.parseInt(num_);
		}
		
		String result = "";
		if( num%2 != 0 ){
			result = "홀수";
		} else {
			result = "짝수";
		} 
		
		request.setAttribute("result", result);
		
		// RequestDispatcher 
		// 요청을 제공하는 도구, 즉 요청을 보내주는 인터페이스
		RequestDispatcher dispatcher 
		  = request.getRequestDispatcher("caos.jsp");
		dispatcher.forward(request, response);
		
	}
}