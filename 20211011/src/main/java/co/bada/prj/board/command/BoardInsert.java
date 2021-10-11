package co.bada.prj.board.command;

import java.util.Scanner;

import co.bada.prj.board.service.BoardVO;

public class BoardInsert implements Command {
	//DAO객체는 인터페이스에서 public으로 되어 있으니깐 상속받아서 사용가능. 
	//김칫국이 아니라 외부에서 객체를 담을 수 있도록 해보자. 스캐너를 선언하는 것부터 시작. 
	private Scanner scb = new Scanner(System.in);
	
	
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		
		System.out.println("=====================");
		System.out.println("작성자를 입력하세요? ");
		vo.setBWriter(scb.nextLine());
		System.out.println("제목을 입력하세요? ");
//		vo.setbWriteDate(Date.valueOf("2021-10-11"));  //int타입을 integer객체로 바꾸는 것. 
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력하세요? ");
		vo.setBContents(scb.nextLine());
		int n = dao.boardInsert(vo);   //interface에서 썻으니깐 dao를 바로 쓸 수 있다. 
		if(n !=0) {
			System.out.println("정상적으로 등록 되었습니다.");
		} else {
			System.out.println("등록이 실패하였습니다.");
		}
		
	}

}
