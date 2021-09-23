package cd.yedam.person;
/*
 * 이름, 키, 몸무게, 혈액형,나이
 */

public class Person {
	private String name;
	private double height;
	private double weight;
	private String RH;
	private int age;

	// String name, double height, double weight, String RH, int age
	public Person(String name, double height, double weight, String RH, int age)

	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.RH = RH;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setheight(double height) {
		this.height = height;
	}

	public void setweight(double weight) {
		this.weight = weight;
	}

	public void setRH(String RH) {
		this.RH = RH;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public double getheight() {
		return this.height;
	}

	public double getweight() {
		return this.weight;
	}

	public String getRH() {
		return this.RH;
	}

	public int getage() {
		return this.age;
	}
	
	
	
	
	public void showInfo() {
		System.out.println("이름 : " + name + "키 :" + height + "몸무게 :" + weight + "혈액형 :" + RH + "나이 : " + age);
	}

}
