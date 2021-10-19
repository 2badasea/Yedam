package co.bada.prj.comm;

import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceimpl.MemberServiceImpl;

public class Login {
	public void run() {
		MemberService memberDao = new MemberServiceImpl();
		MemberVO member;
		boolean b = false;
		do {
			member = new MemberVO();
			System.out.println("=====로 그 인=====");
			System.out.println("아이디를 입력하세요.");
			member.setId(GB.sc.nextLine());
			System.out.println("패스워드를 입력하세요.");
			member.setPassword(GB.sc.nextLine());
			member = memberDao.memberSelect(member);
			
			if(member != null) {
				GB.NAME = member.getName();
				GB.AUTHOR = member.getAuthor();
				GB.ID = member.getId();
				b = true;
			}else {
				System.out.println("!!!사용자 아이디 또는 패스워드가 틀렸다.");
				GB.sc.nextLine();
			}
		}while(!b);
	}
	
	
	
	
	
	
}
