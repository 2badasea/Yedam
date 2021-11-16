package co.bada.prj.comm;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.command.HomeCommand;
import co.bada.prj.command.LoginCommand;
import co.bada.prj.command.LoginForm;
import co.bada.prj.command.Logout;
import co.bada.prj.command.MemberList;

/**
 * Servlet implementation class FrontController
 */
// @WebServlet("/FrontController")  안 사용하기 때문에, 삭제, 사용한다며 import도 해야함. web.xml에 매핑하는 방식 사용. 
public class FrontController extends HttpServlet {
	private HashMap<String, Command> map = new HashMap<String, Command>(); //command 인터페이스를 만들어 key에 적당한 값을 반환하기 위함. 
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		 // init은 초기값을 설정하는 부분.  ("/login.do", new LoginCommand()) >>> key, value값으로 만든다. 그래서 hashmap구조가 필요 >>> 위에서 선언. 
		map.put("/home.do", new HomeCommand());    // 홈 페이지를 보여주는 Command
		map.put("/login.do", new LoginCommand());  // 로그인 처리.
		map.put("/memberList.do", new MemberList());  // 멤버 목록 보기.
		map.put("/loginForm.do", new LoginForm()); // 로그인 폼 호출.
		map.put("/logout.do", new Logout());  // 로그아웃. 
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청을 분석하고 처리하는 부분.  
		request.setCharacterEncoding("UTF-8");  //한글 깨짐 처리 용도. 
		String uri = request.getRequestURI();  //  URI를 구한다. 
		String contextPath = request.getContextPath();  // contextPath 구함. 
		String page = uri.substring(contextPath.length());  // 실제 요청을 구함.  
						// 예를들어, localhost/20211116/a.do  /a.do가 실제호출명령.  uri에서 contextPath부분인 20211116을 제외한 부분. 
	//	System.out.println(request.getLocalAddr() + "=======");  //console창에 찍힘. 나의 서버ip가 뜬다. 
	//	System.out.println(request.getRemoteAddr() + "======="); // 누가 내 서버에 접속했는지 뜨게 하는 것. apache 폴더의 log에 들어가면 log기록이 있음. request객체역할.
		
		Command command = map.get(page); //요청에 대한 수행할 command를 찾음. 
			// map에 key값을 던져주는 게 get()메소드. key값인 'page'가 '/home.do' 이면 위에서 HomeCommand()를 value값으로 반환하는 방식. 그걸 좌항의 command변수명에 담는다. 
		String viewPage = command.run(request, response);   // home/home 이 리턴되서 viewPage에 담긴다.
			
		//WEB-INF에 접근할 수 있도록 viewResolve를 만듬. 서버에서 접근하기 때문에 접근 가능. 
		
		if(!viewPage.endsWith(".do")) {  // "해당 문자열의 마지막에 .do 가 포함되어 있지 않다면(!)~" 
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";  //WEB-INF/views/home/home.jsp  
		} 
		
		//클라이언트가 볼 수 있도록 응답처리를 하는 부분. 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage); 
		dispatcher.forward(request, response);     // jsp액션태그에서 forward와 respondSendRedirect는 휴대폰을 전달하지 않고 명령을 전달함. 
			//반면에 requestdispathcer는 휴대폰을 싣고 가기 때문에, 정확하게 결과가 다시 돌아온다는 예. 
			// 특히 db와의 연동에서 차이가 크다. controller에서는 dispatcher를 사용. 
			// 그래서 결국 dispathcer를 사용함으로써 위에서 정의된 viewPage값이 그대로 가지고 응답처리. 
		
	}

}
