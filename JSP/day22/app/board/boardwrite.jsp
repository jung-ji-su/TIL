<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<c:if test="${not param.flag and not empty param.flag }">
			<script>
				alert("게시글 등록 실패! 다시 시도하세요");
			</script>
		</c:if>
	
		<form method="post" name="boardForm" 
			action="${pageContext.request.contextPath }/board/BoardWriteOk.do">
			<table style="width: 900px; border: 0px;">
				<tr align="center" valign="middle">
					<td><h3>MVC 게시판</h3></td>
				</tr>
			</table>	
			<table border="1" style="border-collapse: collapse;">
				<tr height="30px">
					<th align="center" width="150px;">
						제목
					</th>
					<td>
						<input type="text" name="boardtitle" size="50" maxlength="100" value="" placeholder="제목을 입력하세요">
					</td>
				</tr>
				<tr height="30px">
					<th align="center" width="150px">
						글쓴이
					</th>
					<td>
						<input type="text" name="username" size="50" maxlength="100" value="" placeholder="이름을 입력하세요">
					</td>
				</tr>
				<tr height="30px">
					<th align="center" width="150px">
						내용
					</th>
					<td>
						<textarea name="boardcontents" style="width: 700px;height: 250px;"></textarea>
					</td>
				</tr>
			</table>
			<table style="border: 0px;">
				<tr align="right" valign="middle">
					<td>
						<a href="javascript:document.boardForm.submit()">[등록]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/board/Boardlist.do">[목록]</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>