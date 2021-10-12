package co.bada.prj.member.serviceImpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("ID를 입력하세요");
		vo.setId(scn.nextLine());
		System.out.println("이름을 입력하세요");
		vo.setName(scn.nextLine());
		System.out.println("비밀번호 입력");
		vo.setPassword(scn.nextLine());
		System.out.println("전화번호 입력");
		vo.setTel(scn.nextLine());
		System.out.println("주소 입력");
		vo.setAddress(scn.nextLine());
		int n = dao.memberInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("실패 했습니다.");
		}

	}

}
