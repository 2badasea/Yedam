package co.bada.exam1001;

/**
 * Hello world!
 *
 */
public class App {
	private static int[] a = { 7, 9, 3, 6, 1, 4, 2, 5, 8, 10 };

	public static void main(String[] args) {
		System.out.println("Hello World!");
		selectionSort(); // 여기서 오름차순 sort를 진행하고 밑으로 출력된다.
		System.out.println(a.toString()); // a의 메모리 주소를 보여준다.
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("==========================");

		System.out.println("==========================");
		newselectionSort();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		

	}
	
	// 메인메소드에서 실행되려면 실행될 메소드나 변수가 static이어야 한다.
	private static void selectionSort() {
		// for구문은 시작과 끝이 명확할 때
		for (int i = 0; i < a.length - 1; i++) { // 왜 -1인지 생각해보기.
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // 부등호를 반대로 한다면 desc된다. 내림차순으로 정렬된다.
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	// 위는 스왑과정이 굉장히 빈번해서 , 최근에는 밑의 방식을 많이 쓴다. 진보된sort문.
	private static void newselectionSort() {
		int min; // 얘는 인덱스의 위치값을 기억할 변수.
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j])
					min = j;
			}
			if (i != min) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
}
