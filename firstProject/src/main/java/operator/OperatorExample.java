package operator;

public class OperatorExample {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 10;
	    num2 = 5;
	    
	  //result = num2 = num1;  >>> 오류가 발생하진 않는다. 
 	    result = num1 * num2; //할당(대입)연산자 좌항과 우항을 반대로 못 함. 
	  //num1*num2 = result;    >>> 오류가 발생. 
	    result = -result;
	    System.out.printf("-연산결과: %d\n", result);
	    
	    result = num1 % 3;
	    System.out.printf("연산결과: %d\n", result);
	    
	    // 비트연산자&: 두 비트 모두 1일 경우에만 연산 결과가 1
	    result = num1 & num2;
	    System.out.printf("& 연산결과: %d\n", result);
	    
	    //비트연산자| : 두 비트 중 하나만 1일 경우에도 연산결과가 1
	    result = num1 | num2;
	    System.out.printf("| 연산결과: %d\n", result);
	    
	    result = ~num1; // 2진수 => ~ + 1 = 0
	    // 3 + (-3) = 0 10000011
	    System.out.printf("~ 연산결과: %d\n", result);
	    
	    // >>, >>>, << 
	    result = num1 >>2;
	    System.out.printf(">> 연산결과: %d\n", result);
	    
	    // &&(and연산자), ||(or연산자), !     왼족의 세 연산자들 다로 공부해보기. 
	    //boolean 타입의 기본값은 false다. 
	    boolean b1 = false;
	    boolean b2 = !b1;  //b2는 true의 값을 갖는다. 
	    
	    boolean b3 = b1 && b2; // 두 개의 값이 모두 참이면 참을 가져오고 하나라도 아니면 false
	    System.out.printf("b3: %s, b1: %s, b2:%s", b3, b1, b2);
	   
	}
}
