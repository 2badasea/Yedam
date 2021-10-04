package cd.yedam.person;

public class Car {
	//자동차에 대한 설계. getset메서드에 대한 이해를 높이자. 
	
	//우선 자동차라는 객체를 형성하기 위한 기본적인 필드들 생성 >> 이 필드를 바탕으로 생성자를 만들고, 
	// 얘들을 통해 구체적인 인스턴스를 생성한다. >>> 그리고 tire에 대한 객체를 만들어, 이 타이어 객체를 호출하는 등의 활용을 해보자.
	
	//1. 필드생성
	
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;
	private Tire tire;
	
	
	//위의 매객변수를 바탕으로 한 생성자 정의. 
	//이때 Tire만 따로 빼준 건 >>> Tire는 별개로 더 구체적인 정보를 담고 있기 때문. 나머지는 그냥 그럼. 
	
	//생성자 정의: 반환타입이 없고, 클래스이름과 똑같은 이름의 메서드이름. >>> 인스턴스 생성을 위함. 
	
	public Car(String carName, String carModel, int carPrice, int maxSpeed, Tire tire) {
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed; 
		this.tire = tire; 
	}
	
	//생성자를 정의했으니 이제 메서드를 선언한다. 우선 갖가지 매개값에 대한 초기화를 위한 set메서드. 그리고 이 값들을 반환하는 get메서드
	
	//getset method 생성~
	//다시 한번 강조하지만, set메서드는 매개값이 존재한다. get이 없을 뿐. 
	public void setCarName(String carName) {
		this.carName = carName;    //매개변수인 carName을 초기화시키는 것이다. 좌변으로 대입. 
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setTire(Tire tire) {
		this.tire = tire; 
	}
	
	//set메서드 완성> 초기화를 위한 용도. >> set메서드는 매개값이 존재한다. 그래야 그 매개값을 초기화시킬 수 있으니깐. 
	
	
	//get메서드 생성 >> 해당 메서드 호출시 값을 반환하기 위하여. 
	public String getCarName() {
		return this.carName;
	}
	public String getCarModel() {
		return this.carModel;
	}
	public int getCarPrice() {
		return this.carPrice;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	public Tire getTire() {
		return this.tire;
	}
	// get메서드 생성완료 
	
	
}

