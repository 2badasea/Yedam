package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {
	private String message;
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 처리를 위해 모델을 호출해서 결과를 처리함. 
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		member.setId(request.getParameter("id"));  // 여기의 "id"와 "password"는 memberloginFrorm에서 제공하는 name속성(자바)의 값을 의미한다.
		member.setPassword(request.getParameter("password"));  // request.getParameter는 form값에서 넘어온 데이터를 가져올 때 사용하는 메소드다.
		member = memberDao.memberSelect(member);  // 한 명을 조회하는 경우 또는 로그인 처리용. 
		if(member !=null) {  // 존재하는 경우~
			session.setAttribute("id", member.getId());
			session.setAttribute("author", member.getAuthor());
			session.setAttribute("name", member.getName());
			message = member.getName() + "님 환영합니다.";
		} else {
			message = "아이디 또는 패스워드가 틀렸습니다.";
		}
		request.setAttribute("message", message);
		return "member/memberLogin";
	}

}
