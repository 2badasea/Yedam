package co.micol.prject.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prject.board.service.BoardService;
import co.micol.prject.board.service.BoardVO;
import co.micol.project.comm.Command;

public class BoardList implements Command {

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		list = dao.boardSelectList();
		System.out.println("=================");
		System.out.println("공지사항 목록");
		for(BoardVO vo : list) {
			vo.toListString();
		}
		System.out.println("=================");
	}

}
