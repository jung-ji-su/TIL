<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login_db.jsp" method="post" name="frm">
		<p>
			<label>아이디<input type="text" name="userid"> </label>
		</p>
		<p>
			<label>패스워드<input type="password" name="userpw"> </label>
		</p>
		<input type="button" value="로그인" onclick="sendit()">
	</form>
</body>
<script>
	function sendit(){
		// validation check
		let frm = document.frm;
		let userid = frm.userid;
		let userpw = frm.userpw;
		
		if(userid.value == ""){
			alert("아이디를 입력하세요!");
			userid.focus();
			return false;
		}
		
		if(userpw.value == ""){
			alert("패스워드를 입력하세요!");
			userpw.focus();
			return false;
		}
		
		frm.submit();
	}
</script>
</html>