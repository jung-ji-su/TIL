package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.dao.ReplyDTO;

public class AddReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		
		BoardDAO bdao = new BoardDAO();
		ReplyDTO reply = new ReplyDTO();
		
		int boardnum = Integer.parseInt( request.getParameter("boardnum") );
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String replycontents = request.getParameter("replycontents");
		
		reply.setBoardnum(boardnum);
		reply.setUsername(username);
		reply.setPassword(password);
		reply.setReplycontents(replycontents);
		
		if(bdao.addReply(reply)) {
			// 성공
			forward.setRedirect(true);
			forward.setPath(request.getContextPath() + "/board/BoardView.do?boardnum=" + boardnum);
		} else {
			// 실패
			
		}
		
		return forward;
	}		
}