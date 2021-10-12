package co.bada.prj.member.serviceImpl;

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
		System.out.println("수정할 이름");
		vo.setName(scn.nextLine());
		System.out.println("변경할 비밀번호");
		vo.setPassword(scn.nextLine());
		System.out.println("변경할 전화번호");
		vo.setTel(scn.nextLine());
		System.out.println("변경할 주소");
		vo.setAddress(scn.nextLine());
		System.out.println("변경할 등급 admin & user");
		vo.setAuthor(scn.nextLine());
		int n = dao.memberUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 입력");
		} else {
			System.out.println("실패 하였습니다.");
		}

		// TODO Auto-generated method stub

	}

}
