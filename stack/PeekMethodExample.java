package com.prowings.stack;

import java.util.Stack;

public class PeekMethodExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		stack.push(".Net");
		
		System.out.println("Initial stack : " + stack);
		
		String element = stack.peek();
        System.out.println("Element at top: " + element);

		
	}
	
}
