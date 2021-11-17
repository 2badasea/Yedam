package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class MemberIdCheck implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 아이디 중복체크(Ajax 이용) 
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("chkid")); 
		boolean b = memberDao.memberIdCheck(vo); // true는 이미 존재한다는 것, false는 사용가능한 것. 
		String chk = "0";
		if(b) {	// 존재하면 
			chk = "1";
		} 
		return "ajax:" + chk;
	}

}
