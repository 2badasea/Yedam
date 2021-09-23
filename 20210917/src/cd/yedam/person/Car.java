package cd.yedam.person;

public class Car { // 필드 확인하기 오른쪽마우스 source > 제너레이터 getter and setter
	// 생성자 만들기 필드 확인하기 오른쪽마우스 source > contructor filed
	//메소드 오른쪽마우스 source > 제너레이터 getter and setter
	
	// 필드
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpped;
	private Tire tire;
	
	//생성자
	public Car(String carName, String carModel, int carPrice, int maxSpped, Tire tire) {
		
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpped = maxSpped;
		this.tire = tire;
	}
//메소드

	public String getCarName() {	//select * from employee;
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getMaxSpped() {
		return maxSpped;
	}

	public void setMaxSpped(int maxSpped) {
		this.maxSpped = maxSpped;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	


}
