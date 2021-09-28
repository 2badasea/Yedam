package co.micol.prj;
import java.util.Scanner;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);
	
	private void mainMenu() {
		System.out.println("==================================");
		System.out.println("==1. �Է� �ϱ� ===");
		System.out.println("==2. ���� �ϱ� ===");
		System.out.println("==3. ��ȸ �ϱ� ===");
		System.out.println("==4. �����ϱ� ===");
		System.out.println("==================================");
		System.out.println("���ϴ� �۾���ȣ�� �Է��㼼��?");
	} //�ϴ� �ѹ��� ������ ����Ǿ�� �ϴ� �޴�����̹Ƿ� dowhile���� ����.
	
	private void firstMenu() {
		System.out.println("==================================");
		System.out.println("==����� �Է��ϴ� ȭ���Դϴ�. ===");
		System.out.println("==���θ޴��� �ƹ�Ű�� ��������.==");
		System.out.println("==================================");
		sc.nextLine();
	}
	
	private void secondMenu() {
		System.out.println("==================================");
		System.out.println("==����� �����ϴ� ȭ���Դϴ�. ===");
		System.out.println("==���θ޴��� �ƹ�Ű�� ��������.==");
		System.out.println("==================================");
		sc.nextLine();
	}
	
	private void thirdMenu() {
		System.out.println("==================================");
		System.out.println("==����� ��ȸ�ϴ� ȭ���Դϴ�. ===");
		System.out.println("==���θ޴��� �ƹ�Ű�� ��������.==");
		System.out.println("==================================");
		sc.nextLine();
	}
	
	private void endMenu() {
		System.out.println("==== Good Bye =====");
	}
	
	private void doWhileMenu() {
		boolean b = true;   //������ false�� �ְ� �����ϰ�, ���� b= true;�� �ִ´�. �׸��� while(!b)�� ����.
		do {					//�����ϸ鼭 �����غ��� �ٽ� ���غ���. (boolean����)
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine();  //����� '���� Ŭ����' ����. 
			//if���� ����� �� else if�� �� ���� �Ѿ���� �ϸ� �� ����ϴ� �� ����. �����. switch-case�� ���!
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
	
	public void run() {    //���� �޼ҵ���� �������ʱ� ������, �����ϱ� ���� �޼ҵ� ����
		doWhileMenu();
		sc.close();   // ó�� ������ ��ĳ�ʸ� �����Ű�� ����.
	}
	
	
	
	
	
}
