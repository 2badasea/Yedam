package co.bada.lms.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList(String status);   // 상태값을 받을 것이다. 상태값에 따라 선택적으로 멤버를 보여주기 위함. 
	MemberVO memberSelect(MemberVO vo); 
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean isCheckId(String id); // is니깐 존재하면 false >>> 사용가능하지 않다는 것, 그렇지 않으면 true.

}
