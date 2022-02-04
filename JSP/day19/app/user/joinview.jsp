<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/UserJoin.us" method="post">
		<p>
			아이디<input type="text" name="userid">
		</p>
		<p>
			비밀번호<input type="password" name="userpw">
		</p>
		<p>
			이름<input type="text" name="username">
		</p>
		<p>
			전화번호<input type="text" name="userphone">
		</p>
		<p>
			주소<input type="text" name="useraddr">
		</p>
		<p>
			<input type="submit" value="회원가입">
		</p>
	</form>
</body>
</html>