package cd.yedam.lesson;

/*
 * �л��̸�, ����ó, �л��ּ�
 */
public class Student {
	//학생에 대한 정보를 설계한다.
	
		private String studentName;
		private String phone;
		private String address;
		
		
		//필드값을 설정해주고, 이제 위의 정보를 매개변수로 하는 생성자를 정의한다. LessonExample클래스에서
			// 인스턴스로 생성할 때 매개값을 바탕으로 객체를 만들기 위함. 
		
		
		public Student(String studentName, String phone, String address) {
			this.studentName = studentName;
			this.phone = phone;
			this.address = address;
			
		}
		
		//위에 정의한 생성자를 바탕으로 메인클래스에서 인스턴스를 생성헌다. 
		// 학생 객체에 대한 getset 메서드 생성. 
		
		//set메서드는 반환타입이 void다. 초기화를 시키는 용도. 
		//get메서드는 반환타입이 존재한다. 
		
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public void setAddress(String address) {
			this.address = address; 
		}
		
		//set메서드 설정이 끝났으니, get메서드를 설정할 시간. 
		
		public String getStudentName() {
			return this.studentName;
		}
		
		public String getPhone() {
			return this.phone; 
		}
		
		
		public String getAddress() {
			return this.address;
		}
		
	
	}