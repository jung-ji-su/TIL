<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 게시판</title>
</head>
<body>
	<div>
		<table style="width: 900px; border: 0px;">
			<tr align="center" valign="middle">
				<td><h3>MVC 게시판</h3></td>
			</tr>
			<tr align="right" valign="middle">
				<td>글 개수 : XX 개</td>
			</tr>
		</table>
		<!-- 게시글 -->
		<table border="1" style="border-collapse: collapse;border-spacing: 0;width: 900px;">
			<tr align="center" valign="middle">
				<th width="8%">번호</th>
				<th width="50%">제목</th>
				<th width="15%">작성자</th>
				<th width="17%">날짜</th>
				<th width="10%">조회수</th>
			</tr>
			
			<!-- 게시글 -->
		</table><br>
		<!-- 페이징처리 -->
		<table style="border: 0px; width: 900px;">
			<tr align="right" valign="middle">
				<td><a href="">[글쓰기]</a></td>
			</tr>
		</table>
	</div>
</body>
</html>