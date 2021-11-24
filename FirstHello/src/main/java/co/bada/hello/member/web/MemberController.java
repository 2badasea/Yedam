package co.bada.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
		// a링크는 get방식으로만 가능한 듯. 
	@GetMapping("/memberList.do")    // 호출명  ,  >>> 호출명, 메소드명, jsp명은 일치시킨다. 
	public String memberList(Model model) {  //메소드명
		model.addAttribute("message", "멤버 리스트 입니다."); 
			// 지난 dynamicweb에서 request.setattribute("members", memberDao.memberSelectList); 와 같은 원리.  
				// spring에선 model객체의 addattribute()메소드를 사용한다. 
		return "member/memberList";   // jsp명   
	}
	
	// member를 처리하는 모든 메서드는 여기에 저장하기. board를 한다면, board controller 만들기. 
}
