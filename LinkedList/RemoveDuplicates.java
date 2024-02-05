package com.prowings.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {

		LinkedList<Integer> LL = new LinkedList<>();

		LL.add(10);
		LL.add(20);
		LL.add(10);
		LL.add(30);
		LL.add(20);
		LL.add(30);

		System.out.println("Original LinkedList with Duplicates : " + LL);

		// Using HashSet to remove duplicates
		HashSet<Integer> uniqueSet = new HashSet<>(LL);

		LL.clear();

		LL.addAll(uniqueSet);

		// Displaying the linked list without duplicates
		System.out.println("Linked List Without duplicates : " + LL);
	}

}
