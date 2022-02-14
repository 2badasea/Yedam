package co.bada.hello.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);   // ?‘ ê°?ì§? ?š©?„. ë¡œê·¸?¸ ?™•?¸?š©ê³?, ?šŒ?› ?•œ ëª? ì¡°íšŒ?•˜ê¸°ìš©
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean memberIdCheck(MemberVO vo);   //  id?…ˆì¤‘ë³µì²´í¬?š© 
	int memberAuthorUpdate(MemberVO vo);
}
