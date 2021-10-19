package co.bada.prj.comm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();
	
	
	private void menuTitle() {  //실행하자마자 떠야 하는 부분.
		System.out.println("======================");
		System.out.println("===== 멤 버 관 리 ======");
		System.out.println("====1. 전체목록 조회=====");
		System.out.println("====2. 회원  조회=======");
		System.out.println("====3. 회원  등록=======");
		System.out.println("====4. 회원정보 수정=====");
		System.out.println("====5. 회원정보 삭제=====");
		System.out.println("====6. 종료============");
		System.out.println("==== 원하는 작업번호 선택 ?");
	}
	
	public void run() {
		while(true) {
			menuTitle();
			int num = sc.nextInt(); 
			sc.nextLine();
			switch(num) {
			case 1: 
				memberList();
				break;
			case 2: 
				selectMember();
				break;
			case 3:
				insertMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 6:
				sc.close();
				return;
			}
		}
	}
	
	
	private void deleteMember() {
		MemberVO vo = new MemberVO();
		System.out.println("========================");
		System.out.println("삭제할 회원 아이디를 입력하세요.");
		System.out.println("========================");
		vo.setId(sc.nextLine());
		int n = memberService.deleteMember(vo);
		if(n !=0) {
			System.out.println("======================");
			System.out.println("정상적으로 삭제되었습니다.");
			System.out.println("아무거나 누르세요......");
		} else {
			System.out.println("======================");
			System.out.println("삭제가 실패했습니다.");
			System.out.println("아무키나 누르세요......");
		}
		sc.nextLine();
		
	}

	private void updateMember() {
		MemberVO vo = new MemberVO();
		System.out.println("========================");
		System.out.println("수정할 회원 아이디를 입력하세요.");
		vo.setId(sc.nextLine());
		int n = memberService.updateMember(vo);
		if(n !=0) { 	// if문과 함께 패스워드를 설정한 이유는? 
			vo.setPassword(sc.nextLine());
		}
		 sc.nextLine();
		
	}

	private void insertMember() {
		MemberVO vo = new MemberVO();
		System.out.println("========================");
		System.out.println("회원 정보를 등록하는 곳입니다.==");
		vo.setId(sc.nextLine());
		sc.nextLine();
		
	}

	private void selectMember() {
		MemberVO vo = new MemberVO();
		System.out.println("========================");
		System.out.println("검색할 회원 아이디를 입력하세요==");
		System.out.println("========================");
		vo.setId(sc.nextLine());
		vo = memberService.selectMember(vo);
		vo.toString();
		System.out.println("========================");
		System.out.println("Press Enter Key.........");
		sc.nextLine();  //잠시 대기를 위한 용도. 
		
	}

	private void memberList() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = memberService.memberList();
		System.out.println("========================");
		System.out.println("=====회원 목록 정보=========");
		for(MemberVO vo : list) {
			vo.toString();
		}
		System.out.println("========================");
		System.out.println("Press Enter Key.........");
		sc.nextLine();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
