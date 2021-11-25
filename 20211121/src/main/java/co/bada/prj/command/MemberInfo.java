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
		// 회원정보 보기. 로그인 과정에 의해 생성된 session 객체를 가져오는 방식으로. 
		HttpSession session = request.getSession(); // request 객체가 가지고 있는 getSession()메소드를 실행하면 현재 생성된 session객체를 가져오게 된다. 
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId((String)session.getAttribute("id")); // string타입으로 boxing해줘야 한다. session.getatt~("id")의 값이 오브젝트 형태이기 때문.
		request.setAttribute("member", memberDao.memberSelect(vo));
		return "member/memberInfo";
	}

}
