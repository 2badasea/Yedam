package co.bada.prj.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class BoardVO { //필드들의 데이터타입과 변수명은 sql의 BOARD테이블을 참조한다. 
	private int bId;
	private String bWriter;
	private Date bWriteDate; //impot java.sql타입으로
	private String bTitle;
	private String bContents;
	private int bHit;
	
	
	public void toListString() {
		System.out.print(bId + " : ");
		System.out.print(bWriter + " : ");
		System.out.print(bWriteDate + " : ");
		System.out.print(bTitle + " : ");
		System.out.print(bHit + "\n");
	}
	
	public String toString() {
		System.out.println("글번호 : " + bId);
		System.out.println("작성자 : " + bWriter);
		System.out.println("작성일자 : " + bWriteDate);
		System.out.println("제 목 : " + bTitle);
		System.out.println("내 용 : " + bContents);
		System.out.println("조회수 : " + bHit);
		return null;
	}
}
/*
 * DTO(Data Transfer Object)의 약자로, 계층간 데이터 교환을 위한 자바빈즈를 뜻한다. 
 * 또한 DTO는 VO(value object)와 용어를 혼용해서 많이 사용하는데,  VO는 읽기만 가능한
 * readOnly속성을 가져, DTO와의 차이점이 존재한다. mybatis에서는 주로 vo 라고 불리며 
 * 많이 사용한다.
 */
