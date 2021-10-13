package co.bada.prj.member.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberList implements Command { //멤버 전체 목록
	//얘는 스캐너가 필요없다. 애초에 목록 전체를 조회하는 것이므로. 
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.memberSelectList();
		//memberServieImpl클래스의 memberSelecList()메소드를 호출하여 members에 담는다.
		
		System.out.println("===========멤버 목록=========");
		for(MemberVO vo : members) {
			System.out.print(vo.getId() + " : ");
			System.out.print(vo.getName()+ " : ");
			System.out.print(vo.getPassword() + " : ");
			System.out.print(vo.getTel() + " : ");
			System.out.print(vo.getAddress() + " : ");
			System.out.println(vo.getAuthor() + " : ");
		}
		System.out.println("=========멤버 목록 끝=========");
	}

}
