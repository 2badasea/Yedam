package co.bada.Second;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id"); // 폼에서 넘어온 변수명이 id >>> 확인하기
		String password = request.getParameter("password"); 
		String message= null;
		
		if(id.equals("hong") && password.equals("1234")) {
			message= "1234";
		} else {
			message = "5678";
		}
		response.sendRedirect("loginResult.jsp?msg="+message);
		
		
		
//		노답방식 
//		response.setContentType("text/html; charset=UTF-8"); 
//		response.setCharacterEncoding("UTF-8");
		
//		Writer out = response.getWriter();
//		out.write("<div><h1>로그인</h1></div>");
//		out.write("<div><form>");
//		out.write("<div><table border='1'>");
//		out.write("<tr><th width='200'>아이디</th>");
//		out.write("<td width='300'><input type='text' id='id' name='id'></td></tr>");
//		out.write("<tr><th width='200'>패스워드</th>");
//		out.write("<td width='300'><input type='password' id='password' name='password'></td></tr>");
//		out.write("</table border='1'></div><br>");
//		out.write("<input type='submit' value='로그인'>");
//		out.write("</form></div>");
//		
//		out.close();
		
=======

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");//name 속성값
		String password = request.getParameter("password");
		String message = null;
		
		if(id.equals("hong") && password.equals("1234")) {
			message="홍길동님 환영합니다.";
		}else {
			message="아이디 또는 패스워드가 틀립니다.";
		}
		response.sendRedirect("loginResult.jsp?msg="+message+encodeURI(message,"UTF-8"));
	}

	private String encodeURI(String message, String string) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> branch 'master' of https://github.com/2badasea/Yedam.git
	}

}
