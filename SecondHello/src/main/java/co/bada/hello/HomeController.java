package co.bada.hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);  // 서버가 올라갈 때 console창에 뜨는 메시지의 정체 
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );  // model로 전송한다. request와 달리 addAttirubte() 메소드사용. 
		
		return "home/home";
	}
	
// 	밑의 역할을 하는 것들을 memberController에서 수행하게끔 수정했다. 
//	@RequestMapping("/memberList.do")    
//	public String memberList(Model model) {
//		model.addAttribute("message", "멤버목록 리스트 입니다.");
//		return "member/memberList";
//	}
	
	@RequestMapping("/test.do")
	public String test() {
		return "test/test";
	}
	
}
