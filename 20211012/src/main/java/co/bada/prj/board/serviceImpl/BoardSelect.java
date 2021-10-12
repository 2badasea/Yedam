package co.bada.prj.board.serviceImpl;

import java.util.Scanner;

import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("========================");
		System.out.println("조회할 공지 번호를 입력하세요.");
		board.setBId(sc.nextInt()); sc.nextLine();
		board = boardService.boardSelect(board);
		
		
		System.out.println(" 번호 : "  + board.getBId());
		System.out.println(" 작성자 : "  +board.getBWriter());
		System.out.println(" 작성일자 : "  +board.getBWriteDate());
		System.out.println(" 제목 : "  +board.getBTitle());
		System.out.println(" 내용 : "  +board.getBContents());
		System.out.println(" 조회수 : "  +board.getBHit());
		
	}

}
