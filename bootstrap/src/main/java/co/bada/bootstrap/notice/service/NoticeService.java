package co.bada.bootstrap.notice.service;

import java.util.List;

public interface NoticeService {  //기본적인 crud
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	List<NoticeVO> noticeSearchList(String searchKey);  // 내용검색을 위한 것. 
	
}
