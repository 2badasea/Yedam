package co.bada.prj.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	
	MemberVO memberSelect(MemberVO vo);
	
	
	//밑의 insert, update, delete가 int타입인 것은 db에서 각 sql문을 실행했을 때의
	//결과가 0또는 1이기 때문. ex) "1행이 삽입되었습니다." "0행이 삭제되었습니다." 
	int memberInsert(MemberVO vo);
	
	int memberUpdate(MemberVO vo);
	
	int memberDelete(MemberVO vo);
	
}
