package co.bada.prj.member.service;

import java.sql.Date;

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
	private String status;
	private Date lastDate;
}
