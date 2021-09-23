package control;

import java.util.Scanner;
public class WhileExample2 {

	public static void main(String[] args) {
		String name = "홍길동";
		String age = "20";
		String phone = "010-8448-0980";
		
		// 사용자의 Scanner 사용. 
		// 1 => 이름, 2를 누르면 나이, 3을 누르면 휴대폰 번호가 나오도록. 4번은 반복문종료. 
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("항목을 선택하세요.");
			System.out.println("1. 이름 2. 나이 3. 연락처 4. 종료");
			int menu = scn.nextInt();
			if(menu ==1) {
				System.out.println("이름: " + name);
			} else if (menu ==2) {
				System.out.println("나이: " + age);
			} else if (menu ==3) {
				System.out.println("연락처: " + phone);
			} else if (menu ==4 ) {
				break;
			}
			/*위에서 int menu = scn.nextInt(); 의 경우. 콘솔창의 입력대기 상태를 
			 * 의미하는 것이 scn.nextInt이다. 여기서 만약 1을 입력한다면 그 값은 
			 * int 타입의 menu라는 변수에 1이 담기게 된다. 그리고 반복문이 실행된다. */
			
		}
		System.out.println("끝.");
	}

}
