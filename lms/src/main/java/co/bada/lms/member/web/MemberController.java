package co.bada.lms.member.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.bada.lms.member.service.MemberService;
import co.bada.lms.member.service.MemberVO;

@Controller   
public class MemberController {
	@Autowired
	MemberService memberDao;
	
	@RequestMapping("/idcheck.do")
	@ResponseBody
	public String idcheck(Model model, @Param("id") String id ) {
		System.out.println(id + "================");
		//model.addAttribute("result", memberDao.isCheckId(id));
		boolean b = memberDao.isCheckId(id);
		String result = "T";
		if(!b) {  
			result = "F";
		}
		return result; //  "member/memberIdCheck"
	}
	
//	  // request와 response 객체를 하나로 묶어준 게 위의 방식 @responseBody를 활용한 것. 위의 방식을 더 추천. 
//	@RequestMapping("/idcheck.do")
//	public void idcheck(Model model, HttpServletRequest request, HttpServletResponse response ) throws IOException {
//		PrintWriter out = response.getWriter();
//		String id = request.getParameter("id");
//		//model.addAttribute("result", memberDao.isCheckId(id));
//		boolean b = memberDao.isCheckId(id);
//		String result = "T";
//		if(!b) {  
//			result = "F";
//		}
//		out.print(result);
//	}
	
	@RequestMapping("/memberList.do")
	@ResponseBody
	public List<MemberVO> memberList() {
		//String status = "C";
		return memberDao.memberSelectList("A");
	}
}
