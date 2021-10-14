package co.micol.prj.command;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;

public class BoardUpdate implements Command {

	@Override
	public void execute() {  //게시글 수정 자신글만 수정한다.
		BoardService boardDao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
	
		System.out.println("*******************");
		System.out.println("!! 수정할 게시글 번호를 입력하세요.");
		board.setBId(GB.sc.nextInt());GB.sc.nextLine();
		board = boardDao.boardSelect(board);
		if(board != null) {
			if(board.getBWriter().equals(GB.NAME)) {
				board.toString();
				System.out.println("*******************");
				System.out.println("수정할 내용을 입력하세요.");
				board.setBContents(GB.sc.nextLine());
				int n = boardDao.boardUpdate(board);
				String message = (n != 0)? "수정 성공" : "수정 실패";  //조건 연산자
				System.out.println(message);
			}else {
				System.out.println("작성자만 수정이 가능합니다.");
			}
		}else {
			System.out.println("존재하지 않는 게시글 입니다.");
		}
		System.out.println("*******************");
	}

}
