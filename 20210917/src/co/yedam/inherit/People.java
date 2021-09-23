package co.yedam.inherit;
/*
 * 상속: 부모-> 자식. 
 */
public class People {
	private String name;
	private String ssn;
	
	public People() {
		
	}
	
	public People(String name, String ssn) {
		this.name = name;   // 필드를 초기화해주는 역할.
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void showInfo() {
		System.out.println("이름은"+ name + ", 주민번호는: " + ssn);
	}

	@Override //부모클래스를 내가 재정의한다는 뜻. 
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
	
}
