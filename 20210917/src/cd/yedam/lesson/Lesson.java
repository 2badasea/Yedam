package cd.yedam.lesson;


public class Lesson {
	private Teacher teacher;
	private String group;
	private Student[] students;
	
	//학급에 대한 객체를 먼저 생성 >>> 학생과 선생을 
	
	//변수를 선언하고, 학생이란 배열에는 몇 명이나 들어가는지 일단 정의
	
	public Lesson() {
		//타입이 없고, 클래스와 이름이 같기에 생성자라 볼 수 있다. 
		
		students = new Student[3]; 
		//배열이란 인스턴스를 생성했다. Students 타입의 자릿수는 3명. 이것을 students 변수에 담다.
		
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	//위 2개는 set메소드다. 해당 매개값이 들어오면 초기값을 설정해주는 용도. 
	
	public void addStudent(Student student) {
		for(int i =0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				break; 
			}
		}
	}
	
	//set메소드는 설정했기 때문에 get메서드를 설정해야 한다. 
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public String getGroup() {
		return this.group;
	}
	
	//위 두 메서드는 호출하게 되면 set메서드에서 설정된 초기값을 반환해주는 역할을 한다. 
	
	public void showStudents() {
		for(int i = 0; i< students.length; i++) {
			if(students[i] != null) {
				System.out.println("학생 이름: " + students[i].getStudentName()
						+ "연락처: " + students[i].getPhone()
						+ "주소: " + students[i].getAddress());
			}
		}
	}
	
	//위는 학생에 대한 정보를 종합적으로 보기 위한 메서드. 
	
	
	
	
	
	
	


}
