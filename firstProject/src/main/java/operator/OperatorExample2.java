package operator;

import java.util.Scanner;
public class OperatorExample2 {

	public static void main(String[] args) {
		// 대입(할당)연산자
		int num1, num2, result; 
		num1 = num2 = 10; 
		
		result = num1 + num2;
		
		result = result + 10;
		result +=10; 
		
		result -= 10; // result = result -10; 이라는 뜻. 
		result *= 10; // 자기자신에 10을 곱한 값을 대입하겠다는 뜻. 
		result /= 10; // 위와 마찬가지. 
		result %= 10; // 자기 자신의 값에 10을 나눈 나머지의 값을 가지겠다는 것.
		
		String str = "Hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);
		
		System.out.println("===========================");
		
//		3항 연산자: 괄호 안의 조건을 만족하면 true, 만족하지 못 하면 false를 가짐. 
		int score = 80;
		boolean pass = (score > 60) ? true : false;  
		String isOk = (score > 60) ? "pass" : "fail"; 
		
		System.out.println(pass);
		System.out.println(isOk);
		
		System.out.println("============================");
		// boolean과 3항 연산자를 이용해서 성취도 성적 구하기. 
		
		Scanner scn = new Scanner(System.in); 
		
		System.out.println("리눅스 성적을 입력하세요");
		int linux = scn.nextInt();
		System.out.println("자바 성적을 입력하세요");
		int java = scn.nextInt();
		
		boolean success = ((linux+java)/2 <=40)?  true: false;
		
		if(success) {
			System.out.println("분발하자.");
		} else {
			System.out.println("조금만 더 열심히 하자.");
	}

}
}
