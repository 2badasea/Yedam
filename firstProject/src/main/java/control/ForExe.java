package control;



public class ForExe {

	public static void main(String[] args) {
	    // 1~10출력
		// 끝1. 
		// 1~10주에서 2, 4, 6, 8, 10
		// 끝2
		// 1~10중에서 1, 3, 5, 7, 9
		// 끝3
		// 1~10 까지 합을 구하도록 => 합계: 55
		// 끝4
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("=========1번 끝===========");
		
		
		
		for(int i=1; i<=10; i++) {
			 if(i%2==0) {
				 System.out.println(i);		 
			 }
		}
		System.out.println("===========2번 끝===========");
		
		
		
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println("===========3번 끝============");
		
		
		int sum =0;
		for(int i = 1; i<=10; i++) {
			sum= sum+i;
		}
		System.out.println(sum);
		System.out.println("==========4번 끝===========");
	}

}
