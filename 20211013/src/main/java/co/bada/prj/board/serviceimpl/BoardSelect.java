package co.bada.prj.board.serviceimpl;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;


public class BoardSelect implements Command {

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("조회할 글번호를 입력하세요.");
		vo.setBId(GB.sc.nextInt());
		vo = dao.boardSelect(vo);
		System.out.println("id : " + vo.getBId());
		System.out.println("작성자 : " + vo.getBWriter());
		System.out.println("공지사항 제목 : " + vo.getBTitle());
		System.out.println("공지사항 내용 : " + vo.getBContents());
		System.out.println("조회수 : " + vo.getBHit());
		

	}

}
