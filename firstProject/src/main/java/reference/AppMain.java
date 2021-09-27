package reference;
/////202쪽 문제. 밑의 코드들은 실행이 안 되므로 책을 참조해서 공부할 것. 
import java.util.Scanner;
public class AppMain {
	
	
	public static void main(String[] args) {
		//학생인원 지정기능, 학생점수, 입력된 전체점수의 리스트, 분석: 평균과 최고점, 종료
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo ==1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			} else if(selectNo==2) {
				System.out.println("점수를 입력하세요");
				for(int i =0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i]=Integer.parseInt(scn.nextLine());
				}
			} else if(selectNo==3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores["+i+"] :" + scores[i]);
				}
			} else if(selectNo==4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i =0; i<scores.length; i++) {
					max = (max < scores[i])? scores[i] : max;
					sum = sum + scores[i];
				}
				avg = (double)sum/studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo==5) {
				run = false;
			}
			
			
			
			
			
		}
		System.out.println("프로그램 종료");
	
 }
}
