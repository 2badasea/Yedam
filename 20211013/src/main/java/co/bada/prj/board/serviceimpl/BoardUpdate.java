package co.bada.prj.board.serviceimpl;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;

public class BoardUpdate implements Command {

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		
		System.out.println("수정할 글의 번호를 입력하세요");
		vo.setBId(GB.sc.nextInt());
		GB.sc.nextLine(); //버퍼용
		System.out.println("내용을 입력하세요");
		vo.setBContents(GB.sc.nextLine());
		
		int n = dao.boardUpdate(vo);
		if(n !=0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("수정이 실패되었습니다.");
		}
		

	}

}
