package com.koreait.spring4.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class jdbcMemberRepository implements MemberRepository {

	private final DataSource dataSource;
	public jdbcMemberRepository(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public MemberDTO save(MemberDTO member) {
		System.out.println("jdbcMemberRepository save 호출");
		String sql = "INSERT INTO member2 values(member2_seq.nextval, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String generatedColumns[] = { "ID" };
			pstmt = conn.prepareStatement(sql, generatedColumns);
			pstmt.setString(1, member.getName());
			pstmt.executeUpdate();
			rs = pstmt.getGeneratedKeys();
			
			if( rs.next() ) {
				System.out.println(rs.getInt(1));
			} else {
				System.out.println("id 조회 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return member;
	}

	@Override
	public List<MemberDTO> findAll() {
		String sql = "SELECT * FROM member2";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDTO> members = new ArrayList<>();
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				members.add(member);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return members;
	}

}



























