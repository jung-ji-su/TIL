package com.koreait.app.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.mybatis.SqlMapConfig;

public class UserDAO {
	
	SqlSessionFactory fatory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public UserDAO() {
		sqlsession = fatory.openSession(true);
	}

	public boolean join(UserDTO user) {
		boolean result = false;
		
		if(sqlsession.insert("User.join",user) == 1) {
			result = true;
		}
		
		return result;
	}
	
}











