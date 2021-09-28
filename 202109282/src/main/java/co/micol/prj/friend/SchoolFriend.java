package co.micol.prj.friend;

public class SchoolFriend extends Friend {

	@Override
	public void friendPrint() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + tel);
		System.out.println("주소: " + address);
		System.out.println("구분: 학교친구"  );
	}


}
