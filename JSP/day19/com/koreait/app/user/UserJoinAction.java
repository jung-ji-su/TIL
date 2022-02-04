package com.koreait.app.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.user.dao.UserDAO;
import com.koreait.app.user.dao.UserDTO;

public class UserJoinAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		UserDAO udao = new UserDAO();
		UserDTO user = new UserDTO();
		ActionForward forward = new ActionForward();
		
		user.setUserid( request.getParameter("userid") );
		user.setUserpw( request.getParameter("userpw") );
		user.setUsername( request.getParameter("username") );
		user.setUserphone( request.getParameter("userphone") );
		user.setUseraddr( request.getParameter("useraddr") );
		
		if(udao.join( user )) {
			// join 성공
			// redirect
			forward.setPath( request.getContextPath() + "/app/user/loginview.jsp" );
			forward.setRedirect(true);
		} else {
			// join 실패
			// redirect
			forward.setPath( request.getContextPath() + "/index.jsp" );
			forward.setRedirect(true);
		}
		
		return forward;
	}
}