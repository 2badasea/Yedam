package co.micol.prj.command;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;

public class BoardSelect implements Command {

	@Override
	public void execute() {
		BoardService boardDao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
		System.out.println("**********************");
		System.out.println("조회할 글번호를 입력하세요.");
		board.setBId(GB.sc.nextInt());
		board = boardDao.boardSelect(board);
		if(board != null) {
			board.toString();
		}else {
			System.out.println("존재하지 않는 게시글 입니다.");
		}
		System.out.println("**********************");
	}
}
