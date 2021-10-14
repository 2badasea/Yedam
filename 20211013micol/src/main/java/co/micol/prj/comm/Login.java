package co.micol.prj.comm;

import co.micol.prj.member.service.MemberSerVice;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class Login{
	public void run() {
		MemberSerVice memberDao = new MemberServiceImpl();
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
