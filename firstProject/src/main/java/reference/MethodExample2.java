package reference;


import java.util.Scanner;

public class MethodExample2 {

	public static void main(String[] args) {
		
		sum(24, 55);    // �޼ҵ� ����. ���� ���� ���� �Ѵ�. 
		int a =45, b = 77;
		sum(a, b);
		multi(33, 10);
		extent(3.5);
		
		int res = getMax(a, b);
		System.out.println("ū ����: " + res);
		
		double res2 = divide(5, 3);
		System.out.println("����� " + res2);
	}

	//�޼ҵ带 �����ϴ� �κп� Ÿ���� ���� �Ѵ�. 
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� ��: " + sum);
	}
	// �� ������ �Է¹޾Ƽ� �� ���� ���� ��¸� ���ִ� �޼ҵ�. 
	
	
	
	// �� ������ �Է¹޾Ƽ� �� ���� ���� console �����ִ� ��. 
	public static void multi(int i1, int i2) {
		int multi = i1 * i2; 
		System.out.println("�� ���� ����: " + multi);
	}
	
	
	// ���簢�� �ʺ� ������ִ� �޼ҵ�.
	public static void extent(double side) {
		double extent = side*side;
		System.out.println("���簢���� ����: " + extent);
	}
	
	// �� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�. 
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;   // return�� ������ ������ ���. ��ȯŸ���� ���.
	
	}
	
	// �� ������ �Է¹޾Ƽ� ù ��° ���� �� ��° ������ ���� ����� ��ȯ���ִ� �޼ҵ�.
	public static double divide(int a, int b) {
		 double result = (double) a/b; 
		 return result;
	}
}
