package co.yedam.member;

public class SpecialUser extends User {
	
	private int point;
	
	public SpecialUser(String userId, String userPw, String userName, Grade userGrade, int userAge,  int userPoint) {
		super(userId, userPw, userName, userGrade, userAge);
		this.point= userPoint;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public void showInfo() {
		System.out.printf("User [userId=%s" + ", userPw=%s" + ", userName=%s" + ", userGrade=%s" + 
				", userAge=%d]\n", super.getUserId(), super.getUserPw(), super.getUserName(), super.getUserGrade(), 
				super.getUserAge());
	}
	
	
	
}
