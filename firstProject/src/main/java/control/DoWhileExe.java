package control;

public class DoWhileExe {

	public static void main(String[] args) {
		boolean run = false;
		
		//1���� 10���� ���.
		// ��1.
		int num = 0;
		do {
			if(num>=10) {
				continue;
			}
			num++;
			System.out.println(num);
			if(num>=10) {
				break;
			}
		} while(true);
		System.out.println("=============1�� ��");
		
		
		// ¦���� ���
		// 2�� ��. 
		num = 0;
		do {
			num++;
			if(num%2==0) {
				System.out.println(num);
				continue;
			}
			if(num>=10) {
				break;
			}
		} while(true);
		System.out.println("=============2�� ��");
		
		//Ȧ���� �հ�.
		//3�� ��.
		
		 	num = 0;
		int sum = 0;
		do {
			num++;
			if(num%2 ==1) {
				sum+=num;
				continue;
			} 
			
			if(num>=10) {
				
				break;
			}
		}while(true);      // true ��ſ� run�� ������ ������ �ǹǷ� 1�� ���.
		System.out.println(sum);
		System.out.println("============3�� ��");
		
		
		// ������ ���� 1~10; 
		// sum ���� 100���� ū ���� �Ǿ��� ��, �׶��� sum���� ���... 
		// �� ���� ������ �ߴ��� ����������... 
		// ��4 
		int i = 0;
		   sum = 0;
		int times = 0;
		do {
			i++;
			sum+=i;
			times++;
			if(sum<=100) {
				continue;
			} else {
				System.out.println(sum);
				break;
			}
			
			
			
		}while(true);
		System.out.println(times);
		System.out.println("=============4����================");
		
		
		
	}
	

	}
