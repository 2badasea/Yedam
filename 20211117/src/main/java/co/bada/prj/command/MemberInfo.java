package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class MemberInfo implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원정보 보기. 세션을 가져온다.
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId((String)session.getAttribute("id"));  // string타입으로 boxing해줘야함. 나오는 값이 오브젝트 형태라,  string타입으로 변경시켜야 함. 
		request.setAttribute("member", memberDao.memberSelect(vo));
		return "member/memberInfo";
	}

}
