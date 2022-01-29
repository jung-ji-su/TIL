<%@page import="com.koreait.dao.TBLMemberDao"%>
<%@page import="com.koreait.dto.TBLMemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.koreait.dto.TBLMemberBean" />
	
<!-- 	각각 전달되는 파라미터값을 각각 처리해 주어야 하지만 *로 해주면 한번에 처리 가능 -->
	<jsp:setProperty property="*" name="member"/>
	
<%-- 	<jsp:setProperty property="userid" name="member"/> --%>
<%-- 	<jsp:setProperty property="userpw" name="member"/> --%>
<%-- 	<jsp:setProperty property="username" name="member"/> --%>
<%-- 	<jsp:setProperty property="usergender" name="member"/> --%>

<!-- 	memeber.setUserid(request.getparameter("userid")); -->

<%
	TBLMemberDao mdao = new TBLMemberDao();
	if(mdao.join(member)){
		// 회원가입 성공
%>
	<script>
		alert("회원가입 성공");
		location.href="login_view.jsp";
	</script>

<% 
	}else{
		// 회원가입 실패
%>
	<script>
		alert("회원가입 실패");
		location.href="join_view.jsp";
	</script>
<%} %>
	
	
</body>
</html>