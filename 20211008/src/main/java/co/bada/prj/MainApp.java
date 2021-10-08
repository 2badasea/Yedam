package co.bada.prj;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.exe.MainMenu;
import co.bada.prj.service.MemberService;
import co.bada.prj.service.MemberVO;
import co.bada.prj.serviceImpl.MemberServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
//		DataSource dao = DataSource.getInstance();  //싱글톤의 인스턴스dao 가져오는 것. 최초에 할당된 하나의 메모리를 계속 쓰는 방식
//		dao.getConnection();			//연결객체 호출. 
		MemberService memberService = new MemberServiceImpl();  // 인터페이스와 상속관계.
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.selectMemberList(); 
		
		MemberVO vo = new MemberVO();
		vo.setId("kim");
		vo.setPassword("4567");
		vo.setName("김치국");
		vo.setTel(null);
		vo.setAddress(null);
		vo.setAuthor("USER");
		int n = memberService.insertMember(vo);   //"입력해주세요" 
		if(n !=0) {
			System.out.println("잘 입력되었습니다. ");
		}else {
			System.out.println("입력이 실패했습니다. ");
		}
		 System.out.println("======================");
	      members = memberService.selectMemberList();

		
		
		for(MemberVO member : members){
			member.toString();
		}
		
		
//		System.out.println("==============hello bada================");  //run을 하면 Arraylist타입처럼 밑으로 출력되어 있다. 
//		MemberVO vo = new MemberVO();
//		vo.setId("bada");   
//		vo = memberService.selectMember(vo);
//		vo.toString();   // 이게 한 명 분에 대한 조회를 하는 식.  
		
		System.out.println("=================");
		MainMenu mainMenu = new MainMenu();
		mainMenu.run();
		
	}
}