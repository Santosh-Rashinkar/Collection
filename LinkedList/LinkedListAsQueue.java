package com.prowings.linkedlist;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {

		LinkedList<Integer> queue = new LinkedList<>();

		queue.addLast(10);
		queue.addLast(20);
		queue.addLast(30);

		// Enqueue operation - Adding elements to the queue
		System.out.println("Queue elements : " + queue);

		if (!queue.isEmpty()) {

			int dequeuedElement = queue.removeFirst();
			System.out.println("Dequed element : " + dequeuedElement);

		} else {
			System.out.println("Queue is empty");
		}
		if (!queue.isEmpty()) {

			int frontElement = queue.getFirst();

			System.out.println("Front Element (peek) : " + frontElement);
		} else {
			System.out.println("Queue is empty");
		}
		System.out.println("Updated Queue elements :" + queue);

	}

}
