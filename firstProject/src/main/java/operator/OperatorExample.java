package operator;

public class OperatorExample {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 10;
	    num2 = 5;
	    
	  //result = num2 = num1;  >>> ������ �߻����� �ʴ´�. 
 	    result = num1 * num2; //�Ҵ�(����)������ ���װ� ������ �ݴ�� �� ��. 
	  //num1*num2 = result;    >>> ������ �߻�. 
	    result = -result;
	    System.out.printf("-������: %d\n", result);
	    
	    result = num1 % 3;
	    System.out.printf("������: %d\n", result);
	    
	    // ��Ʈ������&: �� ��Ʈ ��� 1�� ��쿡�� ���� ����� 1
	    result = num1 & num2;
	    System.out.printf("& ������: %d\n", result);
	    
	    //��Ʈ������| : �� ��Ʈ �� �ϳ��� 1�� ��쿡�� �������� 1
	    result = num1 | num2;
	    System.out.printf("| ������: %d\n", result);
	    
	    result = ~num1; // 2���� => ~ + 1 = 0
	    // 3 + (-3) = 0 10000011
	    System.out.printf("~ ������: %d\n", result);
	    
	    // >>, >>>, << 
	    result = num1 >>2;
	    System.out.printf(">> ������: %d\n", result);
	    
	    // &&(and������), ||(or������), !     ������ �� �����ڵ� �ٷ� �����غ���. 
	    //boolean Ÿ���� �⺻���� false��. 
	    boolean b1 = false;
	    boolean b2 = !b1;  //b2�� true�� ���� ���´�. 
	    
	    boolean b3 = b1 && b2; // �� ���� ���� ��� ���̸� ���� �������� �ϳ��� �ƴϸ� false
	    System.out.printf("b3: %s, b1: %s, b2:%s", b3, b1, b2);
	   
	}
}
