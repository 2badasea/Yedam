package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry=new String[5]; // null, null, null, null, null �� ä���� ����. 
		strAry= new String[]{"Hong", "park", "choi", "kim", "hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";  // ==, equals()
		
		for(int i= 0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong"))
			System.out.println(strAry[i]);
		}
		
		
		System.out.println("=======�ٽ�========");
		
		//Enhanced for 
		for(String name : strAry) {
			System.out.println(name);
		}
		
		int[] scores= {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) {
			sum= sum+score;
		}
		  System.out.println(sum);
		
		System.out.println("===================");
		// �л� 3��. 4.2, 3.5, 2.8 ���� 
		// �հ踦 ���� �� �ֵ��� ����.
		// ����� ����ؼ� avg
		// �л����:3.4 �Ԥ�;��/ 
		
		double [] point = {4.2, 3.5, 2,8};
		double sum2 = 0;
		double avg2 = 0;
		for(double score2 : point) {
//	�����κ�		sum2 = point[]
			avg2 = sum2/point.length;
		}
		System.out.println("�л����: " + avg2 + "�Դϴ�.");

	}

}
