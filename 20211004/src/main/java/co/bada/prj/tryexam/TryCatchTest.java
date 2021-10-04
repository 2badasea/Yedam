package co.bada.prj.tryexam;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TryCatchTest {
	
	//App클래스 5번째(맨 밑)
	//예외처리 하는 방식 2가지 숙지하기. 직접 처리하는 걸 보토 선호. 지금 방식과 "throws Exception"방식.
	public void method1() {
		try {
			Class clazz = Class.forName("co.micol.prj.TV");
//			Class clazz = Class.forName("co.bada.prj.TestInterface"); 
			System.out.println("원하는 클래스가 존재합니다. ");
			
		}catch(Exception e){
			e.printStackTrace();  // 개발자가 보는 거. 문제가 생겼을 때. 개발이 끝나면. 이 부부 주석처리한다. 
			System.out.println("예기치 않은 오류가 발생되었습니다.");  //사용자입장
			System.out.println("관리자에게 문의 하세요.");		//사용자입장.
		} 
			
	}
}
