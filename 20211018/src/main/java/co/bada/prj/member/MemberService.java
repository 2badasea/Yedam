package co.bada.prj.member;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberList();

	MemberVO memberSelect(MemberVO vo);

	int memberInsert(MemberVO vo);

	int memberUpdate(MemberVO vo);

	int memberDelete(MemberVO vo);
}
