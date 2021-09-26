package control;

import java.util.Scanner;
public class WhileExample2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//1번을 누르면 이름이 출력. 2번 누르면 나이, 3번 누르면 휴대폰 번호. 4번은 반복문 종료. 
		
		String name = "이바다";
		int age = 30;
		String phone = "01084480980";
		boolean run = false; 
		
		while(true) {
		System.out.println("원하시는 목록을 선택하세요.");
		System.out.println("1. 이름 2. 나이 3. 연락처 4. 종료");
		
		int select = scn.nextInt();
		if(select == 1) {
			System.out.println(name);
		} else if(select == 2) {
			System.out.println(age);
		} else if(select == 3) {
			System.out.println(phone);
		} else if(select == 4) {
			System.out.println("종료합니다.");
			break;
		} else {
			continue;      // continue를 만나면 다시 조건문의 조건(while)으로 간다. 
		}
			
	  } System.out.println("끝.");
	}

}
