<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	
	out.print("아이디 : " + userid + " 비밀번호 : " + userpw);
	
	
%>