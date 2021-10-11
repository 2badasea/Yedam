package co.bada.prj;

import java.io.IOException;

import co.bada.prj.board.command.BoardList;
import co.bada.prj.board.command.BoardSelect;
import co.bada.prj.board.command.Command;
import co.bada.prj.comm.BoardMenu;

public class MainApp {
	
	public static void main(String[] args) throws IOException {
//		BoardListCommand blist = new BoardListCommand();  
//		blist.execute();
		
		//1번조회. 2번조회하고 싶으면 BoardSelect에 가서 setbId()에 2를 넣어준다. 
//		Command command = new BoardSelect();
//		command.execute();
		
		BoardMenu boardMenu = new BoardMenu();
		boardMenu.run();
	}
}
