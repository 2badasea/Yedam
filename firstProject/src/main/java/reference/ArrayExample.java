package reference;

public class ArrayExample {

	public static void main(String[] args) {
		// 학생 30명을 일일이 변수로 선언하려면 30개나 필요하다. 
		// int s1~s30; 평균과 합을 계산하려면 코드가 엄청 길어진다. 
		
		// "int형의 데이터 타입을 가지는 값들을 담을 수 있는 배열들을 선언하겠다"
		// 이 배열의 이름은 intAry
		int[] intAry = {1, 2, 3, 4, 5};
		System.out.println(intAry[0]);	// 해당 배열의 첫 번째 값을 출력한다는 의미. 
		System.out.println(intAry[1]); //intAry[1] 처럼 주소값까지 입력하면 정수형이 됨.
		System.out.println(intAry[2]); //그래서 출력값은 정수가 나옴. 출력되는 값은 3.
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		
		for(int i =0; i<5; i++) {
			System.out.println(intAry[i]); 
		}
		
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10; 
		
		
		System.out.println("============다시==========");
		
		for(int i =0; i<5; i++) {
			System.out.println(intAry[i]); 
		}
	
//		정수형의 데이터타입만 배열에 담을 수 있는 건 아니다. 
		byte[] byteAry = {1, 2, 3};
		for(int i=0; i<3; i++) {
			System.out.println("byte배열: " + byteAry[i]);
		}
		
		
		String[] strAry = { "Hello", "World", "Nice"}; 
//		strAry = new String[] {1, 2, 3}; 배열 안에 문자형을 넣어주지 않았기에 에러가 뜸.   
		strAry = new String[] {"Hong", "Kim", "Park"}; /* strAry라는 배열에
				새로운 값들을 넣어주고 싶을 때, new연산자를 사용하여 새로운 객체를 생성 */ 
		for(int i=0; i<3; i++) {
			System.out.println("String배열: " + strAry[i]);
		}
		
		
		double[] dblAry;
		dblAry = new double[] {1, 2.3, 5}; 
		
		
		System.out.println("======float배열=======");
		float[] fltAry = new float[5]; // {0F, 0F,0F,0F,0F} 크기가5인 배열이 생성됨.
		for(int i =0; i<fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}
		
	}
}
