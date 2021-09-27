package co.micol.prj;
//문제. 임의의 두 정수 m, n을 받아서. 그 사이의 값들을 모두 더한 값을 출력하는 class를 만들기.
//이 클래스의 방식은 getter, setter 방식이 아닌, 매개값을 가지고 있는 생성자를 인스턴스로 생성해서 실행하는 방식이다. 
import java.util.Scanner;
public class ForTest {
	Scanner scn = new Scanner(System.in);
	
	private int m;
	private int n;
	
	ForTest(int m, int n){
		this.m = m;
		this.n = n;
	}
	
	int sum = 0;
	private void run() {
		for(int i = m; i<=n; i++) {
			sum = sum+i;
		} System.out.println(sum);
	} 
	
	public void test() {
		run();
	}
	
	
	
	
	
	
	
}
