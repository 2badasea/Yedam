package co.micol.prj.member;
//���̽� ��Ű�� ���� ��Ű��.
//���̵�� �н����带 �����ϴ� ��Ű���� �����ϰ� Ŭ���� ����.
public class Member {
	private String id;
	private String password;
	private String name;
	private String address;
	
	//���� 4������ �� �����ϴ� ��ü�� �����Ѵٰ� ����>>> 
	public Member(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	
	//toString ���� ����� �˱� ���� �޼ҵ� �����뵵.
	private void memberPrint() {           //��������. (private�� ����.) �ν��Ͻ����� private �� ��. 
		System.out.print("���̵� : " + id + " ");
		System.out.print("�н����� : " + password + " ");
		System.out.print("�� �� : " + name + " ");
		System.out.println("�ּ� : " + address + " ");
	}
	
	public void run() {
		memberPrint();
	}
}
