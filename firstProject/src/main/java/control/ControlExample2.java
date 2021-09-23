package control;

public class ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "C";
		
		switch(inputValue) {
		case "A":     
			System.out.println("오~");
			break;
		case "B":
			System.out.println("잘했다.");
			break;
		case "C":
			System.out.println("보통~");
			break;
		case "D":
			System.out.println("노력~");
			break;
		default:
			System.out.println("실망;");
		}
//		switch문의 경우 범위의 조건은 입력할 수 없다.
//		switch문은 break를 넣어줘야 한다. 
	

		switch(inputValue) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		default:
			System.out.println("Fail");
		
		}
	}
}
