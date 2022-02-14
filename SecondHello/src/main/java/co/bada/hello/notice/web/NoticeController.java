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

@Controller   // 이렇게 명시해야  IOC컨테이너에 실리게 된다. 
public class NoticeController {
	
	@Autowired
	private NoticeService noticeDao; // noticeServiceImpl 를 자동주입하게 된다. 
	
//	@Autowired
//	private MemberService memberDao; 
	

	@RequestMapping("/noticeList.do")  // 게시글 목록보기  // 가급적이면 폼에서 폼으로 전달되는 것들은 requestMapping을쓴다. 
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList());
		return "notice/noticeList";
	}
	
	// 이 밑으로는 notice와 관련된 메소드들을 모두 작성한다. 
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		return "redirect:memberList.do"; // jsp가 아니라, .do를 호출하고 싶을 때, redirect: 키워드를 붙여준다. 
	}
	
	
	
	@RequestMapping("/noticeForm.do")
	public String noticeForm() {  // 단순히 폼만 보여주는 용도이기 때문에 매개변수를 받지 않는다. Model도 안 받음. 
		return "notice/noticeForm";
	}
	
	@PostMapping("/noticeResister.do")  // post방식으로 했다. 
	public String noticeResister(NoticeVO vo, Model model, HttpSession session) {  // 여기서 매개변수 vo에는 파일명을 제외한 나머지값들이 포함된 상태로 왔을 것이다. 
		session.setAttribute("id", "bada");
		session.setAttribute("author", "ADMIN");
		System.out.println(session.getId() + "================");
		System.out.println(session.getAttribute("id"));
		System.out.println(session.getAttribute("author"));
		System.out.println(vo.getBigo() + 20);
		System.out.println(vo.getTitle());
		//noticeDao.noticeInsert(vo);	//참고로 매개변수에 HttpSession session으로 해서 session.getId()도 할 수 있다.  고유한 세션값으로 입력될 것이다. 
		return "redirect:noticeList.do";
	}
	
	// 바로 위의 식을 약간 변형하면서 실험하였다. session을 매개값으로 받아와서 다양하게 활용이 가능함을 보여준다. 
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
	
	
	// ModelAndView 설명을 위한 코드. 모델과 뷰를 같이 선택해서 보낼 때 사용한다. 
//	@PostMapping("/noticeResister.do")
//	public ModelAndView noticeResister(NoticeVO vo, ModelAndView mv) {
//		if(vo != null) {
//			mv.addObject("message", "성공했다.");
//			mv.setViewName("notice/noticeSuceess");
//		} else {
//			mv.addObject("message", "실패했다.");
//			mv.setViewName("notice/noticeFail");
//		}
//		return mv;
//	}
	
	
	
}
