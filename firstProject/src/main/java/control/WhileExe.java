package control;

public class WhileExe {

	public static void main(String[] args) {
		// while 구문을 사용해서 1~10까지 출력.
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//while 구문을 사용해서 2, 4, 6, 8, 10을 출력. 
		 i = 1;
		while(i<=5) {
			int sum= i*2;
			i++;
			System.out.println(sum);
		}
		
		// while 구문을 이용하여 1, 3, 5, 7, 9을 출력
		 i = 1;
		while(i<=5) {
			int sum = i*2-1;
			i++;
			System.out.println(sum);
		}
		
		// while 구문을 이용하여 1, 3, 5, 7, 9 출력. 경만님 방식
		i= 1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		
	}

}
