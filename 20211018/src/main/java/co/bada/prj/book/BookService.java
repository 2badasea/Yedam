package co.bada.prj.book;

import java.util.List;

public interface BookService {
	List<BookVO> bookSelectList();
	BookVO bookSelect(BookVO vo);
	int bookInsert(BookVO vo);
	int bookUpdate(BookVO vo);
	int bookDelete(BookVO vo);
}
