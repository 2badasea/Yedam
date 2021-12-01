package co.bada.prj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

@Controller
public class HomeController {
	@Autowired
	MemberService memberDao;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home() {
		
		return "home/home";
	}
	
	@RequestMapping("/gridTest.do")
	public String gridTest() {
		return "home/gridTest";
	}
	
	@RequestMapping("/ajaxMemberList.do")
	@ResponseBody
	public List<MemberVO> ajaxMemberList() {
		
		return memberDao.memberSelectList();
	}
}
