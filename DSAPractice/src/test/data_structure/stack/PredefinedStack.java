package test.data_structure.stack;

import java.util.Stack;

public class PredefinedStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(15);
		stack.push(55);
		stack.push(19);
		stack.push(1);
		stack.push(12);
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
	}

}
