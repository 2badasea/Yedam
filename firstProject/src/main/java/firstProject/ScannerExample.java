package firstProject;

import java.util.Scanner;
public class ScannerExample {
// 		�ڽ��� Ű�� �����Ը� �Է��ϸ� �񸸵��� ������ �� �ֵ��� ���.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("����� Ű��?");
		double height = scn.nextDouble();
		System.out.println("����� �����Դ�?");
		double weight = scn.nextDouble();
		
		double standard = ((height - 100)*0.9)+(weight/10);
		
		if(standard<=70) {
			System.out.println("�����Դϴ�.");
		} else  {
			System.out.println("���� ���ž� �� ��;;");
		}
		
		
//�׽�Ʈ!!
	}

}
