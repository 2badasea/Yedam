package co.bada.prj.member.service;

import java.util.List;

public interface MemberService {
	//기본적인 CRUD
	List<MemberVO> memberSelectList();   //전체 회원 가져오는 것. 
	MemberVO memberSelect(MemberVO vo);   // login, 1명 데이터 가져오기로 2가지 용도. 
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	boolean memberIdCheck(MemberVO vo);  //아이디 중복체크용. 
	int memberAuthorUpdate(MemberVO vo);  // 멤버 권한 변경 
	
}
