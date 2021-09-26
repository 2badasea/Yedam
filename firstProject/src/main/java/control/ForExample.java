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
		
		System.out.println("====================다시========================");

		cnt = 0;
		for (int i = 1; i <= 5; i++) { // i++ 은 i의 값을 먼저 사용하고 +1을 해주는 것.
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}
		
		System.out.println("반복문 끝.");

		System.out.println("==========================다시2=================");

		int sum = 0;
		
		for(int i =1; i<=5; i++) {
			int randomValue = (int)((Math.random()*10)+1);
			System.out.println(i + "번째 값: " + randomValue);
			sum+=randomValue;
			
		}System.out.println("총합: "+ sum );
		System.out.println("반복문 끝");
		
		
		// 0의 값을 준 이유는 tempValue의 값이 계속 증가하기 때문에. 우리가 원하는 건1~10사이값.
		/*int test = (int)(Math.random() * 10) + 1;		
		test += 3; // test = test + 3; */
	}

}
