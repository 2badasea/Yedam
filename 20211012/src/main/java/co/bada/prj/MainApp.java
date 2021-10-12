package co.bada.prj;



import java.util.ArrayList;
import java.util.List;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.board.serviceImpl.BoardServiceImpl;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;
import co.bada.prj.menu.Menu;

public class MainApp {
	

	public static void main(String[] args) {
//		System.out.println("Hello Bada");
//		System.out.println("=========================");
//		List<BoardVO> list = new ArrayList<BoardVO>();
//		BoardService dao = new BoardServiceImpl(); // 서비스 호출
//		BoardVO vo = new BoardVO();
//
//		vo.setBWriter("관리자");
//		vo.setBTitle("마이바티스 테스트");
//		vo.setBContents("마이바티스는 sqlMapper는 dbms와 통신한다. ");
//		
//		int n = dao.boardInsert(vo);   
//		if(n !=0) {
//			System.out.println("입력 성공");
//			list = dao.boardSelectList();
//			for(BoardVO board : list) {
//				System.out.println(board.getBId() + "  :  " + board.getBContents());
//			}
//		} else {
//			System.out.println("입력 실패");
//		}
//		System.out.println("=========================");
		
		
		System.out.println("=========================");
			List<MemberVO> list = new ArrayList<MemberVO>();
			MemberService dao = new MemberServiceImpl();
			list = dao.memberList();
			
			for(MemberVO member : list) {
				System.out.println(member.getId() + "  :  " + member.getName());
			}
		System.out.println("=========================");
		
		
		
		System.out.println("=========================");
		BoardService bs = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = bs.boardSelectList();
		
		for(BoardVO board : boards) {
			System.out.println(board.getBId() + "   :   " + board.getBContents());
		}
		System.out.println("=========================");
		
		
		
		System.out.println("=========================");
		Menu menu = new Menu();
		menu.run();
		System.out.println("=========================");
		
		
		
//		vo.setBId(2); // 2번글 가져오기.
		

		// 새로운 공지사항을 추가해보자.
		
		

//		List<BoardVO> list = new ArrayList<BoardVO>();
//		list = dao.boardSelectList();
//		
//		for(BoardVO vo : list) {
//			System.out.println(vo.getBId() + " :  " + vo.getBTitle());
	}
}
