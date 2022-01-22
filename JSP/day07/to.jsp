<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ans = request.getParameter("ans");

	// 화면에 출력할 문자열
	String result = null;
	
	if( ans == null || ans.equals("") ){
		result = "응답할 내용이 없습니다";
	} else {
		int userSelect = Integer.parseInt(ans);
		if(userSelect == 300){
			result = "정답입니다.";
		} else {
			result = "정답이 아닙니다.";
		}
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><h1>응답결과</h1></div>
	<div>
		<p><%= result %></p>
	</div>
	<!-- 
		ans가 없거나 null 			: 응답할 내용이 없습니다. 
		ans가 300이면 				: 정답입니다. 
		ans가 300이 아닌 나머지 값 	: 정답이 아닙니다.	
	 -->
</body>
</html>