package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;

public class BoardViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int boardnum = Integer.parseInt( request.getParameter("boardnum") );
		
		// 조회수 update
		bdao.updateReadCount(boardnum);
		// 댓글 조회
		request.setAttribute("replylist", bdao.getReplys(boardnum));
		// 상세내역
		request.setAttribute("board", bdao.getDetail(boardnum));
		
		forward.setRedirect(false);
		forward.setPath(request.getContextPath() + "/app/board/boardview.jsp");
		
		return forward;
	}

}