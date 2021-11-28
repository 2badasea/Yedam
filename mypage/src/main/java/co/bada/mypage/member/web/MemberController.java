package co.bada.mypage.member.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.bada.mypage.member.service.MemberService;
import co.bada.mypage.member.service.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService memberDao;
	
	@RequestMapping("memberList/do")
	@ResponseBody
	public List<MemberVO> memberList() {
		
		return memberDao.memberSelectList();
	}
	
//	@RequestMapping("/idcheck.do")
//	@ResponseBody
//	public String idcheck(Model model, @Param("id") String id ) {
//		System.out.println(id + "================");
//		//model.addAttribute("result", memberDao.isCheckId(id));
//		boolean b = memberDao.memberIdCheck(null);
//		String result = "T";
//		if(!b) {  
//			result = "F";
//		}
//		return result; //  "member/memberIdCheck"
//	}
	
	@RequestMapping("/memberJoinForm.do")
	@ResponseBody
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		return "member/memberJoinForm";
	}
	
	
}
