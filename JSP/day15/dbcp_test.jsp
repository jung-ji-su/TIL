<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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
		// dbcp를 이용하는 dbConnection 방법
		Context context = new InitialContext(null);	// WAS와 연결하는 부분(연결 컨텍스트 형성)
		DataSource dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		/*
			연결된 WAS(context)에서 데이터 소스 검색해서 가지고오기(JNDI 활용)
			모든 설정 자원은 JNDI namespace java:comp/env 에 담기게 된다.
			jdbc/oracle 나의 DataSource에 연결
		*/
		
		Connection conn = dataSource.getConnection();
			
		String sql = "SELECT SYSDATE FROM DUAL";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		Date date = null;
		if( rs.next() ){
			date = rs.getDate(1);
		}
	%>
<%-- 	<%=conn %> --%>
	<%=date %>
</body>
</html>