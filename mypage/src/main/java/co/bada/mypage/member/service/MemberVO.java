package co.bada.mypage.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	// MemberVO 객체를 만들 때는 항상 sqldeveloper 를 켜서 컬럼값을 확인하면서 정의한다. 
	private String id;
	private String password;
	private String name;
	private String tel;
	private String address;
	private String author;
}
