package co.yedam.friend;

public class FriendMain {
	/*
	 * 친구 목록 관리 이름 , 연락처, email,키 몸무게 1.등록, 2.조회(이름), 3.목록, 4.수정(이름을기준), 5.삭제 9.종료
	 */
	private String Name;
	private String Phone;
	private String Email;
	private String height;
	private String weight;

	public FriendMain(String name, String phone, String email, String height, String weight) {

		Name = name;
		Phone = phone;
		Email = email;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void showInfo() {
		System.out.printf("[친구이름 : %s, 연락처 : %s, E-mail : %s, 키 : %s ,몸무게 : %s, \n", Name, Phone, Email, height,
				weight);
	}

}
