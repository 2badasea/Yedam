package operator;

import java.util.Scanner;
public class OperatorExample2 {

	public static void main(String[] args) {
		// ����(�Ҵ�)������
		int num1, num2, result; 
		num1 = num2 = 10; 
		
		result = num1 + num2;
		
		result = result + 10;
		result +=10; 
		
		result -= 10; // result = result -10; �̶�� ��. 
		result *= 10; // �ڱ��ڽſ� 10�� ���� ���� �����ϰڴٴ� ��. 
		result /= 10; // ���� ��������. 
		result %= 10; // �ڱ� �ڽ��� ���� 10�� ���� �������� ���� �����ڴٴ� ��.
		
		String str = "Hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);
		
		System.out.println("===========================");
		
//		3�� ������: ��ȣ ���� ������ �����ϸ� true, �������� �� �ϸ� false�� ����. 
		int score = 80;
		boolean pass = (score > 60) ? true : false;  
		String isOk = (score > 60) ? "pass" : "fail"; 
		
		System.out.println(pass);
		System.out.println(isOk);
		
		System.out.println("============================");
		// boolean�� 3�� �����ڸ� �̿��ؼ� ���뵵 ���� ���ϱ�. 
		
		Scanner scn = new Scanner(System.in); 
		
		System.out.println("������ ������ �Է��ϼ���");
		int linux = scn.nextInt();
		System.out.println("�ڹ� ������ �Է��ϼ���");
		int java = scn.nextInt();
		
		boolean success = ((linux+java)/2 <=40)?  true: false;
		
		if(success) {
			System.out.println("�й�����.");
		} else {
			System.out.println("���ݸ� �� ������ ����.");
	}

}
}
