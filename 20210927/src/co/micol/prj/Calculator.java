package co.micol.prj;

public class Calculator {                //public을 접근지시자.  //"Class 정의~" >>>설계를 만든다는 뜻.  
	private int firstNum;
	private int secondNum;    			//pritvate을 쓴 건 정보를 감추기 위함. 
									    //값을 집어넣는 두 가지 방법. 1. 생성자를 통해서. 
	public Calculator() {  //기본생성자.   //Calculator( , ); 방법.
										//2. Setter를 통해 전달하고 Getter를 통해 불러옴.
	}
	
	public Calculator(int n, int m) {    //생성자를 통해 미리 값을 전달 방법. 
		this.firstNum = n; 				//기본생성자와 생성자를 만들어주는 것을 오버라이딩이라 함.	
		this.secondNum = m;				//메소드의 리턴타입, 매개값, 매개 개수, 매개값의 타입이 다르면 오버라이드
	}  								 		
	
	public void setFirstNum(int n) {    //setter문은 변수의 첫 번째 이름을 대문자로.!
		this.firstNum = n;              // set은 해당 변수 이름에 값을 집어넣는다고 생각. 
	}									//get은 해당 변수의 값을 가져온다고 생각할 것. 
    
	public int getFirstNum() {          //getter   return value가 필요함. 
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() {
		return firstNum - secondNum;
	}
	
	// 이렇게 작성했던 것들은 일종의 설계도. 사용하려면 인스턴스를 만들어줘야 한다. 이 클래스는 단지 정의하는 부분이다.
	//하나 이상의 생성자가 원래 존재한다면 디폴트 생성자를 만들어주지 않는다. 
	//생성자를 통하지 않고 getset을 통해서 하고 싶다면 디폴트생성자를 만들어주긴 해야 한다. 인스턴스를 생성하기 위함.
	

}



