package co.bada.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class MemberController {
	
	@GetMapping("/memberList.do")  // ȣ���
	public String memberList(Model model) {  //�޼ҵ��.   // ModelŬ������ �׻� ���. 
		model.addAttribute("message", "��� ����Ʈ �Դϴ�."); //request.setAttribute("message", memberDao.memberSelectList); �̰ſ� ����. 
		return "member/memberList";  // jsp��   => ���� ȣ���� �޼ҵ�� jsp�� ��� ��ġ��Ű�� 
	}
	
	// �� ��Ʈ�ѷ����� member ���� ó���ϴ� ��� �޼ҵ带 �ۼ�. 
}
