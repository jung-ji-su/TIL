<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String cntStr = request.getParameter("cnt");
	
	int cnt = 100;
	if( cntStr != null && !cntStr.equals("") ){
		cnt = Integer.parseInt(cntStr);
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	for(int i =0; i<cnt; i++){
%>		
		안녕 servlet<br>
<%
	}
%>
</body>
</html>