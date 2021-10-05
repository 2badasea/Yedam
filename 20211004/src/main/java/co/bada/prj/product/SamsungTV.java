package co.bada.prj.product;

import co.bada.prj.service.RemoteController;
//import해주는 이유는 인터페이스클래스와 해당  SamsungTV클래스가 소속된 패키지가 다르기 때문이다. 
//모두 같은 패키지에 속한 클래스라면 별도로 import 안 해도 된다. 

public class SamsungTV implements RemoteController {

	@Override  //알아서 만들어준다. inferface칸에 해당 인터페이스 추가하니깐.
	public void powerOn() {
		System.out.println("삼성 TV 전원을 켠다");

	}

	@Override
	public void powerOff() {
		System.out.println("삼성 TV 전원을 끈다.");

	}

}
