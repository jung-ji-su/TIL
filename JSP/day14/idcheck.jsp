<%@page import="com.koreait.dao.TBLMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	TBLMemberDao mdao = new TBLMemberDao();
	if( mdao.checkid(userid) ){
		// id 중복 아님
		out.print("ok");
	} else {
		// id 중복 일때
		out.print("not-ok");
	}
%>