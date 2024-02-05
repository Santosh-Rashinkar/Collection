package com.prowings.linkedlist;

import java.util.LinkedList;

public class LinkedListMethodsDemo {

	public static void main(String[] args) {

		LinkedList<Integer> LL = new LinkedList<>();

		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);

		System.out.println("Original LinkedList : " + LL);

		LL.removeFirst();
		LL.removeLast();
		LL.remove(1);

		System.out.println("After removing elements : " + LL);
		
		System.out.println("Eelement at index 0 : " + LL.get(0));

		
		System.out.println(" Contains 30 ? : " + LL.contains(20));
		
		System.out.println("Size of the LinkedList : "+LL.size());
		
		Integer[] array = LL.toArray(new Integer[0]);
		
		System.out.println("Array from LinkedList : ");
		
		for(Integer num : array) {
			
			System.out.print(num + " ");
		}
		System.out.println();
		
		LL.clear();
		System.out.println("After clearing the LinkedList : "+LL);
		
		System.out.println("Is the  LinkedList empty ?  " +LL.isEmpty());
		
		
		
		
	}
}
