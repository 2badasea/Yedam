package control;

public class DoWhileExample {

	public static void main(String[] args) {
		// Do..while 문법. do while 문법은 잘 쓰이지 않는다.    
		boolean run = false;
		
//		while(run) {                         // 불린 값이 false 이므로 실행x
//			System.out.println("실행문1.");
//		}
		
		int cnt = 0;
		
		do {
			cnt++;
			if(cnt % 2 ==1) {
				continue;   
			}
			System.out.println(cnt);
			if(cnt >=10) {
				break;
			}
//          증감연산자의 위치가 중요하다. cnt++ 구문이 현재의 위치있을 때랑 if문 다음일 때 결과가 다름.
		} while (true);
		System.out.println("끝.");
	}
 
}
