package control;

import java.util.Scanner;
public class WhileExample2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//1���� ������ �̸��� ���. 2�� ������ ����, 3�� ������ �޴��� ��ȣ. 4���� �ݺ��� ����. 
		
		String name = "�̹ٴ�";
		int age = 30;
		String phone = "01084480980";
		boolean run = false; 
		
		while(true) {
		System.out.println("���Ͻô� ����� �����ϼ���.");
		System.out.println("1. �̸� 2. ���� 3. ����ó 4. ����");
		
		int select = scn.nextInt();
		if(select == 1) {
			System.out.println(name);
		} else if(select == 2) {
			System.out.println(age);
		} else if(select == 3) {
			System.out.println(phone);
		} else if(select == 4) {
			System.out.println("�����մϴ�.");
			break;
		} else {
			continue;      // continue�� ������ �ٽ� ���ǹ��� ����(while)���� ����. 
		}
			
	  } System.out.println("��.");
	}

}
