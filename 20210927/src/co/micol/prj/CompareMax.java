package co.micol.prj;

public class CompareMax {   //이 클래스의 목적: 전달받은 두 수에서 큰 값을 리턴한다. 
	
	private int n;
	private int m;
	
	public CompareMax(int n, int m) {          //생성자 정의. 전달받을 매개값을 정해줘여 험. 위에 두 n, m값. 
		this.n = n;
		this.m = m;
	}
	
	public int getMax() {      //get을 붙인 건, 이 메소드는 값을 돌려주는 메소드란 걸 명시하기 위함. 
		int max =0;  		// 두 수가 같을 때는 0을 리턴한다. (초기값을 설정해줘야 밑에서 리턴값 max를 돌려줄 수 있다.)
		if(n > m) {
			max  = n;
		} else if(n < m) {
			max = m;
		}
		return max;
	}
}
