package co.bada.prj.member.service;

import lombok.Getter;
import lombok.Setter;

//롬복을 사용하면 밑에 어노테이션만 달아도 알아서 다 생성해준다. 
@Setter
@Getter
public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
}
