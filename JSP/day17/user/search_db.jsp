<%@page import="com.koreait.dto.TBLMemberBean"%>
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
		String userid = request.getParameter("userid");
		TBLMemberBean user = udao.searchById(userid);
		request.setAttribute("user", user);
		pageContext.forward("searchview.jsp");
	%>

</body>
</html>