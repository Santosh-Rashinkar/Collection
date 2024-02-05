package com.prowings.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackMethodsDemo2 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		stack.push(".Net");
		stack.push("C");

		System.out.println("Original Stack :" + stack);
		try {

			System.out.println("Popped : " + stack.pop());
			System.out.println("Popped : " + stack.pop());
		} catch (EmptyStackException e) {

			System.out.println("Error : stack is empty.");

		}
		stack.push("Java");
		stack.push("is");

		int position = stack.search("Java");

		if (position != -1) {

			System.out.println("Position of 'Java' : " + position);
		} else {

			System.out.println("Element not found in the stack .");
		}
		System.out.println("Is stack empty ? " + stack.empty());

		// Iterating over the remaining elements in the stack
		System.out.println("Remaining elements:");

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		// Attempting to pop from an empty stack
		try {
			System.out.println("Popped: " + stack.pop());
		} catch (EmptyStackException e) {
			System.out.println("Error: Stack is empty.");
		}
	}
}
