<%@page import="com.koreait.dao.MemberDao"%>

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
		String name = request.getParameter("name");
		System.out.println(name);
		MemberDao mdao = new MemberDao();
		int age = mdao.getAge(name);
	%>
	
	<%
		if( age != 0){
	%>
		이름 : <%=name %><br>
		나이 : <%=age %><br>
	<%
		} else {
	%>
		찾는 이름이 없습니다
	<%
		}
	%>

	<input type="button" value="다시 검색하기" onclick="location.href='age_search.jsp'">
</body>
</html>