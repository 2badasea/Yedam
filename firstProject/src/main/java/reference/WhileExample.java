package reference;

public class WhileExample {

	public static void main(String[] args) {

		// while�ݺ��� ����1. while���� ���� ����� ����Ǵ� ������ �� ��������� ��.
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("��======================");

		// 1~10 ¦���� ����ϵ���.
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
		// 1~10 ¦���� ���������, ���� �ణ �ٸ� ���.
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
