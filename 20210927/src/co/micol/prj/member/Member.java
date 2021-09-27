package co.micol.prj.member;
//베이스 패키지 밑의 패키지.
//아이디와 패스워드를 관리하는 패키지라 생각하고 클래스 설계.
public class Member {
	private String id;
	private String password;
	private String name;
	private String address;
	
	//위의 4개값을 다 전달하는 객체를 생성한다고 가정>>> 
	public Member(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	
	//toString 으로 목록을 알기 위한 메소드 생성용도.
	private void memberPrint() {           //정보은폐. (private를 통해.) 인스턴스에서 private 못 봄. 
		System.out.print("아이디 : " + id + " ");
		System.out.print("패스워드 : " + password + " ");
		System.out.print("이 름 : " + name + " ");
		System.out.println("주소 : " + address + " ");
	}
	
	public void run() {
		memberPrint();
	}
}
