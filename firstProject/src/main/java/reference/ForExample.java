package reference;

public class ForExample {

	public static void main(String[] args) {
		{
			int i = 0;   /*괄호 안의 두 식은 괄호를 벗어나면 다시 선언 가능하다. */
			int j = 0;
		}
//		int i = 10; 주석을 해제하면 밑의 for에서 에러가 발생한다.    
//		int j = 1;
			
		for(int i=1; i<=10; i++) {
			System.out.println(i); 
			
		}
		System.out.println("1번 끝=============");
		
		// 1~10 짝수만 출력... 
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("2번 끝============");
		
		// 1~10 중에서 홀수만 합산하도록. 
		int sum = 0; 
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				sum +=i; 
			}
		}
		System.out.println("합계: " +sum);
		System.out.println("3번 끝===========");
		
		sum = 0;
		int cnt = 0;   // 횟수를 출력하기 위한 용도로 선언됨. 
		//1~10 중에서 모든 값을 담도록. sum의 값이 넘어서는 그때의 횟수.. 
		for(int i =1; i<=10; i++) {
			sum +=i;
			if(sum>=20) {
				cnt = i;
				break;
			}
		}
		System.out.println(sum);
		System.out.println("횟수: " +cnt);  // cnt 대신에 i적으면 에러.블록밖의 변수임.
		
		
		
	}

}
