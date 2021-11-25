package co.bada.hello.notice.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoticeVO {  // notice테이블이 가지고 있는 정보들. 
	private int no;  // 순번
	private String id;	//작성자아이디
	private String name; //작성자 이름
 	private Date wdate; //작성일자.
	private String title;  //제목
	private String subject;  //내용
	private String fileName;  // 원본 파일명.
	private String pfileName; // 물리 파일명
	
	
	//여기에다 필요시 확장한다.
}
