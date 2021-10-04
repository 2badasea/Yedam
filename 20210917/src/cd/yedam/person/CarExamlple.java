package cd.yedam.person;

public class CarExamlple {
	//차의 모델과 이름은 '현대', '아이오닉하이브리드' 로 설정하자. 가격은 3000, 최고속도는 300, 
	//우선 실행을 위한 클래스이기에, main메서드를 생성해야 한다.
	
	public static void main(String[] args) {
		Car ionichybrid = new Car("현대", "아이오닉하이브리드", 3000, 300 , new Tire()); 
		
		//car클래스설계도를 바탕으로 ionichybrid라는 객체를 생성했고, 해당 객체에 대한 정보는 미리 입력했다. 
		//하나 특이점은 tire에 해당하는 매개변수로 new Tire()가 들어갔다는 점이다. 
		
		String cn = ionichybrid.getCarName();
		String cm = ionichybrid.getCarModel();
		
		System.out.println("차의 제조사: " + cn);
		System.out.println("모델 이름: " + cm);
			
	}
	
}
