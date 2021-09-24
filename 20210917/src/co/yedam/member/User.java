package co.yedam.member;
//get, set 개념 복습, toString 개념도 복습!
enum Grade{
	SPECIAL, SUPER, MID, GUEST
}
public class User {
	// 사용자 아이디, 사용자비밀번호, 사용자이름, 등급,
	
	// 필드
	private String userId;  //null;
	private String userPw;
	private String userName;
	private Grade userGrade; //null;
	private int userAge; // 0
	
	// 생성자.
	public User() {
		
	}
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	public User(String userId, String userPw, String userName, 
					Grade userGrade, int userAge) {
		this(userId, userPw);
		this.userName = userName;
		this.userGrade = userGrade;
		this.userAge = userAge;
		
	}
	
	// 메소드
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Grade getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(Grade userGrade) {
		this.userGrade = userGrade;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw 
				+ ", userName=" + userName + ", userGrade=" + userGrade
				+ ", userAge=" + userAge + "]";
	}
	
	public void showInfo() {
		System.out.printf("User [userId=%s" + ", userPw=%s" + ", userName=%s" 
							+ ", userGrade=%s" + 
							", userAge=%d]", userId, userPw, userName, userGrade, userAge);
	}
	
	
	
}
