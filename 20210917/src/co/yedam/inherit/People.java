package co.yedam.inherit;
/*
 * ���: �θ�-> �ڽ�. 
 */
public class People {
	private String name;
	private String ssn;
	
	public People() {
		
	}
	
	public People(String name, String ssn) {
		this.name = name;   // �ʵ带 �ʱ�ȭ���ִ� ����.
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void showInfo() {
		System.out.println("�̸���"+ name + ", �ֹι�ȣ��: " + ssn);
	}

	@Override //�θ�Ŭ������ ���� �������Ѵٴ� ��. 
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
	
}
