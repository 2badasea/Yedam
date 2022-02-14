package co.bada.hello.notice.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.bada.hello.notice.service.NoticeService;
import co.bada.hello.notice.service.NoticeVO;

@Controller   // �̷��� ����ؾ�  IOC�����̳ʿ� �Ǹ��� �ȴ�. 
public class NoticeController {
	
	@Autowired
	private NoticeService noticeDao; // noticeServiceImpl �� �ڵ������ϰ� �ȴ�. 
	
//	@Autowired
//	private MemberService memberDao; 
	

	@RequestMapping("/noticeList.do")  // �Խñ� ��Ϻ���  // �������̸� ������ ������ ���޵Ǵ� �͵��� requestMapping������. 
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList());
		return "notice/noticeList";
	}
	
	// �� �����δ� notice�� ���õ� �޼ҵ���� ��� �ۼ��Ѵ�. 
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		return "redirect:memberList.do"; // jsp�� �ƴ϶�, .do�� ȣ���ϰ� ���� ��, redirect: Ű���带 �ٿ��ش�. 
	}
	
	
	
	@RequestMapping("/noticeForm.do")
	public String noticeForm() {  // �ܼ��� ���� �����ִ� �뵵�̱� ������ �Ű������� ���� �ʴ´�. Model�� �� ����. 
		return "notice/noticeForm";
	}
	
	@PostMapping("/noticeResister.do")  // post������� �ߴ�. 
	public String noticeResister(NoticeVO vo, Model model, HttpSession session) {  // ���⼭ �Ű����� vo���� ���ϸ��� ������ ������������ ���Ե� ���·� ���� ���̴�. 
		session.setAttribute("id", "bada");
		session.setAttribute("author", "ADMIN");
		System.out.println(session.getId() + "================");
		System.out.println(session.getAttribute("id"));
		System.out.println(session.getAttribute("author"));
		System.out.println(vo.getBigo() + 20);
		System.out.println(vo.getTitle());
		//noticeDao.noticeInsert(vo);	//����� �Ű������� HttpSession session���� �ؼ� session.getId()�� �� �� �ִ�.  ������ ���ǰ����� �Էµ� ���̴�. 
		return "redirect:noticeList.do";
	}
	
	// �ٷ� ���� ���� �ణ �����ϸ鼭 �����Ͽ���. session�� �Ű������� �޾ƿͼ� �پ��ϰ� Ȱ���� �������� �����ش�. 
//	@PostMapping("/noticeResister.do")
//	public String noticeResister(NoticeVO vo, Model model, HttpSession session) {
//		session.setAttribute("id", "bada");
//		session.setAttribute("author", "ADMIN");
//		System.out.println(session.getId() + "================");
//		System.out.println(session.getAttribute("id"));
//		System.out.println(session.getAttribute("author"));
//		//noticeDao.noticeInsert(vo);
//		return "notice/noticeSuceess"; 
//	
	
	
	// ModelAndView ������ ���� �ڵ�. �𵨰� �並 ���� �����ؼ� ���� �� ����Ѵ�. 
//	@PostMapping("/noticeResister.do")
//	public ModelAndView noticeResister(NoticeVO vo, ModelAndView mv) {
//		if(vo != null) {
//			mv.addObject("message", "�����ߴ�.");
//			mv.setViewName("notice/noticeSuceess");
//		} else {
//			mv.addObject("message", "�����ߴ�.");
//			mv.setViewName("notice/noticeFail");
//		}
//		return mv;
//	}
	
	
	
}
