package cd.yedam.lesson;

// �̸�, ����

public class Teacher {
	//교사에 대한 정보를 담는 클래스를 설계한다. 이름과 전공을 필드값으로 받고, 그 두 값을 매개로 하는 
	//생성자를 정의한다. >>> 객체를 만들 때 사용하기 위함..
	
	
	private String name;
	private String major;
	
	//생성자 만들기. 

	// >>> 필드값들을 매개값으로 하는 인스턴스를 생성하기 위함. 
	
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	
	//생성자 정의. >>> teacher에 대한 getset메서드를 작성한다. 초기값을 설정하고 호출했을 때 반환용도.
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major; 
	}
	
	public String getName() {
		return this.name;
	}
	public String getMajor() {
		return this.major;
	}


}



