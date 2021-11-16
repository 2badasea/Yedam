package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 멤버 목록
		MemberService memberDao = new MemberServiceImpl();
		request.setAttribute("members", memberDao.memberSelectList());
		
		return "member/memberList";
	}

}
