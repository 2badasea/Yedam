package co.bada.prj.board.serviceimpl;

import java.util.Scanner;

import co.bada.prj.board.BoardService;
import co.bada.prj.board.BoardVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;

public class BoardUpdate implements Command {
	private Scanner scn = new Scanner(System.in);
	
	@Override
	public void execute() {
		BoardService boardDao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
	
		System.out.println("*******************");
		System.out.println("!! 수정할 게시글 번호를 입력하세요.");
		board.setBId(scn.nextInt()); scn.nextLine();
		board = boardDao.boardSelect(board);
		if(board != null) {
			if(board.getBWriter().equals(GB.NAME)) {
				board.toString();
				System.out.println("*******************");
				System.out.println("수정할 내용을 입력하세요.");
				board.setBContents(scn.nextLine());
				
				int n = boardDao.boardUpdate(board);
				String message = (n != 0)? "수정 성공" : "수정 실패"; 
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
