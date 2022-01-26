<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	// 특정 데이터베이스와 연결 정보를 가지는 Interface
	Connection conn = null;
	// DB와 연결하는 Driver class
	String driver = "oracle.jdbc.driver.OracleDriver";
	// 계정 url
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// DBMS 계정
	String user = "jsp";
	// DBMS 비밀번호
	String password = "jsp";
	
	Class.forName(driver);
	System.out.println("jdbc driver 로딩 성공!");
	
	conn = DriverManager.getConnection(url, user, password);
	System.out.println("오라클 연결 성공!");
	
	String sql = "INSERT INTO car VALUES ('4', 'Benz', 'Black', 350000000)";
	// sql문을 미리 컴파일 하여 실행 속도를 높여주는 interface
	PreparedStatement pstm = conn.prepareStatement(sql);
	
	// insert, update, delete는 executeUpdate() 사용
	// insert, update or delete가 적용된 건수 return
	// drop, create 는 0
	int check = pstm.executeUpdate();
	System.out.println("check : " + check);

%>

</body>
</html>