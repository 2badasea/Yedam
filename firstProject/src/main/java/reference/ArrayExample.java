package reference;

public class ArrayExample {

	public static void main(String[] args) {
		// �л� 30���� ������ ������ �����Ϸ��� 30���� �ʿ��ϴ�. 
		// int s1~s30; ��հ� ���� ����Ϸ��� �ڵ尡 ��û �������. 
		
		// "int���� ������ Ÿ���� ������ ������ ���� �� �ִ� �迭���� �����ϰڴ�"
		// �� �迭�� �̸��� intAry
		int[] intAry = {1, 2, 3, 4, 5};
		System.out.println(intAry[0]);	// �ش� �迭�� ù ��° ���� ����Ѵٴ� �ǹ�. 
		System.out.println(intAry[1]); //intAry[1] ó�� �ּҰ����� �Է��ϸ� �������� ��.
		System.out.println(intAry[2]); //�׷��� ��°��� ������ ����. ��µǴ� ���� 3.
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
		
		
		System.out.println("============�ٽ�==========");
		
		for(int i =0; i<5; i++) {
			System.out.println(intAry[i]); 
		}
	
//		�������� ������Ÿ�Ը� �迭�� ���� �� �ִ� �� �ƴϴ�. 
		byte[] byteAry = {1, 2, 3};
		for(int i=0; i<3; i++) {
			System.out.println("byte�迭: " + byteAry[i]);
		}
		
		
		String[] strAry = { "Hello", "World", "Nice"}; 
//		strAry = new String[] {1, 2, 3}; �迭 �ȿ� �������� �־����� �ʾұ⿡ ������ ��.   
		strAry = new String[] {"Hong", "Kim", "Park"}; /* strAry��� �迭��
				���ο� ������ �־��ְ� ���� ��, new�����ڸ� ����Ͽ� ���ο� ��ü�� ���� */ 
		for(int i=0; i<3; i++) {
			System.out.println("String�迭: " + strAry[i]);
		}
		
		
		double[] dblAry;
		dblAry = new double[] {1, 2.3, 5}; 
		
		
		System.out.println("======float�迭=======");
		float[] fltAry = new float[5]; // {0F, 0F,0F,0F,0F} ũ�Ⱑ5�� �迭�� ������.
		for(int i =0; i<fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}
		
	}
}
