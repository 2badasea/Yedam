package co.micol.prj;

public class Calculator {                //public�� ����������.  //"Class ����~" >>>���踦 ����ٴ� ��.  
	private int firstNum;
	private int secondNum;    			//pritvate�� �� �� ������ ���߱� ����. 
									    //���� ����ִ� �� ���� ���. 1. �����ڸ� ���ؼ�. 
	public Calculator() {  //�⺻������.   //Calculator( , ); ���.
										//2. Setter�� ���� �����ϰ� Getter�� ���� �ҷ���.
	}
	
	public Calculator(int n, int m) {    //�����ڸ� ���� �̸� ���� ���� ���. 
		this.firstNum = n; 				//�⺻�����ڿ� �����ڸ� ������ִ� ���� �������̵��̶� ��.	
		this.secondNum = m;				//�޼ҵ��� ����Ÿ��, �Ű���, �Ű� ����, �Ű����� Ÿ���� �ٸ��� �������̵�
	}  								 		
	
	public void setFirstNum(int n) {    //setter���� ������ ù ��° �̸��� �빮�ڷ�.!
		this.firstNum = n;              // set�� �ش� ���� �̸��� ���� ����ִ´ٰ� ����. 
	}									//get�� �ش� ������ ���� �����´ٰ� ������ ��. 
    
	public int getFirstNum() {          //getter   return value�� �ʿ���. 
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() {
		return firstNum - secondNum;
	}
	
	// �̷��� �ۼ��ߴ� �͵��� ������ ���赵. ����Ϸ��� �ν��Ͻ��� �������� �Ѵ�. �� Ŭ������ ���� �����ϴ� �κ��̴�.
	//�ϳ� �̻��� �����ڰ� ���� �����Ѵٸ� ����Ʈ �����ڸ� ��������� �ʴ´�. 
	//�����ڸ� ������ �ʰ� getset�� ���ؼ� �ϰ� �ʹٸ� ����Ʈ�����ڸ� ������ֱ� �ؾ� �Ѵ�. �ν��Ͻ��� �����ϱ� ����.
	

}



