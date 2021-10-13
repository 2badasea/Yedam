package co.bada.prj.member.serviceimpl;

import java.util.Scanner;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner scn = new Scanner(System.in);  //일일이 할 필요x 전역으로 설정 추천. 
	
	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		//dao객체는 memberserviceImple의 인스턴스. 
		//memberserviceImpl()에는 sqlsession과 mapper에 대한 설정 객체들이 존재한다. 
	    MemberVO vo = new MemberVO();
	    System.out.println("조회할 멤버를 입력하세요.");
	    vo.setId(scn.nextLine()); //vo객체의 변수id 자체가 string타입을 매개로 받는다. 확인ㄱㄱ
	    vo = dao.memberSelect(vo); //dao가 memberserviceImpl의 인스턴스. 
	    						// >>> memberserviceImpl의 memberSelect메소드에 
	    						// >>> vo객체를 매개로 한 것을 호출한다는 뜻. 그걸 vo에 담음.
	    System.out.println("id : " + vo.getId());
	    System.out.println("이름 : " + vo.getName());
	    System.out.println("비밀번호 : " + vo.getPassword());
	    System.out.println("전화번호: " + vo.getTel());
	    System.out.println("주소 : " + vo.getAddress());
	    

	}

}
