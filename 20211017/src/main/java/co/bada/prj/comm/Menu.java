package co.bada.prj.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.bada.prj.member.serviceimpl.MemberDelete;
import co.bada.prj.member.serviceimpl.MemberInsert;
import co.bada.prj.member.serviceimpl.MemberList;
import co.bada.prj.member.serviceimpl.MemberSelect;
import co.bada.prj.member.serviceimpl.MemberUpdate;

public class Menu {
	private Scanner scn = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();
	
	private void init() {
		map.put("memberList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberInsert", new MemberInsert());
		map.put("memberUpdate", new MemberUpdate());
		map.put("memberDelete", new MemberDelete());
	}
	
	private void menu() {
		while(true) {
			mainMenu();
			int jobNo = scn.nextInt();
			switch(jobNo) {
			case 1 : 
				memberManagement();
				break;
			case 2 :
				System.out.println("프로그램을 종료합니다.");
				return;
				//return은 메소드를 종료하면서 메소드의 리턴값을 보내고 싶을 때 사용.
				//리턴값이 void인 메소드라면 return만 쓰면 된다.
			default :
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}

	private void memberManagement() {
		boolean b = false;
		do {
			memberTitle();
			int jobNo = scn.nextInt();
			switch(jobNo) {
				case 1 :
					executeRun("memberList");
					break;
				case 2 :
					executeRun("memberSelect");
					break;
				case 3 :
					executeRun("memberInsert");
					break;
				case 4 : 
					executeRun("memberUpdate");
					break;
				case 5 :
					executeRun("memberDelete");
					break;
				case 6 : 
					System.out.println("메뉴화면으로 돌아갑니다.");
					b = true;
					break;
				default :
					System.out.println("잘못된 번호를 입력하였습니다.");
			}
			
		} while(!b);
		
	}

	private void executeRun(String str) {
		Command command = map.get(str);
		command.execute();
		
	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("====1. 회원목록 조회=====");
		System.out.println("====2. 회원정보 조회=====");
		System.out.println("====3. 회원정보 등록=====");
		System.out.println("====4. 회원정보 수정=====");
		System.out.println("====5. 회원정보 삭제=====");
		System.out.println("====6. 메인메뉴 이동=====");
		System.out.println("==작업번호를 입력하세요=====");
		
	}

	private void mainMenu() {
		System.out.println("==================");
		System.out.println("=== 1. 멤버 관리 ===");
		System.out.println("====2. 종    료 ====");
		System.out.println("==================");
		System.out.println("작업번호를 선택하세요");
		
	}
	
	public void run() {
		init();
		menu();
	}
		
}
