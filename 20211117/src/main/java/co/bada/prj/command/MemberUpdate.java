package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class MemberUpdate implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원정보 수정. 회원정보를 수정하려면, 수정할 수 있는 폼에 넣어줘야 한다. 
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));  // 
		
		request.setAttribute("member", memberDao.memberSelect(vo));
		return "member/memberUpdate";
	}

}
