package co.bada.prj.board.command;

import java.util.Scanner;

import co.bada.prj.board.service.BoardVO;

//command인터페이스를 추가한 클래스 생성. 
public class BoardSelect implements Command {
		private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
//		BoardService dao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
		System.out.println("========================");
		System.out.println("조회할 글 번호를 입력하세요. \n");
		board.setBId(scb.nextInt()); scb.nextLine();
		board = dao.boardSelect(board);
		
//		board.setbId(1); // 한 개 글을 읽고 싶으면,

		System.out.println(" 번호 : "  + board.getBId());
		System.out.println(" 작성자 : "  +board.getBWriter());
		System.out.println(" 작성일자 : "  +board.getBWriteDate());
		System.out.println(" 제목 : "  +board.getBTitle());
		System.out.println(" 내용 : "  +board.getBContents());
		System.out.println(" 조회수 : "  +board.getBHit());

	}

}
