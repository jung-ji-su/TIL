package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.koreait.dto.TBLMemberBean;

public class TBLMemberDao {
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	// 회원가입, insert
	public boolean join( TBLMemberBean member ) {
		String sql = "insert into tbl_member values(?,?,?,?)";
		int result = 0;
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			
			// 회원가입 항목
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getUserpw());
			pstm.setString(3, member.getUsername());
			pstm.setString(4, member.getUsergender());
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
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

}