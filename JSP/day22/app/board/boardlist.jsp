<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 게시판</title>
<style>
	a:visited{
		color:#ce93d8;
		text-decoration:none;
	}
	a:hover{
		color:#ce93d8;
		text-decoration:none;
		font-weight:bold;
	}
	a:link {
		color:#ce93d8;
		text-decoration:none;
	}
	table{
		margin: 0 auto;
	}
</style>
</head>
<body>
	<c:set var="boardList" value="${requestScope.boardList }"/>
	<c:set var="totalCnt" value="${requestScope.totalCnt }"/>

	<div>
		<table style="width: 900px; border: 0px;">
			<tr align="center" valign="middle">
				<td><h3>MVC 게시판</h3></td>
			</tr>
			<tr align="right" valign="middle">
				<td>글 개수 : ${totalCnt } 개</td>
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
			<c:choose>
				<c:when test="${boardList != null and fn:length(boardList) > 0 }">
					<%-- 게시글이 있는 경우 --%>
					<c:forEach var="board" items="${boardList }">
						<tr align="center" valign="middle"
						onmouseover="this.style.background='#bbdefb'" onmouseout="this.style.background=''">
							<td height="23px">
								${board.boardnum }
							</td>
							<td height="23px">
								<a href="${pageContext.request.contextPath }/board/BoardView.do?boardnum=${board.boardnum }"> ${board.boardtitle }</a>
							</td>
							<td height="23px">
								${board.username }
							</td>
							<td height="23px">
								${board.boarddate }
							</td>
							<td height="23px">
								${board.boardreadcount }
							</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<%-- 게시글이 없는 경우 --%>
					<tr style="height: 50px;">
						<td colspan="5" style="text-align: center;">등록된 게시물이 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</table><br>
		
		<!-- 페이징처리 -->
		<table style="border: 0px; width: 900px;">
			<tr align="center" valign="middle">
				<td>
					<c:if test="${nowPage > 1 }">
						<a href="${pageContext.request.contextPath }/board/Boardlist.do?page=${nowPage - 1 }">[&lt;]</a>
					</c:if>
					
					<c:forEach var="i" begin="${startPage}" end="${endPage }">
						<%-- 현재 보고있는 페이지는 a tag를 제거 --%>
						<c:choose>
							<c:when test="${i == nowPage }">
								[${i }]						
							</c:when>
							<c:otherwise>
								<a href="${pageContext.request.contextPath }/board/Boardlist.do?page=${i }">[${i }]</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					
					<c:if test="${nowPage<totalPage }">
						<a href="${pageContext.request.contextPath }/board/Boardlist.do?page=${nowPage + 1 }">[&gt;]</a>
					</c:if>
				</td>
			</tr>
		</table>
		
		<!-- 글쓰기 -->
		<table style="border: 0px; width: 900px;">
			<tr align="right" valign="middle">
				<td><a href="${pageContext.request.contextPath }/board/BoardWrite.do">[글쓰기]</a></td>
			</tr>
		</table>
	</div>
</body>
</html>