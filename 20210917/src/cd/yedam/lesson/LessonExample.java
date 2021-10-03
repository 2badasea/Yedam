package cd.yedam.lesson;
/*
 *  ����Ŭ���� + ���̺귯���� Ŭ���� ������  -> �ϳ��� ���α׷� ����
 *  ��ü����(�л�, ������, ��) -> ��ü������
 *  �л�(��ü) -> �л�(Ŭ����) s r
 *  ��ҿ� -> new �л�() : �ν��Ͻ�. <- ��ü�� �������
 */

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("이창호","자바");
		
		Student s1 = new Student("이바다", "010-1111-3333","대구");
		Student s2 = new Student("이슬비", "010-2222-4444","부산");
		
		// ������ - �л�1. �л�,2, �л�3...
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г� 1��");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		Teacher t2 =l1.getTeacher(); // Teacher
		System.out.println("������ �̸� :" + t2.getName());
		System.out.println("������ ���� : " + l1.getTeacher().getMajor());
		
		l1.showStudents();
		
	}
	
	
}
