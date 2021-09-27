package co.micol.prj;

public class MyCalculator {		//Method Override >>> 다 sum이란 메소드를 바탕으로 정의됐다. 
	public void sum(int n, int m) {  //void는 내가 수행하고 끝낸다는 것. return밸류가 없다는 뜻. 
		System.out.println(n + m);
	}
	
//	public int sum(int n, int m) {   //>> 오버라이딩이 안 된다. 
//		return n + m;
//	}
	
	public float sum(float n, int m) {  // >> 오버라이드가 된다. 와이?
		return n + m;
	}
	
	public float sum(float n, float m) {
		return n + m;
	}
	
	public double sum(double n, double m) {
		return n +m;
	}
	
	public int sum(int n, int m, int l) {     //MyCalc클래스는 덧셈만 돌려주는 클래스. 
		return n+m+l;
	}
	
	public int sum(int n) {
		int factorial = 1;
			for(int i = 1; i <= n; i++) {
				factorial = factorial * i;    //숫자 하나만 던지면 factorial 결과를 돌려주는 것. 
			}
		return factorial;
	}
	//
}
