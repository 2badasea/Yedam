package control;

public class WhileExe {

	public static void main(String[] args) {
		// while ������ ����ؼ� 1~10���� ���.
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//while ������ ����ؼ� 2, 4, 6, 8, 10�� ���. 
		 i = 1;
		while(i<=5) {
			int sum= i*2;
			i++;
			System.out.println(sum);
		}
		
		// while ������ �̿��Ͽ� 1, 3, 5, 7, 9�� ���
		 i = 1;
		while(i<=5) {
			int sum = i*2-1;
			i++;
			System.out.println(sum);
		}
		
		// while ������ �̿��Ͽ� 1, 3, 5, 7, 9 ���. �游�� ���
		i= 1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		
	}

}
