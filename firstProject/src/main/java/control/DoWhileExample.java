package control;

public class DoWhileExample {

	public static void main(String[] args) {
		// Do..while ����. do while ������ �� ������ �ʴ´�.    
		boolean run = false;
		
//		while(run) {                         // �Ҹ� ���� false �̹Ƿ� ����x
//			System.out.println("���๮1.");
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
//          ������������ ��ġ�� �߿��ϴ�. cnt++ ������ ������ ��ġ���� ���� if�� ������ �� ����� �ٸ�.
		} while (true);
		System.out.println("��.");
	}
 
}
