package co.bada.prj.board.serviceimpl;

import java.util.Scanner;

import co.bada.prj.board.BoardService;
import co.bada.prj.board.BoardVO;
import co.bada.prj.comm.Command;

public class BoardInsert implements Command {
	private Scanner scn = new Scanner(System.in);
	public BoardService dao = new BoardServiceImpl();
	
	
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		
		System.out.println("=====================");
		System.out.println("작성자를 입력하세요? ");
		vo.setBWriter(scn.nextLine());
		System.out.println("제목을 입력하세요? ");
		vo.setBTitle(scn.nextLine());
		System.out.println("내용을 입력하세요? ");
		vo.setBContents(scn.nextLine());
		int n = dao.boardInsert(vo);   //interface에서 썻으니깐 dao를 바로 쓸 수 있다. 
		if(n !=0) {
			System.out.println("정상적으로 등록 되었습니다.");
		} else {
			System.out.println("등록이 실패되었습니다..");
		}

	}

}
