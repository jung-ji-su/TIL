<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	// 	페이지 영역에 저장된다.
	pageContext.setAttribute("result","hello");
%>
<body>
	${param.num }
	<br>---------------------<br>
	${result }<br>
	<br>---------------------<br>
<%-- 	<%=request.getAttribute("result") %>입니다. --%>
	${requestScope.result } 입니다.!!!!<br>
	${names[0] }<br>
	${names[1] }<br>
	${notice.id }<br>
	${notice.title }<br>
	---------------------<br>
	${param.num}<br>
	${param.num >= 3}<br>
	${param.num ge 3}<br>
	---------------------<br>
	${empty param.num }<br>
	${not empty param.num }<br>
	---------------------<br>
	${not empty param.num?'값이 비어 있지 않습니다.':param.num }<br>
	---------------------<br>
	${param.num / 2}<br>
</body>
</html>









