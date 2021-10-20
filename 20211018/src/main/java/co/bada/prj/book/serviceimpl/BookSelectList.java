package co.bada.prj.book.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.bada.prj.book.BookService;
import co.bada.prj.book.BookVO;
import co.bada.prj.comm.Command;

public class BookSelectList implements Command {

	@Override
	public void execute() {
		BookService bookDao = new BookServiceImpl();
		List<BookVO> books = new ArrayList<BookVO>();
		books = bookDao.bookSelectList();
		
		System.out.println("=====코멘트 목록======");
		for(BookVO vo : books) {
			vo.toListString();
		}
		System.out.println("==================");

	}

}
