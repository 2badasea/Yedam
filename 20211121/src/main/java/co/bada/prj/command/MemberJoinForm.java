package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;

public class MemberJoinForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//	회원가입 폼 호출.
		return "member/memberJoinForm";
	}

}
