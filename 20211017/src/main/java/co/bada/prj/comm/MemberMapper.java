package co.bada.prj.comm;

import java.util.List;

public interface MemberMapper {
	//해당 클래스는 인터페이스 클래스다. 
	
	List<MemberVO> memberList();
	
	MemberVO memberSelect(MemberVO vo);
	
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	//위의 3메소드가 int타입인 것은 db에서 각각의 sql문을 실행했을 때의 결과가
	//0또는 1이기 때문. ex) "1행이 삽입되었습니다"
}
