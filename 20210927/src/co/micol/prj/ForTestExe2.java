package co.micol.prj;
import java.util.Scanner;
public class ForTestExe2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ForTest2 forTest2 = new ForTest2();

		System.out.println("ù ��° ��: ");
		forTest2.setNum1(scn.nextInt());
		System.out.println("�� ��° ��: ");
		forTest2.setNum2(scn.nextInt());
		
		forTest2.run();

	}

}
