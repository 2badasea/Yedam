package co.bada.prj.board.serviceimpl;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;

public class BoardInsert implements Command {

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("작성자를 입력하세요");
		vo.setBWriter(GB.sc.nextLine());  GB.sc.nextLine();
		System.out.println("제목을 입력하세요");
		vo.setBTitle(GB.sc.nextLine());
		System.out.println("내용을 입력하세요");
		vo.setBContents(GB.sc.nextLine());
		
		int n = dao.boardInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록을 실패했습니다.");
		}
		
	}

}
