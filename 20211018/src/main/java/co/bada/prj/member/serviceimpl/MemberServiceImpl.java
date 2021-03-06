package co.bada.prj.member.serviceimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.bada.prj.comm.DataSource;
import co.bada.prj.member.MemberMapper;
import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return map.memberList();
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
	public MemberVO loginCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.loginCheck(vo);
	}

	@Override
	public int memberSelf(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelf(vo);
	}

}
