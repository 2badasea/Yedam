package co.bada.prj.board.serviceimpl;

import java.util.Scanner;

import co.bada.prj.board.BoardService;
import co.bada.prj.board.BoardVO;
import co.bada.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner scn = new Scanner(System.in);
	public BoardService dao = new BoardServiceImpl();

	@Override
	public void execute() {
		// 게시글 삭제
		BoardVO vo = new BoardVO();
		System.out.println("======================");
		System.out.println("삭제할 글 번호를 입력하세요.");
		vo.setBId(scn.nextInt());
		int n = dao.boardDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("게시글 삭제 실패입니다. ");
		}

	}

}
