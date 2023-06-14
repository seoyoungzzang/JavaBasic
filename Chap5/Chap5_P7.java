package Main;

import java.util.Stack;

public class Chap5_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		//먼저 빠지는 것이 무엇인지 출력
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
