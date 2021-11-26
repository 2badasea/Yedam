package co.bada.lms.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String tel;
	private String address;
	private String author;
	private String status; // 상태 C(insert), D(delete), U(update변경) 
}
