package co.micol.prj;

public class Bird extends Animal {

	@Override //부모클래스 Animal에서의  run()메소드가 추상메소드이기 때문에 자식 클래스에서 메소드를 정의하게 됨
	public void run() {
		System.out.println("새는 날아다닌다.");
	}

}
