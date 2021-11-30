package co.bada.mypage.java.web;

import java.sql.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.bada.mypage.java.service.JavaService;
import co.bada.mypage.java.service.JavaVO;

@Controller
public class JavaController {
	@Autowired
	JavaService javaDao;
	
	
	
	@RequestMapping("javaList.do")
	public String javaList(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("javas", javaDao.javaSelectList());
		
		return "java/javaList";
	}
	
	@RequestMapping("javaForm.do")
	public String javaForm(HttpServletRequest request, HttpServletResponse response) {
		
		return "java/javaForm";
	}
	
	@RequestMapping("javaResister.do")
	public String javaResister(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, String> map = new HashMap<String, String>(); 
		JavaVO vo = new JavaVO();
		HttpSession session = request.getSession();
		vo.setId((String) session.getAttribute("id")); // 세션에 저장된 아이디 값. // session의 리턴값은 object이기 때문에 String으로 형변환.
		vo.setName((String) session.getAttribute("name")); // 세션에 저장된 이름 값 >>> 세션에 아이디와 이름을 담았다.
		vo.setWdate(Date.valueOf(map.get("wdate"))); 
		vo.setTitle(map.get("title"));
		vo.setSubject(map.get("subject"));
		javaDao.javaInsert(vo);
		return "java/javaList";
	}
	
	@RequestMapping("javaRead.do")
	public String javaRead(HttpServletRequest request, HttpServletResponse response) {
		JavaVO vo = new JavaVO();
		vo.setNo(Integer.valueOf(request.getParameter("no")));  // 문자열을 integer타입 객체로 만들어서 넘김. 
		request.setAttribute("java", javaDao.javaSelect(vo));  // 알아서 형 변환됨 
		return "java/javaRead";
		
	}
	
	
	
}
