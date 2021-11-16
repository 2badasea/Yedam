package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class LoginCommand implements Command {
	//로그인을 처리하는 부분이라, 처음에 db를 갔다와야 함. 
	
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();   //server가 만들어놓은 세션객체를 가져오겠다는 것. 
		
		vo.setId(request.getParameter("id"));   //vo객체에 담는 과정. 
		vo.setPassword(request.getParameter("password"));
		vo = memberDao.memberSelect(vo);  // vo객체를 실어나른다. 존재하면 결과가 담겨져 올 것. 
		String message = null;
		if(vo != null) {  // "vo객체의 값이 존재한다면~"   세션다루기. >>> 그래야 로그인이 유지될 수 있음. 
			session.setAttribute("id", vo.getId());   //세션에 해당 값들 3개를 담는다. 세션객체는 생성될 때 고유한 id가 생성된다. (uuid) 
			session.setAttribute("name", vo.getName());	// 브라우저가 다음에 또 들어오면 그때는 session객체를 안 만들어준다. 처음에만 만들어줌. 
			session.setAttribute("author", vo.getAuthor());  // 처음에만 session, 그다음부터는 request,response 객체만 계속 생성소멸이 반복. 
			message = vo.getName() + "님 환영합니다.";  
		} else {
			message = "아이디 또는 패스워드가 틀립니다.";
		}
		//결과를 실어보낼 때는 request객체를 씀. 
		request.setAttribute("message", message); // 결과를 담아 보낼 때.  "message"는 jsp페이지의 변수명. message는 값. 
										// "message"라는 변수명에 message값을 담아서, 그걸 memeber/memberLogin에 담는다고 이해.
		return "member/memberLogin";  // 보여줄 페이지  
	}

}
