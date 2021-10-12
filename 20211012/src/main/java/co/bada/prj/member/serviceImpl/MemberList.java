package co.bada.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberVO;

public class MemberList implements Command {

	@Override
	public void execute() {
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.memberList();
		
		System.out.println("===== 공지 목록  =====");
		for (MemberVO vo : members) {
			System.out.print(vo.getId() + " : ");
			System.out.print(vo.getName() + " : ");
			System.out.print(vo.getPassword() + " : ");
			System.out.print(vo.getTel()+ " : ");
			System.out.print(vo.getAddress()+ " : ");
			System.out.println(vo.getAuthor());
		}
		System.out.println("===========================");
	}

}
