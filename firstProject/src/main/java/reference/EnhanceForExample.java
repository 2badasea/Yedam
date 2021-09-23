package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry=new String[5]; // null, null, null, null, null 이 채워져 있음. 
		strAry= new String[]{"Hong", "park", "choi", "kim", "hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";  // ==, equals()
		
		for(int i= 0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong"))
			System.out.println(strAry[i]);
		}
		
		
		System.out.println("=======다시========");
		
		//Enhanced for 
		for(String name : strAry) {
			System.out.println(name);
		}
		
		int[] scores= {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) {
			sum= sum+score;
		}
		  System.out.println(sum);
		
		System.out.println("===================");
		// 학생 3명. 4.2, 3.5, 2.8 점수 
		// 합계를 담을 수 있도록 변수.
		// 평균을 계산해서 avg
		// 학생평균:3.4 입ㄴ;디/ 
		
		double [] point = {4.2, 3.5, 2,8};
		double sum2 = 0;
		double avg2 = 0;
		for(double score2 : point) {
//	오류부분		sum2 = point[]
			avg2 = sum2/point.length;
		}
		System.out.println("학생평균: " + avg2 + "입니다.");

	}

}
