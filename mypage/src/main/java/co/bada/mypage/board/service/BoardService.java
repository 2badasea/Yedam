package co.bada.mypage.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	List<BoardVO> boardSearchList(String searchKey);  // 내용검색을 위한 것. 
}
