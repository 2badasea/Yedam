package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1~10까지 임의 수를 생성.
		// 학생이 10명.
		
		int[] scores = new int[10];
		System.out.println(scores.length);
		for(int i=0; i<scores.length; i++) {
		  int temp = (int)(Math.random()*10)+1; 
		  scores[i] = temp;
		}
		
		// 1번 scores 배열타입. scores[0] int 타입. 
		for(int i =0, l =scores.length; i<l; i++) {
			System.out.printf("scores[%d} => %d\n", i, scores[i]);
		}
		
		System.out.println("===========다시============");
		for(int i =0; i<10; i++) {
			System.out.printf("scores[%d} => %d\n", i, scores[i]);
		}
		
		System.out.println("=======================끝1=======================.");
		
		
		
		//2번. 배열에 들어있는 요소들의 합. 
		int sum =0; 
		for(int i = 0; i<scores.length; i++) {
			sum +=scores[i];
			
		}	
		System.out.println("배열의 합계: " + sum);
		System.out.println("======================끝2=========================");
		
		
		///3번. 배열의 요소 중 5보다 큰값만 합계. 
		sum=0;
		for(int i =0; i<scores.length; i++) {
			int num = scores[i];
			if(num>5) {
				sum += num;
			}
			System.out.println(sum);
		}
		
		
		
		System.out.println("=========================끝3=====================");
		
		//4번. 배열의 요소중 짝수번째 값만 합계. 
		
		int[] ary = new int[10];
		System.out.println("숫자의 개수: " + ary.length);
		
			sum = 0;
		for(int i = 0; i<ary.length; i++) {
			int number = (int)((Math.random()*10)+1);
			ary[i] = number; 
			System.out.println(ary[i]);
			
			if(ary[i]%2==0) {
				sum+=ary[i];
			}
			
		}
		System.out.println("짝수들의 합: " + sum);
		
		
		
		
		
		System.out.println("=====================끝4========================");
		
		
		
		
	}
}

