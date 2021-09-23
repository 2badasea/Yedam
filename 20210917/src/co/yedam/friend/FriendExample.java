package co.yedam.friend;

import java.util.Scanner;

import co.yedam.kyobo.Book;

public class FriendExample {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		FriendMain[] Friend = new FriendMain[100];

		while (true) {
			System.out.println("1.등록, 2.조회(이름), 3.친구 목록, 4.수정(이름을기준), 5.삭제 9.종료");
			Friend[0] = new FriendMain("혼자 공부하는 자바", "신용권", "한빛출판사", "25000","5");
			int menu = readInt("선택하세요");
			// 이름 , 연락처, email,키 몸무게
			if (menu == 1) {
				System.out.println("친구를 등록하세요");
				String Name = readStr("이름을 입력하세요");
				String Phone = readStr("핸드폰 번호를 입력하세요");
				String Email = readStr("E-mail을 입력하세요");
				String height = readStr("키를 입력하세요.");
				String weight = readStr("몸무게를 입력하세요.");
				
				FriendMain fr = new FriendMain(Name,Phone,Email,height,weight);
				for(int i= 0; i <Friend.length; i++) {
					if(Friend[i] == null) {
						Friend[i] = fr;
						break;
					}
					
				}System.out.println("저장완료.");

			} else if (menu == 2) {
				System.out.println("친구 이름을 조회하세요");
				String search = readStr("조회할 이름을 입력하세요");
				for(FriendMain fr : Friend) {
					if(fr != null && fr.getName().indexOf(search)!= -1)
						fr.showInfo();
				}
			} else if (menu == 3) {
				System.out.println("친구 목록을 조회하세요");
				for(FriendMain fr : Friend) {
					if(fr != null) {
						fr.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("친구 이름을 수정하세요");
				String search =  readStr("수정할 이름 입력하세요.[변경안할려면 엔터]");
				String Phone =  readStr("수정할 연락처를 입력하세요.[변경안할려면 엔터]");
				String Email =  readStr("수정할 Email 입력하세요.[변경안할려면 엔터]");
				String height =  readStr("수정할 키를 입력하세요.[변경안할려면 엔터]");
				String weight =  readStr("수정할 몸무게 입력하세요.[변경안할려면 엔터]");
				
			} else if (menu == 5) {
				System.out.println("친구 이름을 삭제하세요");
				String search = readStr("삭제할 도서명을 입력하세요.");
				for(int i= 0; i<Friend.length; i++) {
					if(Friend[i] != null && Friend[i].getName().indexOf(search) != -1)
						Friend[i] = null;
				}
			} else if (menu == 9) {
				System.out.println("종료 메뉴 입니다.");
				break;
			}
		}
		System.out.println("=====끝====");

	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력 하세요.");
			}

		}
		return result;
	}

}
