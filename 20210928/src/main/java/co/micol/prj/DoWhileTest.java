package co.micol.prj;
import java.util.Scanner;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);
	
	private void mainMenu() {
		System.out.println("==================================");
		System.out.println("==1. 입력 하기 ===");
		System.out.println("==2. 수정 하기 ===");
		System.out.println("==3. 조회 하기 ===");
		System.out.println("==4. 종료하기 ===");
		System.out.println("==================================");
		System.out.println("원하는 작업번호를 입력허세요?");
	} //일단 한번은 무조건 실행되어야 하는 메뉴목록이므로 dowhile문이 적합.
	
	private void firstMenu() {
		System.out.println("==================================");
		System.out.println("==여기는 입력하는 화면입니다. ===");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("==================================");
		sc.nextLine();
	}
	
	private void secondMenu() {
		System.out.println("==================================");
		System.out.println("==여기는 수정하는 화면입니다. ===");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("==================================");
		sc.nextLine();
	}
	
	private void thirdMenu() {
		System.out.println("==================================");
		System.out.println("==여기는 조회하는 화면입니다. ===");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("==================================");
		sc.nextLine();
	}
	
	private void endMenu() {
		System.out.println("==== Good Bye =====");
	}
	
	private void doWhileMenu() {
		boolean b = true;   //보통은 false를 넣고 시작하고, 밑의 b= true;를 넣는다. 그리고 while(!b)로 넣음.
		do {					//복습하면서 수정해보고 다시 비교해보기. (boolean값을)
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine();  //여기는 '버퍼 클리어' 역할. 
			//if문을 사용할 때 else if가 두 개가 넘어가려고 하면 안 사용하는 게 나음. 길어짐. switch-case문 사용!
			switch(key) {
			case 1: 
				firstMenu();
				break;
			case 2: 
				secondMenu();
				break;
			case 3: 
				thirdMenu();
				break;
			case 4:
				endMenu();
				b = false;
				break;
			}
		}while(b);
	}
	
	public void run() {    //위의 메소드들이 보이지않기 때문에, 실행하기 위한 메소드 정의
		doWhileMenu();
		sc.close();   // 처음 열었던 스캐너를 종료시키기 위함.
	}
	
	
	
	
	
}
