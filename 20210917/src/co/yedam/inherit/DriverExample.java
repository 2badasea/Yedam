package co.yedam.inherit;
/*
 * Bus -> Vehicle, taxi -> Vehicle  �θ�Ŭ������ ���Ͽ� ȭ��ǥ�� ����Ŵ.
 */
public class DriverExample {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(t); // Vehicle Ŭ������ �ν��Ͻ��� �Ű������� �;� �Ѵ�. 
	}

}
