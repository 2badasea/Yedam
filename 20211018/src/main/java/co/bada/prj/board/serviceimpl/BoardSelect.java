package co.bada.prj.board.serviceimpl;

import java.util.Scanner;

import co.bada.prj.board.BoardService;
import co.bada.prj.board.BoardVO;
import co.bada.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {
		BoardService boardDao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
		System.out.println("**********************");
		System.out.println("조회할 글번호를 입력하세요.");
		board.setBId(scn.nextInt());
		board = boardDao.boardSelect(board);
		if(board != null) {
			board.toString();
		}else {
			System.out.println("존재하지 않는 게시글 입니다.");
		}
		System.out.println("**********************");
	}
}
