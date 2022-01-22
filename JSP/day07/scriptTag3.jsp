<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.even{
		color: blue;
	}
	.odd{
		color: red;
	}
</style>
</head>
<body>
	<table border="1">
		<%
			for(int i=1; i<=5; i++){
		%>
			<tr class="<%= i%2==0?"even":"odd"%>">
				<%
					for(int j=1; j<=i; j++){
				%>
					<td><%=i %>행<%=j %>열</td>
				<%
					}
				%>
				
			</tr>
		<%
			}
			for( int i=1; i<=5; i++){
		%>
			<tr class="<%=(i+5)%2==0?"even":"odd" %>">
				<%
					for( int j=1; j<=6-i; j++ ){
				%>
					<td><%=i+5 %>행<%=j %>열</td>
				<%
					}
				%>
			</tr>
		<%
			}
		%>
	
	</table>
</body>
</html>