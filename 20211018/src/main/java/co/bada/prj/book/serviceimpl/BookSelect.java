package co.bada.prj.book.serviceimpl;

import java.util.Scanner;

import co.bada.prj.book.BookService;
import co.bada.prj.book.BookVO;
import co.bada.prj.comm.Command;

public class BookSelect implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {
		BookService bookDao = new BookServiceImpl();
		BookVO vo = new BookVO();
		System.out.println("==================");
		System.out.println("조회할 이름을 입력하세요.");
		vo.setCWriter(scn.nextLine());
		vo = bookDao.bookSelect(vo);
		if(vo !=null) {
			vo.toString();
		} else {
			System.out.println("내용이 존재하지 않습니다.");
		}
		System.out.println("===================");
		

	}

}
