package control;

import java.util.Scanner;
public class SepFifteen {

	public static void main(String[] args) {
		
//		������, �����, �ڹ��� ������ �Է��Ͽ� ����� ���ϰ�, �� ���� ���� ������ �ο��ϴ� ���๮.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������, �����, �ڹ��� ������ ���� �Է��� �� \n���� ������");
		
		int firstScore = scn.nextInt();
		System.out.println("\n���� �����");
		
		int secondScore = scn.nextInt();
		System.out.println("\n������ �ڹٴ�?");
		
		int thirdScore = scn.nextInt();
		
		
		int sum = firstScore + secondScore + thirdScore;
		double avg = sum/3; 
		System.out.println("���� ���� ����: " + sum);
		System.out.println("�׸��� ����� :" + avg);
		
		if(avg>=90) {
			System.out.println("A����");
		} else if(avg>=80) {
			System.out.println("B����");
		} else {
			System.out.println("�������� �� �� �л���.");
		}
		
		
		System.out.println("===========����� �ڵ�� �ؿ�=========");
		
		int sum2 = 0;
		int avg2 = 0;
		System.out.println("������2�� ������ �Է��м���.");
		double linux = scn.nextDouble();
		
		System.out.println("�����2�� ������ �Է��м���.");
		double gitHub = scn.nextDouble();
		
		System.out.println("���������� �ڹ�2�� ������ �Է��м���.");
		double java = scn.nextDouble(); 
		
		 sum2 = (int)(linux + gitHub + java);
		 avg2 = (int)(sum2/3);
		System.out.printf("����� ����: %d �̸� ����� %d �̴�.\n", sum2, avg2);
		
		if(avg2>=90) {
			System.out.println("����� A�����Դϴ�.");
		} else {
			System.out.println("����� �� �ƴ϶� ������ �ͼ����� ���� ���̴�.");
		}
		
		System.out.println("\n�λ��� �ӵ��� �ƴ϶� �����̶� �� ����ϼ���.");
		
		
	}

}
