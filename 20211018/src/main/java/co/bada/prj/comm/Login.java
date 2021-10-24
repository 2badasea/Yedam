package co.bada.prj.comm;

import java.util.Scanner;

import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;
import co.bada.prj.member.serviceimpl.MemberServiceImpl;

public class Login {
	private Scanner scn = new Scanner(System.in);
	
	public void run() {
		MemberService memberDao = new MemberServiceImpl();
		MemberVO member;
		
		boolean b = false;
		do {
			member = new MemberVO();
			System.out.println("=====로그인=====");
			System.out.println("아이디를 입력하세요");
			member.setId(scn.nextLine());
			System.out.println("패스워드를 입력하세요");
			member.setPassword(scn.nextLine());
			
			member = memberDao.loginCheck(member);
			
			if(member !=null)	{
				GB.ID = member.getId();
				GB.PASSWORD = member.getPassword();
				GB.NAME = member.getName();
				GB.AUTHOR = member.getAuthor();
				System.out.println("로그인 성공!!");
				b = true;
			} else {
				System.out.println("!!!사용자 아이디 또는 패스워드가 틀렸다.");
				scn.nextLine();
				return;
				
			}
	
		} while(!b);
	}
}
