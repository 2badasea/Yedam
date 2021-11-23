package co.bada.bootstrap.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.bada.bootstrap.comm.DataSource;
import co.bada.bootstrap.member.service.MemberMapper;
import co.bada.bootstrap.member.service.MemberService;
import co.bada.bootstrap.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	// datasource가 가지고 있는 getDataSource 불러들이는 sqlsession 객체 생성. 
	private SqlSession sqlSession = DataSource.getDataSource().openSession(true); //true는 auto commit
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class); 
	
	
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
