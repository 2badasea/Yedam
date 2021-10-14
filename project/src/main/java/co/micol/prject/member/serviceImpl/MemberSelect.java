package co.micol.prject.member.serviceImpl;

import java.util.Scanner;

import co.micol.prject.member.service.MemberSerVice;
import co.micol.prject.member.service.MemberVO;
import co.micol.project.comm.Command;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);

	@Override
	public void execute() {
		MemberSerVice dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		System.out.println("조회할 아이디를 입력하세요");
		vo.setId(sc.nextLine());
		vo = dao.memberSelect(vo);
		vo.toString();

	}

}
