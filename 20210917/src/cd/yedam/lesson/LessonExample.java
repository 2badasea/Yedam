package cd.yedam.lesson;

public class LessonExample {
	public static void main(String[] args) {
		 //구체적으로 이제 학생정보를 입력하고, 인스턴스를 생성하여 관련 작업을 해보자. 
		
		Teacher t1 = new Teacher("이창호", "자바");
		
		Student s1 = new Student("이바다" , "010-8448-0980", "대구시");
		Student s2 = new Student("조수정" , "010-3811-9472" , "수성구");
		
		//위에서 구체적인 인스턴스들은 모두 생성되었다.
		
		Lesson l1 = new Lesson();  
		// 따로 매개변수를 받는 생성자를 Lesson클래스에서 정의하지 않았다. 
		// 기본생성자를 통해 인스턴스 생성. 
		
		l1.setTeacher(t1);
		 //setTeacher 메서드에 의해 초기화가 설정되었다. 
		
		l1.setGroup("해바라기반"); 
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		// getset을 통해 학생들을 생성만 했지, 구체적으로 배열에 담진 않은 상황이다. 
		
		Teacher t2 = l1.getTeacher(); 
		System.out.println("강사 이름: " + t2.getName());
		System.out.println("담당 과목: " + l1.getTeacher().getMajor());
		
		l1.showStudents();
		 
		 
				 
	}
}
