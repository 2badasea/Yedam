package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;

public class HomeCommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//처음 접근했을 때 돌려주는 페이지. 단순히 정적인 페이지만 보여주고 싶으면 리턴구문만 작성. db자료를 브라우저에 뿌릴 필요가 없는 경우.
		return "home/home";
	}

}
