package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.bada.prj.comm.Command;

public class Logout implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃 처리. 세션을 remove처리.
		HttpSession session = request.getSession();
		session.invalidate();
		return "home.do";   // "home/home"으로 해도 된다. 
	}

}
