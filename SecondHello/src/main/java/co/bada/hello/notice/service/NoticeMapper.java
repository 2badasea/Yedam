package co.bada.hello.notice.service;

import java.util.List;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	
	List<NoticeVO> noticeSearchList(String searchKey); // Í≤??Éâ?ùÑ ?úÑ?ïú Í≤?.
}
