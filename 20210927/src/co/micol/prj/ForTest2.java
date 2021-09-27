package co.micol.prj;
//마찬가지로 임의의 두 수를 입력하면, 두 수 사이의 값들을 모두 합한 결과를 출력하는 프로그램. 
//이번 방식은 getter와 setter 를 사용한다. 
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
		System.out.printf("%d부터 %d까지의 합은 %d이다", m, n, sum);
	}
	
	public void run() {
		result();
	}
	
	
	
	
	
}
