package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.Login;
import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;

public class MemberSelf implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		Login login = new Login();

		System.out.println("=====================");
		System.out.println("개인정보 메뉴입니다.");
		System.out.println("=====================");
		System.out.println("본인여부를 확인하겠습니다.");
		System.out.println("ID를 입력하세요");
		vo.setId(scn.nextLine());
		System.out.println("PW를 입력하세요");
		vo.setPassword(scn.nextLine());
		

		vo = dao.loginCheck(vo);

		if (vo != null) {
			System.out.println("수정은 1번, 탈퇴는 2번을 선택하세요");
			int num = scn.nextInt();
			switch (num) {
			case 1:
				vo.toString();
				
				System.out.println("수정할 이름을 입력하세요");
				scn.nextLine();
				vo.setName(scn.nextLine()); 
				System.out.println("수정할 비밀번호를 입력하세요");
				vo.setPassword(scn.nextLine());
				System.out.println("수정할 연락처를 입력하세요");
				vo.setTel(scn.nextLine());
				System.out.println("수정할 주소를 입력하세요");
				vo.setAddress(scn.nextLine());
				

				int n = dao.memberUpdate(vo);
				String message = (n != 0) ? "수정 성공" : "수정 실패";
				System.out.println(message);
				break;
			case 2:
				int m = dao.memberDelete(vo);
				if (m != 0) {
					System.out.println("성공적으로 삭제되었습니다.");
					return;
					
					
				} else {
					System.out.println("삭제 실패");
				}
				break;
			}
//			vo.toString();
//			System.out.println("수정할 이름을 입력하세요");
//			vo.setName(scn.nextLine());
//			System.out.println("수정할 비밀번호를 입력하세요");
//			vo.setPassword(scn.nextLine());
//			System.out.println("수정할 연락처를 입력하세요");
//			vo.setTel(scn.nextLine());
//			System.out.println("수정할 주소를 입력하세요");
//			vo.setAddress(scn.nextLine());
//
//			int n = dao.memberUpdate(vo);
//			String message = (n != 0) ? "수정 성공" : "수정 실패";
//			System.out.println(message);

		} else {
			System.out.println("다시 확인해주세요.");
		}

	}

}
