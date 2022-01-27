<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="age_db.jsp">
		<label>이름<input type="text" name="name"></label><br>
		<input type="submit" value="이름으로 조회">
	</form>
	<input type="button" value="전체확인" onclick="selectAll()">
</body>
<script>
	function selectAll(){
		location.href = "age_all.jsp";
	}
</script>
</html>