package co.micol.prj.friend;

public abstract class Friend {
	public String name;
	public String tel;
	public String address;
	
	public abstract void friendPrint();       //출력하기 위한 메소드를 추상형 생성. 이는 
											//상속받는 클래스들에서 구체적으로 정의하기 위함.
}
