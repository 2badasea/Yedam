package co.bada.hello.notice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.hello.notice.service.NoticeMapper;
import co.bada.hello.notice.service.NoticeService;
import co.bada.hello.notice.service.NoticeVO;

@Repository("noticeDao")
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeMapper map;  //autowired가 적용되는 건 바로 밑의 한 행에만 적용됨!
	
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
