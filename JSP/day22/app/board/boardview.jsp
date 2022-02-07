<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		margin: 0 auto;
		width: 900px;
	}
</style>
</head>
<body>
	<c:set var="board" value="${requestScope.board }"/>
	<c:set var="replylist" value="${requestScope.replylist }"/>
	<div>
		<table style="width: 900px; border: 0px;">
			<tr align="center" valign="middle">
				<td><h3>MVC 게시판</h3></td>
			</tr>
		</table>
		<table border="1" style="border-collapse: collapse;">
			<tr height="30px">
				<th align="center" width="150px">제목</th>
				<td>
					${board.boardtitle }
					<span style="font-weight: bold; color: #6a1b9a; float: right;">
						조회수 : ${board.boardreadcount } 
					</span>
				</td>
			</tr>
			<tr height="30px;">
				<th align="center" width="150px">글쓴이</th>
				<td> ${board.username } </td>
			</tr>
			<tr height="300px;">
				<th align="center" width="150px">내용</th>
				<td valign="top" style="padding: 10px"> ${board.boardcontents }</td>
			</tr>
		</table>
		<table style="border: 0px">
			<tr align="right" valign="middle">
				<td><a href="${pageContext.request.contextPath }/board/Boardlist.do">[목록]</a></td>
			</tr>
		</table>
		
		<!-- 댓글 -->
		<form name="replyForm" action="${pageContext.request.contextPath }/board/AddReply.do" method="post">
			<input type="hidden" name="boardnum" value="${board.boardnum }">
			<table>
				<tr>
					<td align="center" width="200px;">
						댓글<br><hr>
						이름  <input type="text" name="username" maxlength="10" ><br>
						비밀번호<input name="password" type="password" maxlength="10" >
					</td>
					<td style="padding-left: 10px">
						<textarea name="replycontents" style="width: 680px;height: 85px;resize: none;"></textarea><br>
						<a href="javascript:document.replyForm.submit()">[등록]</a>
					</td>
				</tr>
			</table>
			
			<hr>
			<!-- 댓글 리스트 -->
			<table border="1">
				<c:choose>
					<c:when test="${replylist != null and fn:length(replylist) > 0 }">
						<c:forEach var="reply" items="${replylist }">
							<tr>
								<td align="center" width="200px" >${reply.username }</td>
								<td valign="top" style="padding-left: 10px;">
									<textarea id="reply${reply.replynum }" name="reply${reply.replynum }" style="text-align:left;border:0px;width:680px;height:85px;resize:none;" readonly>${reply.replycontents }
									</textarea><br>
									<a href="javascript:updateReply(${reply.replynum}, '${reply.password}' )">[수정]</a>
									<a href="javascript:updateReadonlyReply( ${reply.replynum} );">[수정 하기]</a>
									<a href="javascript:deleteReply(${reply.replynum}, '${reply.password}')">[삭제]</a>
								</td>
							</tr>
						</c:forEach>
						
					</c:when>
					<c:otherwise>
						<tr>
							<td align="center">댓글이 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</table>
		</form>
	</div>
</body>
<script>
	// 삭제 function
	function deleteReply(replynum, password ){
		alert(password);
		let pw = prompt("댓글 비밀번호를 입력하세요.");
		if(pw == password){
			document.replyForm.action = "${pageContext.request.contextPath }/board/DeleteReply.do?replynum="+replynum;
			document.replyForm.submit();
		}
	}


	// 수정 function
	function updateReply( replynum, password ){
		let pw = prompt("댓글 비밀번호를 입력하세요.");
		if( pw == password ){
			document.replyForm.action = "${pageContext.request.contextPath }/board/UpdateReply.do?replynum="+replynum;
			document.replyForm.submit();
		}
	}

	// 수정하기 function
	function updateReadonlyReply( replynum ){
		alert(replynum);
		document.getElementById( 'reply' + replynum ).readOnly = false;
	}
</script>
</html>