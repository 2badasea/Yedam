package co.bada.prj.member.serviceImpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberDelete implements Command {
private Scanner scn = new Scanner(System.in);

	@Override
		public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("삭제할 아이디 입력");
		vo.setId(scn.nextLine());
		int n = dao.memberDelete(vo);
		if(n!=0) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("실패");
		}
		
		// TODO Auto-generated method stub

	}

}
