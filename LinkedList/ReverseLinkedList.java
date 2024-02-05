package com.prowings.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> LL = new LinkedList<>();
		
		LL.add("Java");
		LL.add("Python");
		LL.add("C");
		LL.add("C++");
		LL.add(".Net");
		
		System.out.println("Original LinkedList : " + LL);
		
		Collections.reverse(LL);
		
		System.out.println("Reversed Linked List :"+LL);
		
		
		
		
		
	}
	
}
