package cd.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		// 변수이름 p1 키 ,몸무게
		// p2,p3
		// family -> 가족정보 (이름,혈액형,나이) : ㄲ끝1

		// 키가 165 이상 가족만 출력 (이름, 키 ,몸무게)
		// family 혈액형이 ab형인 사람만 나오도록
		// "홍길동", 180, 170, "B", 28
		
		
		
		
//		Car c1 = new Car();
//		c1.carModel = "소나타";
//		c1.carName = "EFSonata";
////		c1.maxSpped = -110;
//		c1.setMaxSpped(-100);
//		
//		
		
		
		
		
		Person p1 = new Person("홍길동 ", 180, 170, "B", 28);

		p1.setName("홍길동");
		p1.setheight(180);
		p1.setweight(170);
		p1.setRH("B");
		p1.setage(28);
		p1.showInfo();
		Person p2 = new Person("짱구 ", 175, 75, "A", 25);
		p2.showInfo();
		Person p3 = new Person("철수 ", 160, 50, "C", 20);
		p3.showInfo();

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i].getName() + " : " + family[i].getheight() + " : " + family[i].getweight());
		}

		System.out.println("=========끝1======");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getheight() > 165) {
				System.out.println(family[i].getName() + "의 키는 165 이상 이며" + family[i].getheight() + "cm 입니다");
			}

		}
		System.out.println("==================끝2=============");
		p3.setRH("AB");
		for (int i = 0; i < family.length; i++) {
			if (family[i].getRH().equals("AB")) {
				System.out.println(family[i].getName() + "의 혈액형은" + family[i].getRH() + "입니다");
			} else {
				System.out.println(family[i].getName()+ "혈액형은 AB형이 아닙니다.");
			}

		} System.out.println("===========끝3=============");

	}

}
