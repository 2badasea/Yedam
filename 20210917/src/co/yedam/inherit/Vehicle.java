package co.yedam.inherit;
// inheritance ��� �ٸ� ��Ű���� ����, protected ���� (���� �����ƺ��鼭 ������ ��!)
public class Vehicle {
	
	protected Vehicle() {
		
	}
	
	public Vehicle(String msg) {
		System.out.println(">>" + msg);
	}
	
	protected void run() {   // ������ ��Ű�� ������ default�� ����. 
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	
	public void stop() {     // default�� ������ ��Ű�� ������ ��� ����.
		System.out.println("�ڵ����� ����ϴ�");
	}
	
	
}
