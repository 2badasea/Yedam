package co.micol.project.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prject.board.serviceImpl.BoardList;
import co.micol.prject.member.serviceImpl.MemberSelect;

public class Menu {
	private Map<String, Command> map = new HashMap<String, Command>();
	private Scanner sc = new Scanner(System.in);
	
	
	
	public void run() {
		con();
		menu();
	}
	
	public void menu() {
		System.out.println("=== 4번 회원정보 조회 ===");
		System.out.println("=== 5번 공지사항 목록 ===");
		
		int num = sc.nextInt();
		switch(num) {
		case 4: 
			executRun("memberSelect");
			break;
		case 5:
			executRun("boardList");
			break;
		}
		
	}
	
	private void executRun(String str) {
		Command command = map.get(str);
		command.execute();
	}
	
	private void con(){
		map.put("boardList", new BoardList());
		map.put("memberSelect", new MemberSelect());
		
	}

	

}
