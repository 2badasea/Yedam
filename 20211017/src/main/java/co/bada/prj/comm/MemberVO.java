package co.bada.prj.comm;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
	
	public void toListString() {  //멤버 리스트 전체 보는 것.
		System.out.print(id + " : ");
		System.out.print(name + " : ");
		System.out.print(password + " : ");
		System.out.print(tel + " : ");
		System.out.print(address + " : ");
		System.out.print(author + "\n : ");
	} 
	
	public String toString() {	//멤버 개별 정보 조회하는 메소드. .
		System.out.println("아이디 : " + id);
		System.out.println("이름 " + name);
		System.out.println("패스워드 : " + password);
		System.out.println("연락처 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("권한 : " + author);
		
		return null;
	}
}
