package co.micol.prj;
import java.util.Scanner;

public class ForTestExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		int m = scn.nextInt();
		System.out.println("두 번째 수: ");
		int n = scn.nextInt();
		
		ForTest forTest = new ForTest(m, n);
		forTest.test();
	}

}
