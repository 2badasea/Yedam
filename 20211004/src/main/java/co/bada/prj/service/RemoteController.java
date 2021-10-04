package co.bada.prj.service;


//자체적으로 객체를 생성해서 초기화할 수 없는 2가지: abstract, interface
//구체적으로 구현한 자식 클래스에서 객체를 생성 가능. 
public interface RemoteController {
	void powerOn();
	void powerOff();
}
