package co.bada.prj.member.serviceImpl;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberLogin implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId("micol");
		vo.setPassword("1234");
		System.out.println(vo.getId() + " : " + vo.getPassword());
		vo = memberService.loginCheck(vo);
		System.out.println(vo.getName() + " : " + vo.getAuthor());
		System.out.println(vo.getId() + " : " + vo.getPassword());
	}

}
