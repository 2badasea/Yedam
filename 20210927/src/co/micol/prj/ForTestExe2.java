package co.micol.prj;
import java.util.Scanner;
public class ForTestExe2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ForTest2 forTest2 = new ForTest2();

		System.out.println("첫 번째 수: ");
		forTest2.setNum1(scn.nextInt());
		System.out.println("두 번째 수: ");
		forTest2.setNum2(scn.nextInt());
		
		forTest2.run();

	}

}
