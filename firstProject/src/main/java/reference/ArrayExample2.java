package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1~10���� ���� ���� ����.
		// �л��� 10��.
		
		int[] scores = new int[10];
		System.out.println(scores.length);
		for(int i=0; i<scores.length; i++) {
		  int temp = (int)(Math.random()*10)+1; 
		  scores[i] = temp;
		}
		
		// 1�� scores �迭Ÿ��. scores[0] int Ÿ��. 
		for(int i =0, l =scores.length; i<l; i++) {
			System.out.printf("scores[%d} => %d\n", i, scores[i]);
		}
		
		System.out.println("===========�ٽ�============");
		for(int i =0; i<10; i++) {
			System.out.printf("scores[%d} => %d\n", i, scores[i]);
		}
		
		System.out.println("=======================��1=======================.");
		
		
		
		//2��. �迭�� ����ִ� ��ҵ��� ��. 
		int sum =0; 
		for(int i = 0; i<scores.length; i++) {
			sum +=scores[i];
			
		}	
		System.out.println("�迭�� �հ�: " + sum);
		System.out.println("======================��2=========================");
		
		
		///3��. �迭�� ��� �� 5���� ū���� �հ�. 
		sum=0;
		for(int i =0; i<scores.length; i++) {
			int num = scores[i];
			if(num>5) {
				sum += num;
			}
			System.out.println(sum);
		}
		
		
		
		System.out.println("=========================��3=====================");
		
		//4��. �迭�� ����� ¦����° ���� �հ�. 
		
		int[] ary = new int[10];
		System.out.println("������ ����: " + ary.length);
		
			sum = 0;
		for(int i = 0; i<ary.length; i++) {
			int number = (int)((Math.random()*10)+1);
			ary[i] = number; 
			System.out.println(ary[i]);
			
			if(ary[i]%2==0) {
				sum+=ary[i];
			}
			
		}
		System.out.println("¦������ ��: " + sum);
		
		
		
		
		
		System.out.println("=====================��4========================");
		
		
		
		
	}
}

