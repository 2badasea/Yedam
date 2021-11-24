package co.bada.hello.notice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	
	 //form에서 form으로 전달하는 건 requestMapping으로 사용할 것.
	@RequestMapping("/noticeList.do")
	public String noticeList(Model model) {
		model.addAttribute("message", "공지사항 목록 입니다.");
		return "notice/noticeList";
	}
	
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		return "redirect:memberList.do"; // jsp페이지가 아니라 .do를 호출하고 싶을 때는 redirect: 키워드를 붙여준다. 
	}
}
