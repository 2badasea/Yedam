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
	
						// home.do 로 들어오는 것들을 다 처리하겠다는 것.
	@RequestMapping(value = "/home.do", method = RequestMethod.GET) //requestMapping은 get, post 다 쓴다. method부분 지워도 되지만, 처리방식을 명시하고 싶은 경우 작성. 
	public String home(Locale locale, Model model) {  // 전달 인자. 이전에는 request, response 객체를 가져왓엇음. 
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();  
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
						// 밑의 home 에서 사용할 변수의 이름 serverTime, 그 값이 formattedDate라는 의미. 
										//controller method를 만들 때 거의 포함되는 게 model 
		return "home/home";
	}
}
