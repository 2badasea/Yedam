package control;

public class ConditionExe {

	public static void main(String[] args) {
		// �� ���� 60, 70 ������ ����.
		// �� ���� ���� ��� 100�� �Ѿ�� �հ�, �� �Ǹ� ���հ�.
		// ���� �������� ��.
		int firstScore = 60;
		int secondScore = 70;

		if (firstScore + secondScore >= 100) {
			System.out.println("�հ�~");
		} else {
			System.out.println("���հ�");
		}
		System.out.println("1�� ��.");

		// �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��.
		// 2��° ��.
		int multiple = firstScore * secondScore;
		if (multiple % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		System.out.println("2�� ��");

		// ���ο� ���� 4, 12 ����� ���,
		// 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���, 2��3�� ���.
		int thirdScore = 12;
		if (thirdScore % 6 == 0) {
			System.out.println("2�� 3�� ���");
		} else if (thirdScore % 3 == 0) {
			System.out.println("3�� ���");
		} else if (thirdScore % 2 == 0) {
			System.out.println("2�� ���");
		}
		System.out.println("3�� ��");

//		randomValue�� 0�� 1 ������ ������ �������� ������ش�. �ܼ�â Ȯ��. 
		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// swtich case �������� ���� ���� 1�̸� "1�� ���Խ��ϴ� "
		switch (randomValue) {
		case 1: {
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		}
		case 2: {
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		}
		case 3: {
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		}
		case 4: {
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		}
		case 5: {
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		}
		case 6: {
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}
		}

		System.out.println("4�� ��.");

		int randomScore = (int) (Math.random() * 100);
		if (randomScore >= 90) {
			System.out.println("A����");
		} else if (randomScore >= 80) {
			System.out.println("B����");
		} else if (randomScore >= 70) {
			System.out.println("C����");
		} else if (randomScore >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("����~");
		}
		
		System.out.println("5�� ��");
		
		switch(randomScore/10) {
		case 9: {
			System.out.println("A�����Դϴ�.");
			break;
		}
		case 8: {
			System.out.println("B�����Դϴ�.");
			break;
		}
		case 7: {
			System.out.println("C�����Դϴ�.");
			break;
		}
		case 6: {
			System.out.println("D�����Դϴ�.");
			break;
		} default: {
			System.out.println("����;;");
		}
		
		}
		System.out.println("==========���� ���� ���������� ���� ��");
		// ������ ������ �ֻ��� ���� ������. �׸��� �� �ֻ��� ���� ���� ��� 3���̽� ���غ���. ��������~
		int number = (int) (Math.random() * 3 + 1);

		switch (number) {
		case 1: {
			System.out.println("���� ���� 50�� �ϱ�");
			break;
		}
		case 2: {
			System.out.println("�ΰ���5, ����5, �ȱ�30, ����Ʈ 30��");
			break;
		}
		case 3: {
			System.out.println("�뷡 �� �� ���. �̼���: �ο�. ");
			break;
		} default: {
			System.out.println("��� ��������.");
		}
		}
		
		
		
		
	}
}
