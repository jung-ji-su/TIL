package com.koreait.app.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.ActionForward;

@WebServlet("*.do")
public class BoardFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		ActionForward forward = null;
		
		switch(requestURI) {
			case "/board/Boardlist.do":
				// DB조회 필요
				forward = new BoardListAction().execute(req, resp);
				break;
			case "/board/BoardWrite.do":
				// 화면만 return
				forward = new ActionForward(true, req.getContextPath() + "/app/board/boardwrite.jsp");
				break;
			case "/board/BoardWriteOk.do":
				// 글쓰기 저장
				forward = new BoardWriteOkAction().execute(req, resp);
				break;
			case "/board/BoardView.do":
				// 상세항목 조회
				forward = new BoardViewAction().execute(req, resp);
				break;
				
		}
		
		
		// 일괄처리
		if( forward != null ) {
			if( forward.isRedirect() ) {
				// redirect 방식
				resp.sendRedirect(forward.getPath());
			} else {
				// forward방식
				RequestDispatcher disp = req.getRequestDispatcher(forward.getPath());
				disp.forward(req, resp);
			}
		}
		
	}
	
}