package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.bada.prj.comm.Command;

public class Logout implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃 처리 >>> 세션을 끊으면 된다. 
		HttpSession session = request.getSession();
		session.invalidate();   // 서버가 가지고 있는 세션객체를 없애는 것. invalidate()
		return "home.do";
	}

}
