package co.bada.prj;

import co.bada.prj.menu.Menu;

public class MainApp {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.run();
		
	
	}

}

//vo.setBId(3);//3번글 가져오기
//
//vo = dao.boardSelect(vo);
//System.out.println(vo.getBId());
//System.out.println(vo.getBContents());
// **********************
//		List<BoardVO> list = new ArrayList<BoardVO>();
//		list = dao.boardSelectList();
//		
//		for(BoardVO v1 : list) {
//			System.out.println(v1.getBId() + " :  " + v1.getBTitle());  // 리스트 가져오기

// ******************************************** 추가
//		System.out.println("Hello Bada");
//		List<BoardVO> list = new ArrayList<BoardVO>();
//
//		BoardService dao = new BoardServiceImpl(); // 서비스 호출
//		BoardVO vo = new BoardVO();
//
//		vo.setBWriter("안경만");
//		vo.setBTitle("오늘의 공지사항");
//		vo.setBContents("날씨가 춥습니다");
//
//		vo.setBWriter("관리자");
//		vo.setBTitle("마이바티스 테스트");
//		vo.setBContents("마이바티스는 sqlmapper로 dbms와 통신한다.");
//
//		int n = dao.boardInsert(vo);
//
//		if (n != 0) {
//			System.out.println("성공");
//			list = dao.boardSelectList();		// 제대로 들어갔는지 확인
//			for (BoardVO board : list) {
//				System.out.println(board.getBId() + " : " + board.getBContents());
//			}
//		} else {
//			System.out.println("실패");
//		}


//		List<MemberVO> list = new ArrayList<MemberVO>();
//		MemberService dao = new MemberServiceImpl();
//		list = dao.memberSelectList();
//		
//		for (MemberVO member : list) {
//			System.out.println(member.getId() + " : " + member.getName());
//			
//			
//		}
//		System.out.println("======================");
//		BoardService bs = new BoardServiceImpl();
//		List<BoardVO> boards = new ArrayList<BoardVO>();
//		boards = bs.boardSelectList();
//		for (BoardVO board : boards) {
//			System.out.println(board.getBId() + " : " + board.getBContents());
//			
//		}