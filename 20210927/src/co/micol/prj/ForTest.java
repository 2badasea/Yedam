package co.micol.prj;
//����. ������ �� ���� m, n�� �޾Ƽ�. �� ������ ������ ��� ���� ���� ����ϴ� class�� �����.
//�� Ŭ������ ����� getter, setter ����� �ƴ�, �Ű����� ������ �ִ� �����ڸ� �ν��Ͻ��� �����ؼ� �����ϴ� ����̴�. 
import java.util.Scanner;
public class ForTest {
	Scanner scn = new Scanner(System.in);
	
	private int m;
	private int n;
	
	ForTest(int m, int n){
		this.m = m;
		this.n = n;
	}
	
	int sum = 0;
	private void run() {
		for(int i = m; i<=n; i++) {
			sum = sum+i;
		} System.out.println(sum);
	} 
	
	public void test() {
		run();
	}
	
	
	
	
	
	
	
}
