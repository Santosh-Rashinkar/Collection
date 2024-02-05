package com.prowings.linkedlist;

import java.util.LinkedList;

public class MergeLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);

		LinkedList<Integer> list2 = new LinkedList<>();

		list2.add(40);
		list2.add(50);
		list2.add(60);

		// Merging the two LinkedLists
		list1.addAll(list2);

		System.out.println("Merged Linked List :" + list1);

	}

}
