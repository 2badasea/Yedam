package co.bada.prj.vo;

public class DevVO {		//VO객체, DTO 객체(변수와 getset으로만 구성되어 있는 것)
	private int id;
	private String name;
	private String address;
	private int age;  //db랑 같이 보면서 만든다. 
	
	//생성자를 통해서 전달하는 방법과, getset을 통해서 전달하는 방법
	
	public DevVO() {
		//기본생성자는 안 만들어도 되지만 혹시나 오버라이딩을 통해 재정의해서 사용할 수도 있으니. 
	}

	//getset메서드 완성. 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	//toString()메서드를 오버라이딩(최상위 객체로부터) 해서 위의 내용들을 출력할 것이다 한번에,.
	public String toString() {     //리턴타입이 String이기 때문에 몸체에서 return문 써야함. 
		System.out.print("아이디: " + id + " ");
		System.out.print("이름: " + name + " ");
		System.out.print("주소: " + address + " ");
		System.out.println("나이: " + age + " ");
		return null;    
	}
	// 또 한 가지 중요한 사실 >>> toString()메서드의 리턴타입을 String으로 한 것은 ,
	//애초에 해당 타입의 값을 호출하려는 게 아니라, 정보를 출력하기 위함이다. 
	// int 타입에서는 null값이 존재하지 않지만, String 타입에서는 null값으로 선언할 수 있기 때문. 
	
	
}
