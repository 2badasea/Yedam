package reference;

public class MethodExample {

	public static void main(String[] args) {
		
		
		//�񸸵� ������. 
		double w1 = 83.1, h1 = 1.77;
		checkBMI(w1, h1);
		//bmi < 18.5 ��ü��. 
		//18.5 ~ 23 ����.
		//23 ~ 25 ������. 
		//25 ~ 30 ��. 
		//30 �̻��� ����. */  
		
		double w2, h2; 
		double w3, h3;
//		������� �񸸵��� ���Ϸ��� �ڵ尡 ��û ��������. �׷��� �ݺ��Ǵ� ó���� �� �� �ִ� �����
//	 	�����ϰ� ȣ���� �� �ִٸ� �ڵ尡 �ٰ� ��������. �װ� �޼ҵ��� �����̴�. 
	}
		
	
	public static void checkBMI(double weight, double height) {
			double bmi = weight / (height * height);
			if(bmi < 18.5) {
				System.out.println("��ü��");
			} else if (bmi >= 18.5 && bmi <23) {
				System.out.println("����ü��");
			} else if (bmi >= 23 && bmi <25) {
				System.out.println("������");
			} else if (bmi >= 25) {
				System.out.println("��");
			} else {
				System.out.println("����..");
			}
			
		}
		
		
	}


