package control;

public class ForTimesExample {

	public static void main(String[] args) {
		// 1~9단까지의 구구단을 생성하기. 
		int i = 0;
		int j = 0;
		
		for( i=1; i<=9; i++) {
			for( j=1; j<=9; j++) {
				int value = i * j;
				System.out.println(i + "x" + j + "=" + value);
			}
		}
	}
}

// 구구단의 경우, 반복문을 쓰지 않으면 코드가 총 72줄이나 작성해야 한다. 