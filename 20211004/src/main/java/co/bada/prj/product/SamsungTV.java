package co.bada.prj.product;

import co.bada.prj.service.RemoteController;

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
