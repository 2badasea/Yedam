package co.bada.prj.member.service;

import java.util.List;

public interface MemberMapper {
	//기본적인 CRUD. memberservice에서 복붙. 
		List<MemberVO> memberSelectList();   
		MemberVO memberSelect(MemberVO vo);   
		int memberInsert(MemberVO vo);
		int memberDelete(MemberVO vo);
		int memberUpdate(MemberVO vo);
		boolean memberIdCheck(MemberVO vo);  
		int memberAuthorUpdate(MemberVO vo);
}
