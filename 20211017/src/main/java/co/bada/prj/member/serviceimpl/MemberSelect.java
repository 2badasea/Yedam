package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.MemberService;
import co.bada.prj.comm.MemberVO;

public class MemberSelect implements Command {
	private Scanner scn = new Scanner(System.in);
	
	@Override
	public void execute() {
		MemberService  dao = new MemberServiceImpl();
		//dao객체는 memberServiceImpl의 인스턴스. 
		//memberServiceImpl설계도엔 sqlsession과 mapper sql문에 대한 객체가 존재한다. 
		
		MemberVO vo = new MemberVO();
		//한 명을 조회하기 때문에 vo클래스 하나를 초기화시켜놓는다. 
		
		System.out.println("조회할 멤버를 입력하세요");
		vo.setId(scn.nextLine());
		//vo객체의 변수 id는 String타입이기 때문에 nextLine()메소드를 사용하였다. 
		
		vo = dao.memberSelect(vo);
		//dao는 memberServiceImpl의 인스턴스. 해당 설계도의 memberSelect()메소드 호출.
		//호출된 vo객체엔 내가 위에서 setId를 통해 입력한 객체의 정보가 날라오고, 그걸 vo에 담음.
		
		System.out.println("id : " + vo.getId());
		System.out.println("이름 : " + vo.getName());
		System.out.println("비밀번호 : " + vo.getPassword());
		System.out.println("연락처 : " + vo.getTel());
		System.out.println("주소 : " + vo.getAddress());

	}

}
