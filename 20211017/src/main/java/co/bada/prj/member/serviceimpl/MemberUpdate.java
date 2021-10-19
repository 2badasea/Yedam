package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.MemberService;
import co.bada.prj.comm.MemberVO;

public class MemberUpdate implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		System.out.println("수정할 아이디를 입력하세요");
		vo.setId(scn.nextLine());
		System.out.println("수정할 이름을 입력하세요");
		vo.setName(scn.nextLine());
		System.out.println("수정할 비밀번호를 입력하세요");
		vo.setPassword(scn.nextLine());
		System.out.println("수정할 주소를 입력하세요");
		vo.setAddress(scn.nextLine());
		System.out.println("수정할 권한을 입력하세요.");
		vo.setAuthor(scn.nextLine());
		
		int n = dao.memberUpdate(vo);
		if(n !=0) {
			System.out.println("성공적으로 수정되었습니다.");
		} else {
			System.out.println("수정이 실패되었습니다.");
		}

	}

}
