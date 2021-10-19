package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.MemberService;
import co.bada.prj.comm.MemberVO;

public class MemberInsert implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {	 //새로운 멤버를 등록하는 클래스. 
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		System.out.println("ID를 입력하세요");
		vo.setId(scn.nextLine());
		System.out.println("이름을 입력하세요");
		vo.setName(scn.nextLine());
		System.out.println("비밀번호를 입력하세요");
		vo.setPassword(scn.nextLine());
		System.out.println("연락처를 입력하세요");
		vo.setTel(scn.nextLine());
		System.out.println("주소를 입력하세요");
		vo.setAddress(scn.nextLine());
		System.out.println("권한을 입력하세요(user)");
		vo.setAuthor(scn.nextLine());
		
		int n = dao.memberInsert(vo); 
		//성공했으면 n의 값은 1이다. 
		
		if(n !=0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("실패했습니다.");
		}
	}

}
