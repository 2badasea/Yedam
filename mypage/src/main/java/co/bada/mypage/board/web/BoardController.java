package co.bada.mypage.board.web;

import java.sql.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.bada.mypage.board.service.BoardService;
import co.bada.mypage.board.service.BoardVO;

@Controller
public class BoardController {
	@Autowired
	BoardService boardDao;
	
	@RequestMapping("boardList.do")
	public String boardList(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("boards", boardDao.boardSelectList());
	
		return "board/boardList";
	}
	
	@RequestMapping("boardForm.do")
	public String boardForm(HttpServletRequest request, HttpServletResponse response) {
		
		return "board/boardForm";
	}
	
	@RequestMapping("boardResister.do")
	public String boardResister(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, String> map = new HashMap<String, String>();
		BoardVO vo = new BoardVO();
		HttpSession session = request.getSession();
		vo.setId((String) session.getAttribute("id")); // 세션에 저장된 아이디 값. // session의 리턴값은 object이기 때문에 String으로 형변환.
		vo.setName((String) session.getAttribute("name"));
		vo.setWdate(Date.valueOf(map.get("wdate")));
		vo.setTitle(map.get("title"));
		vo.setSubject(map.get("subject"));
		boardDao.boardInsert(vo);
		return "board/boardList";
	}
	
	@RequestMapping("boardRead")
	public String boardRead(HttpServletRequest request, HttpServletResponse response) {
		BoardVO vo = new BoardVO();
		vo.setNo(Integer.valueOf(request.getParameter("no")));
		request.setAttribute("board", boardDao.boardSelect(vo));  // 알아서 형 변환됨 
		return "board/boardRead";
		
	}
	
	
	
}
