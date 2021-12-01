package co.bada.prj.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.prj.member.service.MemberMapper;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper map;

	public List<MemberVO> memberSelectList() {
	
		return map.memberSelectList();
	}

}
