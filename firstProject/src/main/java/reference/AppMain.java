package reference;
/////202쪽 문제.
import java.util.Scanner;
public class AppMain {
	
	
	public static void main(String[] args) {
		// 학생정보를 생성 점수분석
		// 학생인원 지정기능, 학생점수, 입력된 전체점수의 리스트, 분석:평균과 최고점, 종료
		int[] scores = null;
		while(true) {
			showMenu();
			int choice = readInt("번호를 선택하세요>>");
			
			if(choice == 1) {
				int size = createStudent();
				scores = new int[size];
			} else if (choice ==2) {
			    inputValue(scores);
			} else if (choice ==3) {
				showList(scores);
			} else if (choice ==4) {
				
			} else if (choice ==5) {
				break;
			}
	}
		System.out.println("끝.");
	}
	
	public static void showMenu() {
		System.out.println("1: 학생인원 지정, 2: 학생점수, 3: 전체리스트, 4: 분석:평균, 최고점, 5:종료");
	}

	
	public static int createStudent() {
		int cnt = readInt("학생수를 입력하세요.");
		return cnt;
	}
	
	public static void inputValue(int[] ary) {
//		if(any ==null) {
//		("먼저 학생점수를 입력하세요.");
		}
		
//	}
	
	public static void showList(int[] ary) {
		if(ary == null) {
			return;
		}
		for(int i=0; i< ary.length; i++) {
			//scores[0] => 88 나오도록. 
			System.out.printf("scores[%d] => %d\n", i , ary[i]);
		}
	}
	
	public static void analysis(int[] ary) {
		//평균, 최고점 => 콘솔창에 출력하는 기능. 
		double avg = 0;
		int maxVal = 0, sum= 0;
		for(int score : ary) {
			sum += score;
			if(maxVal < score) {
				maxVal = score;
			}
		}
		
		System.out.println("평균:, 최고점: ");
	}
	
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		while(true) {
		System.out.println(msg);
		try {
			int menu = scn.nextInt();
			return menu;
		} catch(Exception e) {
			System.out.println("값을 잘못 입력했습니다.");
			scn.nextInt();
		}		
		scn.close();
	  }	
   }
	
	
	
}
