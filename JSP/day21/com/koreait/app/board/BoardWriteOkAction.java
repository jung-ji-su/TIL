package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.dao.BoardDTO;

public class BoardWriteOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		String boardtitle = request.getParameter("boardtitle");
		String boardcontents = request.getParameter("boardcontents");
		String username = request.getParameter("username");
		
		BoardDTO board = new BoardDTO();
		board.setBoardtitle(boardtitle);
		board.setBoardcontents(boardcontents);
		board.setUsername(username);
		
		// redirect
		forward.setRedirect(true);
		
		if(bdao.insertBoard(board)) {
			// 성공시 게시판 리스트
			forward.setPath( request.getContextPath() + "/board/Boardlist.do?page=1" );
		} else {
			// 실패시 글쓰는 페이지
			forward.setPath( request.getContextPath() + "/board/BoardWrite.do" );
		}
		
		return forward;
	}	
}