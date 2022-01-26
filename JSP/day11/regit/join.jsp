<%@page import="com.koreait.dao.UserDAO"%>
<%@page import="com.koreait.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
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

%>
</body>
</html>