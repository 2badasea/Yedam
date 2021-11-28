package co.bada.mypage.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.mypage.member.service.MemberMapper;
import co.bada.mypage.member.service.MemberService;
import co.bada.mypage.member.service.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper map; // datasource-context.xml 의 sqlsession을 자동으로 autowired해주게 된다. 즉 dao를 의존주입한다.
	
	
	@Override
	public List<MemberVO> memberSelectList() {
		// 전체리스트 보기.
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// 로그인처리 또는 한 명의 데이터를 서치할 때 사용. 
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public boolean memberIdCheck(MemberVO vo) {
		return map.memberIdCheck(vo);
	}

	@Override
	public int memberAuthorUpdate(MemberVO vo) {
		return map.memberAuthorUpdate(vo);
	}

}
