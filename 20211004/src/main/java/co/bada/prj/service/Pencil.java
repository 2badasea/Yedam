package co.bada.prj.service;

public interface Pencil {
	void selectPencil();
	
										
	default void pencilInterface() {   //default범위지시자는 interface내에서만 사용가능. 
										//몸체를 만들 수 있다. 추상메서드를 구현한 것과 비슷. 
										//default Interface는 자바 1.8부터 사용가능. 
										//항상 따라다님.
										//범위지시자를 생략하면 default값이 protected가 된다. 
		System.out.println("나는 인터페이스 객체다.");
		
	}
}
