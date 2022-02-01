<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL TEST</h2>
	<!-- 변수선언, scope : 어느 범위까지 사용하는지, page: pageContext -->
	<c:set var="userid" value="apple" scope="page"/>
	회원 아이디 :  <c:out value="${userid }" /><br>
	회원 아이디 :  ${userid }<br>
	<hr>
	<%-- <c:set>이 사이에 들어가는 값이 value</c:set>--%>
	<c:set var="userid" scope="session">apple100</c:set>
	<c:set var="username" scope="session">사과100</c:set>
	회원아이디 : ${userid }<br>
	회원이름 : ${username }<br>
	회원아이디 : ${sessionScope.userid }<br>
	회원이름 : ${sessionScope.username }<br>
</body>
</html>