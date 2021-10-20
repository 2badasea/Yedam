package co.bada.prj.book.serviceimpl;

import java.util.Scanner;

import co.bada.prj.book.BookService;
import co.bada.prj.book.BookVO;
import co.bada.prj.comm.Command;
import co.bada.prj.comm.GB;

public class BookInsert implements Command {
	private Scanner scn = new Scanner(System.in);
	private BookService bookdao = new BookServiceImpl();
	
	@Override
	public void execute() {
		BookVO vo = new BookVO();
		
		System.out.println("========================");
		vo.setCWriter(GB.NAME);
		System.out.println("제목을 입력하세요.");
		vo.setCTitle(scn.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setCContents(scn.nextLine());
		
		int n = bookdao.bookInsert(vo);
		if(n !=0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록이 실패되었습니다.");
		}
		

	}

}
