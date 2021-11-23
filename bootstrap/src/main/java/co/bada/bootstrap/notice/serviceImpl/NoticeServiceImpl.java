package co.bada.bootstrap.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.bada.bootstrap.comm.DataSource;
import co.bada.bootstrap.notice.service.NoticeMapper;
import co.bada.bootstrap.notice.service.NoticeService;
import co.bada.bootstrap.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession session = DataSource.getDataSource().openSession(true);
	private NoticeMapper map = session.getMapper(NoticeMapper.class);  
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		// TODO Auto-generated method stub
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeDelete(vo);
	}

	@Override
	public List<NoticeVO> noticeSearchList(String searchKey) {
		// TODO Auto-generated method stub
		return map.noticeSearchList(searchKey);
	}

}
