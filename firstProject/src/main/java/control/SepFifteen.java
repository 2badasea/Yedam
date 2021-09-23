package control;

import java.util.Scanner;
public class SepFifteen {

	public static void main(String[] args) {
		
//		리눅스, 깃허브, 자바의 점수를 입력하여 평균을 구하고, 그 값에 따라 학점을 부여하는 실행문.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("리눅스, 깃허브, 자바의 점수를 각각 입력해 봐 \n먼저 리눅스");
		
		int firstScore = scn.nextInt();
		System.out.println("\n다음 깃허브");
		
		int secondScore = scn.nextInt();
		System.out.println("\n마지막 자바는?");
		
		int thirdScore = scn.nextInt();
		
		
		int sum = firstScore + secondScore + thirdScore;
		double avg = sum/3; 
		System.out.println("너의 점수 합은: " + sum);
		System.out.println("그리고 평균은 :" + avg);
		
		if(avg>=90) {
			System.out.println("A학점");
		} else if(avg>=80) {
			System.out.println("B학점");
		} else {
			System.out.println("나머지는 싹 다 학사경고.");
		}
		
		
		System.out.println("===========비슷한 코드로 밑에=========");
		
		int sum2 = 0;
		int avg2 = 0;
		System.out.println("리눅스2의 점수를 입력학세요.");
		double linux = scn.nextDouble();
		
		System.out.println("깃허브2의 점수를 입력학세요.");
		double gitHub = scn.nextDouble();
		
		System.out.println("마지막으로 자바2의 점수를 입력학세요.");
		double java = scn.nextDouble(); 
		
		 sum2 = (int)(linux + gitHub + java);
		 avg2 = (int)(sum2/3);
		System.out.printf("당신의 총점: %d 이며 평균은 %d 이다.\n", sum2, avg2);
		
		if(avg2>=90) {
			System.out.println("당신은 A학점입니다.");
		} else {
			System.out.println("어려운 게 아니라 낯설어 익숙하지 않은 것이다.");
		}
		
		System.out.println("\n인생은 속도가 아니라 방향이란 걸 명심하세요.");
		
		
	}

}
