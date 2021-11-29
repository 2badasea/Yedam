package co.bada.mypage.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.bada.mypage.member.service.MemberService;
import co.bada.mypage.member.service.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService memberDao;
	
	@RequestMapping(value="memberList.do")
	public String memberList(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("members", memberDao.memberSelectList());
		return "member/memberList";
	}
	
	@RequestMapping(value = "memberJoinForm.do")
	public String memberJoinForm(HttpServletRequest request, HttpServletResponse response) {
		return "member/memberJoinForm";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "ajaxIdCheck.do")
	public String ajaxIdCheck(HttpServletRequest request, HttpServletResponse response) {
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("chkid"));   // 매개값 "chkid"는 memberJoinForm.jsp에 있는 ajax에 정의되어 있는 데이터값의 key값이다. value는 var id
		boolean b = memberDao.memberIdCheck(vo); // true는 이미 존재한다는 것, false는 사용가능한 것. 
		String chk = "0";
		if(b) {	// 존재하면 
			chk = "1";
		} 
		return chk;
		
	}
	
	@RequestMapping("memberJoin.do")
	public String memberJoin(HttpServletRequest request, HttpServletResponse response) {
		String message = null;
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setTel(request.getParameter("tel"));
		vo.setAddress(request.getParameter("address"));
		vo.setAuthor("USER"); 
		int n = memberDao.memberInsert(vo);
		if(n !=0) {
			message = "회원가입이 성공적으로 되었습니다.";
		} else {
			message = "회원가입이 실패하였습니다. <br> 관리자에게 문의하세요. ";
		}
		
		request.setAttribute("message", message);
		return "member/memberJoin";
		
	}
	
	@RequestMapping(value = "memberLoginForm.do")
	public String memberLoginForm(HttpServletRequest request, HttpServletResponse response) {
		
		return "member/memberLoginForm";
	}
	
	@RequestMapping(value = "memberLogin.do")
	public String memberLogin(HttpServletRequest request, HttpServletResponse response) {
		MemberVO vo = new MemberVO();
		String message= null;
		HttpSession session = request.getSession();
		vo.setId(request.getParameter("id"));  // 여기의 "id"와 "password"는 memberloginFrorm에서 제공하는 name속성(자바)의 값을 의미한다.
		vo.setPassword(request.getParameter("password"));  // request.getParameter는 form값에서 넘어온 데이터를 가져올 때 사용하는 메소드다.
		vo = memberDao.memberSelect(vo);  // 한 명을 조회하는 경우 또는 로그인 처리용. 
		if(vo !=null) {  // 존재하는 경우~
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("name", vo.getName());
			message = vo.getName() + "님 환영합니다.";
		} else {
			message = "아이디 또는 패스워드가 틀렸습니다.";
		}
		request.setAttribute("message", message);
		
		return "member/memberLogin";
	}
	
	@RequestMapping(value = "logout.do")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "home/home"; 
	}
	
	@RequestMapping("memberInfo.do")
	public String memberInfo(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberVO vo = new MemberVO();
		vo.setId((String)session.getAttribute("id"));
		request.setAttribute("member", memberDao.memberSelect(vo));
		
		return "member/memberInfo";
	}
	
	@RequestMapping("memberUpdate.do")
	public String memberUpdate(HttpServletRequest request, HttpServletResponse response) {
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		
		request.setAttribute("member", memberDao.memberSelect(vo));
		return "member/memberUpdate";
	}
	
	@RequestMapping("memberEditSave.do")
	public String memberEditSave(HttpServletRequest request, HttpServletResponse response) {
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setTel(request.getParameter("tel"));
		vo.setAddress(request.getParameter("address"));
		vo.setAuthor(request.getParameter("author")); 
		memberDao.memberUpdate(vo);	
		
		return "member/memberInfo";
	}
	
	@RequestMapping("memberDelete.do")
	public String memberDelete(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));  // 
		int n = memberDao.memberDelete(vo);
		if(n !=0) {
			session.invalidate(); //회원정보 삭제 후 세션값도 삭제한다. 
		}
		return "home/home";
	}
	
	
	@ResponseBody
	@RequestMapping("ajaxAuthorUpdate.do")
	public String ajaxAuthorUpdate(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));  //ajax에서 id로 실었엇음.
		vo.setAuthor(request.getParameter("author"));
		int n = memberDao.memberAuthorUpdate(vo); //update 구문이니깐 integer가 리턴.
		if(n !=0) { //성공적이면~
			result = "yes";     
		} else {
			result = "no";
		}
		return result;
		
	}
	
	
	
	
	
}
