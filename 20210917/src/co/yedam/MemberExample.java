package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member(); // null 값 너으면 null 에러
		m1.memberId = 10;
		m1.name = "박미림";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "홍길동";
		m2.phone = "010-3333-4444";

		Member[] members = { m1, m2 };
		for(Member m : members) {
			System.out.println("아이디 : " + m.memberId);
			System.out.println("이름 : " + m.name);
			System.out.println("연락처 : "+ m.phone);
		}
		
//		m1 -> member[0] 첫번째 위치
		m1.name = "김미림";
		members[0].phone = "010-5555-6666";
		for(Member merber : members) {
			merber.showInfo();
		}
		
		Student s1 = new Student(); 
		s1.name = "Hong";	// default: 같은 패키지 내에서 접근 가능. 
		s1.score = 90;		// default: 다른 패키지에는 접근 불가. 
		
		/*
		 * public >>> 다른 패키지에서 접근가능
		 * private>>> 동일 클래스 내에서 접근가능, 그외는 불가
		 * default >>> 동일한 패키지 내에서 접근가능. 
		 * protect >>> 
		 */
		
		
		
	}

}
