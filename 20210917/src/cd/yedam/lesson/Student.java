package cd.yedam.lesson;

/*
 * 학생이름, 연락처, 학생주소
 */
public class Student {
	private String studentName;
	private String Phone;
	private String address;

	public Student(String name, String phone, String address) {
		this.studentName = name;
		this.Phone = phone;
		this.address = address;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public String getPhone() {
		return this.Phone;
	}

	public String getaddress() {
		return this.address;
	}

}
