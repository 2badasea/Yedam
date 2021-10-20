package co.bada.prj.member.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;
import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;

public class MemberList implements Command {
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		 List<MemberVO> members = new ArrayList<MemberVO>();
		 members = memberService.memberList();
		 //memberServiceImpl클래스의 memberList()메소드를 호출하여 members에 담는다. 
		 
		 if(GB.AUTHOR.equals("ADMIN")) {
			 System.out.println("====멤버 목록====");
			 for(MemberVO vo : members) {
				 vo.toListString();
			 }
			 System.out.println("====멤버 목록 끝====");
		 } else {
			 System.out.println("관리자만 조회가 가능합니다.");
		 }
		 
		 

	}

}
