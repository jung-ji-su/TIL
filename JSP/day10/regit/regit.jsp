<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입 폼</h3>
	<form action="join.jsp" method="post" id="joinForm">
		아이디<input type="text" name="userid" id="userid"><br>
		비밀번호<input type="password" name="userpw" id="userpw"><br>
		이름<input type="text" name="username" id="username"><br>
		핸드폰 번호<input type="text" name="userphone" id="userphone"><br>
		<br>
		<input type="button" value="회원가입" onclick="sendit()">
	</form>
</body>
<script>
	//validation check
	function sendit(){
		let frm = document.getElementById("joinForm");
		
		// id로 가지고올때
		let idTag = document.getElementById("userid");
		let pwTag = document.getElementById("userpw");
		// name 속성 가지고 올때
		let nameTag = frm.username;
		let phoneTag = frm.userphone;
		
		if(idTag.value == ""){
			alert("아이디를 입력하세요!");
			idTag.focus();
			return false;
		}
		if(pwTag.value.length < 8){
			alert("패스워드는 8자리 이상으로 입력하세요!");
			pwTag.focus();
			return false;
		}
		
		frm.submit();
	}
</script>
</html>