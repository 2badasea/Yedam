package co.yedam.inherit;
/*
 * People 상속 Student
 */
public class Student extends People {
	private int studentNo;
	
	Student(String name, String ssn){
		super(name, ssn);
	}
	
	Student(String name, String ssn, int studentNo){
//		this.name = name;  << 작동안됨.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}

//	override
	@Override
	public void showInfo() {
		System.out.println("Name: " + super.getName() 
							+ ", SSN: " + this.getSsn()
							+ ", SNO: " + this.getStudentNo());
	}
	
	// Student -> People을 상속받고 있고, 그리고 모든 클래스는 기본적으로 Object라는 것을 상속받고 있음. 
	// 
	@Override
	public String toString() {
		return "학생 [이름" + this.getName()  // 
			+ " 주민번호 " + this.getSsn()     //
			+ " 학번 " + this.getStudentNo() + "]";
	}
	
	
	
} 
