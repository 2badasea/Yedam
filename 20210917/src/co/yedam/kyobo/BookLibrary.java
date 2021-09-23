package co.yedam.kyobo;

import java.util.Scanner;

/*
 * 1. 도서등록 2. 도서수정 3. 도서목록 4.도서조회 5.도서삭제 9. 종료
 * 도서정보 : 도서제목/ 저자/출판사/가격.. 클래스
 */
public class BookLibrary {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("혼자 공부하는 자바", "신용권", "한빛출판사", 25000);
		kyoboLib[1] = new Book("이것이 자바다", "신용권", "한빛출산사", 20000);
		kyoboLib[2] = new Book("혼자 공부하는 도둑질", "홍길동", "우리출판사", 35000);

		while (true) {
			System.out.println("1. 도서등록 2. 도서수정 3. 도서목록 4.도서조회 5.도서삭제 9. 종료");
			int menu = readInt("메뉴를 선택하세요."); // 사용자가 입력할때까지 기다려줌
			if (menu == 1) {
				System.out.println("도서 등록 메뉴입니다.");
				// 도서등록 : 제목,저자,출판사,가격
				String title = readStr("책 제목을 입력하세요.");
				String author = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요");
				int price = readInt("가격을 입력하세요");
				// 생성자를 호출 -> book 변수저장
				Book book = new Book(title, author, press, price);
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // 배열의 비어있는 위치에 저장.
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("저장완료.");

			} else if (menu == 2) {
				System.out.println("도서 수정 메뉴 입니다.");
				// 도서명으로 찾아와서 -> 도서명이(키역활)
				// 저자, 출판사,가격 -> 항목변경
				// 저자는 입력 바꾸고싶은거만 바꾸는거
				String search = readStr("수정할 도서명을 입력하세요.[변경안할려면 엔터]"); // ""
				String author = readStr("변경할 저자를 입력[변경안할려면 엔터].");
				String press = readStr("변경할 출판사를 입력하세요.[변경안할려면 엔터]");
				String price = readStr("변경할 금액을 입력하세요.[변경안할려면 엔터]");
				boolean isExist = false;
				for (int i = 0; i < kyoboLib.length; i++) {
					// 한건 찾아온 경우.
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().equals(search)) {
						if (!author.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						if (!press.equals("")) {
							kyoboLib[i].setPress(press);
						}
						if (!price.equals("")) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
						}
						isExist = true;
					}
				}
				if (isExist) {
					System.out.println("정상적으로 수정했습니다.");
				} else {
					System.out.println("책을 찾을수 없습니다.");
				}

			} else if (menu == 3) {
				System.out.println("도서 목록 메뉴 입니다.");
				for (Book book : kyoboLib) {
					if (book != null) {
						book.showInfo();
					}

				}

			} else if (menu == 4) {
				System.out.println("도서 조회 메뉴 입니다.");
				String search = readStr("조회할 도서명을 입력하세요.");
				for (Book book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1) // indexOf -> 값이 있으면 인덱스값 없으면 -1(없다)을 리턴
						book.showInfo();
				}

			} else if (menu == 5) {
				System.out.println("도서 삭제 메뉴 입니다.");
				String search = readStr("삭제할 도서명을 입력하세요.");
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) // indexOf -> 값이 있으면 인덱스값
																								// 없으면 -1(없다)을 리턴
						kyoboLib[i] = null; // 배열자체를 지우는 것 위처럼book로하면 book으로 할당받은것만 지워 져서 안지워짐
				}

				System.out.println("삭제완료.");

			} else if (menu == 9) {
				System.out.println("종료 메뉴 입니다");
				break;

			}

		} // end of while
		System.out.println("=====끝.=====");

	} // end of main method
		// 사용자 입력값을 반환.

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();

	}

	// 사용자 입력값을 반환(Int)
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val); // Integer.parseInt -> 문자타입의 숫자를 숫자로 바꿔줌 "1000"->1000
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력 하세요.");

			}
		}
		return result;
	}

}
