package co.bada.prj;

public class Example01 {
	//스트링 객체 테스트
	private String str = "abcdefg";
	private String str2 = "19920803";  //생일이라고 가정.  yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = "akcdefg.jsp";
	private String cstr2 = "akcd efg.jsp";
	
	void stringTest() {
		System.out.println(str.charAt(3));     //str.charAt(3);  d가 출력된다. 
		System.out.println(str.codePointAt(2));  // 99가 출력된다. c의 아스키코드값이 99임. 
		System.out.println(str.codePointBefore(2));  // 98이 출력된다. c의 전인 b의 코드값.
		System.out.println(str.startsWith("ak")); // 시작할 때 ak가 있다면 true 리턴. 
		System.out.println(str.startsWith("ab"));  // true 리턴 
		System.out.println(str.endsWith("fg"));  //마지막이 fg가 끝나는지 알아줌. 
												//확장자이름이나 파일이름의 마지막 단어 파악가능.
		
		System.out.println("=============2교시==================");
		System.out.println(str.toString());  
		System.out.println(nstr.toString()); 
		System.out.println(nstr+mstr);  //두 문자가 결합되어서 출력된다. 
		
		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(mstr);
		System.out.println(n + m);  //이번에는 ""안에 있는 숫자들의 합이 출력되었다. 
		//Integer은 int값으로 객체화. 즉 클래스화 시키는 것이다. 
		 
		
		if(str.equals(cstr)) {        //두 문자열을 비교하는 것이다. 
			System.out.println(cstr); 
		} else {
			System.out.println("You lier!! ");
		}
		
		//필드값 private str2 예제. 
		String mm = str2.substring(4,6);  // 4번째부터 6 전까지 
		String dd = str2.substring(6);   // 그냥 6이라고 적으면 6번째부터 끝까지 가져오라는 것. 
		System.out.println("귀하의 생일은 " + mm + "월 " + dd + "일 입니다.");
		
		//위 cstr 값중에서 .jsp를 제외한 파일이름만 가져오고 싶으면? 
		String ex = cstr.substring(0,7);
		System.out.println(ex);
		
		//위를 조금 더 세련된 방식으로. 
		int l = cstr.indexOf(".");
		
		
		System.out.println(cstr.concat("xyz")); //기존 문자열에 'xyz'를 이어서 더해준다. 
		System.out.println(cstr.toUpperCase()); //모두 대문자로 변환시켜 출력해준다. 
					//활용법 예: y or n 의 설문을 물을 때 사용자가 Y나 y를 입력해도 동일한 결과출력.
		
		System.out.println(cstr.getBytes());  // 
		System.out.println(cstr2.trim());   // 공백을 포함해서 출력한다. 
		
		//char타입은 표현할 때 '';   
		//string타입은 ""; 
		//char = 'a'
		//str = "a"  
		// char = str >> false다. 같은 문자 a를 가리키지만 다르다. 
		
		char c = 'a';
		String cs = String.valueOf(c); //char type을 String type으로 변환. 비교를 위해. 
		String s = "a"; 
		if(s == cs) {
			System.out.println(c);
		} else {
			System.out.println("lier"); //lier가 출력된다. 형변환을 하더라도 애초에 객체가 다름. 
		}
		
		
		
	}
}
