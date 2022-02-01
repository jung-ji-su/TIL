package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.dto.TBLMemberBean;
import com.koreait.mybatis.SqlMapConfig;

public class TBLMemberDao {
	
	SqlSessionFactory fatory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public TBLMemberDao() {
		sqlsession = fatory.openSession(true);
		// true -> 오토커밋
	}
	
	// 회원가입, insert
	public boolean join( TBLMemberBean member ) {
		boolean result = false;
		if( sqlsession.insert("Member.join",member) == 1 ) {
			result = true;
		}
		
		return result;
	}
	
	
	// 로그인, select
	public TBLMemberBean login2(String userid, String userpw) {
		TBLMemberBean member = null;
		
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);
		
		member = sqlsession.selectOne("Member.login", datas);
		
		return member;
	}
	
	// 아이디 중복확인, select
	public boolean checkid( String userid ) {
		boolean result = false;
		
		int cnt = 0;
		cnt = sqlsession.selectOne("Member.checkid", userid);
		if( cnt == 0 ) {
			result = true;
		}
		return result;
	}
	
}