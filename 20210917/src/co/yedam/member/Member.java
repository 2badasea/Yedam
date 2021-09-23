package co.yedam.member;

public class Member { // public -> open,공공의 다른class에서 사용되도록 오픈
	// user1(아이디), 홍길동(이름), 대구 중구신당동(주소)
	private String memberId; // private -> 개인적인 숨긴다 다른클래스에서는 사용은하지만 수정을 못함
	private String name;
	private String address;

	// 생성자 : 필드에 값을 초기화

	public Member() {
//		memberId = "user1";
//		name = "박지원";
//		address = "대구 중구 내일동";
	}

	public Member(String mId) {
		memberId = mId;
	}

	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}

	public void setMemberId(String mId) {
		memberId = mId;
	}

	public void setName(String n) {
		name = n;
	}

	public void setaddress(String a) {
		address = a;
	}

	public String getMemberId() {
		return memberId;		//반환해주는 필드 : 아이디
	}

	public String getName() {
		return name;		//반환해주는 필드 : 이름
	}

	public String getaddress() {
		return address;		//반환해주는 필드 : 주소
	}

	// 메소드
	public void showInfo() {
		System.out.println("아이디: " + memberId + "이름: " + name + "주소: " + address);
	}

	public void showMemberId() {
		System.out.println("아이디: " + memberId);
	}

	public void showName() {
		System.out.println("이름:  " + name);

	}

	public void showAddress() {
		System.out.println("주소: " + address);
	}

}
