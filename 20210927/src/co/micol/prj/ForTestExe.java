package co.micol.prj;
import java.util.Scanner;

public class ForTestExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ù ��° ��: ");
		int m = scn.nextInt();
		System.out.println("�� ��° ��: ");
		int n = scn.nextInt();
		
		ForTest forTest = new ForTest(m, n);
		forTest.test();
	}

}
