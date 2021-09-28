package co.micol.prj;

public abstract class Animal {   //abstract를 붙이면 추상클래스라는 걸 선언해주는 뜻.
	public abstract void run();  //메소드원형만 있고 중괄호(몸체)가 없는 메소드.
									//abstract가 없으면 body를 만들거나 abstract를 만들어라고 경고뜸.
									//abstract가 붙어지면 "몸체는 밑에 가서 정의해라"
									//추상클래스는 자기 자신을 인스턴스로 생성불가.(new연산자 사용불가)
									
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
}
