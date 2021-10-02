package co.bada.exam1001;

public class RankAlgorithm {
	private int[] grade = {80, 100, 50, 80, 73, 42};
	private int[] rank;
	
	private void rank() {
		int[] rank = new int[grade.length];
		for(int i = 0; i < rank.length; i++) {  //rank배열의 초기화 용도.
			rank[i] = 1;  
		}
		
		for(int i = 0; i < grade.length -1; i++) {
			for(int j =i+1; j< grade.length; j++ ) {
				if(grade[i] > grade[j]) {
					rank[j] ++;
				} else if(grade[i] < grade[j]) {
					rank[i]++; 
				}
			}
		}
	}
	//상속받아서 쓰기 위해선 public으로 해줘야 함. private은 에러가 뜬다.
	public  String toString() {
		rank();
		for(int g : grade){   //보다 나은 for문. forEach구문. 주로 값을 읽을 때 사용한다. 
			System.out.print(g + " ");
		}
		
		for(int r : rank) {
			System.out.print(r + " ");
		}
		return null;
	}
}
