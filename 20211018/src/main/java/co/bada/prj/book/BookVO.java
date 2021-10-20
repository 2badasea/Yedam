package co.bada.prj.book;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookVO {
	private int cId;
	private String cWriter;
	private Date cDate;
	private String cTitle;
	private String cContents;
	
	
	public void toListString() {  //코멘트 전체 조회하기.
		System.out.print("글번호: " + cId + "  ");
		System.out.print("작성자: " +cWriter + "  ");
		System.out.print("작성날짜: " + cDate + "  ");
		System.out.print("제목: " + cTitle + "  ");
		System.out.print("내용: " + cContents + "\n");
	}
	
	public String toString() {    //번호 입력시 해당 id로 작성된 코멘트들만 따로 모아서 보도록. 
		System.out.println("글번호 : " + cId);
		System.out.println("작성자 : " + cWriter);
		System.out.println("작성날짜: " + cDate);
		System.out.println("제목: " + cTitle);
		System.out.println("내용: " + cContents);
		
		return null;
	}
	
	
}
