package control;

public class ConditionExample {

	public static void main(String[] args) {
		int score = 90;
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("끝."); 
		//90점 이상이면 A, 80점 이상 B, 70점 이상 C, 60점이상 D, 그외 F
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >=70) {
			System.out.println("C학점");
		} else if (score >=60) {
			System.out.println("D학점");
		} else {
			System.out.println("포기하지 마라. 익숙하지 않을 뿐이지 어려운 게 아니다");
		}
			
	}

}
