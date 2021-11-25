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
		member.setId(request.getParameter("id")); // 여기 중괄호 안의 'id'와 밑의 'password'는 memberLoginForm에서
		member.setPassword(request.getParameter("password"));// 제공하는 name속성(자바)의 값을 의미한다. 
		member = memberDao.memberSelect(member);
		if(member !=null) {  // 존재하는 경우. 
			session.setAttribute("id", member.getId());
			session.setAttribute("author", member.getAuthor());
			session.setAttribute("name", member.getName());
			message = member.getName() + "야 환영한다.";
		} else {
			message = "아이디 또는 패스워드가 틀렸습니다.";
		}
		request.setAttribute("message", message);
		return	"member/memberLogin";
	}

}
