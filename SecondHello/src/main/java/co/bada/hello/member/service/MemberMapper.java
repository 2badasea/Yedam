package co.bada.hello.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);   // ? κ°?μ§? ?©?. λ‘κ·Έ?Έ ??Έ?©κ³?, ?? ? λͺ? μ‘°ν?κΈ°μ©
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean memberIdCheck(MemberVO vo);   //  id?μ€λ³΅μ²΄ν¬?© 
	int memberAuthorUpdate(MemberVO vo);
}
