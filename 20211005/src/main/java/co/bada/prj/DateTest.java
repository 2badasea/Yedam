package co.bada.prj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;   //utilDate들은 format과 함께 써주는 게 좋다. 


public class DateTest {
	private Date date;
	private Calendar now;
	private SimpleDateFormat sd;
	private SimpleDateFormat sd2;
	
	void dateTest() {
		sd = new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss"); //날짜 표현 형식 정의. 
								//MM대문자로 작성한 건 뒤의 m과 충돌이 일어나기 때문. 
		
		sd2 = new SimpleDateFormat("yyyy년 MM월 dd일"); //다른 형식으로 바꿔봄. 
		date = new Date();  //새로운 날짜 객체를 생성. 
		
		sd.format(date); 
		sd2.format(date);
		System.out.println(sd.format(date));
		System.out.println(sd2.format(date));
		System.out.println(date);  //포멧형식을 주지 않았을 경우. 
		System.out.println("=======================================");
	
	}
	
	// Calender클래스 학습. 
	void calendarTest() {
		now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH);
		int month2 = now.get(Calendar.MONTH) + 1;  
		System.out.println(month);
		System.out.println(month2);
		
	}
	
	
	
	
}
