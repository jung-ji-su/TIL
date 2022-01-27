package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.koreait.dto.MemberBean;

public class MemberDao {
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;

	// 이름에 따른 나이 조회
	public int getAge(String name) {
		int age = 0;
		String sql = "SELECT AGE FROM MEMBER WHERE name=?";
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				age = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return age;
	}
	
	
	// 전체 조회 
	public ArrayList<MemberBean> selectAll() {
		String sql = "select * from member";
		ArrayList<MemberBean> result = new ArrayList<MemberBean>();
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				MemberBean member = new MemberBean();
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				result.add(member);
				
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("age"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}