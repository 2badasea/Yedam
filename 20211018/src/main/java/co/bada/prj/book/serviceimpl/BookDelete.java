package co.bada.prj.book.serviceimpl;

import java.util.Scanner;

import co.bada.prj.book.BookService;
import co.bada.prj.book.BookVO;
import co.bada.prj.comm.Command;

public class BookDelete implements Command {
	private Scanner scn = new Scanner(System.in);
	private BookService bookDao = new BookServiceImpl();

	@Override
	public void execute() {	//게시글 삭제
		BookVO vo = new BookVO();
		
		System.out.println("=====================");
		System.out.println("삭제할 글의 번호를 입력하세요.");
		vo.setCId(scn.nextInt());
		
		int n = bookDao.bookDelete(vo);
		if(n !=0) {
			System.out.println("성공적으로 삭제 되었습니다.");
		} else {
			System.out.println("게시글 삭제가 실패되었습니다.");
		}
		

	}

}
