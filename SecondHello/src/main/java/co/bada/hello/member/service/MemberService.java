package co.bada.hello.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);   // 
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean memberIdCheck(MemberVO vo);   //  
	int memberAuthorUpdate(MemberVO vo);
}
