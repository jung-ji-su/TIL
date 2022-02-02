<%@page import="com.koreait.dao.TBLMemberDao"%>
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
		TBLMemberDao udao = new TBLMemberDao();
		request.setAttribute("list", udao.getList());
		pageContext.forward("searchview.jsp");
	%>
</body>
</html>