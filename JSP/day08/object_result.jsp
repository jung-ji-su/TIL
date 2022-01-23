<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("username") %>님 어서오세요<br>
	생일은 <%=request.getParameter("userbirth") %> 이군요!!

</body>
</html>