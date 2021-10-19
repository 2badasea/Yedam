package co.bada.prj.stack;

public class Stack {
	private char[] stack = new char[10];  // 문자 스택. 
	private int top = -1; //top=0;으로 하면 11행의 ++이 top에 온다
	
	public void push(char c) {
		if(top > stack.length-1) {
			System.out.println("스택에 더이상 데이터를 입력할 수 없다. ");
		} else {
			stack[++top] = c; 
		}
	}
	
	 public char pop() {
		 char data = ' ';
		 if(top < 0) {
			 System.out.println("스택에 더이상 데이터가 없다.");
		 } else {
			 data = stack[top--];
		 }
		 return data;
	 }
}
