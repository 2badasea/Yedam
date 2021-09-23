package co.yedam.account;
import java.util.Scanner;

public class AppMain {
	
	// 싱글톤: new 연산자로 생성자를 호출하면, 새로운 인스턴스가 만들어짐.
	private static AppMain singleton = new AppMain();
	// 한 번 만들어진 인스턴스로 계속 활용하자는 의도로, 
	// 생성자를 private으로 접근해서, 외부에선 접근 못 하게. 
	private AppMain() {
		
	}
	
	// method getInstance() 
	public static AppMain getInstance() {
		return singleton;
	}
	
	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);

	public void createAccount() {
		System.out.println("계좌생성");
	}
	
	public void accountList()
	{
		System.out.println("계좌목록");
	}
	
	public void deposit() {
		System.out.println("입금");
	}
	
	public void withdraw() {
		System.out.println("출금");
	}
	
	//main 메소드
	public Account findAccount(String ano) {
		return null;
	}
	
	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("1. 계좌생성 2. 계좌목록 3. 예금 4,. 출금 5. 종료");
		System.out.println("--------");
		System.out.println("선택>>");
		int selectNo = scanner.nextInt();
		
		while(run) {
		if(selectNo ==1) {
			createAccount();
		} else if (selectNo==2) {
			accountList();
		} else if (selectNo==3) {
			deposit();
		} else if (selectNo==4) {
			withdraw();
		} else if (selectNo==5) {
			run =false;
		}
	}
	}
}

