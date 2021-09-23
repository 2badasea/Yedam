package cd.yedam.lesson;

// 이름, 과목

public class Teacher {
	// 필드...
	private String name;
	private String major;

	// 생성자...
	// Teacher t1 = new Teacher(); -> 공간만드는걸 인스턴스생성.
	public Teacher(String name, String major) { // 생성자에서는 메소드 매개값 우선 name 은 다같다 This쓰면 필드임
		this.name = name;
		this.major = major;

	}

	// 메소드
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
