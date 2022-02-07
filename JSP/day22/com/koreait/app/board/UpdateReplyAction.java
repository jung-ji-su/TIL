package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;

public class UpdateReplyAction implements Action  {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int replynum = Integer.parseInt( request.getParameter("replynum") );
		String replycontents = request.getParameter( "reply" + replynum );
		String boardnum = request.getParameter("boardnum");
		
		if(bdao.updateReply(replynum, replycontents)) {
			forward.setRedirect(true);
			forward.setPath( request.getContextPath() + "/board/BoardView.do?boardnum=" + boardnum );
		}
		
		return forward;
	}
	
}