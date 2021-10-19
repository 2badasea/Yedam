/*
 * List는 동일한 특성의 데이터들을 묶는다. 
 * 리스트의 길이는 가변적이다. 이를 '동적 할당'이라고 한다. 
 * 데이터들이 연속적으로 나열된다. >>> 데이터(element)사이에 빈 공간을 허용하지 않는다. 
 * List인터페이스는 3개의 클래스로 구성되어 있다. Vector, ArrayList, LinkedList 
 */
package co.bada.prj.comm;

import java.util.List;

public interface MemberService {    //인터페이스로 정의. 각각의 메소드들을 구현해야 한다. 
	List<MemberVO> memberList();  //전체 목록 가져오기
	MemberVO selectMember(MemberVO vo); //원하는 한 명의 정보 가져오기 
	int insertMember(MemberVO vo); // 한 명의 데이터 삽입. 
	int updateMember(MemberVO vo); // 한 명의 데이터 변경. 
	int deleteMember(MemberVO vo); // 한 명의 데이터 삭제. 
	
	
}
