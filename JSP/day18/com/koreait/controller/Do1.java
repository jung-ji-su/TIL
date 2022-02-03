package com.koreait.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Do1 {
	public String execute(HttpServletRequest req, 
			HttpServletResponse resp) {
		
		req.setAttribute("result", "do1요청보내기!!");	// 처리
		return "do1.jsp";
	}
}