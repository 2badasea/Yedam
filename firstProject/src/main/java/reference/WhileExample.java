package reference;

public class WhileExample {

	public static void main(String[] args) {

		// while반복문 연습1. while문을 쓰는 방식은 종료되는 조건을 꼭 선언해줘야 함.
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("끝======================");

		// 1~10 짝수만 출력하도록.
		boolean run = true;
		i = 1;
		while (run) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (i >= 10) {
				run = false;
			}
			i++;
		}
		System.out.println("=========================");
		// 1~10 짝수만 출력하지만, 위랑 약간 다른 방식.
		boolean run2 = true;
		i = 1;
		while (run2) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (i == 10) {
				break;
			}

			i++;
		}

		System.out.println("=========================");

	}

}
