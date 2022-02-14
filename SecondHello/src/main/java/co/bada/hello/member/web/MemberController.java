package co.bada.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class MemberController {
	
	@GetMapping("/memberList.do")  // 호출명
	public String memberList(Model model) {  //메소드명.   // Model클래스는 항상 사용. 
		model.addAttribute("message", "멤버 리스트 입니다."); //request.setAttribute("message", memberDao.memberSelectList); 이거와 같다. 
		return "member/memberList";  // jsp명   => 위의 호출명과 메소드명 jsp명 모두 일치시키기 
	}
	
	// 이 컨트롤러에선 member 관련 처리하는 모든 메소드를 작성. 
}
