package co.micol.prj;

public class CompareMax {   //�� Ŭ������ ����: ���޹��� �� ������ ū ���� �����Ѵ�. 
	
	private int n;
	private int m;
	
	public CompareMax(int n, int m) {          //������ ����. ���޹��� �Ű����� �����࿩ ��. ���� �� n, m��. 
		this.n = n;
		this.m = m;
	}
	
	public int getMax() {      //get�� ���� ��, �� �޼ҵ�� ���� �����ִ� �޼ҵ�� �� ����ϱ� ����. 
		int max =0;  		// �� ���� ���� ���� 0�� �����Ѵ�. (�ʱⰪ�� ��������� �ؿ��� ���ϰ� max�� ������ �� �ִ�.)
		if(n > m) {
			max  = n;
		} else if(n < m) {
			max = m;
		}
		return max;
	}
}
