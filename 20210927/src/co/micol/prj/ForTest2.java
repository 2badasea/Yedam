package co.micol.prj;
//���������� ������ �� ���� �Է��ϸ�, �� �� ������ ������ ��� ���� ����� ����ϴ� ���α׷�. 
//�̹� ����� getter�� setter �� ����Ѵ�. 
public class ForTest2 {
	private int m;
	private int n;
	
	public int getNum1() {
		return m;
	}
	public void setNum1(int m) {
		this.m = m;
	}
	public int getNum2() {
		return n;
	}
	public void setNum2(int n) {
		this.n = n;
	}
	
	private void result() {
		int sum = 0;
		for(int i = m; i<=n; i++) {
			sum = sum + i;
		}
		System.out.printf("%d���� %d������ ���� %d�̴�", m, n, sum);
	}
	
	public void run() {
		result();
	}
	
	
	
	
	
}
