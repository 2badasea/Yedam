package co.bada.prj.comm;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class MemberVO {
	//VO(Value Object) 객체를 만들 때는 테이블을 참조해서 만든다. 
	//각 필드별 gettersetter메소드는 lombok으로 해결. 
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
	
	
	public MemberVO() {}

	public String toString() {  //toString()메소드를 통해 한번에 보는 기능 추가. 
		System.out.print(id + " ");
		System.out.print(name + " ");
		System.out.print(password + " ");
		System.out.print(tel + " ");
		System.out.print(address + " ");
		System.out.print(author + "\n ");
		
		return null;
		
	}
	
	
	
}
