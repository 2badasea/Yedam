package co.bada.hello.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);   // ?�� �?�? ?��?��. 로그?�� ?��?��?���?, ?��?�� ?�� �? 조회?��기용
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean memberIdCheck(MemberVO vo);   //  id?��중복체크?�� 
	int memberAuthorUpdate(MemberVO vo);
}
