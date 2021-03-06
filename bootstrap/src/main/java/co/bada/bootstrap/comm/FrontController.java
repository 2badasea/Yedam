package co.bada.bootstrap.comm;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.bootstrap.comm.main.Buttons;
import co.bada.bootstrap.main.Login;
import co.bada.bootstrap.main.MainCommand;
import co.bada.bootstrap.member.command.LoginCheck;
import co.bada.bootstrap.member.command.Logout;
import co.bada.bootstrap.notice.command.NoticeList;

/**
 * 메인 컨트롤러.
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
	
       
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainCommand());  //시작하는 곳
		map.put("/noticeList.do", new NoticeList()); // 공지사항 목록
		map.put("/buttons.do", new Buttons()); // buttons.html 호출
		map.put("/login.do", new Login());  // 로그인 폼 호출.
		map.put("/loginCheck.do", new LoginCheck()); // 로그인 처리
		map.put("/logout.do", new Logout()); // 로그아웃 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath(); 
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.run(request, response);
		
		//view resolve  >>> 이번에는 tile까지 포함해서 3개가 되어야 한다. 1. ajax요청용 2. tiles용 3. jsp용. 
		if(!viewPage.endsWith(".do")) {
			if(viewPage.startsWith("ajax:")) {
				//ajax처리루틴. 
				return;
			} 
			if(viewPage.endsWith(".jsp")) {
				viewPage = "WEB-INF/views/" + viewPage;  // 타일즈를 안 탈 때.
			} else {
			viewPage = viewPage + ".tiles";  // tiles 레이아웃 사용하기 위함.
		}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
