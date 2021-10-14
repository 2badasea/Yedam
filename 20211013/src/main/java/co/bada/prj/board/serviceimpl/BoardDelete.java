package co.bada.prj.board.serviceimpl;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;

public class BoardDelete implements Command {

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		
		System.out.println("삭제할 글의 번호를 입력하세요");
		vo.setBId(GB.sc.nextInt());
		
		int n = dao.boardDelete(vo);
		if(n !=0) {
			System.out.println("삭제됐습니다.");
		} else {
			System.out.println("실패했습니다.");
		}
		

	}

}
