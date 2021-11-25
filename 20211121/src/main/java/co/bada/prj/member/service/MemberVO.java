package co.bada.prj.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	// id, password, name, tel, address, author // db참조하기. 
	private String id;
	private String password;
	private String name;
	private String tel;
	private String address;
	private String author;
}
