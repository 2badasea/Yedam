package co.bada.mypage.java.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JavaVO {
	private int no;
	private String id;
	private String name;
	private Date wdate;
	private String title;
	private String subject;
}
