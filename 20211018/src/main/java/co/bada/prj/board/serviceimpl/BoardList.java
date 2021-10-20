package co.bada.prj.board.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.board.BoardService;
import co.bada.prj.board.BoardVO;
import co.bada.prj.comm.Command;

public class BoardList implements Command {

	@Override
	public void execute() {
		BoardService boardDao = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardDao.boardSelectList();
		System.out.println("****** 게시글 목록 ******");
		for(BoardVO board : boards) {
			board.toListString();
		}
		System.out.println("**********************");

	}

}
