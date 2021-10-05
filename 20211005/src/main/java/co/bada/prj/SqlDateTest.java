package co.bada.prj;

import java.sql.Date;  // sql임.

public class SqlDateTest {
	private Date date; //기본적으로 java.sql.Date 객체는 년-월-일 만 처리한다. 
	
	void sqlDate() {
//		date  = new Date(2021, 10, 05);   //초기화할 때 값을 넣어줘야 한다. 에러가 뜸. 
		date = Date.valueOf("2021-10-05"); // string객체를 데이터객체화 시켜준 것
		System.out.println(date);
		System.out.println(date.getTime()); 
		System.out.println(date.toString()); //toString은 문자열 그대로 출력해주는 것. 
	}
}
