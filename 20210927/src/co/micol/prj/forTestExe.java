package co.micol.prj;

import java.util.Scanner;

public class forTestExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		int j = scn.nextInt();
		ForTest forTest = new ForTest(i, j);
		
	}

}
//int 변수를 사용할 때는 ijklmn 이런 걸 쓴다. 
//sum +=i;  보다는 sum = sum+i; 이렇게 쓰는 걸 권장. 더 빠름. 연산자 우선순위 속도에 따른. 
//코드를 최대한 단순하고 쉽게 쓸 수 있도록 노력하기. 고급개발자일수록 심플해진다. 