package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.koreait.dto.TBLMemberBean;

public class TBLMemberDao {
	
	Context context;
	DataSource datasource;
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	// 회원가입, insert
	public boolean join( TBLMemberBean member ) {
		
		System.out.println(member.getUserid());
		System.out.println(member.getUserpw());
		System.out.println(member.getUsername());
		System.out.println(member.getUsergender());
		
		
		String sql = "insert into tbl_member values(?,?,?,?)";
		int result = 0;
		
		try {
//			conn = DBConnection.getConnection();
			
			context = new InitialContext(null);
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = datasource.getConnection();
			pstm = conn.prepareStatement(sql);
			
			// 회원가입 항목
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getUserpw());
			pstm.setString(3, member.getUsername());
			pstm.setString(4, member.getUsergender());
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		if( result != 0 ) {
			// 성공
			return true;
		} else {
			// 실패
			return false;
		}
		
	}
	
	
	// 로그인, select
	public boolean login(String userid, String userpw) {
		
		boolean flag = false;
		String sql = "SELECT * FROM TBL_MEMBER tm  WHERE USERID = ? AND USERPW = ?";
		
		try {
//			conn = DBConnection.getConnection();
			
			context = new InitialContext(null);
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = datasource.getConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userid); 
			pstm.setString(2, userpw);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				flag = true;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public TBLMemberBean login2(String userid, String userpw) {
		TBLMemberBean member = null;
		String sql = "SELECT * FROM TBL_MEMBER tm  WHERE USERID = ? AND USERPW = ?";
		
		try {
//			conn = DBConnection.getConnection();
			
			context = new InitialContext(null);
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = datasource.getConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userid); 
			pstm.setString(2, userpw);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				member = new TBLMemberBean();
				member.setUserid(rs.getString("userid"));
				member.setUserpw(rs.getString("userpw"));
				member.setUsername(rs.getString("username"));
				member.setUsergender(rs.getString("usergender"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
	// 아이디 중복확인, select
	public boolean checkid( String userid ) {
		System.out.println("userid : " + userid);
		
		String sql = "SELECT count(*) FROM TBL_MEMBER WHERE USERID = ?";
		boolean result = false;
		
		try {
//			conn = DBConnection.getConnection();
			
			context = new InitialContext(null);
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = datasource.getConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userid); 
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				if(rs.getInt(1) == 0) {
					System.out.println("rs.getInt(1) : " + rs.getInt(1));
					result = true;
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}