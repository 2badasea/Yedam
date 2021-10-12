package co.bada.prj.board.serviceImpl;

import java.util.Scanner;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		BoardService dao  = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("삭제할 글 번호를 입력");
		vo.setBId(scn.nextInt());
		int n = dao.boardDelete(vo);
				if(n!=0) {
					System.out.println("삭제 되었습니다.");
				}else {
					System.out.println("실패");
				}
		
		// TODO Auto-generated method stub

	}

}
