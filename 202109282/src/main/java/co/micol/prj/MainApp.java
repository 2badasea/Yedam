package co.micol.prj;

import co.micol.prj.friend.CompanyFriend;
import co.micol.prj.friend.Friend;
import co.micol.prj.friend.SchoolFriend;

public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run();         // �̷� ����� �ΰ� ��������� ��. 
		
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
		schoolFriend.name = "ȫ�浿";
		schoolFriend.tel = "010-1234-7980";
		schoolFriend.address = "�뱸������";
		schoolFriend.friendPrint();
		
		Friend companyFriend = new CompanyFriend();
		companyFriend.name = "ȫ���";
		companyFriend.tel = "01230255";
		companyFriend.address = "�뱸������";
		
		
	}
}
