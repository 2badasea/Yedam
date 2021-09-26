package reference;

public class WhileExample {

	public static void main(String[] args) {

		// while�ݺ��� ����1. while���� ���� ����� ����Ǵ� ������ �� ��������� ��.
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("===================��======================");

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
		System.out.println("============================================");
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

		System.out.println("===============================================");
		//�߿��� ��. while���� ������ boolean Ÿ������ ���� ���. ���ǹ��� true�� �Ű������� �־��ٸ�
		//�ݺ����� �����ϴ� ���ǿ� "(booleanŸ����) �����̸� = false;" �� �־��ش�.
		//�ݸ� while���ǹ��� boolean Ÿ���� �����̸��� �Ű������� �޴´ٸ�  �������ǹ��� "break;"�� �����Ѵ�. 
		boolean run3 = false;
		 i = 1;
		while(true) {
			if(i%2==0) {
				System.out.println(i);
			}
			if(i>10) {
				run = false;
				break;
			}
			i++;
		}

	}

}
