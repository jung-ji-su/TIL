<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<%
			for( int i=1; i<=3; i++ ){
		%>
			<tr>
				<% 
					for( int j=1; j<=5; j++ ){
				%>
					<td><%=i %>행 <%=j %>열</td>
				<%
					} 
				%>
				
			</tr>
		<%
			}
		%>
	</table>

<!-- 	<table border="1"> -->
<!-- 		<tr> -->
<!-- 			<td>1행 1열</td> -->
<!-- 			<td>1행 2열</td> -->
<!-- 			<td>1행 3열</td> -->
<!-- 			<td>1행 4열</td> -->
<!-- 			<td>1행 5열</td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>2행 1열</td> -->
<!-- 			<td>2행 2열</td> -->
<!-- 			<td>2행 3열</td> -->
<!-- 			<td>2행 4열</td> -->
<!-- 			<td>2행 5열</td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>3행 1열</td> -->
<!-- 			<td>3행 2열</td> -->
<!-- 			<td>3행 3열</td> -->
<!-- 			<td>3행 4열</td> -->
<!-- 			<td>3행 5열</td> -->
<!-- 		</tr> -->
<!-- 	</table> -->
</body>
</html>