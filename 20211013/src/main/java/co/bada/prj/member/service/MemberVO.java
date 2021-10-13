package co.bada.prj.member.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class MemberVO { //DB의 멤버테이블을 확인하면, 모든 컬럼이 VARCHAR2 >>> 자바에선 String.
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
}
