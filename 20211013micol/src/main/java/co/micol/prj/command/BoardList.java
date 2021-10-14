package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.comm.Command;

public class BoardList implements Command {

	@Override
	public void execute() {  //게시글 목록보기
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
