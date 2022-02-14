package co.bada.hello.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.hello.member.service.MemberMapper;
import co.bada.hello.member.service.MemberService;
import co.bada.hello.member.service.MemberVO;

@Repository("memberDao")  // @Service ,  @Componenet 모두 같은 개념이다. IOC컨테이너에 레퍼지토리로 등록한다. 
public class MemberServiceImpl implements MemberService { //통상적으로 dao에 해당하는 것들은 주로 repositrry. vo는 @service로 등록. 
	@Autowired
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
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
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
