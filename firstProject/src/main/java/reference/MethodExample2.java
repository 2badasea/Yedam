package reference;


import java.util.Scanner;

public class MethodExample2 {

	public static void main(String[] args) {
		
		sum(24, 55);    // 메소드 실행. 실제 값이 들어가야 한다. 
		int a =45, b = 77;
		sum(a, b);
		multi(33, 10);
		extent(3.5);
		
		int res = getMax(a, b);
		System.out.println("큰 수는: " + res);
		
		double res2 = divide(5, 3);
		System.out.println("결과는 " + res2);
	}

	//메소드를 정의하는 부분엔 타입이 들어가야 한다. 
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합: " + sum);
	}
	// 두 정수를 입력받아서 두 수의 합을 출력만 해주는 메소드. 
	
	
	
	// 두 점수를 입력받아서 두 수의 곱을 console 보여주는 것. 
	public static void multi(int i1, int i2) {
		int multi = i1 * i2; 
		System.out.println("두 수의 곱은: " + multi);
	}
	
	
	// 정사각형 너비를 계산해주는 메소드.
	public static void extent(double side) {
		double extent = side*side;
		System.out.println("정사각형의 넓이: " + extent);
	}
	
	// 두 수 중에서 큰 값을 반환해주는 메소드. 
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;   // return이 없으면 에러가 뜬다. 반환타입이 없어서.
	
	}
	
	// 두 정수를 입력받아서 첫 번째 값을 두 번째 값으로 나눈 결과를 반환해주는 메소드.
	public static double divide(int a, int b) {
		 double result = (double) a/b; 
		 return result;
	}
}
