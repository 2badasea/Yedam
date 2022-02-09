package co.bada.hello.notice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // �̷��� ����ؾ�  IOC�����̳ʿ� �Ǹ��� �ȴ�. 
public class NoticeController {

	@RequestMapping("/noticeList.do") 
	public String noticeList(Model model) {
		
		model.addAttribute("message", "�������� ��� �Դϴ�.");
		return "notice/noticeList";
	}
}
