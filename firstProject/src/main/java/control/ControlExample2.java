package control;

public class ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "C";
		
		switch(inputValue) {
		case "A":     
			System.out.println("��~");
			break;
		case "B":
			System.out.println("���ߴ�.");
			break;
		case "C":
			System.out.println("����~");
			break;
		case "D":
			System.out.println("���~");
			break;
		default:
			System.out.println("�Ǹ�;");
		}
//		switch���� ��� ������ ������ �Է��� �� ����.
//		switch���� break�� �־���� �Ѵ�. 
	

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
