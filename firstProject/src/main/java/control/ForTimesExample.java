package control;

public class ForTimesExample {

	public static void main(String[] args) {
		// 1~9�ܱ����� �������� �����ϱ�. 
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

// �������� ���, �ݺ����� ���� ������ �ڵ尡 �� 72���̳� �ۼ��ؾ� �Ѵ�. 