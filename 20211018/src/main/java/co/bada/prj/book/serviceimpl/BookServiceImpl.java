package co.bada.prj.book.serviceimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.bada.prj.book.BookMapper;
import co.bada.prj.book.BookService;
import co.bada.prj.book.BookVO;
import co.bada.prj.comm.DataSource;

public class BookServiceImpl implements BookService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BookMapper map = sqlSession.getMapper(BookMapper.class);
	
	@Override
	public List<BookVO> bookSelectList() {
		// TODO Auto-generated method stub
		return map.bookSelectList();
	}

	@Override
	public BookVO bookSelect(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookSelect(vo);
	}

	@Override
	public int bookInsert(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookInsert(vo);
	}

	@Override
	public int bookUpdate(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookUpdate(vo);
	}

	@Override
	public int bookDelete(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookDelete(vo);
	}

}
