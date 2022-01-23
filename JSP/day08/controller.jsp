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
		String site = request.getParameter("site");
		System.out.println(site);
		String resultURI = "";
		
		if(site.equals("naver")){
			resultURI = "forward_naver.jsp";
		} else if(site.equals("google")){
			resultURI = "forward_google.jsp";
		} else {	// daum
			resultURI = "forward_daum.jsp";
		}
	%>
	
	<jsp:forward page="<%=resultURI %>" />
</body>
</html>