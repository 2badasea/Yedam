package reference;

public class ForExample {

	public static void main(String[] args) {
		{
			int i = 0;   /*��ȣ ���� �� ���� ��ȣ�� ����� �ٽ� ���� �����ϴ�. */
			int j = 0;
		}
//		int i = 10; �ּ��� �����ϸ� ���� for���� ������ �߻��Ѵ�.    
//		int j = 1;
			
		for(int i=1; i<=10; i++) {
			System.out.println(i); 
			
		}
		System.out.println("1�� ��=============");
		
		// 1~10 ¦���� ���... 
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("2�� ��============");
		
		// 1~10 �߿��� Ȧ���� �ջ��ϵ���. 
		int sum = 0; 
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				sum +=i; 
			}
		}
		System.out.println("�հ�: " +sum);
		System.out.println("3�� ��===========");
		
		sum = 0;
		int cnt = 0;   // Ƚ���� ����ϱ� ���� �뵵�� �����. 
		//1~10 �߿��� ��� ���� �㵵��. sum�� ���� �Ѿ�� �׶��� Ƚ��.. 
		for(int i =1; i<=10; i++) {
			sum +=i;
			if(sum>=20) {
				cnt = i;
				break;
			}
		}
		System.out.println(sum);
		System.out.println("Ƚ��: " +cnt);  // cnt ��ſ� i������ ����.��Ϲ��� ������.
		
		
		
	}

}
