package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.MemberService;
import co.bada.prj.comm.MemberVO;

public class MemberDelete implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		System.out.println("삭제할 아이디를 입력하세요");
		vo.setId(scn.nextLine());
		
		int n = dao.memberDelete(vo);
		if(n !=0) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패");
		}
	}

}
