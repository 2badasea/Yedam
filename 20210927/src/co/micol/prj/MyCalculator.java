package co.micol.prj;

public class MyCalculator {		//Method Overloading >>> �� sum�̶� �޼ҵ带 �������� ���ǵƴ�. 
	public void sum(int n, int m) {  //void�� ���� �����ϰ� �����ٴ� ��. return����� ���ٴ� ��. 
		System.out.println(n + m);
	}
	
//	public int sum(int n, int m) {   // �����ε��� �� �ȴ�. �޼ҵ� �����ε����� ����Ÿ���� �߿����� �ʴ�. 
//		return n + m;				// �ٸ� �Ű������� Ÿ���̳� ������ �޶�� �Ѵ�. 
//	}
	
	public float sum(float n, int m) {  // >> �����ε��� �ȴ�. ����? �Ű����� Ÿ���� �ٸ��� ����. 
		return n + m;
	}
	
	public float sum(float n, float m) {
		return n + m;
	}
	
	public double sum(double n, double m) {
		return n +m;
	}
	
	public int sum(int n, int m, int l) {     //MyCalcŬ������ ������ �����ִ� Ŭ����. 
		return n+m+l;
	}
	
	public int sum(int n) {
		int factorial = 1;
			for(int i = 1; i <= n; i++) {
				factorial = factorial * i;    //���� �ϳ��� ������ factorial ����� �����ִ� ��. 
			}
		return factorial;
	}
	//
}
