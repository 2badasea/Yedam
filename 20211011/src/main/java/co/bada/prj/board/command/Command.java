package co.bada.prj.board.command;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.serviceImpl.BoardServiceImpl;
import co.bada.prj.mybatis.BoardMybatisService;

//execute()만 실행하는 인터페이스를 생성. 
public interface Command {
//	public BoardService dao = new BoardServiceImpl();
	//Command 인터페이스 만들었다. public으로 dao를 상속시킬 수 있게 만들었다.
	public BoardService dao = new BoardMybatisService();
	public void execute();    //접근지시자를 달지 않으면 기본적으로 default
}
