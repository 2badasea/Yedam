package control;

public class WhileExample {

	public static void main(String[] args) {
		int i = 1; //초기식
		while(i <= 10) {
			System.out.printf("i의 값은 %d\n", i); // 이까지만 적으면 i는 늘 값이 고정.
			i++;
		}
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			cnt = (int)(Math.random() * 10) +1;
			System.out.println(cnt);
			if(cnt==8) {
				run = false; /* break구문을 넣으려면 while문 안에 run이 아니라 true;
				                  boolean값을 안 넣고. */
			}
		}
		
		System.out.println("끝.");
	}

}
