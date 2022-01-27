<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="com.koreait.dto.UserBean" id="user" />
	<jsp:setProperty property="userid" name="user" value="id_123"/>
	<jsp:setProperty property="userpw" name="user" value="password123"/>
	
	<table border="1"> 
		<tr>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<tr>
			<td><jsp:getProperty property="userid" name="user"/></td>
			<td><jsp:getProperty property="userpw" name="user"/></td>
		</tr>
	</table>
</body>
</html>