/*
 * 제출용
 */
package co.bada.prj;

import java.util.Scanner;

import co.bada.prj.comm.Login;
import co.bada.prj.comm.Menu;
import co.bada.prj.member.serviceimpl.MemberInsert;
import lombok.Builder.Default;

public class MainApp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Login login = new Login();
		Menu menu = new Menu();
		MemberInsert memberInsert = new MemberInsert();

		boolean b = false;
		do {
			System.out.println("====================");
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 프로그램 종료");
			System.out.println("====================");
			int num = scn.nextInt();
			
			

			switch (num) {
			case 1:
				login.run();
				menu.run();
				break;
			case 2:
				memberInsert.execute();
				login.run();
				menu.run();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		} while (!b);

	}

}
