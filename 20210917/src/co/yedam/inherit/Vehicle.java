package co.yedam.inherit;
// inheritance 라는 다른 패키지를 선언, protected 예시 (서로 번갈아보면서 공부할 것!)
public class Vehicle {
	
	protected Vehicle() {
		
	}
	
	public Vehicle(String msg) {
		System.out.println(">>" + msg);
	}
	
	protected void run() {   // 동일한 패키지 내에선 default랑 같음. 
		System.out.println("자동차가 달립니다.");
	}
	
	public void stop() {     // default는 동일한 패키지 내에서 사용 가능.
		System.out.println("자동차가 멈춥니다");
	}
	
	
}
