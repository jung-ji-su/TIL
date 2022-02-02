package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

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
	}
	
	public TBLMemberBean searchById(String userid) {
		 return sqlsession.selectOne("Member.searchById",userid);
		
//		TBLMemberBean member = null;
//		member = sqlsession.selectOne("Member.searchById",userid);
//		return member;
	}
	
	public List<TBLMemberBean> getList() {
		List<TBLMemberBean> result = sqlsession.selectList("Member.getList");
		return result;
	}
}