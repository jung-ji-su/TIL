<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int num = 0;
	String num_ = request.getParameter("num");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if( num_ != null || !num_.equals("") ){
			num = Integer.parseInt(num_);
		}
	%>

	<% if( num%2 != 0 ){	%>
		홀수입니다.
	<% } else { %>
		짝수입니다.
	<% } %>
</body>
</html>