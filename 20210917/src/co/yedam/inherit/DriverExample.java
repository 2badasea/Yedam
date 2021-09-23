package co.yedam.inherit;
/*
 * Bus -> Vehicle, taxi -> Vehicle  부모클래스를 향하여 화살표가 가리킴.
 */
public class DriverExample {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(t); // Vehicle 클래스의 인스턴스가 매개값으로 와야 한다. 
	}

}
