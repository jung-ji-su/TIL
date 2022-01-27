<%@page import="com.koreait.dto.MemberBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mdao" class="com.koreait.dao.MemberDao"/>
	<%
		ArrayList<MemberBean> result =  mdao.selectAll();
	%>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<%
			for( MemberBean member : result ){
				System.out.println("member");
		%>
			<tr>
				<td><%=member.getName() %></td>
				<td><%=member.getAge() %></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>