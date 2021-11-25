package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class MemberJoin implements Command {
	private String message;
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입 처리.  db상에 insert를 하게 된다. 그러기 위해선 memberserviceimpl와 membervo를 초기화 시켜줘야 한다. 
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setTel(request.getParameter("tel"));
		vo.setAddress(request.getParameter("address"));
		vo.setAuthor("USER");   // setAuthor 값으로 request.getParameter를 안 넣어준 이유는 회원가입 양식에서 권한을 적는 항목이 없었기 때문.
										//  그리고 권한의 경우 관리자가 정하는 부분이다.  
		int n = memberDao.memberInsert(vo);
		if(n !=0) {
			message = "회원가입이 성공적으로 되었습니다.";
		} else {
			message = "회원가입이 실패하였습니다. <br> 관리자에게 문의하세요.";
		}
		request.setAttribute("message", message);
		return "member/memberJoin";
	}

}
