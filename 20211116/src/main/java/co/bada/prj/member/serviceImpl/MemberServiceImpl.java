package co.bada.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.bada.prj.comm.DataSource;
import co.bada.prj.member.service.MemberMapper;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	// sql세션객체부터 생성. 
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

}
