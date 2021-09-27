package co.micol.prj;

public class MyCalculator {		//Method Overloading >>> 다 sum이란 메소드를 바탕으로 정의됐다. 
	public void sum(int n, int m) {  //void는 내가 수행하고 끝낸다는 것. return밸류가 없다는 뜻. 
		System.out.println(n + m);
	}
	
//	public int sum(int n, int m) {   // 오버로딩이 안 된다. 메소드 오버로딩에서 리턴타입은 중요하지 않다. 
//		return n + m;				// 다만 매개변수의 타입이나 갯수가 달라야 한다. 
//	}
	
	public float sum(float n, int m) {  // >> 오버로딩이 된다. 와이? 매개값의 타입이 다르기 때문. 
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
