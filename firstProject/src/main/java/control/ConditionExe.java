package control;

public class ConditionExe {

	public static void main(String[] args) {
		// 두 정수 60, 70 변수로 선언.
		// 두 수를 합한 결과 100점 넘어서면 합격, 안 되면 불합격.
		// 제일 마지막엔 끝.
		int firstScore = 60;
		int secondScore = 70;

		if (firstScore + secondScore >= 100) {
			System.out.println("합격~");
		} else {
			System.out.println("불합격");
		}
		System.out.println("1번 끝.");

		// 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수.
		// 2번째 끝.
		int multiple = firstScore * secondScore;
		if (multiple % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("2번 끝");

		// 새로운 변수 4, 12 등등을 담고,
		// 2의 배수이면 2의 배수, 3의 배수이면 3의 배수, 2와3의 배수.
		int thirdScore = 12;
		if (thirdScore % 6 == 0) {
			System.out.println("2와 3의 배수");
		} else if (thirdScore % 3 == 0) {
			System.out.println("3의 배수");
		} else if (thirdScore % 2 == 0) {
			System.out.println("2의 배수");
		}
		System.out.println("3번 끝");

//		randomValue는 0과 1 사이의 임의의 난수값을 출력해준다. 콘솔창 확인. 
		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// swtich case 구문으로 위의 값이 1이면 "1이 나왔습니다 "
		switch (randomValue) {
		case 1: {
			System.out.println("1이 나왔습니다.");
			break;
		}
		case 2: {
			System.out.println("2가 나왔습니다.");
			break;
		}
		case 3: {
			System.out.println("3이 나왔습니다.");
			break;
		}
		case 4: {
			System.out.println("4가 나왔습니다.");
			break;
		}
		case 5: {
			System.out.println("5가 나왔습니다.");
			break;
		}
		case 6: {
			System.out.println("6이 나왔습니다.");
			break;
		}
		}

		System.out.println("4번 끝.");

		int randomScore = (int) (Math.random() * 100);
		if (randomScore >= 90) {
			System.out.println("A학점");
		} else if (randomScore >= 80) {
			System.out.println("B학점");
		} else if (randomScore >= 70) {
			System.out.println("C학점");
		} else if (randomScore >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("열공~");
		}
		
		System.out.println("5번 끝");
		
		switch(randomScore/10) {
		case 9: {
			System.out.println("A학점입니다.");
			break;
		}
		case 8: {
			System.out.println("B학점입니다.");
			break;
		}
		case 7: {
			System.out.println("C학점입니다.");
			break;
		}
		case 6: {
			System.out.println("D학점입니다.");
			break;
		} default: {
			System.out.println("열공;;");
		}
		
		}
		System.out.println("==========밑은 내가 개인적으로 만든 것");
		// 난수의 값으로 주사위 값을 만들어보자. 그리고 그 주사위 값에 따라 운동량 3케이스 정해보자. 랜덤으로~
		int number = (int) (Math.random() * 3 + 1);

		switch (number) {
		case 1: {
			System.out.println("당장 윗몸 50개 하기");
			break;
		}
		case 2: {
			System.out.println("턱걸이5, 복근5, 팔굽30, 스쿼트 30초");
			break;
		}
		case 3: {
			System.out.println("노래 한 번 듣기. 이선희: 인연. ");
			break;
		} default: {
			System.out.println("계속 공부하자.");
		}
		}
		
		
		
		
	}
}
