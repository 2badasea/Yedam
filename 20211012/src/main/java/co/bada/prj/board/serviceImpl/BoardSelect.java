package co.bada.prj.board.serviceImpl;

import java.util.Scanner;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("조회할 글번호를 입력");
		vo.setBId(scn.nextInt());
		vo = dao.boardSelect(vo);
		System.out.println("id : " + vo.getBId());
		System.out.println("작성자 : " + vo.getBWriter());
		System.out.println("공지사항 제목 :" + vo.getBTitle());
		System.out.println("조회수 : " + vo.getBHit());
		System.out.println("공지사항 내용 : " + vo.getBContents());
	}

}
