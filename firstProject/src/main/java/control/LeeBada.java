package control;

import java.util.Scanner;
public class LeeBada {

	public static void main(String[] args) {
		// ������ if����, for�Ǵ� while, break, continue 
		// ���α׷��� �ڵ�� �ۼ��غ���
		// 2�ڸ� ������ 7��(6�� +1��)�� ������ ���� �ζǹ�ȣ ����ϱ�.
		Scanner scn = new Scanner(System.in);
		
		int rs1 = (int) (Math.random() *100);
		int rs2 = (int) (Math.random() *100);
		int rs3 = (int) (Math.random() *100);
		int rs4 = (int) (Math.random() *100);
		int rs5 = (int) (Math.random() *100);
		int rs6 = (int) (Math.random() *100);
		
		System.out.println("����� ���� ����?");
		int select = scn.nextInt();
		
		System.out.printf("%d, %d, %d, %d, %d, %d,", rs1 , rs2, rs3, rs4 , rs5 , rs6);
		System.out.println("+ ����� �� ��: " + select);
		
		
		

	}

}
