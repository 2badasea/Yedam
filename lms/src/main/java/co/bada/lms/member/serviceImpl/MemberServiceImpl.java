package co.bada.lms.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.lms.member.service.MemberMapper;
import co.bada.lms.member.service.MemberService;
import co.bada.lms.member.service.MemberVO;

@Repository("memberDao")  // memberDao 라는 이름을 IOC컨테이너에 등록한다는 것. 
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper map; // datasource-context.xml 의 sqlsession을 자동으로 autowired해주게 된다. 즉 dao를 의존주입한다.
	
	@Override
	public List<MemberVO> memberSelectList(String status) {
		// TODO Auto-generated method stub
		return map.memberSelectList(status);
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
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public boolean isCheckId(String id) {
		// TODO Auto-generated method stub
		return map.isCheckId(id);
	}

}
