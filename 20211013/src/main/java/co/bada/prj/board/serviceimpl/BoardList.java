package co.bada.prj.board.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;

public class BoardList implements Command {
	private BoardService boardService = new BoardServiceImpl();
	
	@Override
	public void execute() {
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();
		
		System.out.println("=======공지 사항 목록=======");
		for(BoardVO vo : boards) {
			System.out.println(vo.getBId() + " : ");
			System.out.println(vo.getBWriter() + " : ");
			System.out.println(vo.getBWriteDate() + " : ");
			System.out.println(vo.getBTitle() + " : ");
			System.out.println(vo.getBHit() + " : ");
		}
		
		System.out.println("========공지 사항 목록 끝========");
	}

}
