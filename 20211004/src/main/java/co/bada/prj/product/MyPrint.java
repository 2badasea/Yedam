package co.bada.prj.product;

import co.bada.prj.service.Pencil;
import co.bada.prj.service.RemoteController;

public class MyPrint implements RemoteController, Pencil {
	//밑의 주석들은 App클래스의 4번째 부분이랑 연계해서 볼 것. 오류도 왜 떴는지.
	//그리고 해당 주석들은 MyPrint 클래스의 맨 밑의 '나만의 메소드'부분도 연계됨. 같이 볼 것. 
//	private Pencil pencil;
//	public MyPrint(Pencil pencil) {
//		this.pencil = pencil; 
//	}
	

	//두 개를 추가함. pencil을 통해 연필의 속성을 정하고, remote를 통해 온오프하기위하여
	@Override
	public void selectPencil() {
		System.out.println("4B");
	}

	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");
	}
	
	//나만의 메서드 작성.
//	public void toPrint() {
//		System.out.println("나는");
//		pencil.selectPencil();
//	}

}
