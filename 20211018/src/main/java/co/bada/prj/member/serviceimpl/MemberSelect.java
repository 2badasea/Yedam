package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;
import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;

public class MemberSelect implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {
		MemberService  dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		if(GB.AUTHOR.equals("ADMIN")) {
		System.out.println("========================");
		System.out.println("조회할 멤버를 입력하세요");
		vo.setId(scn.nextLine());
		vo = dao.memberSelect(vo);
		
		if(vo !=null) {
			vo.toString();
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
		System.out.println("========================");
		} else {
			System.out.println("관리자만 조회가 가능합니다.");
		}
		
		
	}

}
