package control;

public class DoWhileExe {

	public static void main(String[] args) {
		boolean run = false;
		
		//1부터 10까지 출력.
		// 끝1.
		int num = 0;
		do {
			if(num>=10) {
				continue;
			}
			num++;
			System.out.println(num);
			if(num>=10) {
				break;
			}
		} while(true);
		System.out.println("=============1번 끝");
		
		
		// 짝수만 출력
		// 2번 끝. 
		num = 0;
		do {
			num++;
			if(num%2==0) {
				System.out.println(num);
				continue;
			}
			if(num>=10) {
				break;
			}
		} while(true);
		System.out.println("=============2번 끝");
		
		//홀수만 합계.
		//3번 끝.
		
		 	num = 0;
		int sum = 0;
		do {
			num++;
			if(num%2 ==1) {
				sum+=num;
				continue;
			} 
			
			if(num>=10) {
				
				break;
			}
		}while(true);      // true 대신에 run을 넣으면 거짓이 되므로 1만 출력.
		System.out.println(sum);
		System.out.println("============3번 끝");
		
		
		// 임의의 값을 1~10; 
		// sum 값이 100보다 큰 수가 되었을 때, 그때의 sum값을 출력... 
		// 몇 번을 실행을 했는지 보여지도록... 
		// 끝4 
		int i = 0;
		   sum = 0;
		int times = 0;
		do {
			i++;
			sum+=i;
			times++;
			if(sum<=100) {
				continue;
			} else {
				System.out.println(sum);
				break;
			}
			
			
			
		}while(true);
		System.out.println(times);
		System.out.println("=============4번끝================");
		
		
		
	}
	

	}
