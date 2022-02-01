<%@page import="com.koreait.dto.TBLMemberBean"%>
<%@page import="com.koreait.dao.TBLMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	TBLMemberDao mdao = new TBLMemberDao();
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	
	TBLMemberBean member = mdao.login2(userid, userpw);
	
	if(member != null){
		// 로그인 성공	
		// session 
		session.setAttribute("session_id", member);
%>
	<script>
		location.href = "main_view.jsp";
	</script>
<%
	} else {
	// 로그인 실패
%>
	<script>
		alert("로그인실패");
		location.href = "login_view.jsp";
	</script>
<%
	}
%>

</body>
</html>