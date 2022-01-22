<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="myForm" method="post" action="action.jsp">
		<fieldset>
			<legend>Post Data 전송예제</legend>
			<div>
				<label for="user_name"> 이름 </label>
				<input type="text" name="user_name" id="user_name">
			</div>
			<button type="submit">Submit</button>
		</fieldset>
	</form>
</body>
</html>