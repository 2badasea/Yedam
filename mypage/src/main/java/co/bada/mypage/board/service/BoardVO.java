package co.bada.mypage.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int no;
	private String id;
	private String name;
	private Date wdate;
	private String title;
	private String subject;
}
