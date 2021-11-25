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

@Controller  // controller역할을 하는 애들은 어노테이션으로 명시해주기
public class NoticeController {
	
	@Autowired
	private NoticeService noticeDao; // noticeImpl을 자동 주입하라. (noticeServiceimpl을 자동주입하게 된다.)
	
	//@Autowired
	//private MemberService memberDao; // 사용할 일 있으면 선언해주면 된다. 
	
	 //form에서 form으로 전달하는 건 requestMapping으로 사용할 것.
	@RequestMapping("/noticeList.do")  //게시글 목록보기. 
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList());  // 호출명, 컨트롤명, 뷰페이지 명이 일치시켜준다. 
		return "notice/noticeList";
	}
	
	
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		return "redirect:memberList.do"; // jsp페이지가 아니라 .do를 호출하고 싶을 때는 redirect: 키워드를 붙여준다. 
	}
	
	@RequestMapping("/noticeForm.do")
	public String noticeForm() {  //단순하게 폼만 호출하니깐 매개값을 넣어주지 않았다.
		return "notice/noticeForm";
	}
	
	//밑의 modelandview방식과 비교하기 위해 약간 수정했다. 원본을 보려면 11월 25일 점심시간 직후 영상 참조하기.
	@PostMapping("/noticeR.do") // noticeForm에 보면 resister가 post방식으로 되어있다는 걸 확인. 
	public String noticeResister(NoticeVO vo, Model model, HttpSession session) {  // session객체를 매개로 넣은 건 실험용. 
		String path =null; 
		if(vo!=null) {
			model.addAttribute("message", "입력이 성공했다."); // 성공했을 때 메시지를 건네주고 싶지 않으면, path만 선택해도 된다. 
			path = "notice/noticeSuccess";
		} else {
			 model.addAttribute("message", "입력이 실패했다.");
			 path = "notice/noticeFail";
		}
		return path;
		//오후시간 개념설명. model, modelandview
//		model.addAttribute("message","입력이 성공했다.");  // model객체는 이렇게 값을 넣을 수 있다. 
		
//		session.setAttribute("id", "bada");   // 폼에서 parameter로 전달되는 bigo라는 네임속성이 있다면 , 걔를 string타입으로 bigo라는 변수를 쓰겠다는 것 int타입바꿈.
//		session.setAttribute("author", "ADMIN");
//		System.out.println(session.getId() + "============");  //  세션객체가 들어왔는지 체크 .
//		System.out.println(session.getAttribute("id"));
//		System.out.println(session.getAttribute("author"));
//		//System.out.println(vo.getTitle());
//		//System.out.println(vo.getBigo() + 20);
//		noticeDao.noticeInsert(vo);
//		return "notice/noticeSuccess";   // .do 로 돌리고 싶을 때는 redirect: 
	}
	
	//  ModelAndView 사용방식. model 과 view를 같이 선택해서 보낼 수 있다는 장점이 있다.. 위의 model방식과 비교하기. 둘 다 작동방식은 똑같다. model을 더 많이 사용.
	@PostMapping("/noticeResister.do")
	public ModelAndView noticeResister(NoticeVO vo, ModelAndView mv) {
		if(vo !=null) {
			mv.addObject("message", "성공했다.");
			mv.setViewName("notice/noticeSuccess");   // 리턴페이지를 담을 때. 
		} else {
			mv.addObject("message", "실패했다");
			mv.setViewName("notice/noticeFail");
		}
		return mv;
	}
	
	
}
