<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="object_ok.jsp" name="joinForm">
		<fieldset>
			<legend>개인정보</legend>
			<input type="text" name="username" placeholder="이름을 입력해주세요.">
			<input type="date" name="userbirth">
			<input type="button" value="확인" onclick="sendit()">
		</fieldset>
	</form>
</body>
<script>
	function sendit(){
		let joinForm = document.joinForm;
		let nameTag = joinForm.username;
		let birthTag = joinForm.userbirth;
		
		if(nameTag.value == ""){
			alert("이름을 입력하세요");
			nameTag.focus();
			return false;
		}
		if(birthTag.value == ""){
			alert("생일을 입력하세요");
			birthTag.focus();
			return false;
		}
		
		joinForm.submit();
	}

</script>
</html>