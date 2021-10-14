package co.micol.prj.command;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;
import co.micol.prj.member.service.MemberSerVice;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelect implements Command {
	private static Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		MemberSerVice memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		if(GB.AUTHOR.equals("ADMIN")) {
			System.out.println("**************************");
			System.out.println("!! 조회할 회원의 아이디를 입력하세요.");
			vo.setId(sc.nextLine()); 
			
			vo = memberDao.memberSelect(vo);
			if(vo !=null) {
				vo.toString();
			} else {
				System.out.println("존재하지 않는 회원아이디 입니다.");
			}
		}	//첫번재if 
		else {
			vo.setId(GB.ID);
			vo = memberDao.memberSelect(vo);
			vo.toString();
		}
		System.out.println("*****************************");
	}

}
