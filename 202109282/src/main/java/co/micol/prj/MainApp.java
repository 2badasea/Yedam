package co.micol.prj;

import co.micol.prj.friend.CompanyFriend;
import co.micol.prj.friend.Friend;
import co.micol.prj.friend.SchoolFriend;

public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run();         // 이런 방식을 두고 정보은폐라 함. 
		
//		Animal man = new Man();
//		man.run();
//		man.sleep();
//		
//		Animal bird = new Bird();
//		bird.run();
//		bird.sleep();
//		
//		Man man2 = new Man();
		
		Friend schoolFriend = new SchoolFriend();
		schoolFriend.name = "홍길동";
		schoolFriend.tel = "010-1234-7980";
		schoolFriend.address = "대구광역시";
		schoolFriend.friendPrint();
		
		Friend companyFriend = new CompanyFriend();
		companyFriend.name = "홍길순";
		companyFriend.tel = "01230255";
		companyFriend.address = "대구광역시";
		
		
	}
}
