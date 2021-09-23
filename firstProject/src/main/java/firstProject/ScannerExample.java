package firstProject;

import java.util.Scanner;
public class ScannerExample {
// 		자신의 키와 몸무게를 입력하면 비만도를 측정할 수 있도록 출력.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("당신의 키는?");
		double height = scn.nextDouble();
		System.out.println("당신의 몸무게는?");
		double weight = scn.nextDouble();
		
		double standard = ((height - 100)*0.9)+(weight/10);
		
		if(standard<=70) {
			System.out.println("정상입니다.");
		} else  {
			System.out.println("살좀 빼셔야 할 듯;;");
		}
		
		
//테스트!!
	}

}
