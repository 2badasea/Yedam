package co.bada.prj.book.serviceimpl;

import java.util.Scanner;

import co.bada.prj.book.BookService;
import co.bada.prj.book.BookVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;

public class BookUpdate implements Command {
	private Scanner scn = new Scanner(System.in);
	
	@Override
	public void execute() {
		BookService bookDao = new BookServiceImpl();
		BookVO vo = new BookVO();
		
		System.out.println("======================");
		System.out.println("수정할 글 번호를 입력하세요.");
		vo.setCId(scn.nextInt()); scn.nextLine();
		vo = bookDao.bookSelect(vo);
		if(vo !=null) {
			if(vo.getCWriter().equals(GB.NAME)) {
				vo.toString();
				System.out.println("==================");
				System.out.println("수정할 제목을 입력하세요");
				vo.setCTitle(scn.nextLine());
				System.out.println("수정할 내용을 입력하세요");
				vo.setCContents(scn.nextLine());
				
				int n = bookDao.bookUpdate(vo);
				String message = (n !=0)? "수정 성공" : "수정 실패";
				System.out.println(message);
			} else {
				System.out.println("작성자만 수정이 가능합니다.");
			}
		} else {
			System.out.println("존재하지 않는 게시글 입니다.");
		}
		System.out.println("==================");

	}

}
