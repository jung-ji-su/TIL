package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.dao.UserDAO;
import com.koreait.dto.UserBean;

@WebServlet("/join")
public class Join extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String username = request.getParameter("username");
		String userphone = request.getParameter("userphone");
		
		// data set
		UserBean bean = new UserBean();
		bean.setUserid(userid);
		bean.setUserpw(userpw);
		bean.setUsername(username);
		bean.setUserphone(userphone);
		
		// dao
		UserDAO udao = new UserDAO();
		boolean check = udao.join(bean);
		if(check){
			// 가입 성공
		}else{
			// 가입 실패
		}
		
	}
	
}