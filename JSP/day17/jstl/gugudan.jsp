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
	<c:forEach var="i" begin="1" end="9" step="1">
		5 X ${i } = ${5*i }<br>
	</c:forEach>
	<hr>
	<form>
		<c:choose>
			<c:when test="${empty param.dan }">
				<%--처음 시작 했을 때, 단을 입력할 수 있는 인풋 창 --%>
				단 <input type="text" name="dan"><br>
				<input type="submit">
			</c:when>
			<c:otherwise>
				<%-- 입력 후 submit 했을 때 --%>	
				<%-- 입력한 단으로 구구단 출력 or 0이하이거나, 100초과이면 메시지 출력 --%>
				<c:set var="dan" value="${param.dan }"/>
				<c:choose>
					<%-- 제대로 단을 입력했을때 --%>
					<c:when test="${dan >= 1 and dan <= 100 }">
						<c:forEach var="i" begin="1" end="9" step="1">
							${dan } X ${i } = ${dan*i }<br>
						</c:forEach>
					</c:when>
					<%-- 잘못 입력했을때 --%>
					<c:otherwise>
						1 이상 100 이하의 숫자를 입력하세요!!
					</c:otherwise>						
				</c:choose>
				<input type="button" value="홈으로 돌아가기" onclick="history.go(-1);">
			</c:otherwise>
		</c:choose>
	</form>
</body>
</html>