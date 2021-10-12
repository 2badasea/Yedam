package co.bada.prj.member.serviceImpl;

import java.util.Scanner;

import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner scn = new Scanner(System.in);
	

	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("조회할 멤버를 입력");
		vo.setId(scn.nextLine());
		vo = dao.memberSelect(vo);
		System.out.println("id : " + vo.getId());
		System.out.println("이름 :  " +vo.getName());
		System.out.println("비밀번호 : " +vo.getPassword());
		System.out.println("전화번호 :" + vo.getTel());
		System.out.println("주소 : " + vo.getAddress());
		// TODO Auto-generated method stub

	}

}
