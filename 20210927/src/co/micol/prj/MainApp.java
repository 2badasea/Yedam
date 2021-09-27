package co.micol.prj;

import co.micol.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
			MyCalculator myCalculator = new MyCalculator();
			
			myCalculator.sum(10,10);
			float f = myCalculator.sum(5.0f, 5);  //float 돌려주는 타입이 존재하는 것을 'funciontype메소드'.
			System.out.println(f);				//functiontype메소드는 결과를 돌려줘야 한다. 				
												//프로그래밍에서 '='의 좌변에는 기억장소. 우변에는 값이 와야한다. 
												//돌려줘야 할 때 타입을 제대로 정해줘야 한다. 데이터손실이 발생.
												//return타입이 존재한다는 것은 돌려받는 공간이 존재한다는 뜻. 
			int n = myCalculator.sum(5); //int  sum(5)의 값을 출력하기 위해 타입과 변수(int n)를 넣어줬다. 
			System.out.println(n);      //120이 출력된 건 매개값을 하나만 받는 sum메소드는 factorial과정을 거침.
			
//			double d = myCalculator.sum(10, 10);  >>>오류가 뜸. int로 인식하니깐. 
			double d = myCalculator.sum(10.2 , 10.2);  //>>> 이렇게 수정해야 한다. 
			System.out.println(d); 
			
//			double d2 = myCalculator.sum(10, 100);  마찬가지로 오류. 
			double d2 = myCalculator.sum(10.1, 100);   // 오버라이드를 할 때 가급적이면 void타입은 안 하는 게 굿
			System.out.println(d2);
			
			System.out.println("======================큰 값, 작은 값 비교=========================");
			//클래스를 만들어줘야 한다(CompareMax 클래스 생성). main은 최종 조립. 
			CompareMax compareMax = new CompareMax(100, 50);   //무조건 값을 두 개 받는 생성자를 호출. 
			int max = compareMax.getMax();         // 앞에 (int max)를 붙인 건 get의 값을 받아서 출력하기 위함.
			System.out.println("두 수 중에 큰 값은: " + max);    
			
			Calculator calculator = new Calculator();     //기본생성자를 호출. >>> getset설정해야 함. 
			calculator.setFirstNum(200);
			calculator.setSecondNum(500);
			System.out.println("전달된 두 수의 합 = " + calculator.sum());
			
			System.out.println("========================멤버=============================");
			Member member = new Member("hong", "1234", "홍길동", "대구광역시"); //import해야 인스턴스생성가능.
		    member.run();    //member 클래스에서 .을 찍고 제공해주는 메소드는 run()밖에 없다. 나머진 private이라서.
		    
		    
			
			//첫 번째 방법. 기본생성자를 통해. 
//		Calculator calculator = new Calculator(); //"생성하자~" >>인스턴스 만든다는 얘기. 
//		calculator.setFirstNum(200);    // setter를 통해 값을 전달한다. 
//		calculator.setSecondNum(20);   
//		int sum = calculator.sum();
//		int sub = calculator.sub();
		
//		//매개값이 있는 생성자에 의한 전달 방법. (두 번째 방법) 
//		Calculator  calculator = new Calculator(20, 20); 
//		int sum = calculator.sum();
//		int sub = calculator.sub();
//		
//		System.out.println("덧셈의 결과: " + sum);
//		System.out.println("뺄셈의 결과: " + sub);
		
		//main메소드는 시작과 끝을 나타낸다. 모든 클래스, 즉 어떤 순서로 조립할지 다 생각하고 최종적으로 작성하는 것이다. 
		//없다고 생각하고, 모든 필요한 부품들을 다 만들고 가장 마지막에 작성. ^^
	}
}
