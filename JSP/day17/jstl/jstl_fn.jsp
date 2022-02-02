<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HashMap map = new HashMap();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
	%>
	
	<c:set var="map" value="<%=map %>"/>
	<c:set var="str1" value="jstlfn"/>
	<c:set var="str2" value="jstlfn배워봅시다"/>
	<c:set var="tokens" value="1,2,3,4,5,6,7,8,9,10" />
	
	<h1>Function 태그</h1>
	
	length(map) : ${fn:length(map) }<br>
	length(str1) : ${fn:length(str1) }<br>
	length(str2) : ${fn:length(str2) }<br>
	toUpperCase(str1) : ${fn:toUpperCase(str1) }<br>
	toUpperCase(str2) : ${fn:toUpperCase(str2) }<br>
	toLowerCase(str1) : ${fn:toLowerCase(str1) }<br>
	substring(str1, 1, 3) : ${fn:substring(str1, 1, 3) }<br>
	replace(str1, src, dest) : ${fn:replace(str1, "f", "^") }<br>
	
	<c:set var="array" value="${fn:split(tokens, ',') }"/>
	join(array,"-") : ${fn:join(array,"-") }

</body>
</html>