package co.bada.prj.comm;

import java.util.HashMap;
import java.util.Map;

import co.bada.prj.board.serviceimpl.BoardDelete;
import co.bada.prj.board.serviceimpl.BoardInsert;
import co.bada.prj.board.serviceimpl.BoardList;
import co.bada.prj.board.serviceimpl.BoardSelect;
import co.bada.prj.board.serviceimpl.BoardUpdate;
import co.bada.prj.member.serviceimpl.MemberDelete;
import co.bada.prj.member.serviceimpl.MemberInsert;
import co.bada.prj.member.serviceimpl.MemberList;
import co.bada.prj.member.serviceimpl.MemberSelect;
import co.bada.prj.member.serviceimpl.MemberUpdate;

public class Menu {
	private Map<String, Command> map = new HashMap<String,Command>();

	private void init(){
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());
		map.put("memberList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberInsert", new MemberInsert());
		map.put("memberUpdate", new MemberUpdate());
		map.put("memberDelete", new MemberDelete());
	}

	private void menu() {
		while(true) {
			mainMenu();
			int jobNo = GB.sc.nextInt();
			switch(jobNo) {
				case 1 :
					memberMangement();
					break;
				case 2 :
					boardMangement();
					break;
				case 3 :
					System.out.println("프로그램 완전히 종료합니다.");
					GB.sc.close();
					return;
				default :
					System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}

	private void boardMangement() {
		boolean b = false;
		do{
			boardTitle();
			int jobNo = GB.sc.nextInt();
			switch (jobNo) {
				case 1:
					executRun("boardList");
					break;
				case 2:
					executRun("boardSelect");
					break;
				case 3:
					executRun("boardInsert");
					break;
				case 4:
					executRun("boardUpdate");
					break;
				case 5:
					executRun("boardDelete");
					break;
				case 6:
					System.out.println("메뉴화명으로 돌아갑니다.");
					b = true;
					break;
				default:
					System.out.println("잘못된 키를 입력하였습니다.");
			}
		}while(!b);
	}

	private void memberMangement() {
		boolean b = false;
		do{
			memberTitle();
			int jobNo = GB.sc.nextInt();
			switch (jobNo) {
				case 1:
					executRun("memberList");
					break;
				case 2:
					executRun("memberSelect");
					break;
				case 3:
					executRun("memberInsert");
					break;
				case 4:
					executRun("memberUpdate");
					break;
				case 5:
					executRun("memberDelete");
					break;
				case 6:
					System.out.println("메뉴화명으로 돌아갑니다.");
					b = true;
					break;
				default:
					System.out.println("잘못된 키를 입력하였습니다.");
			}
		}while(!b);

	}

	private void mainMenu() {
		System.out.println("==================");
		System.out.println("=== 1. 멤버 관리 ===");
		System.out.println("=== 2. 공지 관리 ===");
		System.out.println("====3. 종    료 ====");
		System.out.println("==================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void boardTitle() {
		System.out.println("====================");
		System.out.println("=== 1. 공지사항 목록 ===");
		System.out.println("=== 2. 공지사항 조회 ===");
		System.out.println("=== 3. 공지사항 등록 ===");
		System.out.println("=== 4. 공지사항 수정 ===");
		System.out.println("=== 5. 공지사항 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("====================");
		System.out.println("작업번호를 넣어주세요");

	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. 회원목록 조회 ===");
		System.out.println("=== 2. 회원정보 조회 ===");
		System.out.println("=== 3. 회원정보 등록 ===");
		System.out.println("=== 4. 회원정보 수정 ===");
		System.out.println("=== 5. 회원정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}
	
	private void executRun(String str) {
		Command command = map.get(str);
		command.execute();
	}

	public void run() {
		init();
		menu();
	}
}
