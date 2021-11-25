package co.bada.hello.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.hello.member.service.MemberMapper;
import co.bada.hello.member.service.MemberService;
import co.bada.hello.member.service.MemberVO;

@Repository("memberDao")    //IOC컨테이너에 레퍼지토리로 등록한다. 최신 버전 이후로는 가급적이면 이름 넣자~
//@Service    // 보통 vo객체를 주입하고 싶을 때는 service를 이용한다. 
//@Component   // 이 3개 어노테이션은 같은 개념이다.3개 모두 이름 넣어주자. 안 넣어주면 에러가 뜬다. 
public class MemberServiceImpl implements MemberService {
	@Autowired    // 자동주입. member-map을 자동으로 찾게 된다.  sqlsessiontemplate 으로 등록되게 된다.
	private MemberMapper map;

	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberUpdate(vo);
	}

	@Override
	public boolean memberIdCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberIdCheck(vo);
	}

	@Override
	public int memberAuthorUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberAuthorUpdate(vo);
	}

}
