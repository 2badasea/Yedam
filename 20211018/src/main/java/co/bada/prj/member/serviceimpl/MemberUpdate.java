package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;
import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;

public class MemberUpdate implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();

		System.out.println("====================");
		System.out.println("수정할 ID를 입력하세요.");
		vo.setId(scn.nextLine());
		vo = dao.memberSelect(vo);

		if (vo != null) {  //관리자의 경우, 일반USER의경우는 권한수정x, >>> if, else if, else구문.
			if (vo.getName().equals(GB.NAME) || GB.NAME.equals("이바다")) {
				vo.toString();
				System.out.println("수정할 이름을 입력하세요");
				vo.setName(scn.nextLine());
				System.out.println("수정할 비밀번호를 입력하세요");
				vo.setPassword(scn.nextLine());
				System.out.println("수정할 연락처를 입력하세요");
				vo.setTel(scn.nextLine());
				System.out.println("수정할 주소를 입력하세요");
				vo.setAddress(scn.nextLine());
				System.out.println("수정할 권한을 입력하세요.");
				vo.setAuthor(scn.nextLine());

				int n = dao.memberUpdate(vo);
				String message = (n != 0) ? "수정 성공" : "수정 실패";
				System.out.println(message);
			} else {
				System.out.println("권한이 없습니다.");
			} //권한  24행.
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		} //vo가 null인지 아닌지. 23행.
	}

}
