package co.bada.prj.board.service;

import java.sql.Date;


import lombok.Getter;
import lombok.Setter;


@Setter //이걸 작성
@Getter	//주로 이거 2개만 작성한다. 
public class BoardVO {
	//얘를 만들 때는 db의 테이블객체를 열어서 보고 만들어야 한다. 타입과 컬럼명 등등 확인
	
	
	private int bId;
	private String bWriter;
	private Date bWriteDate;  //자바 sql import로.
	private String bTitle;
	private String bContents;
	private int bHit;
	
	
	
	
}
