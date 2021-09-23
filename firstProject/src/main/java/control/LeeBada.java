package control;

import java.util.Scanner;
public class LeeBada {

	public static void main(String[] args) {
		// 생각한 if구문, for또는 while, break, continue 
		// 프로그램을 코드로 작성해보기
		// 2자리 숫자의 7개(6개 +1개)의 형식을 가진 로또번호 출력하기.
		Scanner scn = new Scanner(System.in);
		
		int rs1 = (int) (Math.random() *100);
		int rs2 = (int) (Math.random() *100);
		int rs3 = (int) (Math.random() *100);
		int rs4 = (int) (Math.random() *100);
		int rs5 = (int) (Math.random() *100);
		int rs6 = (int) (Math.random() *100);
		
		System.out.println("당신이 정할 값은?");
		int select = scn.nextInt();
		
		System.out.printf("%d, %d, %d, %d, %d, %d,", rs1 , rs2, rs3, rs4 , rs5 , rs6);
		System.out.println("+ 당신이 고른 값: " + select);
		
		
		

	}

}
