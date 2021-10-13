package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

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
		System.out.println("변경할 비밀번호를 입력하세요");
		vo.setTel(scn.nextLine());
		System.out.println("변경할 주소를 입력하세요");
		vo.setAddress(scn.nextLine());
		System.out.println("변경할 등급을 입력하세요 admin or user");
		vo.setAuthor(scn.nextLine());
		
		int n = dao.memberUpdate(vo);
		if(n !=0) {
			System.out.println("성공적으로 수정되었습니다.");
		} else {
			System.out.println("수정을 실패했습니다.");
		}

	}

}
