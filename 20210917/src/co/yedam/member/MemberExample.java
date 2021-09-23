package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "박미림", "대구중구 내일동"); // 생성자 () 호출 ctrl+마우스 하면 따라감
		m1.showInfo();

//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//      m1.address = "중구 남일동";
		m1.setaddress("중구 남일동");

//		System.out.println("아이디: " + m1.memberId);
		System.out.println("아이디: " + m1.getMemberId());
//		System.out.println("이름: " + m1.name);
		System.out.println("이름: " + m1.getName());
//		System.out.println("주소: " + m1.address);
		System.out.println("주소: " + m1.getaddress());

System.out.println("===============m1 =============");
		Member m2 = new Member();
		m2.setMemberId("user2");
		m2.setName("안경만");
		m2.setaddress("중구 신당동");
		
		System.out.println("아이디: " + m2.getMemberId());
		System.out.println("이름: " + m2.getName());
		System.out.println("주소: " + m2.getaddress());
		m2.showInfo();
		System.out.println("===============m2 =============");
		
		
		
		Member m3 = new Member("user3", "홍길동", "대구 신남동");
		m3.showInfo();
//		m3.name = "박길동";
		m3.setName("박길동");
		m3.showInfo();

//		
	}

}
