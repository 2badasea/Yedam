package co.bada.prj.comm;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.serviceImpl.BoardServiceImpl;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public interface Command{
	public BoardService boardService = new BoardServiceImpl();
	public MemberService memberService = new MemberServiceImpl();
	
	public void  execute();

}