package co.yedam.member;

public class UserExample {

	public static void main(String[] args) {
		
		User user1 = null;
//		user1 = new User1(); // 에러가 나는 이유는 User1 이라는 생성자가 없기 때문.
		user1 = new User("user1", "1234");
		user1.setUserAge(20);
		user1.setUserName("사용자");
		user1.setUserGrade(Grade.GUEST);
		
		user1.getUserId();
		user1.getUserAge();
		
		
		User user2 = new User("user2", "5555", "상용자2", Grade.MID, 30);
		//위는 인스턴스를 만드는 시점에 각각의 값으로 초기화시켜줌. 
		String name = user2.getUserName();
		int age = user2.getUserAge();
		Grade grade = user2.getUserGrade(); 
		
		if(!name.equals("상용자2")) {
			user2.setUserGrade(Grade.SUPER);
		}
		if(age >= 20) {
			user2.setUserGrade(Grade.SPECIAL);
		}
		if(grade == Grade.MID) {
			user2.setUserGrade(grade);
		}
		
		
		System.out.println(user2.toString());
		user2.showInfo();
		
		User user3 = new SpecialUser("user2", "5555", "상용자2", Grade.MID, 30, 10);
		user3.showInfo();
	}

}
