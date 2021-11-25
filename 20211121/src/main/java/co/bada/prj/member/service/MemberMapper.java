package co.bada.prj.member.service;

import java.util.List;

public interface MemberMapper {
//  vo객체를 위한 클래스 만들고, 쿼리문을 위한 인터페이스, 그리고 mapper인터페이스를 만들어야 한다. 
	// 전체리스트를 가져오는 것. 
	List<MemberVO> memberSelectList();  
	MemberVO memberSelect(MemberVO vo); // login 또는 1명의 데이터를 가져오는 2가지 용도. 
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberInsert(MemberVO vo);
	boolean memberIdCheck(MemberVO vo); // 아이디 중복체크용. 
	int memberAuthorUpdate(MemberVO vo);  // 멤버 권한 변경.
}
