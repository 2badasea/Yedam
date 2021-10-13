package co.bada.prj.member.serviceimpl;

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
		vo.setName(scn.nextLine()); //nextLine()인 건, vo객체의 필드들이 모두 String임.
		System.out.println("비밀번호를 입력하세요");
		vo.setPassword(scn.nextLine());
		System.out.println("전화번호를 입력하세요");
		vo.setTel(scn.nextLine());
		System.out.println("주소를 입력하세요");
		vo.setAddress(scn.nextLine());
		
		int n = dao.memberInsert(vo);   //성공이 되었으면 n의 값은 1이다. 
		if(n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("실패했습니다.");
		}
		
		
	}

}
