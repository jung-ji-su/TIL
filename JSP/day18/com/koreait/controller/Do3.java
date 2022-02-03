package com.koreait.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Do3 {
	public String execute(HttpServletRequest req, 
			HttpServletResponse resp) {
		
		req.setAttribute("result", "do3요청보내기!!");	// 처리
		return "do3.jsp";
	}
}