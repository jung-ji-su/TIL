package com.koreait.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.mybatis.SqlMapConfig;

public class BoardDAO {
	
	SqlSessionFactory fatory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public BoardDAO() {
		sqlsession = fatory.openSession(true);
	}
	
	public List<BoardDTO> getBoardList(int startRow, int endRow) {
		HashMap<String, Integer> datas = new HashMap<>();
		datas.put("startRow", startRow);
		datas.put("endRow", endRow);
		List<BoardDTO> boardList =  sqlsession.selectList("Board.getBoardList", datas);
		return boardList;
	}

	public int getBoardCnt() {
		return sqlsession.selectOne("Board.getBoardCnt") ;
	}

	public boolean insertBoard(BoardDTO board) {
		boolean result = false;
		
		if(sqlsession.insert("Board.insertBoard", board) == 1) {
			result = true;
		}
		
		return result;
	}

	public BoardDTO getDetail(int boardnum) {
		return  sqlsession.selectOne("Board.getDetail", boardnum);
		
	}

}