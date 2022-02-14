package co.bada.hello.notice.service;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class NoticeVO {
	private int no;
	private String id;
	private String name;
	private Date wdate;
	private String title;
	private String subject;
	private String fileName;
	private String pfileName;  // 물리파일명
	
	private int bigo;
	
}
