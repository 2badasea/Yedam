package co.micol.prj;

import co.micol.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
			MyCalculator myCalculator = new MyCalculator();
			
			myCalculator.sum(10,10);
			float f = myCalculator.sum(5.0f, 5);  //float �����ִ� Ÿ���� �����ϴ� ���� 'funciontype�޼ҵ�'.
			System.out.println(f);				//functiontype�޼ҵ�� ����� ������� �Ѵ�. 				
												//���α׷��ֿ��� '='�� �º����� ������. �캯���� ���� �;��Ѵ�. 
												//������� �� �� Ÿ���� ����� ������� �Ѵ�. �����ͼս��� �߻�.
												//returnŸ���� �����Ѵٴ� ���� �����޴� ������ �����Ѵٴ� ��. 
			int n = myCalculator.sum(5); //int  sum(5)�� ���� ����ϱ� ���� Ÿ�԰� ����(int n)�� �־����. 
			System.out.println(n);      //120�� ��µ� �� �Ű����� �ϳ��� �޴� sum�޼ҵ�� factorial������ ��ħ.
			
//			double d = myCalculator.sum(10, 10);  >>>������ ��. int�� �ν��ϴϱ�. 
			double d = myCalculator.sum(10.2 , 10.2);  //>>> �̷��� �����ؾ� �Ѵ�. 
			System.out.println(d); 
			
//			double d2 = myCalculator.sum(10, 100);  ���������� ����. 
			double d2 = myCalculator.sum(10.1, 100);   // �������̵带 �� �� �������̸� voidŸ���� �� �ϴ� �� ��
			System.out.println(d2);
			
			System.out.println("======================ū ��, ���� �� ��=========================");
			//Ŭ������ �������� �Ѵ�(CompareMax Ŭ���� ����). main�� ���� ����. 
			CompareMax compareMax = new CompareMax(100, 50);   //������ ���� �� �� �޴� �����ڸ� ȣ��. 
			int max = compareMax.getMax();         // �տ� (int max)�� ���� �� get�� ���� �޾Ƽ� ����ϱ� ����.
			System.out.println("�� �� �߿� ū ����: " + max);    
			
			Calculator calculator = new Calculator();     //�⺻�����ڸ� ȣ��. >>> getset�����ؾ� ��. 
			calculator.setFirstNum(200);
			calculator.setSecondNum(500);
			System.out.println("���޵� �� ���� �� = " + calculator.sum());
			
			System.out.println("========================���=============================");
			Member member = new Member("hong", "1234", "ȫ�浿", "�뱸������"); //import�ؾ� �ν��Ͻ���������.
		    member.run();    //member Ŭ�������� .�� ��� �������ִ� �޼ҵ�� run()�ۿ� ����. ������ private�̶�.
		    
		    
			
			//ù ��° ���. �⺻�����ڸ� ����. 
//		Calculator calculator = new Calculator(); //"��������~" >>�ν��Ͻ� ����ٴ� ���. 
//		calculator.setFirstNum(200);    // setter�� ���� ���� �����Ѵ�. 
//		calculator.setSecondNum(20);   
//		int sum = calculator.sum();
//		int sub = calculator.sub();
		
//		//�Ű����� �ִ� �����ڿ� ���� ���� ���. (�� ��° ���) 
//		Calculator  calculator = new Calculator(20, 20); 
//		int sum = calculator.sum();
//		int sub = calculator.sub();
//		
//		System.out.println("������ ���: " + sum);
//		System.out.println("������ ���: " + sub);
		
		//main�޼ҵ�� ���۰� ���� ��Ÿ����. ��� Ŭ����, �� � ������ �������� �� �����ϰ� ���������� �ۼ��ϴ� ���̴�. 
		//���ٰ� �����ϰ�, ��� �ʿ��� ��ǰ���� �� ����� ���� �������� �ۼ�. ^^
	}
}
