package co.bada.prj.board.serviceImpl;

import java.util.Scanner;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;

public class BoardUpdate implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("변경할 글의 번호를 입력");
		vo.setBId(scn.nextInt());
		scn.nextLine();
		System.out.println("내용을 입력");
		vo.setBContents(scn.nextLine());
		int n = dao.boardUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 입력");
		} else {
			System.out.println("실패 하였습니다.");
		}

	}

}
