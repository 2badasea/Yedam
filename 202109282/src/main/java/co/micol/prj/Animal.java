package co.micol.prj;

public abstract class Animal {   //abstract�� ���̸� �߻�Ŭ������� �� �������ִ� ��.
	public abstract void run();  //�޼ҵ������ �ְ� �߰�ȣ(��ü)�� ���� �޼ҵ�.
									//abstract�� ������ body�� ����ų� abstract�� ������� ����.
									//abstract�� �پ����� "��ü�� �ؿ� ���� �����ض�"
									//�߻�Ŭ������ �ڱ� �ڽ��� �ν��Ͻ��� �����Ұ�.(new������ ���Ұ�)
									
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	
}
