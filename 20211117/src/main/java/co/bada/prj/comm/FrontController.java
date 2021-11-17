package co.bada.prj.comm;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.command.HomeCommand;
import co.bada.prj.command.Logout;
import co.bada.prj.command.MemberDelete;
import co.bada.prj.command.MemberEditSave;
import co.bada.prj.command.MemberIdCheck;
import co.bada.prj.command.MemberInfo;
import co.bada.prj.command.MemberJoin;
import co.bada.prj.command.MemberJoinForm;
import co.bada.prj.command.MemberList;
import co.bada.prj.command.MemberLogin;
import co.bada.prj.command.MemberLoginForm;
import co.bada.prj.command.MemberUpdate;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
       
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		// Command들을 요청에 따라 처리할 수 있도록 메모리에 구성한다.
		map.put("/home.do", new HomeCommand());  //홈 페이지
		map.put("/memberLoginForm.do", new MemberLoginForm());  // 로그인 폼 호출.
		map.put("/memberLogin.do", new MemberLogin()); // 로그인처리. 
		map.put("/logout.do", new Logout()); // 로그아웃 
		map.put("/memberList.do", new MemberList());  // 멤버 목록 
		map.put("/memberJoinForm.do", new MemberJoinForm());  // 회원가입 폼 호출. 
		map.put("/ajaxIdCheck.do", new MemberIdCheck()); // 아이디 중복 체크
		map.put("/memberJoin.do", new MemberJoin()); // 회원가입 처리.
		map.put("/memberInfo.do", new MemberInfo()); // 회원 정보
		map.put("/memberUpdate.do", new MemberUpdate()); // 회원 정보 수정
		map.put("/memberEditSave.do", new MemberEditSave()); // 수정 사항 저장. 
		map.put("/memberDelete.do", new MemberDelete()); // 회원 정보 삭제.
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) //server는 요청이 들어오면 requset,response객체 생성. 
			throws ServletException, IOException {
		// 요청을 분석하고 실행할 command명령을 찾아 수행하고 결과를 돌려주는 메소드. 
		request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지용. 
		String uri = request.getRequestURI();  // domanin네임을 제외한 나머지.
		String contextPath = request.getContextPath(); // contextpath 구하기. 
		String page = uri.substring(contextPath.length());  // /~ 만 남는다. 
		
		Command command = map.get(page); // page 키값을 넣어준 것의 value값이 command에 삽입. >>> new HomeCommand()
		String viewPage = command.run(request, response);  //service()메소드의 매개값 request, response을 그대로 이용. 
		
		// view resolve
		if(!viewPage.endsWith(".do")) {
			if(viewPage.startsWith("ajax:")) {  // ajax 처리 
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().append(viewPage.substring(5));
				return; // return하면 호출한 페이지로 바로 날아간다. 밑으로 안 감.
			} else {
				viewPage = "WEB-INF/views/" + viewPage + ".jsp";
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response); // 38행의 request, response가 또 그대로 전달. 
		
		
		
		
		
	}

}
