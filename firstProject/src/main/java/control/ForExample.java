package control;

public class ForExample {

	public static void main(String[] args) {
		int cnt = 0;

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		System.out.println("====================�ٽ�========================");

		cnt = 0;
		for (int i = 1; i <= 5; i++) { // i++ �� i�� ���� ���� ����ϰ� +1�� ���ִ� ��.
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}
		
		System.out.println("�ݺ��� ��.");

		System.out.println("==========================�ٽ�2=================");

		int sum = 0;
		
		for(int i =1; i<=5; i++) {
			int randomValue = (int)((Math.random()*10)+1);
			System.out.println(i + "��° ��: " + randomValue);
			sum+=randomValue;
			
		}System.out.println("����: "+ sum );
		System.out.println("�ݺ��� ��");
		
		
		// 0�� ���� �� ������ tempValue�� ���� ��� �����ϱ� ������. �츮�� ���ϴ� ��1~10���̰�.
		/*int test = (int)(Math.random() * 10) + 1;		
		test += 3; // test = test + 3; */
	}

}
