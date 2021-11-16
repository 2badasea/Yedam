package co.bada.prj.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.bada.prj.board.serviceimpl.BoardDelete;
import co.bada.prj.board.serviceimpl.BoardInsert;
import co.bada.prj.board.serviceimpl.BoardList;
import co.bada.prj.board.serviceimpl.BoardSelect;
import co.bada.prj.board.serviceimpl.BoardUpdate;
import co.bada.prj.book.serviceimpl.BookDelete;
import co.bada.prj.book.serviceimpl.BookInsert;
import co.bada.prj.book.serviceimpl.BookSelect;
import co.bada.prj.book.serviceimpl.BookSelectList;
import co.bada.prj.book.serviceimpl.BookUpdate;
import co.bada.prj.member.MemberService;
import co.bada.prj.member.MemberVO;
import co.bada.prj.member.serviceimpl.MemberDelete;
import co.bada.prj.member.serviceimpl.MemberInsert;
import co.bada.prj.member.serviceimpl.MemberList;
import co.bada.prj.member.serviceimpl.MemberSelect;
import co.bada.prj.member.serviceimpl.MemberSelf;
import co.bada.prj.member.serviceimpl.MemberServiceImpl;
import co.bada.prj.member.serviceimpl.MemberUpdate;

public class Menu {
	private Scanner scn = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();
	
	private void init() {
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
		map.put("bookSelectList", new BookSelectList());
		map.put("bookSelect", new BookSelect());
		map.put("bookInsert", new BookInsert());
		map.put("bookUpdate", new BookUpdate());
		map.put("bookDelete", new BookDelete());
		map.put("memberSelf", new MemberSelf());
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
				boardMangement();
				break;
			case 3 :
				bookManagement();
				break;
			case 4 :
				selfManagement();
				break;
			case 5 :
				System.out.println("첫 화면으로 돌아갑니다.");
				return;
				//return은 메소드를 종료하면서 메소드의 리턴값을 보내고 싶을 때 사용.
				//리턴값이 void인 메소드라면 return만 쓰면 된다.
			default :
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}

	private void selfManagement() {   //개인정보수정기능. 수정 또는 회원탈퇴. 
		executeRun("memberSelf");
		
		
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

	private void boardMangement() {
		boolean b = false;
		do{
			boardTitle();
			int jobNo = scn.nextInt();
			switch (jobNo) {
				case 1:
					executeRun("boardList");
					break;
				case 2:
					executeRun("boardSelect");
					break;
				case 3:
					executeRun("boardInsert");
					break;
				case 4:
					executeRun("boardUpdate");
					break;
				case 5:
					executeRun("boardDelete");
					break;
				case 6:
					System.out.println("메뉴화면으로 돌아갑니다.");
					b = true;
					break;
				default:
					System.out.println("잘못된 키를 입력하였습니다.");
			}
		}while(!b);
	}
	
	private void bookManagement() {
		boolean b = false;
		do {
			bookTitle();
			int jobNo = scn.nextInt();
			switch(jobNo) {
			case 1: 
				executeRun("bookSelectList");
				break;
			case 2:
				executeRun("bookSelect");
				break;
			case 3:
				executeRun("bookInsert");
				break;
			case 4:
				executeRun("bookUpdate");
				break;
			case 5:
				executeRun("bookDelete");
				break;
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default :
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while(!b);
	}

	private void bookTitle() {
		System.out.println("====================");
		System.out.println("=== 1. 게시글 목록 ===");
		System.out.println("=== 2. 게시글 조회 ===");
		System.out.println("=== 3. 게시글 등록 ===");
		System.out.println("=== 4. 게시글 수정 ===");
		System.out.println("=== 5. 게시글 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("====================");
		System.out.println("작업번호를 입력하세요");
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
		System.out.println("=== 1. 회원 관리 ===");
		System.out.println("=== 2. 공지 관리 ===");
		System.out.println("=== 3. 게시글 관리===");
		System.out.println("=== 4. 개인정보 수정==");
		System.out.println("====5. 종    료 ====");
		System.out.println("==================");
		System.out.println("작업번호를 입력하세요");
		
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
		System.out.println("작업번호를 입력하세요");

	}
	
	public void run() {
		init();
		menu();
	}

	public void join() {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		System.out.println("회원등록을 시작하겠습니다.");
		
		System.out.println("ID를 입력하세요");
		vo.setId(scn.nextLine());
		System.out.println("이름을 입력하세요");
		vo.setName(scn.nextLine());
		System.out.println("비밀번호를 입력하세요");
		vo.setPassword(scn.nextLine());
		System.out.println("연락처를 입력하세요");
		vo.setTel(scn.nextLine());
		System.out.println("주소를 입력하세요");
		vo.setAddress(scn.nextLine()); 
		System.out.println("권한을 입력하세요(user)");
		vo.setAuthor(scn.nextLine());
		
		int n = dao.memberInsert(vo); 
		//성공했으면 n의 값은 1이다. 
		
		if(n !=0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("실패했습니다.");
		}
		
		
	}
	
	
	
	
	
}
