package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberLogin implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		System.out.println("아이디를 입력하세요");
		vo.setId(scn.nextLine());
		System.out.println("비밀번호를 입력하세요");
		vo.setPassword(scn.nextLine());
		vo = memberService.loginCheck(vo);
		
		System.out.println(vo.getId() + " : " + vo.getPassword());
		System.out.println(vo.getName() + " : " + vo.getAuthor());
		System.out.println(vo.getId() + " : " + vo.getPassword()
		); 
		
		

	}

}
