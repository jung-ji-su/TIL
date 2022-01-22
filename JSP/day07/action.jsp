<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String user_name = request.getParameter("user_name");
	
	if( user_name == null ){
		user_name = "이름이 없습니다.";
	}
	
	user_name = user_name.trim();
	
	if( user_name.equals("") ){
		user_name = "이름을 입력하세요.";
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><hi><%=user_name %></hi></div>

	<!-- 
		userName == null	: 이름이 없습니다.
		userName == ""		: 이름을 입력하세요
		userName 존재		: userName 출력
	 -->

</body>
</html>