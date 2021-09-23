package co.yedam;

public class Member {
	// 필드 (정보저장)
	int memberId;
	String name;
	String phone;
	
	// 메소드(기능을 수행 - 정보를 내보내거나 받는)
	public void showInfo() {      // main 메소드가 없으면 Stitc 못씀
		System.out.println("아이디: " + memberId + ",이름: " + name + ",연락처 : " + phone);
	}
	

}
