package co.bada.prj.member.service;

import java.util.List;

public interface MemberMapper { //거의 대부분 MemberService와 MemberMapper의 구성은 비슷하다. 
	List<MemberVO> memberList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	
	MemberVO loginCheck(MemberVO vo);
}
