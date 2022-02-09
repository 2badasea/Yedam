package co.bada.hello.notice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // 이렇게 명시해야  IOC컨테이너에 실리게 된다. 
public class NoticeController {

	@RequestMapping("/noticeList.do") 
	public String noticeList(Model model) {
		
		model.addAttribute("message", "공지사항 목록 입니다.");
		return "notice/noticeList";
	}
}
